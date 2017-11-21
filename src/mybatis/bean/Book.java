package mybatis.bean;

public class Book {
    private Integer id;

    private String isbn;

    private String path;

    private String title;

    private String subtitle;

    private String originalTitle;

    private String marketPrice;

    private String binding;

    private String pages;

    private String author;

    private String publisher;

    private String supply;

    private Integer status;

    private Integer hot;
    private String intro;
    private String catalog;
    public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle == null ? null : originalTitle.trim();
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice == null ? null : marketPrice.trim();
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding == null ? null : binding.trim();
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages == null ? null : pages.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply == null ? null : supply.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", path=" + path + ", title=" + title + ", subtitle=" + subtitle
				+ ", originalTitle=" + originalTitle + ", marketPrice=" + marketPrice + ", binding=" + binding
				+ ", pages=" + pages + ", author=" + author + ", publisher=" + publisher + ", supply=" + supply
				+ ", status=" + status + ", hot=" + hot + "]";
	}
    
}