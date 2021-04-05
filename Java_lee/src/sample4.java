import java.io. *;

public class sample4 {

	public static void main(String[] args) throws IOException {
			
		System.out.println("문자열을 입력하세요");
		
		BufferedReader br =
				new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(str + "이 입력됐습니다");

	}

}
