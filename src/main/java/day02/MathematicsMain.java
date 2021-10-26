package day02;

public class MathematicsMain {
    public static void main(String[] args) {
        Mathematics math = new Mathematics();

        System.out.println("2" + math.isPrime(2));
        System.out.println("3" + math.isPrime(3));
        System.out.println("7" + math.isPrime(7));
        System.out.println("8" + math.isPrime(8));
        System.out.println("11" + math.isPrime(11));
        System.out.println("15" + math.isPrime(15));
        System.out.println("19" + math.isPrime(19));
        System.out.println("22" + math.isPrime(22));
        System.out.println("23" + math.isPrime(23));
        System.out.println("29" + math.isPrime(29));
        System.out.println("281" + math.isPrime(281));
        System.out.println("5184" + math.isPrime(5184));
        System.out.println("21848451" + math.isPrime(21848451));
    }
}
