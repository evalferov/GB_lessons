package CoreHW1;

public class Human implements Competitable {
    private int jumpHeight;
    private int runLenght;

    public Human(int jumpHeight, int runLenght) {
        this.jumpHeight = jumpHeight;
        this.runLenght = runLenght;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("человек не смог перепрыгнуть");
        }
        else {
            System.out.println("человек перепрыгнул");
        }
    }


    @Override
    public void run(int length) {
        if (length > runLenght) {
            System.out.println("человек не смог пробежать");
        }
        else {
            System.out.println("человек пробежал");
        }
    }
}
