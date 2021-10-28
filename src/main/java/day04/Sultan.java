package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();

        prison.openFreeCells();
        System.out.println("Nyitott cellák:");
        for (int i = 0; i < prison.getCells().length; i++) {
            if (prison.getCells()[i]) {
                System.out.println((i + 1) + ". cella");    //sorszám az 1. cellával indul
            }
        }
    }
}
