import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int val = 0;
        int val2 = 0;
        while((input = br.readLine()) != null){
            if(input.equals("Lion")){
                val++;
            }else if(input.equals("Tiger")){
                val2++;
            }
        }
        if(val > val2){
            bw.write("Lion");
        }else{
            bw.write("Tiger");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}