import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String answer = br.readLine();
        int num = 1;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken())== 1){
                sum += num;
                num++;
            }else{
                num = 1;
            }
        }
        bw.write(""+sum);
        br.close();
        bw.flush();
        bw.close();
	} 
}