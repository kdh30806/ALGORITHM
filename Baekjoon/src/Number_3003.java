import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_3003 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		String[] my_chess = br.readLine().split(" ");
		
		for (int i = 0 ; i < 6 ; i++) {
			int count = Integer.parseInt(my_chess[i]);
			bw.write(String.valueOf((chess[i] - count)) + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
