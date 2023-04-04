package JavaSeries.Programs;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        Socket connectedSocket = new Socket("localhost", 69);
        InputStream is = connectedSocket.getInputStream();
        DataInputStream recieve = new DataInputStream(is);
        
        OutputStream ot = connectedSocket.getOutputStream();
        DataOutputStream send = new DataOutputStream(ot);
        
        while(true){
            System.out.print("You: ");
            String str = input.nextLine();
            if(str.toLowerCase().equals("bye")) {
                send.writeUTF(str);
                break;
            }
            send.writeUTF(str);

            String str2 = recieve.readUTF();
            System.out.println("Anuj: " + str2);
            if(str2.toLowerCase().equals("bye")){
                System.out.print("You: ");
                input.nextLine();
                break;
            }
        }
        
        
    }
}

class Server{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        ServerSocket serverSocket = new ServerSocket(69);
        
        System.out.println("Server has started");
        System.out.println("Waiting for client response...");
        
        Socket connectedSocket = serverSocket.accept();

        System.out.println("\nConnection Established!\n");

        InputStream is = connectedSocket.getInputStream();
        DataInputStream recieve = new DataInputStream(is);

        OutputStream ot = connectedSocket.getOutputStream();
        DataOutputStream send = new DataOutputStream(ot);

        while(true){
            String str = recieve.readUTF();
            System.out.print("Samkit: " + str);
            if(str.toLowerCase().equals("bye")){
                System.out.print("\nYou: ");
                input.nextLine();
                break;
            }
            System.out.print("\nYou: ");
            String str2 = input.nextLine();
            if(str2.toLowerCase().equals("bye")) {
                send.writeUTF(str2);
                break;
            }
            send.writeUTF(str2);
        }

    }
}
