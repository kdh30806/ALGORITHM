import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1924 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] xy = br.readLine().split(" ");
		int x = Integer.parseInt(xy[0]);
		int y = Integer.parseInt(xy[1]);
		int totalDay = 0;
		
		for(int i = 1 ; i <= x ; i++) {
			if(x == 1) {
				totalDay = y - 1;
			}else {
				switch (i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					totalDay += 31;
					break;
				case 4: case 6: case 9: case 11:
					totalDay += 30;
					break;
				case 2:
					totalDay += 28;
					break;
				}
				
				if(i == x - 1) {
					totalDay += y - 1;
					break;
				}
			}
		}
		
		if(totalDay % 7 == 0) {
			bw.write("MON");
		}else if(totalDay % 7 == 1) {
			bw.write("TUE");
		}else if(totalDay % 7 == 2) {
			bw.write("WED");
		}else if(totalDay % 7 == 3) {
			bw.write("THU");
		}else if(totalDay % 7 == 4) {
			bw.write("FRI");
		}else if(totalDay % 7 == 5) {
			bw.write("SAT");
		}else if(totalDay % 7 == 6) {
			bw.write("SUN");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
