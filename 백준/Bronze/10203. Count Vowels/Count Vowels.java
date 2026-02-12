import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum = "";
        int count = 0;
        while((input = br.readLine()) != null){
            count = 0;
            for(int i=0;i<input.length();i++){
                sum = ""+input.charAt(i); 
                if(sum.equals("a")){
                    count++;
                }else if(sum.equals("e")){
                    count++;
                }else if(sum.equals("i")){
                    count++;
                }else if(sum.equals("o")){
                    count++;
                }else if(sum.equals("u")){
                    count++;
                }
            }
            bw.write("The number of vowels in "+input+" is "+count+".\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}