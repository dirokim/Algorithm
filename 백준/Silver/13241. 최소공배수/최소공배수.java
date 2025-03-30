import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Long num = Long.parseLong(st.nextToken());
        Long num2 = Long.parseLong(st.nextToken());
        Long sum = num * num2;
        Long temp = 0L;
        if(num2 > num ){
            temp = num2;
            num2 = num;
            num  = temp;
        }
        while(num2 != 0){
            temp = num2;
            num2 = num % num2;
            num  = temp;
        }
        num = Math.abs(num);
        Long answer = sum / num;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}