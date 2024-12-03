import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int num2 = Integer.parseInt(input.substring(input.length()-1,input.length()));
        for(int i=0;i<input.length()-1;i++){
            if(Character.isDigit(input.charAt(i))){
                num += Integer.parseInt(""+input.charAt(i));
            }
        }
        if(num == num2){
            bw.write("YES");
        }else{
            bw.write("NO");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}