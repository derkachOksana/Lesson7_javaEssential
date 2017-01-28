package Task_7_1;

/**
 * Created by lion on 28.01.17.
 */
public enum Animals {
    CAT(3), DOG(4), LION(8), TIGER(12);

    private int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal is " + super.toString() + "," + " age = " + age;
    }
}
