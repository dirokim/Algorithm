import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        if(input.contains("+")){
            if(input.contains("A")){
                answer = "4";
            }else if(input.contains("B")){
                answer = "3";
            }else if(input.contains("C")){
                answer = "2";
            }else if(input.contains("D")){
                answer = "1";
            }
            answer += ".3";
        }else if(input.contains("0")){
            if(input.contains("A")){
                answer = "4";
            }else if(input.contains("B")){
                answer = "3";
            }else if(input.contains("C")){
                answer = "2";
            }else if(input.contains("D")){
                answer = "1";
            }
            answer += ".0";
        }else if(input.contains("-")){
            if(input.contains("A")){
                answer = "3";
            }else if(input.contains("B")){
                answer = "2";
            }else if(input.contains("C")){
                answer = "1";
            }else if(input.contains("D")){
                answer = "0";
            }
            answer += ".7";
        }else if(input.contains("F")){
            answer = "0.0";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}