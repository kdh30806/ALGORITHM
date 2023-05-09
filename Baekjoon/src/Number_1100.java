import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1100 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		
		for(int i = 0 ; i < 8 ; i++) {
			String wb = br.readLine();
			for(int i2 = 0 ; i2 < 8 ; i2++) {
				String temp = String.valueOf(wb.charAt(i2));
				if(i % 2 == 0) {
					if((i2 % 2 == 0) && temp.equals("F")) {
						count++;
					}
				}else {
					if((i2 % 2 == 1) && temp.equals("F")) {
						count++;
					}
				}
			}
		}
		
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
