import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_19532 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int a = Integer.parseInt(NM[0]);
		int b = Integer.parseInt(NM[1]);
		int c = Integer.parseInt(NM[2]);
		int d = Integer.parseInt(NM[3]);
		int e = Integer.parseInt(NM[4]);
		int f = Integer.parseInt(NM[5]);
		
		boolean flag = false;
		for(int x = -999 ; x < 1000 ; x++) {
			for(int y = -999 ; y < 1000 ; y++) {
				if(a * x + y * b == c && d * x + e * y == f) {
					bw.write(String.valueOf(x) + " " + String.valueOf(y));
					flag = true;
				}
			}
			
			if(flag) break;
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
