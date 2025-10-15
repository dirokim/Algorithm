import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String val = "";
        String val2 = "";
        int num = 0;
        while((input = br.readLine()) != null){
            num = input.length() / 2;
            val = input.substring(num-1,num);
            val2 = input.substring(num,num+1);
            if(val.equals(val2)){
                bw.write("Do-it"+"\n");
            }else{
                bw.write("Do-it-Not"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}