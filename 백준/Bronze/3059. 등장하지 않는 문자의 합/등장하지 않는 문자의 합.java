import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char val = 'S';
        int sum = 0;
        while((input = br.readLine()) != null){
            value = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            sum = 0;
            for(int i=0;i<input.length();i++){
                val = input.charAt(i);
                if(value.contains(""+val)){
                    value = value.replaceAll(""+val,"");
                }
            }
            for(int j=0;j<value.length();j++){
                val = value.charAt(j);
                sum += (int)val;
            }
            bw.write(""+sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}