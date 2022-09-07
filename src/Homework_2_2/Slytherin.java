package Homework_2_2;

public class Slytherin extends hogwarts{
    private int cunning;
    private int ambition;
    private int resourcefulness;



    public static void studentComparisonSlytherin(Slytherin firstStudent, Slytherin secondStudent){
        int powerFirst = firstStudent.cunning + firstStudent.ambition + firstStudent.resourcefulness;
        int powerSecond = secondStudent.cunning + secondStudent.ambition + secondStudent.resourcefulness;
        if (powerFirst > powerSecond) {
            System.out.println(firstStudent.getFullName() + "является более лучшим учеником факультета чем" + secondStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + "является более лучшим учеником факультета чем" + firstStudent.getFullName());
        }
    }

    public Slytherin(String name, int abilityToConjure, int transgressionDistance, int cunning, int ambition, int resourcefulness) {
        super(name, abilityToConjure, transgressionDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return "Имя " + fullName +
                ", сила магии " + abilityToConjure +
                ", растояние трансгрессии " + transgressionDistance +
                ", хитрость " + cunning +
                ", амбиции " + ambition +
                ", находчивость " + resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.cunning = cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.resourcefulness = resourcefulness;
    }
}
