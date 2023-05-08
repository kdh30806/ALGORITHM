import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1032 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] str_array = new String[N];
		for(int i = 0 ; i < N ; i++) {
			str_array[i] = br.readLine();
		}
		
		StringBuilder pattern = new StringBuilder();
		for(int i = 0 ; i < str_array[0].length() ; i++) {
			for(int i2 = 0 ; i2 < str_array.length - 1 ; i2++) {
				
				// 1. 패턴이 다르면 = ?
				if(!String.valueOf(str_array[i2].charAt(i)).equals(String.valueOf(str_array[i2 + 1].charAt(i)))) {
					pattern.append("?");
					break;
				}
				
				// 2. 패턴이 같으면
				if(i2 == str_array.length - 2 && String.valueOf(str_array[i2].charAt(i)).equals(String.valueOf(str_array[i2 + 1].charAt(i)))) {
					// 2-1. 패턴이 같고 . 이면
					 if(String.valueOf(str_array[i2].charAt(i)).equals(".")){
						 pattern.append(".");
					 }else { // 2-2. 패턴이 같고 .이 아니면 알파벳 추가
						 pattern.append(String.valueOf(str_array[i2].charAt(i)));
					 }
				}
			}
		}
		
		if(N == 1) {
			bw.write(str_array[0]);
		}else {
			bw.write(pattern.toString());
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
