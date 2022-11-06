public class MyClass {
    private String name;
    private String surName;
    private int age;
    private String[] peaksoft;
    private  String food;

    public MyClass() {

    }

    public MyClass(String name, String surName, int age, String[] peaksoft, String food) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.peaksoft = peaksoft;
        this.food = food;
    }

    public MyClass(String name, String surName,int age,String food) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this. food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getPeaksoft() {
        return peaksoft;
    }

    public void setPeaksoft(String[] peaksoft) {
        this.peaksoft = peaksoft;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
