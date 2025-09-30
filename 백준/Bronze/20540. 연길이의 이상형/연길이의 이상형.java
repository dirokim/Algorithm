import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        if(input.charAt(0) == 'I'){
            answer+= 'E';
        }
        if(input.charAt(0) == 'E'){
            answer+= 'I';
        }
        if(input.charAt(1) == 'N'){
            answer+= 'S';
        }
        if(input.charAt(1) == 'S'){
            answer+= 'N';
        }
        if(input.charAt(2) == 'T'){
            answer+= 'F';
        }
        if(input.charAt(2) == 'F'){
            answer+= 'T';
        }
        if(input.charAt(3) == 'J'){
            answer+= 'P';
        }
        if(input.charAt(3) == 'P'){
            answer+= 'J';
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}