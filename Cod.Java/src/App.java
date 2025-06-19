import register.book;

public class App {
    public static void main(String[] args) throws Exception {

        book b = new Book();
        b.setid(id: "5");
        b.setisbn(isbn:"9788539907793");
        b.author_name(author_name: "Claudio Vieira Oliveira" );
        b.title("Aprenda Lógica de Programacao e Algoritmos");
        b.subtitle("blablablav");
        b.publisher("blablablav");
        b.book_subject("blablablav");
        b.book_language("blablablav");
        b.publication_date("2004");
        b.page_numbers("200");
        b.book_genre("blablablav");

        new bookdao.java().book(b)

        
    }
}
