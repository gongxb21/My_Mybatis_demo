package mybatis.bean;

/**
 * �½�
 * @author gongxb
 *
 * 2017��11��22��
 */
public class Chapter {
	private String name;
	private String id;
	private String bookId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Chapter [name=" + name + ", id=" + id + ", bookId=" + bookId + "]";
	}
	
}
