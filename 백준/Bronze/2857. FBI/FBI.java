import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 1; 
        String answer = "";
        while((input = br.readLine()) != null){
            if(input.contains("FBI")){
                answer += ""+num+" ";
            }
            num++;
        }
        if(answer.equals("")){
            answer = "HE GOT AWAY!";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}