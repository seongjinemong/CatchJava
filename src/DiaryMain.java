public class DiaryMain {
    public static void main(String[] args) {
        MyPreciousDiary myDiary = new MyPreciousDiary();
        MyPreciousDiary myDiary_withDate = new MyPreciousDiary(2025, 11, 3);

        for(int i=0; i<8; i++) {
            myDiary.writeDiary(i + "번째 일기 ><");
        }

        System.out.println(myDiary.createdAt());
        System.out.println(myDiary.getNumDiary());
        System.out.println(myDiary.getDiary(2));

        for(int i=0; i<10; i++) {
            myDiary_withDate.writeDiary(i + "번째 >< 일기 ><");
        }

        System.out.println(myDiary_withDate.createdAt());
        System.out.println(myDiary_withDate.getDiary(4));
    }
}

class MyPreciousDiary {
    int year, month, day;
    String[] diary = new String[10];
    int numDiary = 0; // 지금까지 적은 일기 수

    public MyPreciousDiary() {
        this.year = 2025;
        this.month = 1;
        this.day = 1;
    }

    public MyPreciousDiary(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String createdAt() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public int getNumDiary() {
        return numDiary;
    }

    public void writeDiary(String text) {
        diary[numDiary] = text;
        numDiary++;
    }

    public String getDiary(int num) {
        return diary[num];
    }
}