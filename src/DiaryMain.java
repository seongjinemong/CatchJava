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

}