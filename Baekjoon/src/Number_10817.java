import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10817 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int num_1 = Integer.parseInt(str[0]);
		int num_2 = Integer.parseInt(str[1]);
		int num_3 = Integer.parseInt(str[2]);
		
		int[] numArray = {num_1, num_2, num_3};
		
		for(int i = 0 ; i < numArray.length - 1 ; i++) {
			for(int i2 = i + 1 ; i2 < numArray.length ; i2++) {
				if(numArray[i] > numArray[i2]) {
					int temp = numArray[i];
					numArray[i] = numArray[i2];
					numArray[i2] = temp;
				}
			}
		}
		
		bw.write(String.valueOf(numArray[1]));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
