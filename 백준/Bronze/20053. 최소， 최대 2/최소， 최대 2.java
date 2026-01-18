import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int low =  1000000;
        int high = 0;
        int num = 0;
        while((input = br.readLine()) != null){
            input = br.readLine();
            low =  1000000;
            high = -1000000;
            StringTokenizer st = new StringTokenizer(input," ");
            while(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
                if(num > high){
                    high = num;
                }
                if(num < low){
                    low = num;
                }
            }
            bw.write(""+low+" "+high+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}