import java.util.*;
public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abaaacdaafg";
		int ee = LLS(s);

	}
	
	public class solution{
		public List<Integer> slidingwindow(String s, String t){
			List<Integer> result = new LinkedList<>();
			if (t.length()>s.length()) return result;
			
			HashMap<Character, Integer> map = new HashMap<>();
			for (char c:t.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			
			int counter = map.size();
			int start = 0;
			int end = 0;
			int len = Integer.MAX_VALUE;
			
			while(end < s.length()) {
				char c = s.charAt(end);
				
				if(map.containsKey(c)) {
					map.put(c, map.get(c)-1);
					if (map.get(c) == 0) counter--;
				}
				end++;
				
				while(counter == 0) {
					char tempc = s.charAt(start);
					if (map.containsKey(tempc)) {
						map.put(tempc, map.get(tempc)+1);
						if (map.get(tempc)>0) counter++;
					}
					start++;
				}
			}
			return result;
		}
	}
	
	public static int LLS(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int start = 0;
		int end = 0;
		int counter = 0;
		int d = 0;
		
		//算法原理：创建一个sliding window，遍历整个string。记录下并比较所有的substring的长度，返回最大值。
		
		//start记录sliding window的第一个character的位置
		//end记录sliding window的最后一个character的位置, end永远从0遍历到string的长度
		//counter记录是否有重复字母，是为1，不是为0；
		//d记录sliding window的最长长度，永远等于end - start，所以sliding window的长度有start决定
		
		while (end < s.length()) {
			
			char c = s.charAt(end);
			map.put(c , map.getOrDefault(c, 0)+1);
			//此处map记录sliding window内每个character的频率，因为每当出现重复的字母时sliding window就会右移，所以频率只会为0，1或2.
			
			if (map.get(c)>1) counter++;
			end++;
			System.out.println(end);
			
			while (counter > 0) {
				//当counter为1时，从sliding window的最左端start开始右移，指导找到重复的字母，counter恢复为0
				char chartemp = s.charAt(start);
				if (map.get(chartemp)>1) counter--;
				map.put(chartemp, map.get(chartemp)-1);
				//sliding window右移时，被移除的字母的频率也要相应减少。
				System.out.println(chartemp);
				start++;
			}
			d = Math.max(d, end-start);
		}
		return d;
	}
	
	
	
	public static int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start = 0, end = 0, counter = 0, len = 0;
        
        while(end < s.length()){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) == 1) counter++;//new char
            end++;
            
            while(counter > 2){
                char cTemp = s.charAt(start);
                map.put(cTemp, map.get(cTemp) - 1);
                if(map.get(cTemp) == 0)counter--;
                start++;
            }
            
            len = Math.max(len, end-start);
        }
        return len;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
