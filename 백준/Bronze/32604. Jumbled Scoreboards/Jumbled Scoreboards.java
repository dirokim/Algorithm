import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken());
        int val2 = Integer.parseInt(st.nextToken());
        int a = 0;
        int b = 0;
        String answer = "yes";
        while((input = br.readLine()) != null){
            st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a < val){
                answer = "no";
                break;
            }else{
                val = a;
            }
            if(b < val2){
                answer = "no";
                break;
            }else{
                val2 = b;
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}