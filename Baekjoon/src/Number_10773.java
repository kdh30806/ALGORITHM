import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Number_10773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for(int i = 0 ; i < K ; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				numList.add(num);
			}else {
				numList.remove(numList.size() - 1);
			}
		}
		
		int anwser = 0;
		for(int i = 0 ; i < numList.size() ; i++) {
			anwser += numList.get(i);
		}
		
		bw.write(String.valueOf(anwser));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
