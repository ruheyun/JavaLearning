package cn.ruheyun.teststudy7;

public class Monkey {
    public static void main(String[] args) {
        System.out.println(NumPeach(1));
    }
    public static int NumPeach(int day){
        if (day == 10){
            return 1;
        }
        return (NumPeach(day + 1) + 1) * 2;
    }
}
