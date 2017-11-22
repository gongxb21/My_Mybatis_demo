package mybatis.bean;

import java.util.List;

public class BookCd extends Book {
	private CD cd;
	private List<Chapter> chapters;
	

	public List<Chapter> getChapter() {
		return chapters;
	}

	public void setChapter(List<Chapter> chapter) {
		this.chapters = chapter;
	}

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}

	@Override
	public String toString() {
		super.toString();
		return "BookCd [cd=" + cd + ", chapter=" + chapters+"]";
	}
	
}
