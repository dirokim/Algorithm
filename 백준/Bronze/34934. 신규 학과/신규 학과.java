import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String num = "";
        String num2 = "";
        String answer = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num = st.nextToken();
            num2 = st.nextToken();
            if(num2.equals("2026")){
                answer = num;
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}