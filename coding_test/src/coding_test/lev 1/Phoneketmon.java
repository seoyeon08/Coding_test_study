package coding_test;

public class Phoneketmon {

	public static int main(int[] nums) {
		// TODO Auto-generated method stub
		int answer = 0;
        int [] arr = new int[200001];   //200000���� �ϸ� ��Ÿ�� ����;;
        for(int i = 0; i < nums.length; i++){
            if(arr[nums[i]] == 0){      //������
                answer ++;
            }
            arr[nums[i]]++;
        }
        if (answer > nums.length / 2){
            answer = nums.length / 2;
        }
        return answer;
	}

}


class Solution {
    public int solution(int[] nums) {
        
    }
}
