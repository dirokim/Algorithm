import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        String sum = "";
        char val = 'h';
        while((input = br.readLine()) != null){
            sum = "";
            for(int i=0;i<input.length();i++){
                val = input.charAt(i);
                if(val == 'e'){
                    sum += "i";
                }else if(val == 'i'){
                    sum += "e";
                }else if(val == 'E'){
                    sum += "I";
                }else if(val == 'I'){
                    sum += "E";
                }else{
                    sum += ""+val;
                }
            }
            bw.write(sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}