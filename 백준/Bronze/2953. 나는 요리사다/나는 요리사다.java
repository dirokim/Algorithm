import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        int num2 = 0;
        int answer = 0;
        int answer2 = 0;
        while((input = br.readLine()) != null){
            num2++;
            StringTokenizer st = new StringTokenizer(input," ");
            num = Integer.parseInt(st.nextToken());
            num += Integer.parseInt(st.nextToken());
            num += Integer.parseInt(st.nextToken());
            num += Integer.parseInt(st.nextToken());
            if(num >= answer2){
                answer = num2;
                answer2 = num;
            }
        }
        bw.write(""+answer+" "+answer2);
        br.close();
        bw.flush();
        bw.close();
	} 
}