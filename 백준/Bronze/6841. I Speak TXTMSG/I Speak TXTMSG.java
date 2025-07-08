import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = ""; 
        String answer = "";
        while((input = br.readLine()) != null){
            if(input.equals("CU")){
                answer += "see you"+"\n";
            }else if(input.equals(":-)")){
                answer += "I’m happy"+"\n";
            }else if(input.equals(":-(")){
                answer += "I’m unhappy"+"\n";
            }else if(input.equals(";-)")){
                answer += "wink"+"\n";
            }else if(input.equals(":-P")){
                answer += "stick out my tongue"+"\n";
            }else if(input.equals("(~.~)")){
                answer += "sleepy"+"\n";
            }else if(input.equals("TA")){
                answer += "totally awesome"+"\n";
            }else if(input.equals("CCC")){
                answer += "Canadian Computing Competition"+"\n";
            }else if(input.equals("CUZ")){
                answer += "because"+"\n";
            }else if(input.equals("TY")){
                answer += "thank-you"+"\n";
            }else if(input.equals("YW")){
                answer += "you’re welcome"+"\n";
            }else if(input.equals("TTYL")){
                answer += "talk to you later"+"\n";
                break;
            }else{
                answer += input+"\n";
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}