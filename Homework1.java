import java.util.Scanner;
class Homework1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int result = 0 ;
        for(int i = 0 ; i<5 ;i++) {
            int num = sc.nextInt();
            System.out.println("정수를 입력하세요 :  " + num);
            result += num;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.", result);
        }
    }
}