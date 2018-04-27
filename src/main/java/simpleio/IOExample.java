package simpleio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IOExample {
  public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    String s = scan.nextLine();
//    System.out.println("You typed " + s);

    try {
//      FileReader fr = new FileReader("MyText.txt");
      Socket s = new Socket("127.0.0.1", 8888);
      InputStream fr = s.getInputStream();
      Scanner scan2 = new Scanner(fr);
      while (scan2.hasNext()) {
        System.out.println("> " + scan2.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("Oops that broke");
      e.printStackTrace();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
