public class Investment {
    public static void main(String[]args){
        double interest = 0;
        int years= 0;
        do{
            interest += 2500*0.075;
            years+=1;
        }while(interest+2500 <=5000);
        System.out.print("It would take "+years+" years.");
    }
}
