import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int [] coin = {25, 10 ,5 ,1};
		for(int i = 0 ; i < T ; i++) {
			int C = Integer.parseInt(br.readLine());
			for (int cent : coin) {
				bw.write(String.valueOf(C / cent) + " ");
				C %= cent;
			}
			
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
