import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        while((input = br.readLine()) != null){
            if(input.equals("Algorithm")){
                bw.write("204"+"\n");
            }else if(input.equals("DataAnalysis")){
                bw.write("207"+"\n");
            }else if(input.equals("ArtificialIntelligence")){
                bw.write("302"+"\n");
            }else if(input.equals("CyberSecurity")){
                bw.write("B101"+"\n");
            }else if(input.equals("Network")){
                bw.write("303"+"\n");
            }else if(input.equals("Startup")){
                bw.write("501"+"\n");
            }else if(input.equals("TestStrategy")){
                bw.write("105"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}