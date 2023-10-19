import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2525 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] HM = br.readLine().split(" ");
		int time = Integer.parseInt(br.readLine());
		int H = Integer.parseInt(HM[0]);
		int M = Integer.parseInt(HM[1]);
		
		int hour = H + (M + time) / 60;
		int minute = (M + time) % 60;
		
		bw.write(String.valueOf(hour % 24) + " " + String.valueOf(minute));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
