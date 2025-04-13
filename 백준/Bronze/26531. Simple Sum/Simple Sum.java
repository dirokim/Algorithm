import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        String input = st.nextToken();
        int num2 = Integer.parseInt(st.nextToken());
        input = st.nextToken();
        int num3 = Integer.parseInt(st.nextToken());
        if(num3 == num+num2){
            bw.write("YES");
        }else{
            bw.write("NO");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}