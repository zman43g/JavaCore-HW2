public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wise;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int magicPower, int transgressionDistance, int intellect, int wise, int wit, int creativity) {
        super(fullName, magicPower, transgressionDistance);
        this.intellect = intellect;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void printInfo() {
        System.out.println(getFullName() + ": сила магии " + getMagicPower() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", ум " + intellect + ", мудрость " + wise + ", остроумие " + wit +
                ", творчество " + creativity);
    }

    public void compareStudents(Ravenclaw student2) {
        int student1Power = this.intellect + this.wise + this.wit;
        int student2Power = student2.intellect + student2.wise + student2.wit;
        if (student1Power > student2Power) {
            System.out.println(this.getFullName() + " лучший котгевранец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший котгевранец, чем " + this.getFullName());
        }
    }
}
