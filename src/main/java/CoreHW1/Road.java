package CoreHW1;

public class Road implements Overcomable {
    private int lenght;

    public Road(int lenght) {
        this.lenght = lenght;
    }
    public void overcome(Competitable competitable) {
        competitable.run(lenght);
    }
}
