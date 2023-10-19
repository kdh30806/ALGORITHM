import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_14681 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A > 0 && B > 0) {
			bw.write(String.valueOf(1));
		}else if(A > 0 && B < 0) {
			bw.write(String.valueOf(4));
		}else if(A < 0 && B > 0) {
			bw.write(String.valueOf(2));
		}else{
			bw.write(String.valueOf(3));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
