package labEx3;

public class LabEx3 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Interstellar","Abhishek");
        Movie movie2 = new Movie("Iron man","MCU","Jon Favreau",130,2008,"Action");
//        Movie movie3 = new Movie(1);

        SpecialMovie specialMovie1 = new SpecialMovie("Inception", "Naa thaa","Naatha","Ithuvu Naatha");
        SpecialMovie specialMovie2 = new SpecialMovie("Iron Man 2","MCU","Jon Favreau",150,2012,"Action","Nane","naan");

        InternationalMovie internationalMovie1 = new InternationalMovie("Iron Man 3", "MCU","USA","English");
        InternationalMovie internationalMovie2 = new InternationalMovie("Avengers","MCU","Russo Brothers",200,2012,"Action","USA","English");

        System.out.println(movie1.showDetails());
        System.out.println(movie2.showDetails());
        System.out.println(specialMovie1.showDetails());
        System.out.println(specialMovie2.showDetails());
        System.out.println(internationalMovie1.showDetails());
        System.out.println(internationalMovie2.showDetails());
    }
}
