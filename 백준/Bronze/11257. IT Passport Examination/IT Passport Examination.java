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
        int d = 0;
        int chk = 0;
        int sum = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            sum = b + c + d;
            chk = 0;
            if(b > 10){
                chk++;
            }
            if(c > 7){
                chk++;
            }
            if(d > 11){
                chk++;
            }
            if(sum > 54){
                chk++;
            }
            if(chk == 4){
                bw.write(""+a+" "+sum+" PASS"+"\n");
            }else{
                bw.write(""+a+" "+sum+" FAIL"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}