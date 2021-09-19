package coding_test;

public class LCM {
	public static int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j=i+1;j<arr.length;j++) {
		    		  answer =lcm(arr[i],arr[j]);
		    	  }
        }
        return answer;
    }
	
    public static void main(String[] args) {
		int[] arr = {8,2,14,6};
		System.out.print(solution(arr));
	}
		 
    static int gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
    
    static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
}

class Solution {
    
}