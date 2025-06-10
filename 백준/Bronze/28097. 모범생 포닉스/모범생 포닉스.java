import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int num = 0;
        int answer = 0;
        int answer2 = 0;
        while(st.hasMoreTokens()){
            num++;
            if(num > 1){
                answer += 8;
            }
            answer += Integer.parseInt(st.nextToken());
        }
        if(answer / 24 > 0){
            answer2 = answer % 24;
            answer  = answer / 24;
        }else{
            answer2 = answer;
            answer  = 0;
        }
        bw.write(""+answer+" "+answer2);
        br.close();
        bw.flush();
        bw.close();
	} 
}