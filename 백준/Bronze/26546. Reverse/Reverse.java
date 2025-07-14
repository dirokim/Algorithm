import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int val = 0;
        int val2 = 0;
        String answer = "";
        String sum    = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            answer = st.nextToken();
            val = Integer.parseInt(st.nextToken());
            val2 = Integer.parseInt(st.nextToken());
            sum = answer.substring(val,val2);
            answer = answer.replace(sum,"");
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}