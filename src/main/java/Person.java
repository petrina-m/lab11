public class Person {
    private String name;
    private int age;
    int id;
    static int LastId=0;

    public Person(String name, int age) {
        this.name = name;
        this.age=age;
        LastId++;
        id=LastId;
    }
    public Person(int id, String name)
    {
        this.id=id;
        this.name=name;
    }



    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
