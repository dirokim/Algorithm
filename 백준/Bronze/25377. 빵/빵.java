import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int answer = 0;
        int chk = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a <= b){
                chk++;
                if(answer == 0){
                    answer = b;
                }else if(b < answer){
                    answer = b;
                }
            }
        }
        if(chk == 0){
            answer = -1;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}