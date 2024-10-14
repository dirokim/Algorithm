import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{ 
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        input += "    8888888888  888    88888"+"\n";
        input += "   88     88   88 88   88  88"+"\n";
        input += "    8888  88  88   88  88888"+"\n";
        input += "       88 88 888888888 88   88"+"\n";
        input += "88888888  88 88     88 88    888888"+"\n";
        input += "\n";
        input += "88  88  88   888    88888    888888"+"\n";
        input += "88  88  88  88 88   88  88  88"+"\n";
        input += "88 8888 88 88   88  88888    8888"+"\n";
        input += " 888  888 888888888 88  88      88"+"\n";
        input += "  88  88  88     88 88   88888888";
        bw.write(input);
        bw.flush();
        bw.close();
	} 
}