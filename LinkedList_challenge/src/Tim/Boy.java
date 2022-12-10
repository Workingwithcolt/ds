package Tim;

public abstract class Boy {
    private String name;
    private int age;
    public Boy(String name,int age){
        this.age = age;
        this.name =name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
