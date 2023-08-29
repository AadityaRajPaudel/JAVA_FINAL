/*
 4. Create a TCP client/server program in which client sends a integer to the server and
server sends back the response as Fibonacci sequence upto the number the client has
provided. (Client requests:- 5 server response :- 0 1 1 2). The client response must be
greater than 5.
Server
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
public class Server {
public static void main(String [] args ) throws Exception{
ServerSocket ss = new ServerSocket(5500);
System.out.println("Server running on 5500");
Socket s = ss.accept();
System.out.println("Client connected !!");
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
// get the number sent by the client
int num = dis.readInt();
for(int i =0;i < num; i++){
dos.writeInt(fibonacci(i));
}
dos.close();
dis.close();
s.close();
ss.close();
}
static int fibonacci(int n)
{
// Using recursive method; you can use any other method of your choice.
if (n <= 1)
return n;
// Recursive call
return fibonacci(n - 1) + fibonacci(n - 2);

}
}

Client
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
public static void main(String [] args )throws IOException{
Scanner scan = new Scanner(System.in);
Socket s = new Socket("localhost",5500);
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
System.out.println("Enter number ");
int num = scan.nextInt();
// check if the number is less than 1
if(num < 1){
s.close();
scan.close();
throw new IllegalArgumentException("Cant find sequence of length less than 1");
}
// send the number
dos.writeInt(num);
// read the sequence from the server
// use for loop; since the server will respond the sequence one number at a time
for(int i =0; i<num; i++){
int seq = dis.readInt();
System.out.print(seq + ",");
}
dos.close();
dis.close();
s.close();

scan.close();
}
}
 */