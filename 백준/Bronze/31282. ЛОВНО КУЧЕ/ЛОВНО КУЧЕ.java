import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int num4 = 0;
        int answer = 0;
        while(num > num4){
            answer++;
            num += num2;
            num4 += num3;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}