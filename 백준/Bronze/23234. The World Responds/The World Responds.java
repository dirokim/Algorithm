import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{ 
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        bw.write("The world says hello!");
        bw.flush();
        bw.close();
	} 
}