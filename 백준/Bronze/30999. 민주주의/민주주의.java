import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int num2 = 0;
        String sum = "";
        int answer = 0;
        while((input = br.readLine()) != null){
                num = 0;
                num2 = 0;
            for(int i=0;i<input.length();i++){
                sum = "" + input.charAt(i); 
                if(sum.equals("O")){
                    num++;
                }else{
                    num2++;
                }
            }
            if(num > num2){
                answer++;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}