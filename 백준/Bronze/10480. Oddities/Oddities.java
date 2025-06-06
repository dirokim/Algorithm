import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        while((input = br.readLine()) != null){
            num = Integer.parseInt(input);
            if(num % 2 == 0){
                bw.write(""+num+" is even"+"\n");
            }else{
                bw.write(""+num+" is odd"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}