public class week10 {
    public static void main(String[] args) {
        System.out.println("=== 1. 객체 생성 및 상속(super) 동작 확인 ===");

        // Student 객체 생성
        Student studentKim = new Student("김철수", 20, "20241004");
        // Teacher 객체 생성
        Teacher teacherLee = new Teacher("이영희", 45, "과학");

        System.out.println("\n--- 상속된 introduce() 메서드 호출 (Student ---");
        studentKim.introduce(); // Student에서 오버라이딩하여 부모 정보와 자녀 정보를 모두 출력

        System.out.println("\n--- 상속된 eat() 메서드 호출 (Teacher) ---");
        teacherLee.eat();       // Person으로부터 상속받은 메서드

        System.out.println("\n=== 2. 오버라이딩(Overriding) 동작 확인 ===");

        System.out.print("Student의 work(): ");
        studentKim.work(); // Student에서 오버라이딩된 메서드 실행 (공부)

        System.out.print("Teacher의 work(): ");
        teacherLee.work(); // Teacher에서 오버라이딩된 메서드 실행 (가르침)

        System.out.println("\n=== 3. 캡슐화(Encapsulation) 및 Getter 확인 ===");

        // Student 객체를 Person 타입으로 참조 (다형성)
        Person personRef = new Student("박민지", 22, "20221234");

        // private 변수 name과 age에 직접 접근 불가 (컴파일 에러 발생)
        // System.out.println(personRef.name); // ERROR!

        // public Getter 메서드를 통해 private 변수 값 읽기
        System.out.println("Person 참조 변수에서 Getter 사용:");
        System.out.println("이름(getName()): " + personRef.getName());
        System.out.println("나이(getAge()): " + personRef.getAge());

        System.out.println("\n=== 4. 오버라이딩된 메서드가 여전히 동작하는지 확인 ===");
        personRef.work(); // Student의 오버라이딩된 work() 메서드 실행 (공부)
    }
}

class Person {
    private String name; // private으로 변경
    private int age;    // private으로 변경

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person 생성자 호출: " + name);
    }

    // ⭐ Getter 메서드 추가 ⭐
    // private 변수에 접근하기 위한 public 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 모든 사람이 하는 공통 동작
    public void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }

    // 기본적으로 정의된 '일하다' 동작
    public void work() {
        System.out.println(name + "이(가) 일반적인 일을 합니다.");
    }

    // 정보 출력 메서드
    public void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

class Student extends Person {
    private String studentId; // 학번

    // 생성자
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        System.out.println("Student 생성자 호출: " + name);
    }

    // 오버라이딩: work() 메서드
    @Override
    public void work() {
        // getName()을 사용하여 부모의 private name 변수에 간접 접근
        System.out.println(getName() + "이(가) **공부합니다.** (학번: " + studentId + ")");
    }

    // 오버라이딩: introduce() 메서드
    @Override
    public void introduce() {
        // super.introduce()를 호출하여 부모가 정의한 출력 방식 사용
        super.introduce();
        System.out.println("학번: " + studentId);
    }

    // 학생 고유의 동작
    public void attendClass() {
        System.out.println(getName() + "이(가) 수업에 출석합니다.");
    }
}

class Teacher extends Person {
    private String subject; // 담당 과목

    // 생성자
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher 생성자 호출: " + name);
    }

    // 오버라이딩: work() 메서드
    @Override
    public void work() {
        // getName()을 사용하여 부모의 private name 변수에 간접 접근
        System.out.println(getName() + "이(가) **" + subject + "을(를) 가르칩니다.**");
    }

    // 오버라이딩: introduce() 메서드
    @Override
    public void introduce() {
        // super.introduce()를 호출하여 부모가 정의한 출력 방식 사용
        super.introduce();
        System.out.println("담당 과목: " + subject);
    }

    // 선생 고유의 동작
    public void gradePapers() {
        System.out.println(getName() + "이(가) 시험지를 채점합니다.");
    }
}