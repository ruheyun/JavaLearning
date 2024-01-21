package cn.ruheyun.teststudy7;

public class Rabbit {
    public static void main(String[] args) {
        int month = 12;
        int numRabbit = RabbitRecursion(month);
        System.out.println(numRabbit);
    }
    public static int RabbitRecursion(int month){
        if (month == 1 || month == 2){
            return 1;
        }
        return RabbitRecursion(month - 1) + RabbitRecursion(month - 2);
    }
}
