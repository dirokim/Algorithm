import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());   // X 1리터당 요금
        int num2 = Integer.parseInt(br.readLine());  // Y 기본요금
        int num3 = Integer.parseInt(br.readLine());  // Y 상한요금
        int num4 = Integer.parseInt(br.readLine());  // Y 1리터당 추가요금
        int num5 = Integer.parseInt(br.readLine());  // 한달간의 수도요금
        int sum = num * num5;
        int sum2 = 0 ;
        if(num3 < num5){
            sum2 = num4 * (num5 - num3) + num2;
        }else{
            sum2 = num2;
        }
        if(sum > sum2){
            bw.write(""+sum2);
        }else{
            bw.write(""+sum);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}