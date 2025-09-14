public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(fullName, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printInfo() {
        System.out.println(getFullName() + ": сила магии " + getMagicPower() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", трудолюбие " + hardWork + ", верность " + loyalty + ", честность " + honesty);
    }

    public void compareStudents(Hufflepuff student2) {
        int student1Power = this.hardWork + this.loyalty + this.honesty;
        int student2Power = student2.hardWork + student2.loyalty + student2.honesty;
        if (student1Power > student2Power) {
            System.out.println(this.getFullName() + " лучший пуффиндуец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший пуффиндуец, чем " + this.getFullName());
        }
    }
}
