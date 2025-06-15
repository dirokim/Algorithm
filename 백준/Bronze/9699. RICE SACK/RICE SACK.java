import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int answer = 0;
        int num = 0;
        int num2 =0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            answer = 0;
            num2++;
            while(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
                if(answer < num){
                    answer = num;
                }
            }
            bw.write("Case #"+num2+": "+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}