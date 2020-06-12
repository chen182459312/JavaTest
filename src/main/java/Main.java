
class Persion {
    private int age;
    private  String [] name;
    private  String nick;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void setName(String [] name) {
        this.name = name;
    }
    public String getName() {
        return name[0];
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }
}

class Constructer {
    private String name;
    private int age;
    public Constructer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
}
public class Main {
    public static void main(String[] args) {
        Constructer constructer = new Constructer("Andy", 3);
        System.out.println(constructer.getAge());
        System.out.println(constructer.getName());
        int age = 10;
        Persion person = new Persion();

        person.setAge(age);
        System.out.println(person.getAge());
        age = 20;
        System.out.println(person.getAge());

        String nick = "Andy";
        person.setNick(nick);
        System.out.println(person.getNick());
        nick = "Tony";
        System.out.println(person.getNick());

        String[] fullname = new String[] { "Homer", "Simpson" };
        person.setName(fullname);
        System.out.println(person.getName());
        fullname[0] = "Andy";
        System.out.println(person.getName());

    }
}
