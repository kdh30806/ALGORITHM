import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Number_1620 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		HashMap<String, Integer> NametoNum = new HashMap<>();
		HashMap<Integer, String> NumtoName = new HashMap<>();
		for(int i = 1 ; i <= N ; i++) {
			String name = br.readLine();
			NametoNum.put(name, i);
			NumtoName.put(i, name);
		}
		
		for(int i = 1 ; i <= M ; i++) {
			String str = br.readLine();
			if(isNumeric(str)) { // 문자열이 숫자인지 아닌지 판별
				int num = Integer.parseInt(str);
				bw.write(String.valueOf(NumtoName.get(num)) + "\n");
			}else {
				bw.write(String.valueOf(NametoNum.get(str)) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static boolean isNumeric(String str) {
        try {
            // 문자열을 숫자로 변환하여 예외가 발생하지 않으면 숫자
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            // 예외가 발생하면 문자
            return false;
        }
    }
}
