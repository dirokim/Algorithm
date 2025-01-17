import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int num2 = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            num = Integer.parseInt(input);
            answer = "";
            if(num / 25 > 0){
                num2 = num / 25;
                num = num % 25;
                answer += ""+num2+" ";
            }else{
                answer += "0 ";
            }
            if(num / 10 > 0){
                num2 = num / 10;
                num = num % 10;
                answer += ""+num2+" ";
            }else{
                answer += "0 ";
            }
            if(num / 5 > 0){
                num2 = num / 5;
                num = num % 5;
                answer += ""+num2+" ";
            }else{
                answer += "0 ";
            }
            if(num / 1 > 0){
                num2 = num / 1;
                answer += ""+num2+" ";
            }else{
                answer += "0";
            }
            bw.write(answer+"\n");
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}