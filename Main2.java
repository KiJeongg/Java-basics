//Q2. 별 표시하기
// 줄이 바뀔때마다 별도 하나씩 늘리기

public class Main2 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i += 1; //while 수행 시 1씩 증가
            if (i > 5) {// i가5보다 크면 while문 벗어남
                break;
            }
            for (int j = 0; j < i; j++) { //i값만큼 *출력
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}

