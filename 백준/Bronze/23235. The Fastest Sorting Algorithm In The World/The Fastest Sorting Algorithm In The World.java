import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        while((input = br.readLine()) != null){
            if(input.equals("0")){
                break;
            }
            num++;
            bw.write("Case "+num+": Sorting... done!\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}