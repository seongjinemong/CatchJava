// 2주차: Scanner 사용을 위한 import
import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {

        System.out.println("--- 2주차: 변수, 상수 ---");
        // 2주차: 변수 선언 및 초기화
        int myInt = 10; // 정수형
        double myDouble = 5.5; // 실수형
        char myChar = 'A'; // 문자형
        boolean myBoolean = true; // 논리형
        String myString = "Hello"; // 참조형 String

        // 2주차: 상수 (final) - 값을 변경할 수 없음
        final double PI = 3.14159;
        System.out.println("정수: " + myInt + ", 실수: " + myDouble + ", 문자열: " + myString);
        System.out.println("상수 PI: " + PI);

        System.out.println("\n--- 2주차: 연산자 ---");
        // 2주차: 산술 연산자 및 문자열 연결
        int sum = myInt + 20;
        int remainder = myInt % 3; // 나머지 연산자
        String greeting = myString + " Java!";
        System.out.println("덧셈: " + sum + ", 나머지: " + remainder);
        System.out.println("문자열 연결: " + greeting);

        // 2주차: 단항 연산자 (증감 연산자)
        int a = 5;
        System.out.println("전위 증가 ++a: " + (++a)); // 6 (실행 전 +1)
        System.out.println("후위 증가 a++: " + (a++)); // 6 (실행 후 +1)
        System.out.println("최종 a: " + a); // 7

        // 2주차: 산술 변환 (형변환)
        double d_val = (double)myInt; // int를 double로 변환
        int i_val = (int)myDouble; // double을 int로 변환 (소수점 버림)
        System.out.println("int 10을 double로: " + d_val);
        System.out.println("double 5.5를 int로: " + i_val);

        // 2주차: printf를 이용한 서식 출력
        System.out.printf("정수: %d, 실수: %.1f, 문자열: %s\n", myInt, myDouble, myString);

        System.out.println("\n--- 2주차: 입력 받기 ---");
        // 2주차: Scanner를 이용한 입력 받기
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine();

        System.out.println("나이를 입력하세요:");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput); // 문자열을 숫자로 변환

        System.out.println("안녕하세요, " + name + "님. " + age + "살이시군요.");

        // Scanner 자원 반납
        scanner.close();
    }
}