import java.util.*;
public class Completion {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        //������ completion�� �� �� ª���ϱ�
        for(i = 0; i < completion.length; i++){
            // ���� ����� ã�Ƽ� �ٷ� return
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}