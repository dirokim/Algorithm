import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(num > num2){
            answer = num + num2;
        }else{
            answer = num2 - num;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}