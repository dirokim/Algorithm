import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String input = "";
        for(int i=0;i<length;i++){
            input = br.readLine();
            if(input.length()>=6 && input.length() <= 9){
                bw.write("yes\n");
            }else{
                bw.write("no\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}