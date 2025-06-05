import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        String num3 = br.readLine();
        int num4 = Integer.parseInt(br.readLine());
        int chk = 0;
        if(num == 8 || num == 9){
            chk++;
        }
        if(num2.equals(num3)){
            chk++;
        }
        if(num4 == 8 || num4 == 9){
            chk++;
        }
        if(chk == 3){
            bw.write("ignore");
        }else{
            bw.write("answer");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}