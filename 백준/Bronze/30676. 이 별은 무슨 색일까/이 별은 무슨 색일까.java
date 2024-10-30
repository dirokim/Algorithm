import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        String answer = "";
        if(num >= 620 && num <= 780){
            answer = "Red";
        }else if(num >= 590 && num < 620){
            answer = "Orange";
        }else if(num >= 570 && num < 590){
            answer = "Yellow";
        }else if(num >= 495 && num < 570){
            answer = "Green";
        }else if(num >= 450 && num < 495){
            answer = "Blue";
        }else if(num >= 425 && num < 450){
            answer = "Indigo";
        }else if(num >= 380 && num < 425){
            answer = "Violet";
        } 
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}