import java.util.*;

public class Budget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        // ���� �� ���� ���� �� result�� ���� Ŀ��
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            // ó������ �ʹ� Ŭ �� -> testcase 3��
            if(d[i] > budget){
                answer = -1;
                break;
            }
            // �⺻
            if(sum <= budget){
                sum += d[i];
                // ���ߴ��� budget���� Ŀ���� ��
                if(sum > budget)
                    break;
                answer = i;     // �� ���� i���� answer�� ����
            }
            
        }
        return answer + 1;
    }
}