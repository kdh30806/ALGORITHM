import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_5622 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int[] sec = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };

		String S = br.readLine();
		int time = 0;
		
		for(int i = 0 ; i < S.length(); i++) {
			String temp = String.valueOf(S.charAt(i));
			
			for(int i2 = 0 ; i2 < alpha.length ; i2++) {
				if(temp.equals(alpha[i2])) {
					time += sec[i2];
					break;
				}
			}
		}
		
		bw.write(String.valueOf(time));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
