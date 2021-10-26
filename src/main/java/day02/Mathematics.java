package day02;

public class Mathematics {
    public boolean isPrime(int number){
        boolean prime = true;
        if ((number % 2 == 0) && (number != 2)) {
            prime = false;
            return prime;
        } else {
            for (int i = 3; i < number; i += 2) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }
}
