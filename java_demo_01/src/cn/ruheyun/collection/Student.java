package cn.ruheyun.collection;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int Chinese;
    private int Math;
    private int English;


    public Student() {
    }

    public Student(String name, int age, int Chinese, int Math, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return Math
     */
    public int getMath() {
        return Math;
    }

    /**
     * 设置
     * @param Math
     */
    public void setMath(int Math) {
        this.Math = Math;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", Math = " + Math + ", English = " + English + ", Sum =" + (Chinese + Math + English) + "}";
    }

    @Override
    public int compareTo(Student o) {
        int sum1 = this.getChinese() + this.getMath() + this.getEnglish();
        int sum2 = o.getChinese() + this.getMath() + this.getEnglish();

        int i = sum1 - sum2;
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
