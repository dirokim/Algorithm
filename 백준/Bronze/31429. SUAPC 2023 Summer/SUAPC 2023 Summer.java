import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        if(num ==1){
            bw.write("12 1600");
        }else if(num == 2){
            bw.write("11 894");
        }else if(num == 3){
            bw.write("11 1327");
        }else if(num == 4){
            bw.write("10 1311");
        }else if(num == 5){
            bw.write("9 1004");
        }else if(num == 6){
            bw.write("9 1178");
        }else if(num == 7){
            bw.write("9 1357");
        }else if(num == 8){
            bw.write("8 837");
        }else if(num == 9){
            bw.write("7 1055");
        }else if(num == 10){
            bw.write("6 556");
        }else if(num == 11){
            bw.write("6 773");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}