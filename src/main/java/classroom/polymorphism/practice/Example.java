package classroom.polymorphism.practice;

public class Example {
    public static void main(String[] args) {

        Author autorBookOne = new Author("dfhwlfw", "hdfsk@nfks.lv");

       // Book harryPotter = new Book("459555684","efdhvuoehto", new Author("ndhekwduhkw", "ejkdbk@dnsjkf.lv"),50,2558746);

        Book harryPotter = new Book("459555684","efdhvuoehto", autorBookOne,50,2558746);

        System.out.println(harryPotter);
        System.out.println("Book author is: " + harryPotter.getAuthor());
    }

}
