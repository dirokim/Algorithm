import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            bw.write(" @@@   @@@ "+"\n");
            bw.write("@   @ @   @"+"\n");
            bw.write("@    @    @"+"\n");
            bw.write("@         @"+"\n");
            bw.write(" @       @ "+"\n");
            bw.write("  @     @  "+"\n");
            bw.write("   @   @   "+"\n");
            bw.write("    @ @    "+"\n");
            bw.write("     @     "+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}