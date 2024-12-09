import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input  = "";
        String name   = "";
        String answer = "";
        int a = 0;
        int b = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            name = st.nextToken();
            answer = "Junior";
            if(name.equals("#"))break;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a > 17 || b >= 80){
                answer = "Senior";
            }
            bw.write(name+" "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}