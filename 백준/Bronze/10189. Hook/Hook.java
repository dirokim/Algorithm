import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{ 
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = ""; 
        bw.write("#  # #### #### #  #"+"\n");
        bw.write("#### #  # #  # # #"+"\n");
        bw.write("#### #  # #  # # #"+"\n");
        bw.write("#  # #### #### #  #"+"\n");
        bw.flush();
        bw.close();
	} 
}