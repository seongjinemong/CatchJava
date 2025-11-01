// 4주차: 클래스 정의 (설계도)
// 'Car'라는 이름의 클래스를 생성합니다.
class Car {

    // 4주차: 속성 (멤버 변수)
    // 4주차: 제어자 (public, private)
    public String name; // public: 외부에서 접근 가능
    private int speed; // private: 이 클래스 내부에서만 접근 가능

    // 4주차: static 변수 (클래스 변수)
    // 객체들이 공유하는 변수입니다.
    public static int carCount = 0;

    // 4주차: 생성자
    // 객체가 'new' 키워드로 생성될 때 호출되는 특별한 메서드입니다.
    // 주로 속성을 초기화하는 데 사용됩니다.
    public Car(String carName) {
        // 'this'는 객체 자기 자신을 가리킵니다.
        this.name = carName;
        this.speed = 0; // 초기 속도는 0
        carCount++; // 새 차가 만들어질 때마다 static 변수 1 증가
        System.out.println(this.name + "가 생성되었습니다.");
    }

    // 4주차: 기능 (메서드)

    // 1. 반환값이 없는(void) 메서드
    public void beep() {
        System.out.println(this.name + "가 경적을 울립니다: 빵!");
    }

    // 2. 입력 변수(parameter)가 있는 메서드
    public void accelerate(int increase) {
        this.speed += increase;
        System.out.println(this.name + "가 속도를 올려 현재 " + this.speed + "km/h 입니다.");
    }

    // 3. 반환값(return)이 있는 메서드
    public int getCurrentSpeed() {
        return this.speed;
    }
}


// 4주차: psvm (public static void main)을 포함하는 메인 클래스
// 실제 프로그램이 실행되는 클래스입니다.
public class Week4 {

    public static void main(String[] args) {

        System.out.println("--- 4주차: 객체 생성 및 사용 ---");

        // 4주차: 객체 생성 (인스턴스화)
        // Car 클래스(설계도)를 바탕으로 'mercedes'라는 객체(실체)를 만듭니다.
        // new Car("벤츠 E클래스") -> Car 클래스의 생성자를 호출합니다.
        Car mercedes = new Car("벤츠 E클래스");

        // 두 번째 객체 생성
        Car bmw = new Car("BMW M3");

        // 4주차: 메서드 호출 (객체의 기능 사용)
        mercedes.beep();
        bmw.beep();

        mercedes.accelerate(30);
        bmw.accelerate(50);

        // 4주차: 속성 접근 (객체의 속성 조회)
        // name은 public이라 접근 가능
        System.out.println("첫 번째 차 이름: " + mercedes.name);

        // speed는 private이라 직접 접근 불가 (오류 발생)
        // System.out.println("두 번째 차 속도: " + bmw.speed);

        // private 변수는 메서드(getter)를 통해 접근해야 합니다.
        System.out.println("두 번째 차 현재 속도: " + bmw.getCurrentSpeed() + "km/h");

        // 4주차: static 변수 접근
        // static 변수는 클래스 이름으로 직접 접근합니다. (객체 공유)
        System.out.println("지금까지 생성된 총 차의 대수: " + Car.carCount);
    }
}