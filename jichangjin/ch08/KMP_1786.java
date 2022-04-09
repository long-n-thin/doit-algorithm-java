package jichangjin.ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMP_1786 {

	static String p;
	static String t;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = br.readLine(); // target
		p = br.readLine(); // pattern
		
		int result = bfMatch();
		System.out.println(result);

	}

	private static int bfMatch() {

		int ct = 0; // target cursor;
		int cp = 0; // pattern cursor;

		while (ct != t.length() && cp != p.length()) {
			if (t.charAt(ct) == p.charAt(cp)) {
				ct++;
				cp++;
			} else {
				ct = ct - cp + 1;
				cp = 0;
			}
		}

		if (cp == p.length()) {
			return ct - cp;
		} 
		
		return -1; // 검색 실패
	}
}
