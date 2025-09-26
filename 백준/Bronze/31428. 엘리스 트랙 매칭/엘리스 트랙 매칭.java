import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String sum = br.readLine();
        int num = 0;
        while(st.hasMoreTokens()){
            if(sum.equals(st.nextToken())){
                num++;
            }
        }
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}