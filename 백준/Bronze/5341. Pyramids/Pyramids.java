import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        int answer = 0;
        while((input = br.readLine()) != null){
            if(input.equals("0")){
                break;
            }
            num = Integer.parseInt(input);
            if(num % 2 == 1){
                answer = num / 2 + 1 * num;
            }else{
                answer = num / 2 * num + (num/2);
            }
            bw.write(""+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}