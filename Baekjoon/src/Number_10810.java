import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10810 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);	
		int[] baguni = new int[N];
		
		for(int i = 0 ; i < M ; i++) {
			String[] abc = br.readLine().split(" ");
			int a = Integer.parseInt(abc[0]);
			int b = Integer.parseInt(abc[1]);
			int c = Integer.parseInt(abc[2]);
			
			for(int i2 = a ; i2 <= b ; i2++) {
				baguni[i2-1] = c;
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			bw.write(String.valueOf(baguni[i] + " "));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
