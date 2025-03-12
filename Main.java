//Q1. 3의 배수의 합 구하기
//while 문을 사용해 1 부터 1000 까지의 자연수 중 3 의 배수의 합을 구해 보자.


public class Main {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while (i<1000) {
            if(i%3==0){
                result +=i;
            }
            i +=1;
        }
        System.out.println(result);
    }
}