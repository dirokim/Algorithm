import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int val = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            answer = "";
            num = Integer.parseInt(input);
            val = num / 5;
            num = num % 5;
            for(int i=0;i<val;i++){
                answer += "++++ ";
            }
            if(num == 1){
                answer += "|";
            }else if(num == 2){
                answer += "||";
            }else if(num == 3){
                answer += "|||";
            }else if(num == 4){
                answer += "||||";
            }
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}