package CoreHW1;

public class Robot implements Competitable {
    private int jumpHeight;
    private int runLenght;

    public Robot(int jumpHeight, int runLenght) {
        this.jumpHeight = jumpHeight;
        this.runLenght = runLenght;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("робот не смог перепрыгнуть");
        }
        else {
            System.out.println("робот перепрыгнул");
        }
    }


    @Override
    public void run(int length) {
        if (length > runLenght) {
            System.out.println("робот не смог пробежать");
        }
        else {
            System.out.println("робот пробежал");
        }
    }
}
