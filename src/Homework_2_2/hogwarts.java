package Homework_2_2;

public abstract class hogwarts {
    protected String fullName;
    protected int abilityToConjure;
    protected int transgressionDistance;

    public hogwarts(String fullName, int abilityToConjure, int transgressionDistance) {
        this.fullName = fullName;
        this.abilityToConjure = abilityToConjure;
        this.transgressionDistance = transgressionDistance;
    }

    public static void studentComparison(hogwarts firstStudent, hogwarts secondStudent){
        if(firstStudent.abilityToConjure > secondStudent.abilityToConjure || firstStudent.transgressionDistance > secondStudent.transgressionDistance){
            System.out.println(firstStudent.fullName + " превосходит " + secondStudent.fullName +" в силе магии и растоянии перемешения");
        }
        else if (firstStudent.abilityToConjure < secondStudent.abilityToConjure || firstStudent.transgressionDistance < secondStudent.transgressionDistance) {
            System.out.println(secondStudent.fullName + " превосходит " + firstStudent.fullName +" в силе магии и растоянии перемешения");
        }
        else if (firstStudent.abilityToConjure > secondStudent.abilityToConjure || firstStudent.transgressionDistance < secondStudent.transgressionDistance) {
            System.out.println(firstStudent.fullName + " превосходит " + secondStudent.fullName +" в силе магии, но слабее в растоянии перемешения");
        }
        else if (firstStudent.abilityToConjure < secondStudent.abilityToConjure || firstStudent.transgressionDistance > secondStudent.transgressionDistance) {
            System.out.println(secondStudent.fullName + " превосходит " + firstStudent.fullName +" в силе магии, но слабее в растоянии перемешения");
        }
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAbilityToConjure() {
        return abilityToConjure;
    }

    public void setAbilityToConjure(int abilityToConjure) {
        if (abilityToConjure < 0 || abilityToConjure> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.abilityToConjure = abilityToConjure;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance < 0 || transgressionDistance> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Имя" + fullName + '\'' +
                ", сила магии " + abilityToConjure +
                ", растояние трансгрессии " + transgressionDistance;
    }
}
