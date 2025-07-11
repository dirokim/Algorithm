import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num  = 0;
        int num2 = 0;
        int chk = 0;
        for(int i=0;i<input.length();i++){
            if(num == 10 && num2 == 10){
                chk++;
            }
            if(input.charAt(i) == 'A'){
                num += Integer.parseInt(""+input.charAt(i+1));
            }else if(input.charAt(i) == 'B'){
                num2 += Integer.parseInt(""+input.charAt(i+1));
            }
            if(chk > 0){
                if(num > num2){
                    if((num - num2) > 1){
                        break;
                    }
                }else if(num2 > num){
                    if((num2 - num) > 1){
                        break;
                    }
                }
            }else{
                if(num > 10 || num2 > 10){
                    break;
                }
            }
        }
        if(num > num2){
            bw.write("A");
        }else{
            bw.write("B");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}