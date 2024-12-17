import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = ""; 
        String sum = "";
        int num = 0;
        while((input = br.readLine()) != null){
            if(input.equals("#"))break;
            num = 0;
            for(int i=0;i<input.length();i++){
               sum = ""+input.charAt(i);
               sum = sum.toLowerCase();
               if(sum.equals("a")){
                   num++;
               }else if(sum.equals("e")){
                   num++;
               }else if(sum.equals("i")){
                   num++;
               }else if(sum.equals("o")){
                   num++;
               }else if(sum.equals("u")){
                   num++;
               }
           }
            bw.write(""+num+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}