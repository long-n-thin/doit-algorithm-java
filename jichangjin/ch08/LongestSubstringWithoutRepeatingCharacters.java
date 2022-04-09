package jichangjin.ch08;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {

		int result = lengthOfLongestSubstring("pwwkew");

		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {

		int l = 0;
		int r = 0;
		int max = 0;

		Set<Character> set = new HashSet<Character>();
		
		/*
		 * 주어진 문자열에서 중복 원소를 갖지 않는 가장 긴 부분 문자열 찾기
		 * 슬라이딩 윈도우 방식을 이용하면 시간 복잡도를 줄일 수 있다.
		 * 
		 * 
		 */

		while (r < s.length()) {
			if (r == s.length()) {
				break;
			}
			if (!set.contains(s.charAt(r))) {
				set.add(s.charAt(r++)); // set에 현재 탐색 중인 문자를 넣고 윈도우 크기 증가
				max = Math.max(r - l, max); // r - l 을 하면 중복 원소가 없는 부분 문자열의 길이를 구할 수 있다.
			} else {
				set.remove(s.charAt(l++)); // 중복을 만나면 중복 원소 전부 삭제. l과 r이 만나게 됨, l을 증가시킴으로써 윈도우를 오른쪽으로 옮긴다.
			}
		}
		return max;
	}
}
