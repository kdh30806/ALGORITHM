import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Number_11382 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] numArray = br.readLine().split(" ");
		
		BigInteger A_big = new BigInteger(numArray[0]);
		BigInteger B_big = new BigInteger(numArray[1]);
		BigInteger C_big = new BigInteger(numArray[2]);
		
		bw.write(String.valueOf(A_big.add(B_big).add(C_big)));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
