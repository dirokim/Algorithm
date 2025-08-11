import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int sum = 100;
        int sum2 = 100;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a == b){
                
            }else if(a > b){
                sum2 -= a;
            }else if (b > a){
                sum -= b;
            }
        }
        bw.write(""+sum+"\n"+sum2);
        br.close();
        bw.flush();
        bw.close();
	} 
}