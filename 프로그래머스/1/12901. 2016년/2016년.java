import java.time.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = ""+dayOfWeek;
        answer = answer.substring(0,3);
        return answer;
    }
}