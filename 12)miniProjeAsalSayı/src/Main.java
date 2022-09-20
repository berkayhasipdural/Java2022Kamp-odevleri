public class Main {

    public static void main(String[] args) {
	int number = 0;
    boolean isPrime = true;
    
    if (number<1) {
    	System.out.println("Asal sayýdan bahsedilemez ");
    	return;
    }

            if (number==1){
                System.out.println("Asal sayý deðildir.");
                return;
            }
           for (int i = 2; i < number; i++) {
               if (number % i == 0) {
                   isPrime = false;
               }
           }
            if(isPrime){
                System.out.println("Asal sayýdýr: " + number);
            } else{
                System.out.println("Asal sayý deðildir: " + number);
            }
        }

}