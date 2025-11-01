import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        num = Integer.parseInt(st.nextToken());
        int num2 = 0;
        int sum  = 0;
        int chk = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        while(st2.hasMoreTokens()){
            num2 = Integer.parseInt(st2.nextToken());
            if((sum+num2) > num){
                break;
            }
            sum += num2;
            chk++;
        }
        bw.write(""+chk);
        br.close();
        bw.flush();
        bw.close();
	} 
}