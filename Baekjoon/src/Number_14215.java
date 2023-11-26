import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number_14215 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] araay = br.readLine().split(" ");
		int[] ABC = new int[3];
		ABC[0] = Integer.parseInt(araay[0]);
		ABC[1] = Integer.parseInt(araay[1]);
		ABC[2] = Integer.parseInt(araay[2]);
		Arrays.sort(ABC);
		
		while(true) {
			if(ABC[2] < ABC[0] + ABC[1]) {
				bw.write(String.valueOf(ABC[2] + ABC[0] + ABC[1]));
				break;
			}else {
				ABC[2]--;
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
