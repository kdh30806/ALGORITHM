import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Number_10815 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<String, String> people = new HashMap<>();
		for(int i = 0 ; i < N ; i++) {
			String[] array = br.readLine().split(" ");
			if(array[1].equals("enter")) {
				people.put(array[0], array[1]);
			}else if(array[1].equals("leave")) {
				people.remove(array[0]);
			}
		}
		
		List<String> peopleList = new ArrayList<>(people.keySet());
		peopleList.sort((s1, s2) -> s2.compareTo(s1));
		peopleList.forEach((name) -> {
			try {
				bw.write(name + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		br.close();
		bw.flush();
		bw.close();
	}

}
