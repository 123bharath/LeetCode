package leetcode;
import java.util.*;
public class Longsubstring {
	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	    	LinkedList<Integer> list=new LinkedList<Integer>();
	    	int count=0;
	    	int longest=0;
	    	int idx=-1;
	        for(int i=0;i<s.length()-1;i++){
	            for(int j=i+1;j<s.length();j++){
	            	if(s.charAt(i)==s.charAt(j)) {
//	            		count++;
	            		longest=j-i;
	            		list.add(longest);
	            		System.out.println(s.charAt(j));
	            		System.out.println(j);
	            		break;		
	            	}
	            }   
	        }
            System.out.println(list);
            int max=0;
            for(int i : list) {
            	if(max<i) {
            		max=i;
            	}
            }
	        return max;
	    }
	}
	public static void main(String[] args) {
		Longsubstring lss= new Longsubstring();
		Solution sol= lss.new Solution();
//		lengthOfLongestSubstring = lss.new lengthOfLongestSubstring();
		int ans=sol.lengthOfLongestSubstring("abcabcbb");
		System.out.println(ans);
	}

}
