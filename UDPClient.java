import java.io.*; 
import java.net.*; 
  
class UDPClient {
   public static void main(final String args[]) throws Exception {
      final InetAddress IPAddress = InetAddress.getByName("localhost");
      new Thread() {
         @Override
         public void run() {
            while (true) {
               DatagramSocket clientSocket = null;
               try {
                  clientSocket = new DatagramSocket();
                  byte[] sendData = new byte[100];
                  final String sentence = "";
                  sendData = sentence.getBytes();
                  final DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9874);
                  clientSocket.send(sendPacket);
                  Thread.sleep(2000);
               } catch (final Exception e) {
                  e.printStackTrace();
               } finally {
                  clientSocket.close();
               }
            }
         }
      }.start();
      new Thread() {
         @Override
         public void run() {
            DatagramSocket clientSocket = null;
            try {
               clientSocket = new DatagramSocket();
            } catch (final SocketException e1) {
               e1.printStackTrace();
            }
            while (true) {
               try {
                  final byte[] receiveData = new byte[100];
                  final DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                  clientSocket.receive(receivePacket);
                  final String modifiedSentence = new String(receivePacket.getData());
                  System.out.println("FROM SERVER:" + modifiedSentence);
               } catch (final Exception e) {
                  e.printStackTrace();
               }
            }
         }
      }.start();
   }

}
