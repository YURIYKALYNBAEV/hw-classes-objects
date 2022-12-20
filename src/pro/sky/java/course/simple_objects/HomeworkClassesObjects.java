package pro.sky.java.course.simple_objects;

public class HomeworkClassesObjects {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Author authorNameTolstoy = new Author("Л.Н.Толстой");
        Author authorNameDostoevsky = new Author("Ф.М.Достоевский");

        Book bookNameTolstoy = new Book("Война и мир", authorNameTolstoy, 1867);
        System.out.println("Название книги - " + bookNameTolstoy.getBookName() + " автор - " +
                authorNameTolstoy.getAuthorName() + " год публикации книги - " + bookNameTolstoy.getPublishingYear());

        Book bookNameDostoevsky = new Book("Преступление и наказание", authorNameDostoevsky, 1866);
        System.out.println("Название книги - " + bookNameDostoevsky.getBookName() + " автор - " +
                authorNameDostoevsky.getAuthorName() + " год публикации книги - " + bookNameDostoevsky.getPublishingYear());

        bookNameTolstoy.setPublishingYear(1868);
        System.out.println("Год публикации книги - " + bookNameTolstoy.getPublishingYear());
    }

}
