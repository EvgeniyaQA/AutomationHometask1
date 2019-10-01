public class Task3 {
    public static void main(String[] args) {
        int age =10;
           String name;
        name = "Ivanov";

        if (age >= 0 && age <= 12) {
            System.out.println("Insurance for " + name + " " + "10$");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Insurance for " + name + " " + "20$");
        } else if (age >= 20 && age <= 39) {
            System.out.println("Insurance for " + name + " " + "30$");
        } else if (age >= 40 && age <= 59) {
            System.out.println("Insurance for " + name + " " + "40$");
        } else {
            System.out.println("Wrong age!");
        }
    }
}
