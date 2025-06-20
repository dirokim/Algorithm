import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String answer = "";
        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());
            if(num >= 300){
                bw.write("1 ");
            }else if(num >= 275 && num < 300){
                bw.write("2 ");
            }else if(num >= 250 && num < 275){
                bw.write("3 ");
            }else if(num < 250){
                bw.write("4 ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}