package cn.ruheyun.teststudy1;

public class test1 {
    public static void main(String[] args) {
        GirlFriend[] array = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("小诗诗",18,"女","看书");
        GirlFriend gf2 = new GirlFriend("小慧慧",20,"女","睡觉");
        GirlFriend gf3 = new GirlFriend("小呵呵",26,"女","玩游戏");
        GirlFriend gf4 = new GirlFriend("小喵喵",19,"女","学习");
        array[0] = gf1;
        array[1] = gf2;
        array[2] = gf3;
        array[3] = gf4;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getAge();
        }
        average = sum / array.length;
        System.out.println(array.length + "个女朋友的平均年龄为：" + average);
        int count = 0;
        GirlFriend[] array1 = new GirlFriend[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() < average){
                array1[count++] = array[i];
            }
        }
        System.out.println("年龄比平均值低的女朋友有" + count + "个");
        for (int i = 0; i < count; i++) {
            array1[i].printGirl();
        }
    }
}
