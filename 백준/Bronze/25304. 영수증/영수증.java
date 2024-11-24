import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        long sum = Long.parseLong(br.readLine());
        int num = Integer.parseInt(br.readLine());
        long val = 0L;
        long val2 = 0L;
        long sumVal = 0L;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            val = Long.parseLong(st.nextToken());
            val2 = Long.parseLong(st.nextToken());
            sumVal = val * val2;
            sum -= sumVal;
        }
        if(sum == 0){
            bw.write("Yes");
        }else{
            bw.write("No");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}