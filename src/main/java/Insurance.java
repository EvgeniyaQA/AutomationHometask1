public class Insurance{
    public int getInsurance(int age) {
        if (age >= 0 && age <= 12) {
return 10;
        } else if (age >= 13 && age <= 25) {
return 20 ;
        } else if (age >= 26 && age <= 45) {
return 30;
        } else if (age >= 46 && age <= 60) {
return 40;
        } else {
            System.out.println("Sorry, wrong age!");
        }
        return age;
    }



}
