import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        int num2 = 0;
        int chk = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            while(st.hasMoreTokens()){
                if(chk == 0){
                    num += Integer.parseInt(st.nextToken());
                }else if(chk > 0){
                    num2 += Integer.parseInt(st.nextToken());
                }
            }
            chk++;
        }
        if(num >= num2){
            bw.write(""+num);
        }else if(num < num2){
            bw.write(""+num2);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}