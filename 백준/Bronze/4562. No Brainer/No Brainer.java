import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a >= b){
                answer = "MMM BRAINS";
            }else{
                answer = "NO BRAINS";
            }
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}