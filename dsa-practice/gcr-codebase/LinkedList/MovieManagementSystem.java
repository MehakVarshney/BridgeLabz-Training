
class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    // Constructor
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList {
    private MovieNode head;
    private MovieNode tail;

    // Add at Beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
 
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Movie added at beginning.");
    }

    //  Add at End
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Movie added at end.");
    }

     // Add at Specific Position 
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
    }

     //  Remove Movie by Title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        MovieNode temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
             } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Movie removed successfully.");
    }

    // Search by Director

    public void searchByDirector(String director){
        MovieNode temp= head;
        boolean found= false;
        
        while(temp != null){
            if(temp.director.equalsIgnoreCase(director)){
                displayMovie(temp);
                found= true;
            }
            temp= temp.next;
        }

        if(!found){
            System.out.println("No movies found for director: " + director);
        }
    }
        // Search by rating

     public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with rating >= " + rating);
    }

     // Update Movie Rating
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    //  Display Forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    //   Display Reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
     // Helper Method
    private void displayMovie(MovieNode m) {
        System.out.println("Title: " + m.title +
                ", Director: " + m.director +
                ", Year: " + m.year +
                ", Rating: " + m.rating);
    }

    
}
public class MovieManagementSystem {
    public static void main(String[] args) {
         MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        movies.addAtEnd("Avatar", "Cameron", 2009, 7.8);

        System.out.println("\nAll Movies (Forward):");
        movies.displayForward();

        System.out.println("\nAll Movies (Reverse):");
        movies.displayReverse();

        System.out.println("\nSearch by Director:");
        movies.searchByDirector("Nolan");

        System.out.println("\nUpdate Rating:");
        movies.updateRating("Avatar", 8.0);

        System.out.println("\nRemove Movie:");
        movies.removeByTitle("Interstellar");

        System.out.println("\nFinal Movie List:");
        movies.displayForward();
    
    }
}
