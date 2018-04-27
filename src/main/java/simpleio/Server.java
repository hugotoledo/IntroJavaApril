package simpleio;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(8888);
      for (;;) {
        Socket s = ss.accept();
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
        pw.println("Hello!");
        pw.println("How are you...?");
        pw.flush();
        s.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
