import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int val = 0;
        int val2 = 0;
        int answer = 0;
        while((input = br.readLine()) != null){ 
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='K'){
                    val += 0;
                }else if(input.charAt(i)=='P'){
                    val += 1;
                }else if(input.charAt(i)=='N'){
                    val += 3;
                }else if(input.charAt(i)=='B'){
                    val += 3;
                }else if(input.charAt(i)=='R'){
                    val += 5;
                }else if(input.charAt(i)=='Q'){
                    val += 9;
                }else if(input.charAt(i)=='k'){
                    val2 += 0;
                }else if(input.charAt(i)=='p'){
                    val2 += 1;
                }else if(input.charAt(i)=='n'){
                    val2 += 3;
                }else if(input.charAt(i)=='b'){
                    val2 += 3;
                }else if(input.charAt(i)=='r'){
                    val2 += 5;
                }else if(input.charAt(i)=='q'){
                    val2 += 9;
                }
            }
        }
        answer = val - val2;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}