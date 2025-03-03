import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        int num = 0;
        int num2 = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='A'){
                num++;
            }else if(input.charAt(i)=='B'){
                num2++;
            }
        }
        if(num > num2){
            bw.write("A");
        }else if(num <num2){
            bw.write("B");
        }else if(num == num2){
            bw.write("Tie");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}