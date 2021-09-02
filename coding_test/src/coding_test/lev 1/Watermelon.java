package coding_test;

public class Watermelon {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++){
            if (i % 2 == 0){
                answer += "¼ö";
            }
            else {
                answer += "¹Ú";
            }
        }
        return answer;
    }
}