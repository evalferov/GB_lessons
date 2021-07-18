package CoreHW1;

public class Cat implements Competitable {
    private int jumpHeight;
    private int runLenght;

    public Cat(int jumpHeight, int runLenght) {
        this.jumpHeight = jumpHeight;
        this.runLenght = runLenght;
    }

    @Override
    public void jump(int height) {
if (height > jumpHeight) {
    System.out.println("кот не смог перепрыгнуть");
} else {
    System.out.println("кот перепрыгнул");
}
}


    @Override
    public void run(int length) {
        if (length > runLenght) {
            System.out.println("кот не смог пробежать");
        }        else {
            System.out.println("кот пробежал");
        }
    }
}
