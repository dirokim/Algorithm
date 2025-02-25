import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int answer = 0;
        while((input = br.readLine()) != null){
            answer = 0;
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input," ");
            while(st.hasMoreTokens()){
                answer += Integer.parseInt(st.nextToken());
            }
            bw.write(""+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}