import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] numArray = br.readLine().split(" ");
		int num_1 = Integer.parseInt(numArray[0]);
		int num_2 = Integer.parseInt(numArray[1]);
		
		br.close();
		bw.flush();
		bw.close();
	}

}
