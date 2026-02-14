import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int val = 0;
        int val2 = 0;
        for(int i=0;i<num;i++){
            if(input.charAt(i)=='e'){
                val++;
            }else if(input.charAt(i)=='2'){
                val2++;
            }
        }
        if(val == val2){
            bw.write("yee");
        }else if(val > val2){
            bw.write("e");
        }else if(val2 > val){
            bw.write("2");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}