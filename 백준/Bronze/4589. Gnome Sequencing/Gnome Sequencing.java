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
        int chk  = 0;
        int chk2 = 0;
        bw.write("Gnomes:\n");
        while((input = br.readLine()) != null){
            chk = 0;
            chk2 =0;
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a > b){
                chk++;
            }
            if(b > c){
                chk++;
            }
            if(a < b){
                chk2++;
            }
            if(b < c){
                chk2++;
            }
            if(chk == 2 || chk2 == 2){
                bw.write("Ordered\n");
            }else{
                bw.write("Unordered\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}