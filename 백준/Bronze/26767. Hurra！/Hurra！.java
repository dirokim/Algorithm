import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=1;i<=num;i++){
            if(i % 7 == 0 && i % 11 == 0){
                bw.write("Wiwat!"+"\n");
            }else if(i % 7 == 0){
                bw.write("Hurra!"+"\n");
            }else if(i % 11 == 0){
                bw.write("Super!"+"\n");
            }else{
                bw.write(""+i+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}