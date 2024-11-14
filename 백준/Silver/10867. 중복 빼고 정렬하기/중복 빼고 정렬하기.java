import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String input2 = br.readLine();
        int num = 0;
        TreeSet<Integer> treeSet = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(input2," ");
        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());
            treeSet.add(num);
        } 
        String sum = "";
        for(Integer arg : treeSet){
            sum += ""+arg+" ";
        }
        System.out.println(sum);
        br.close();
	} 
}