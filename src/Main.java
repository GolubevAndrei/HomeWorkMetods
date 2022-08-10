public class Main {
    public static void main(String[] args) {
        Author Garcia = new Author("Габриэль", "Гарсиа Маркес");
        Author Conan = new Author("Артур Конан", "Дойл");
        Book soledad = new Book(Garcia.getFistName() + " " + Garcia.getLastName(), "Сто лет одиночества", 1967);
        Book WhiteCompany = new Book(Conan.getFistName() + " " + Conan.getLastName(), "Белый отряд", 1891);
        System.out.println("soledad = " + soledad.getBookName() + " " + soledad.getAuthorName() + " " + soledad.getBookYear());
        System.out.println("WhiteCompany = " + WhiteCompany.getBookName() + " " + WhiteCompany.getAuthorName() + " " + WhiteCompany.getBookYear());
        soledad.setBookYear(1984);
        System.out.println("soledad = " + soledad.getBookName() + " " + soledad.getAuthorName() + " " + soledad.getBookYear());
    }
}