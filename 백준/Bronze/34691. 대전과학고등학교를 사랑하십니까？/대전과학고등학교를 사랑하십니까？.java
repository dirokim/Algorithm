import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        while((input = br.readLine()) != null){
            if(input.equals("animal")){
                bw.write("Panthera tigris"+"\n");
            }else if(input.equals("tree")){
                bw.write("Pinus densiflora"+"\n");
            }else if(input.equals("flower")){
                bw.write("Forsythia koreana"+"\n");
            }else if(input.equals("end"))break;
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}