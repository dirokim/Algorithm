import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int chk = 0;
        int answer = 0;
        while((input = br.readLine()) != null){
            chk = 0;
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken()); 
            if(a >= 1000) chk++;
            if(b >= 1600) chk++;
            if(c >= 1500) chk++;
            if(d <= 30) chk++;
            if(d == -1) chk--;
            if(chk >= 1) answer++;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}