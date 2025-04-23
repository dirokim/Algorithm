import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        String num = "";
        String num2 ="";
        int answer = Integer.parseInt(br.readLine());
        answer = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num = st.nextToken();
            num2 = st.nextToken();
            if(num.equals("136")){
                answer += 1000;
            }else if(num.equals("142")){
                answer += 5000;
            }else if(num.equals("148")){
                answer += 10000;
            }else if(num.equals("154")){
                answer += 50000;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}