package mybatis.junit;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import mybatis.bean.Book;

public class BookTest {
	String resource = "sqlConfig.xml";
    // 得到配置文件流
    InputStream inputStream = null;

	public void  findBookById() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//创建会话工厂，传入mybatis配置文件的信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	        // 通过工厂得到SqlSession
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        
	        Book book = sqlSession.selectOne("BookMapper.findBookById" ,1000);
	        
	        System.out.println(book);
	        // 释放资源
	        sqlSession.close();
	}

	public void findBookByName() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis配置文件的信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        List<Book> book = sqlSession.selectList("BookMapper.findBookByName" ,"Java");
        
        for(Book bk:book) {
        	System.out.println(bk);
        }
        // 释放资源
        sqlSession.close();
	}
	@Test
	public void getBookCount() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis配置文件的信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        int count = sqlSession.selectOne("BookMapper.getBookCount" ,"Java");
        
        	System.out.println(count);
        // 释放资源
        sqlSession.close();
	}
	
	public void updateBook() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//创建会话工厂，传入mybatis配置文件的信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Book book=new Book();
		book.setTitle("Spring");
		book.setId(1001);
		int count= sqlSession.update("BookMapper.updateBook", book);
		System.out.println(count);
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
	}
	
	public void delBook() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//创建会话工厂，传入mybatis配置文件的信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Book book=new Book();
		book.setId(1001);
		int count= sqlSession.update("BookMapper.delBook", book);
		System.out.println(count);
		sqlSession.commit();//进行修改，删除，一定要提交事务
		// 释放资源
		sqlSession.close();
	}

	public void insertBook() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//创建会话工厂，传入mybatis配置文件的信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Book book=new Book();
		book.setId(1001);
		book.setTitle("title");
		book.setIsbn("123456");
		book.setIntro("1234");
		book.setCatalog("test");
		int count= sqlSession.update("BookMapper.insertBook", book);
		System.out.println(count);
		sqlSession.commit();//进行修改，删除，一定要提交事务
		// 释放资源
		sqlSession.close();
	}
}
