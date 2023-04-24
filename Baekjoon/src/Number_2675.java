import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 테스트케이스 횟수
		
		for(int i = 0 ; i < N ; i++) {
			String[] line = br.readLine().split(" ");
			int R = Integer.parseInt(line[0]);
			String S = line[1];
			String P = "";
			
			for(int i2 = 0 ; i2 < S.length() ; i2++) {
				String temp = String.valueOf(S.charAt(i2));
				P += new String(new char[R]).replace("\0", temp);
			}
			
			bw.write(P + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
