import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int anwser = 1;
		
		for(int i = 0 ; i < str.length() / 2 ; i++) {
			String front = String.valueOf(str.charAt(i));
			String back = String.valueOf(str.charAt(str.length() - 1 - i));
			
			if(!front.equals(back)) {
				anwser = 0;
				break;
			}
		}
		
		bw.write(String.valueOf(anwser));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
