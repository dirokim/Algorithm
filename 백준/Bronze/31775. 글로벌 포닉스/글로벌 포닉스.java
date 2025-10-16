import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        String sum = "";
        String val = "lkps";
        while((input = br.readLine()) != null){
            sum = input.substring(0,1);
            if(sum.equals("l")){
                val = val.replace("l","");
            }
            if(sum.equals("k")){
                val = val.replace("k","");
            }
            if(sum.equals("p")){
                val = val.replace("p","");
            }
        }
        if(val.equals("s")){
            bw.write("GLOBAL");
        }else{
            bw.write("PONIX");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}