public class Person {
    private String firstname;
    private String lastname;
    private int age;
    int id;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname=lastname;
        this.age=age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

}
