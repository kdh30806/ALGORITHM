import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_11021 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		for(int i = 1 ; i <= N ; i++) {
			String[] AB = br.readLine().split(" ");
			int A = Integer.parseInt(AB[0]);
			int B = Integer.parseInt(AB[1]);
			
			bw.write("Case #" +i+ ": "+A+" + "+B+" = " + (A+B) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
