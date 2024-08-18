import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Number_26069 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashSet<String> dancer = new HashSet<>();
		dancer.add("ChongChong");
		
		for(int i = 0 ; i < N ; i++) {
			String[] people = br.readLine().split(" ");
			if(dancer.contains(people[0])) dancer.add(people[1]);
			if(dancer.contains(people[1])) dancer.add(people[0]);
		}
		
		bw.write(String.valueOf(dancer.size()));
		br.close();
		bw.flush();
		bw.close();
	}

}
