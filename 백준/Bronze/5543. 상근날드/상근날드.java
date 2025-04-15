import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int burger = Integer.parseInt(br.readLine());
        int drink = 0;
        int num = 0;
        for(int i=0;i<4;i++){
            num = Integer.parseInt(br.readLine());
            if(i < 2){
                if(num < burger){
                    burger = num;
                }
            }
            if(i == 2){
                drink = num;
            }
            if(i == 3){
                if(drink > num){
                    drink = num;
                }
            }
        }
        num = burger + drink - 50;
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}