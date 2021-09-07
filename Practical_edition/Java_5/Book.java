import org.apache.commons.lang3.builder.*;

public class Book implementsComparable<Book>, Cloneable {
  private String title;
  private Date publishDate;
  private String comment;

  public int hashCode(){
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public boolean equals (Object o){
    return EqualsBuilder.reflectionEquals(this, o);
  }

  public int compareTo(Book o){
    return CompareToBuilder.reflectionCompare(
      this, o, "comment", "title");
  }

  public Book clone(){
    Book b = new Book();
    b.title = this.title;
    b.comment = this.comment;
    b.publishDate = (Date)this.publishDate.clone();
    return b;
  }

}