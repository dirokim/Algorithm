import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        int chk = 0;
        String sum = "";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                chk++;
                sum = "";
                continue;
            }
            if(input.charAt(i)==')'){
                chk = 0;
                sum = new StringBuilder(sum).reverse().toString();
                answer += sum;
                continue;
            }
            if(chk > 0){
               sum += ""+ input.charAt(i); 
            }else{
                answer += ""+ input.charAt(i);
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}