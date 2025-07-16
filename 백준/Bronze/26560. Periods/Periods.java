import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String sum = "";
        String val = "";
        int val2 = 0; 
        for(int i=0;i<num;i++){
           sum = br.readLine();
           val2 = sum.length();
           val = sum.substring(val2-1,val2);
           if(val.equals(".")){
           }else{
               sum += ".";
           }
            bw.write(sum +"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}

