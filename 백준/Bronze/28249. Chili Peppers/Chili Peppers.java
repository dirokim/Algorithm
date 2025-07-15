import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int sum = 0;
        while((input = br.readLine()) != null){
            if(input.equals("Poblano")){
                sum += 1500;
            }else if(input.equals("Mirasol")){
                sum += 6000;
            }else if(input.equals("Serrano")){
                sum += 15500;
            }else if(input.equals("Cayenne")){
                sum += 40000;
            }else if(input.equals("Thai")){
                sum += 75000;
            }else if(input.equals("Habanero")){
                sum += 125000;
            }
        }
        bw.write(""+sum);
        br.close();
        bw.flush();
        bw.close();
	} 
}