import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        int a = 0;
        int b = 0;
        String sum = "";
        for(int i=0;i<input.length();i++){
            sum = ""+input.charAt(i);
            if(Integer.parseInt(sum) % 2 == 0){
                b++;
            }else{
                a++;
            }
        }
        if(a == b){
            bw.write("-1");
        }else if(a > b){
            bw.write("1");
        }else if(b > a){
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}