
public class Task2 {
    public static void main(String[] args) {


        String str= "834dd84784";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                counter++; }

        if (counter==0) {
            System.out.println("No letters");
        }else {

            System.out.println(counter + " letters.");
        }
        }
}





