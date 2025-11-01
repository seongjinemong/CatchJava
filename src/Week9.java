public class Week9 {
    public static void main(String[] args) {
        // --- 4주차 복습: 객체 생성 (인스턴스화) ---
        // 생성자 오버로딩 1 사용
        Calculator myCalc = new Calculator("삼성");

        // 생성자 오버로딩 2 사용
        Calculator basicCalc = new Calculator();

        System.out.println("\n--- 메서드 오버로딩 테스트 ---");

        // 1. 오버로딩 1 (add(int, int)) 호출
        int result1 = myCalc.add(10, 20);
        System.out.println("결과1: " + result1); // 결과1: 30

        // 2. 오버로딩 2 (add(int, int, int)) 호출
        int result2 = myCalc.add(10, 20, 30);
        System.out.println("결과2: " + result2); // 결과2: 60

        // 3. 오버로딩 3 (add(double, double)) 호출
        double result3 = myCalc.add(3.14, 1.59);
        System.out.println("결과3: " + result3); // 결과3: 4.73
    }
}

// 4주차 복습: 'Calculator'라는 이름의 클래스(설계도)를 정의합니다.
class Calculator {

    // 1. 속성 (필드)
    // 이 계산기를 만든 제조사 이름을 저장합니다.
    private String manufacturer;

    // 2. 생성자 (Constructor) - 4주차 복습 [cite: 56]
    // 객체가 처음 생성될 때 호출됩니다.
    public Calculator(String manufacturer) {
        this.manufacturer = manufacturer;
        System.out.println(this.manufacturer + " 계산기 생성 완료!");
    }

    // --- 9주차: 메서드 오버로딩 (Method Overloading) ---
    // 오버로딩 1: 정수(int) 2개를 더하는 add 메서드
    public int add(int a, int b) {
        System.out.println("정수 2개 덧셈 실행");
        return a + b;
    }

    // 오버로딩 2: 정수(int) 3개를 더하는 add 메서드
    // (이름은 'add'로 같지만, 매개변수의 '개수'가 다릅니다.)
    public int add(int a, int b, int c) {
        System.out.println("정수 3개 덧셈 실행");
        return a + b + c;
    }

    // 오버로딩 3: 실수(double) 2개를 더하는 add 메서드
    // (이름은 'add'로 같지만, 매개변수의 '타입'이 다릅니다.)
    public double add(double a, double b) {
        System.out.println("실수 2개 덧셈 실행");
        return a + b;
    }

    // 참고: 생성자 오버로딩
    // 메서드뿐만 아니라 4주차에 배운 생성자(Constructor)도 오버로딩할 수 있습니다.

    // 생성자 오버로딩 1 (위에서 사용)
    // public Calculator(String manufacturer) { ... }

    // 생성자 오버로딩 2
    // (매개변수가 없는 기본 생성자)
    public Calculator() {
        this.manufacturer = "기본 모델"; // 매개변수가 없으면 "기본 모델"로 설정
        System.out.println(this.manufacturer + " 계산기 생성 완료!");
    }
}