import java.util.Date;

public abstract class Document {
	private String title;
	private Date date;
	private String author;
	private PublishingLocation publishingLocation;
	
	public Document(String author, String title, Date date,String city,String state, String postCode) {
		this.author = author;
		this.title = title;
		this.date = date;
		this.setPublishingLocation(new PublishingLocation(city, state, postCode));
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean sameAuthor(Document article){
		return this.author.equals(article.getAuthor());
	}
	
	public String getTitle() {
		return title;
	}
	
	public Date getDate() {
		return date;
	}
	
	public int compareWithGeneralDate(Date date){
		return this.date.compareTo(date);
	}
	
	public int compareDates(Document article){
		return this.date.compareTo(article.getDate());
	}
	
	public PublishingLocation getPublishingLocation() {
		return publishingLocation;
	}

	public void setPublishingLocation(PublishingLocation publishingLocation) {
		this.publishingLocation = publishingLocation;
	}
	
	public String getCity() {
		return this.publishingLocation.getCity();
	}
	
	public String getState() {
		return this.publishingLocation.getState();
	}
	
	public String getPostCode() {
		return this.publishingLocation.getPostCode();
	}
}
