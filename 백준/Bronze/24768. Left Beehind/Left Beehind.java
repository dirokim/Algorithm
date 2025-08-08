import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int a = 0;
        int b = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a == 0  && b == 0){
                break;
            }
            if((a+b) == 13){
                bw.write("Never speak again.\n");    
            }else if(a == b){
                bw.write("Undecided.\n");
            }else if(a > b){
                bw.write("To the convention.\n");
            }else if(b > a){
                bw.write("Left beehind.\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}