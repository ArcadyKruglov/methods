public class User {
    private String name = "";
    private int age = 0;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUserName() {
        return this.name;
    }

    public int getUserAge() {
        return this.age;
    }

    public void printUserInfo() {
        System.out.println("Пользователь: " + getUserName() + ", " + getUserAge() + getSufficsYear());
    }

    public String getSufficsYear() {
        int LastNumber = this.getUserAge() % 10;
        if (LastNumber == 1) return " год";
        if (LastNumber > 1 && LastNumber < 5) return " года";
        return " лет";
    }


}
