import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1009 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int temp = 1;
			
			for(int i2 = 0 ; i2 < b ; i2++) {
				temp = (temp * a) % 10;
			}
			
			if(temp == 0) {
				bw.write(String.valueOf(10 + "\n"));
			}else {
				bw.write(String.valueOf(temp + "\n"));
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
