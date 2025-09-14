
public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = new Gryffindor[3];
        gryffindors[0] = new Gryffindor("Гарри Поттер",50,30,70,80,90);
        gryffindors[1] = new Gryffindor("Гермиона Грейнджер",60,50,20,70,50);
        gryffindors[2]= new Gryffindor("Рон Уизли",40,70,20,90,100);

        Slytherin[] slytherins = new Slytherin[3];
        slytherins[0] = new Slytherin("Драко Малфой",30, 60, 40,24,88,53, 90);
        slytherins[1] = new Slytherin("Грэхэм Монтегю",53, 51, 33,64,18,8, 54);
        slytherins[2] = new Slytherin("Грегори Гойл",15, 23, 50,28,51,61, 22);

        Ravenclaw[] ravenclaws = new Ravenclaw[3];
        ravenclaws[0] = new Ravenclaw("Чжоу Чанг",25,9,54,44,65,59);
        ravenclaws[1] = new Ravenclaw("Падма Патил",67,21,72,24,57,19);
        ravenclaws[2] = new Ravenclaw("Маркус Белби",51,19,34,24,22,75);

        Hufflepuff[] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0] = new Hufflepuff("Захария Смит", 24,98,44,55,48);
        hufflepuffs[1] = new Hufflepuff("Седрик Диггори", 99,98,77,52,78);
        hufflepuffs[2] = new Hufflepuff("Джастин Финч-Флетчли", 54,45,90,59,31);


        gryffindors[1].printInfo();
        slytherins[2].printInfo();
        ravenclaws[0].printInfo();
        hufflepuffs[0].printInfo();

        gryffindors[0].compareStudents(gryffindors[2]);
        hufflepuffs[0].compareStudents(hufflepuffs[2]);
        ravenclaws[2].compareStudents(ravenclaws[1]);
        slytherins[1].compareStudents(slytherins[0]);

        gryffindors[1].compareHogwartsStudents(hufflepuffs[1]);



    }
}
