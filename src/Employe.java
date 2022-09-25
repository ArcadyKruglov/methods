public class Employe {
    private String name;
    private String email = "не задан";
    private int phoneNumber;


    public Employe(String name, String email) {
        this.name = name;
        this.email = email;
        this.phoneNumber = 0;
    }

    public Employe(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Employe(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Е-мейл: " + email);
        System.out.println("Телефон: " + phoneNumber);
    }
}
