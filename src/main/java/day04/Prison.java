package day04;

public class Prison {
    private boolean[] cells = new boolean[100];

    public boolean[] getCells() {
        return cells;
    }

    public void openFreeCells() {
        int day = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = day; j < cells.length; j += (day + 1)) {
                cells[j] = !cells[j];
            }
            day++;
        }
    }
}
