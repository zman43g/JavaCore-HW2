public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullName, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printInfo() {
        System.out.println(getFullName() + ": сила магии " + getMagicPower() +
                ", расстояние трансгрессии " + getTransgressionDistance() +
                ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery);
    }

    public void compareStudents(Gryffindor student2) {
        int student1Power = this.nobility + this.honor + this.bravery;
        int student2Power = student2.nobility + student2.honor + student2.bravery;
        if (student1Power > student2Power) {
            System.out.println(this.getFullName() + " лучший гриффиндорец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший гриффиндорец, чем " + this.getFullName());
        }
    }


}
