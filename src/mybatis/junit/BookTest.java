package mybatis.junit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import mybatis.bean.Book;
import mybatis.bean.BookCd;
import mybatis.bean.BookQueryVo;

public class BookTest {
	String resource = "sqlConfig.xml";
    // �õ������ļ���
    InputStream inputStream = null;
    @Test
	public void  findBookById() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//�����Ự����������mybatis�����ļ�����Ϣ
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	        // ͨ�������õ�SqlSession
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        
	        List<BookCd> list = sqlSession.selectList("BookMapper.findBookById",1000);
	       System.out.println("list.size="+list.size());
	        for(BookCd bc: list) {
	        	System.out.println(bc);
	        }
	        // �ͷ���Դ
	        sqlSession.close();
	}

	public void findBookByName() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
        //�����Ự����������mybatis�����ļ�����Ϣ
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // ͨ�������õ�SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        List<Book> book = sqlSession.selectList("BookMapper.findBookByName" ,"Java");
        
        for(Book bk:book) {
        	System.out.println(bk);
        }
        // �ͷ���Դ
        sqlSession.close();
	}

	public void getBookCount() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
        //�����Ự����������mybatis�����ļ�����Ϣ
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // ͨ�������õ�SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<String> list=new ArrayList<String>();
        list.add("1000");
        list.add("1002");
        int count = sqlSession.selectOne("BookMapper.getBookCount" ,list);
        
        	System.out.println(count);
        // �ͷ���Դ
        sqlSession.close();
	}

	
	public void updateBook() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//�����Ự����������mybatis�����ļ�����Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Book book=new Book();
		book.setTitle("Spring");
		book.setId(1001);
		int count= sqlSession.update("BookMapper.updateBook", book);
		System.out.println(count);
		sqlSession.commit();
		// �ͷ���Դ
		sqlSession.close();
	}
	
	public void delBook() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//�����Ự����������mybatis�����ļ�����Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Book book=new Book();
		book.setId(1001);
		int count= sqlSession.update("BookMapper.delBook", book);
		System.out.println(count);
		sqlSession.commit();//�����޸ģ�ɾ����һ��Ҫ�ύ����
		// �ͷ���Դ
		sqlSession.close();
	}

	public void insertBook() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//�����Ự����������mybatis�����ļ�����Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Book book=new Book();
		book.setId(1001);
		book.setTitle("title");
		book.setIsbn("123456");
		book.setIntro("1234");
		book.setCatalog("test");
		int count= sqlSession.update("BookMapper.insertBook", book);
		System.out.println(count);
		sqlSession.commit();//�����޸ģ�ɾ����һ��Ҫ�ύ����
		// �ͷ���Դ
		sqlSession.close();
	}

	public void getBooks() throws IOException {
		inputStream =  Resources.getResourceAsStream(resource);
		//�����Ự����������mybatis�����ļ�����Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Book book=new Book();
		book.setId(1001);
		book.setTitle("title");
		//book.setIsbn("123456");
		book.setIntro("1234");
		book.setCatalog("test");
		
		BookQueryVo bqv=new BookQueryVo();
		bqv.setBook(book);
		List<Book> list=  sqlSession.selectList("BookMapper.getBooks", bqv);
		for(Book bk:list) {
			
			System.out.println(bk);
		}

		// �ͷ���Դ
		sqlSession.close();
	}
}
