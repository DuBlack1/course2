package Homework_2_2;

public class Hufflepuff extends hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public static void studentComparisonHufflepuff(Hufflepuff firstStudent, Hufflepuff secondStudent){
        int powerFirst = firstStudent.industriousness + firstStudent.loyalty + firstStudent.honesty;
        int powerSecond = secondStudent.industriousness + secondStudent.loyalty + secondStudent.honesty;
        if (powerFirst > powerSecond) {
            System.out.println(firstStudent.getFullName() + "является более лучшим учеником факультета чем" + secondStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + "является более лучшим учеником факультета чем" + firstStudent.getFullName());
        }
    }

    public Hufflepuff(String name, int abilityToConjure, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, abilityToConjure, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя " + fullName +
                ", сила магии " + abilityToConjure +
                ", растояние трансгрессии " + transgressionDistance +
                ", трудолюбивость " + industriousness +
                ", верность " + loyalty +
                ", храбрость " + honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        if (industriousness < 0 || industriousness> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty> 100){
            throw new RuntimeException("Введено неверное значение");
        }
        this.honesty = honesty;
    }

}

