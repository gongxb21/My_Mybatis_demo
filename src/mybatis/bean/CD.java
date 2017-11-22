package mybatis.bean;
/**
 * 随书赠送的CD
 * @author gongxb
 *
 * 2017年11月22日
 */
public class CD {
	private String size;
	private String name;
	private String bookId;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CD [size=" + size + ", name=" + name + ", bookId=" + bookId + "]";
	}
	
}
