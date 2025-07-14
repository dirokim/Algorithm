import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        int answer = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            sum = a * (b+c);
            if(a == (b+c)){
                sum = sum * 2;
            }
            if(answer < sum){
                answer = sum;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}