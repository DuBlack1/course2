package Homework_2_2;

public class Ravenclaw extends hogwarts {
    private int mind;
    private int wit;
    private int creation;

    public static void studentComparisonRavenclaw(Ravenclaw firstStudent, Ravenclaw secondStudent){
        int powerFirst = firstStudent.mind + firstStudent.wit + firstStudent.creation;
        int powerSecond = secondStudent.mind + secondStudent.wit + secondStudent.creation;
        if (powerFirst > powerSecond) {
            System.out.println(firstStudent.getFullName() + "является более лучшим учеником факультета чем" + secondStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + "является более лучшим учеником факультета чем" + firstStudent.getFullName());
        }
    }

    public Ravenclaw(String name, int abilityToConjure, int transgressionDistance, int mind, int wit, int creation) {
        super(name, abilityToConjure, transgressionDistance);
        this.mind = mind;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Имя " + fullName +
                ", сила магии " + abilityToConjure +
                ", растояние трансгрессии " + transgressionDistance +
                ", ум " + mind +
                ", остроумие" + wit +
                ", креативность " + creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        if (mind < 0 || mind> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.mind = mind;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (wit < 0 || wit> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        if (creation < 0 || creation> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.creation = creation;
    }

}
