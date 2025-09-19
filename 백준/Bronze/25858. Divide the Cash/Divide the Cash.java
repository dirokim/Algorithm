import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int val = Integer.parseInt(st.nextToken());
        String input = "";
        String answer = "";
        num = 0;
        while((input = br.readLine()) != null){
            answer += input + " ";
            num += Integer.parseInt(input);
        }
        val = val / num;
        StringTokenizer st2 = new StringTokenizer(answer," ");
        while(st2.hasMoreTokens()){
           num = Integer.parseInt(st2.nextToken());
           num = val * num;
           bw.write(""+num+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}