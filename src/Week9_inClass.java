public class Week9_inClass {
    public static void main(String[] args) {
        Calculator_inClass calculator1 = new Calculator_inClass("Samsung");

        int a=1, b=3;

        System.out.println(calculator1.getManufacturer());
        System.out.println(calculator1.add(2.0, 3.2));
        System.out.println(calculator1.subtract(2, 3));
    }
}

class Calculator_inClass{
    String manufacturer;

    public Calculator_inClass() {
        this.manufacturer = "Casio";
    }

    public Calculator_inClass(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int add(int a, int b) {
        System.out.println("정수가 입력되었습니다.");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("실수가 입력되었습니다.");
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

}