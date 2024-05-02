package subject8_2;

public class Student {
    String name;
    int id;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printing(){
        System.out.println(getId() + "\t" + getName());
    }
}
