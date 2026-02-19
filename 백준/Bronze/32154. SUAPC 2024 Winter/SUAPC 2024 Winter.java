import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String answer = "";
        if(num < 2){
            answer = "11\n"+"A B C D E F G H J L M";
        }else if(num >= 2 && num <= 3){
            answer = "9\n"+"A C E F G H I L M";
        }else if(num == 4){
            answer = "9\n"+"A B C E F G H L M";
        }else if(num >= 5 && num < 10){
            answer = "8\n"+"A C E F G H L M";
        }else if(num == 10){
            answer = "8\n"+"A B C F G H L M";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}