package Homework_2_2;

public class Gryffindor extends hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public static void studentComparisonGryffindor(Gryffindor firstStudent, Gryffindor secondStudent){
        int powerFirst = firstStudent.nobility + firstStudent.honour + firstStudent.bravery;
        int powerSecond = secondStudent.nobility + secondStudent.honour + secondStudent.bravery;
        if (powerFirst > powerSecond) {
            System.out.println(firstStudent.getFullName() + "является более лучшим учеником факультета чем" + secondStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + "является более лучшим учеником факультета чем" + firstStudent.getFullName());
        }
    }

    public Gryffindor(String name, int abilityToConjure, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, abilityToConjure, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Имя " + fullName +
                ", сила магии " + abilityToConjure +
                ", растояние трансгрессии " + transgressionDistance +
                ", благородство " + nobility +
                ", честь " + honour +
                ", храбрость " + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        if (honour < 0 || honour> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.bravery = bravery;
    }

}
