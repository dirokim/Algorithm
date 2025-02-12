import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        String num  = st.nextToken();
        String num2 = st.nextToken();
        int answer = 0;
        int answer2 = 0;
        if(num.contains("6")){
           num = num.replaceAll("6","5");
        }
        if(num2.contains("6")){
           num2 = num2.replaceAll("6","5");
        }
        answer = Integer.parseInt(num) + Integer.parseInt(num2);
        if(num.contains("5")){
           num = num.replaceAll("5","6");
        }
        if(num2.contains("5")){
           num2 = num2.replaceAll("5","6");
        }
        answer2 = Integer.parseInt(num) + Integer.parseInt(num2);
        bw.write(""+answer+" "+answer2);
        br.close();
        bw.flush();
        bw.close();
	} 
}