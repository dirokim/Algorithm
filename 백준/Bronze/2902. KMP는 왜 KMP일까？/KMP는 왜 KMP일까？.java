import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input,"-");
        String temp = "";
        String answer = "";
        while(st.hasMoreTokens()){
            temp = st.nextToken();
            temp = ""+temp.charAt(0);
            answer += temp;
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}