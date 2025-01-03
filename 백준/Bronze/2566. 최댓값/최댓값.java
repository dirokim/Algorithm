import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num  = 0; //행
        int num2 = 0; //열
        int num3 = 0; //value
        int sum  = 0;
        int sum2 = 0;
        int sum3 = 0;
        while((input = br.readLine()) != null){  
            sum++;
            sum2 = 0;
            StringTokenizer st = new StringTokenizer(input," ");
            while(st.hasMoreTokens()){
                sum2++;
                sum3 = Integer.parseInt(st.nextToken());
                if(num3 <= sum3){
                   num = sum;
                   num2 = sum2;
                   num3 = sum3;
                }
            }
        }
        bw.write(""+num3+"\n"+num+" "+num2);
        br.close();
        bw.flush();
        bw.close();
	} 
}