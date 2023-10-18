import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10430 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] numArray = br.readLine().split(" ");
		int A = Integer.parseInt(numArray[0]);
		int B = Integer.parseInt(numArray[1]);
		int C = Integer.parseInt(numArray[2]);
		
		bw.write(String.valueOf((A+B)%C) + "\n");
		bw.write(String.valueOf(((A%C)+(B%C))%C) + "\n");
		bw.write(String.valueOf((A*B)%C) + "\n");
		bw.write(String.valueOf((((A%C)*(B%C))%C)));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
