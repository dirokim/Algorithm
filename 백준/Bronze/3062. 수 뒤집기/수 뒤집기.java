import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        StringBuilder str = new StringBuilder("");
        int sum = 0;
        String temp = "";
        while((input = br.readLine()) != null){
            num = Integer.parseInt(input);
            temp = ""+num;
            str = new StringBuilder(temp).reverse();
            sum = num + Integer.parseInt(""+str);
            temp = ""+sum;
            str = new StringBuilder(temp).reverse();
            if(sum == Integer.parseInt(""+str)){
                bw.write("YES"+"\n");
            }else{
                bw.write("NO"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}