import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "molu";
        if(input.equals("fdsajkl;") || input.equals("jkl;fdsa")){
            answer = "in-out";
        }else if(input.equals("asdf;lkj") || input.equals(";lkjasdf")){
            answer = "out-in";
        }else if(input.equals("asdfjkl;")){
            answer = "stairs";
        }else if(input.equals(";lkjfdsa")){
            answer = "reverse";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}