import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2577 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String ABC = String.valueOf(A*B*C);
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i = 0 ; i < ABC.length() ; i++) {
			int num =  Integer.parseInt(String.valueOf(ABC.charAt(i)));
			count[num]++;
		}
		
		for(int i = 0 ; i < count.length ; i++) {
			bw.write(String.valueOf(count[i]) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
