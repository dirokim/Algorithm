import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int num2 = 0;
        int answer = 0;
        int answer2 = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            answer = num/num2;
            answer2 = num%num2;
            bw.write("You get "+answer+" piece(s) and your dad gets "+answer2+" piece(s).\n");
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}