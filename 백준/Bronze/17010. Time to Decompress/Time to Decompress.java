import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        String sum = "";
        String answer = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            answer = "";
            num = Integer.parseInt(st.nextToken());
            sum = st.nextToken();
            for(int i=0;i<num;i++){
                answer += sum;
            }
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}