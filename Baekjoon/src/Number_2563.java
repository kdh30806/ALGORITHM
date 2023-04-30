import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number_2563 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] whiteSpace = new int[101][101]; // (0, 0) 부터 시작 (100, 100) 까지
		for(int i = 0 ; i < whiteSpace.length ; i++) {
			int[] temp = whiteSpace[i];
			 for (int j = 0; j < temp.length; j++) {
				 whiteSpace[i][j] = 0; // 흰색 도화지를 0으로 채움
	         }
		}
		int N = Integer.parseInt(br.readLine()); // 검은 색종이 갯수
		
		for(int i = 0 ; i < N ; i++) {
			String[] xy = br.readLine().split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			
			for(int a = x ; a < x + 10 ; a++) {
				for(int b = y ; b < y + 10 ; b++) {
					whiteSpace[a][b] = 1; // 검은색 종이를 붙인다.
				}
			}
		}
		
		int count = 0;
		
		for(int i = 0 ; i < whiteSpace.length ; i++) {
			int[] temp = whiteSpace[i];
			 for (int j = 0; j < temp.length; j++) {
				 if(whiteSpace[i][j] == 1) {
					 count++;
				 }
	         }
		}
		
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
