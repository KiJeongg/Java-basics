//Q4. 평균 점수 구하기
//70, 60, 55, 75, 95, 90, 80, 80, 85, 100 점수가 이렇게 있고
//for each 문을 사용하여 A 학급의 평균 점수를 구해 보자

public class Main4 {
    public static void main (String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 85, 100};
        int total = 0;
        for (int mark:marks) {
            total +=mark;
        }
        float average = (float) total / marks.length;
        System.out.println(average);
    }
}
