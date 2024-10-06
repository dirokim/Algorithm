import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String sum = br.readLine();
        int num = 0; 
        int [] numArray = new int[sum.length()];
        for(int i=0;i<sum.length();i++){
            numArray[i] = Integer.parseInt(""+sum.charAt(i));
        }
        Arrays.sort(numArray);
        sum = "";
        for(int j=numArray.length-1;j>=0;j--){
            sum+= ""+numArray[j];
        }
        br.close();
        bw.write(sum);
        bw.flush();
        bw.close();
	} 
}