package mybatis.dao;

import java.util.List;

import mybatis.bean.Book;
import mybatis.bean.BookQueryVo;

public interface BookMapper {
	public Book findBookById(String id);
	public List<Book> findBookByName(String name);
	public int getBookCount(List<String> list);
	public int updateBook(Book book);
	public int delBook(Book book);
	public int insertBook(Book book);
	public List<Book> getBooks(BookQueryVo bqv);
}