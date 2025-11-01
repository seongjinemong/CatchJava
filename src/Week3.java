import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {

        System.out.println("--- 3주차: 조건문 (if) ---");
        int score = 85;

        // 3주차: if-else if-else 조건문
        if (score >= 90) {
            System.out.println("A등급 입니다.");
        } else if (score >= 80) {
            System.out.println("B등급 입니다.");
        } else {
            System.out.println("C등급 이하입니다.");
        }

        // 3주차: 비교 연산자 (==, !=, >, <) 및 논리 연산자 (&&, ||, !)
        int number = 15;
        if (number > 10 && number % 2 == 0) { // 10보다 크고(AND) 짝수인가?
            System.out.println("10보다 큰 짝수입니다.");
        } else if (number < 10 || number % 2 != 0) { // 10보다 작거나(OR) 홀수인가?
            System.out.println("10보다 작거나 홀수입니다.");
        }

        // 3주차: 삼항 연산자
        String type = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(number + "는 " + type + "입니다.");


        System.out.println("\n--- 3주차: 반복문 (for, while) ---");
        // 3주차: for 반복문 (1부터 5까지 출력)
        System.out.println("for 반복문:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3주차: while 반복문 (1부터 5까지 출력)
        System.out.println("while 반복문:");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // 3주차: do-while 반복문 (최소 한 번 실행)
        System.out.println("do-while 반복문:");
        int k = 10; // 조건(k <= 5)이 처음부터 거짓이지만
        do {
            System.out.println("do-while 실행됨 (k=" + k + ")");
            k++;
        } while (k <= 5); // 조건 검사는 나중에 함

        // 3주차: 중첩 for 반복문 (구구단 2단)
        System.out.println("중첩 for (구구단 2단):");
        for (int m = 2; m <= 2; m++) {
            for (int n = 1; n <= 9; n++) {
                System.out.printf("%d * %d = %d\n", m, n, m * n);
            }
        }

        // 3주차: break (반복문 탈출) 및 continue (다음 반복으로 건너뛰기)
        System.out.println("break와 continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 짝수면 출력하지 않고 건너뜀
            }
            if (i == 7) {
                break; // 7이면 반복문 전체를 탈출
            }
            System.out.print(i + " "); // 1 3 5 출력
        }
        System.out.println();


        System.out.println("\n--- 추가: 배열 (Array) ---");
        // 1. 배열 선언 및 초기화 (5칸짜리 정수 배열)
        int[] numbers = new int[5];

        // 2. 배열 요소에 값 할당
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // 3. 배열 요소 접근 (index는 0부터 시작)
        System.out.println("배열의 2번째 요소: " + numbers[1]); // 20
        System.out.println("배열의 3번째 요소: " + numbers[2]); // 30

        // 4. 선언과 동시에 초기화
        String[] fruits = {"사과", "바나나", "딸기"};
        System.out.println("과일 배열의 길이: " + fruits.length);

        // 5. 배열과 for-each 반복문 (향상된 for문)
        System.out.println("과일 목록:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}