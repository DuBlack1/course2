package Homework_2_2;

public class main {
    public static void main(String[] args){
        Gryffindor HarryPotter = new Gryffindor("Harry Potter", 91, 50, 97, 100, 100);
        Gryffindor HermioneGranger = new Gryffindor("Hermione Granger", 100, 71, 95, 98, 78);
        Gryffindor RonWeasley = new Gryffindor("Ron Weasley", 74, 51, 98, 87, 83);

        Ravenclaw ZhouChang = new Ravenclaw("Zhou Chang", 50,100,55,23,79);
        Ravenclaw PadmaPatil = new Ravenclaw("Padma Patil", 65,38,78,67,78);
        Ravenclaw MarcusBelby = new Ravenclaw("Marcus Belby", 45,67,86,76,89);

        Hufflepuff ZachariasSmith = new Hufflepuff("Zacharias Smith", 58,76,89,65,89);
        Hufflepuff CedricDiggory = new Hufflepuff("Cedric Diggory", 67,89,98,78,67);
        Hufflepuff JustinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 58,57,34,26,89);

        Slytherin DracoMalfoy = new Slytherin("Draco Malfoy",100, 78,89,98,89);
        Slytherin GrahamMontagu = new Slytherin("Graham Montagu",67,57,78,89,70);
        Slytherin GregoryGoyle = new Slytherin("Gregory Goyle",58,8,89,78,89);


        System.out.println(HarryPotter);
    }
}
