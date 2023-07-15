import java.io.*;
import java.net.*;
import java.util.Scanner;

class hello{
    public static void main(String [] args) throws IOException{
        URL url = new URL("https://paramkansagra.github.io/code.txt");
        Scanner sc = new Scanner(url.openStream());

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}