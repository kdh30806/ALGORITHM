import java.io.*;
import java.util.*;

public class Number_4779 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		
		while(true) {
			str = br.readLine();
			if(str == null) break;
			int N = Integer.parseInt(str);
			StringBuilder hypen = new StringBuilder();
			for(int i = 0 ; i < Math.pow(3, N) ; i++) {
				hypen.append("-");
			}
			cantoer(0, hypen.length() ,hypen);
			bw.write(hypen.toString() + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

	public static void cantoer(int start, int size, StringBuilder str) {
		
		if(size == 1) {
			return;
		}else {
			
			int reSize = size / 3;
			for(int i = start + reSize ; i < start + (reSize  * 2) ; i++) {
				str.setCharAt(i, ' ');
			}
			
			cantoer(start, reSize, str);
			cantoer(start + reSize * 2, reSize, str);
		}
	}
}
