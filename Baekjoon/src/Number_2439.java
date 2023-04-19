import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i <= num ; i++) {
			String blank = new String(new char[num-i]).replace("\0", " ");
			String star = new String(new char[i]).replace("\0", "*");
			if(num != i) {
				bw.write(blank + star + "\n");
			}else {
				bw.write(blank + star);
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
