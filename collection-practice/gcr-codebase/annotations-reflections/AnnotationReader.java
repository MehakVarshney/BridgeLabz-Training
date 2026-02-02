public class AnnotationReader {

    public static void main(String[] args) {

        Class<Project> clazz = Project.class;

        if (clazz.isAnnotationPresent(Author.class)) {

            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}
