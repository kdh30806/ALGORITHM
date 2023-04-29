import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number_2747 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		
		while(!((str = br.readLine()).equals("0"))) {
			int center = str.length() / 2;
			String front_str = "";
			String back_str = "";
			if(str.length() % 2 == 0) {
				front_str = str.substring(0, center);
				back_str = str.substring(center);
			}else {
				front_str = str.substring(0, center);
				back_str = str.substring(center + 1);
			}
			
			String make_str = "";
			for(int i = front_str.length() - 1 ; i >= 0 ; i--) {
				make_str += String.valueOf(front_str.charAt(i));
			}
			
			if(make_str.equals(back_str)) {
				bw.write("yes" + "\n");
			}else {
				bw.write("no" + "\n");
			}		
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
