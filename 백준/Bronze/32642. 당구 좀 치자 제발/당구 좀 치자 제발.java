import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        Long sum = 0L;
        Long answer = 0L;
        StringTokenizer st = new StringTokenizer(input," ");
        while(st.hasMoreTokens()){
            input = st.nextToken();
            if(input.equals("1")){
                sum++;
                answer += sum;
            }else if(input.equals("0")){
                sum--;
                answer += sum;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}

