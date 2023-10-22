import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10950 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i = 0 ; i < N ; i++) {
			String[] AB = br.readLine().split(" ");
			int A = Integer.parseInt(AB[0]);
			int B = Integer.parseInt(AB[1]);
			
			sum += (A * B);
		}
		
		if(sum == X) {
			bw.write("Yes");
		}else {
			bw.write("No");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
