package DAO;

import java.sql.SQLException;
import register.book;

public class bookdao {

    public void register.book (Book book);{

        String sql = "INSERT INTO BOOK (id, isbn, author_name, title, subtitle, publisher, book_subject, book_language, publication_date, page_numbers, book_genre) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PrepareStatement ps = null;

        try{
            ps = conexao.getconexao().prepareStatement(sql);
            ps.setint(parameterIndex:1, book.getid());
            ps.setint(parameterIndex:2, book.getisbn());
            ps.setString(parameterIndex:3, book.getauthor_name());
            ps.setString(parameterIndex:4, book.gettitle());
            ps.setString(parameterIndex:5, book.getsubtitle());
            ps.setString(parameterIndex:6, book.getpublisher());
            ps.setString(parameterIndex:7, book.getbook_subject());
            ps.setString(parameterIndex:8, book.getboo_language());
            ps.setint(parameterIndex:9, book.getpublication_date());
            ps.setint(parameterIndex:10, book.getpage_numbers());
            ps.setString(parameterIndex:11, book.getbook_genre());

            ps.execute();
            ps.close();
        

        }catch (SQLException e){

            //TODO Auto-generated catch block
            e.printStackTrace();
        }




    }

}
