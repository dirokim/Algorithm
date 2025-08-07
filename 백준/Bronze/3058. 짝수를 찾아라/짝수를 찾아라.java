import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int row = 100;
        int num = 0;
        int sum = 0;
        while((input = br.readLine()) != null){
            row = 100;
            sum = 0;
            StringTokenizer st = new StringTokenizer(input," ");
            while(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
                if(num % 2 == 0){
                    sum += num;
                    if(row > num){
                        row = num;
                    }
                }
            }
            bw.write(""+sum+" "+row+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}