import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        String answer = ""+num+"\n";
        for(int i=0;i<num;i++){
            answer += st.nextToken()+"\n";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}