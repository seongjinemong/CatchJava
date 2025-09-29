import java.util.*;

public class Main {
    public static void main(String[] args) {
        AirConditioner 에어컨1 = new AirConditioner();

        System.out.println(에어컨1.on);

        에어컨1.turnOn();

        System.out.println(에어컨1.on);
        System.out.println(에어컨1.getTemp());

        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        에어컨1.tempUP();
        System.out.println(에어컨1.getTemp());
    }
}

class AirConditioner {
    int temp;
    boolean on;

    public AirConditioner() {
        on = false;
    }

    public void turnOn() {
        // 1. 켜짐으로 바꾸기
        this.on = true;

        // 기본온도 20도로 설정
        this.temp = 20;
    }

    public void tempUP() {
        // this.temp = this.temp + 1;

        if(this.temp > 28) {
            return;
        }

        this.temp++;

        // this.temp += 1;
    }

    public void tempDOWN() {
        // this.temp = this.temp - 1;

        this.temp--;

        // this.temp -= 1;
    }

    public int getTemp() {
        return this.temp;
    }
}