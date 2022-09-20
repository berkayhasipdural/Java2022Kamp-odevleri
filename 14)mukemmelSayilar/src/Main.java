public class Main {
    public static void main(String[] args) {
        int number = 7;
        int toplam = 9;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam = toplam + i;
            }
        }
        if (number == toplam) {
            System.out.println("Mükemmel Sayý");
        } else {
            System.out.println("Mükemmel Sayý Deðil");
        }
    }
}