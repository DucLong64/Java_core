package OOP.Interface;

public class News implements INews {
    private static int count =0;
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates = new int[3]; 

    public News (String title, String publishDate, String author, String content, int[] rates) {
        this.id = ++count;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rates = rates;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void Calculate(){
        float sum=0;
        for(int i: rates){
            sum+=i;
        }
        this.averageRate = sum / rates.length;
    }
    @Override
    public void displayNews() {
        System.out.println(title+ " - " + publishDate+ 
                           " - " + author + " - " + content + 
                           " - Average Rate: " + averageRate);

    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("News ID: ").append(id)
                .append(", Title: ").append(title)
                .append(", Publish Date: ").append(publishDate)
                .append(", Author: ").append(author)
                .append(", Content: ").append(content)
                .append(", Average Rate: ").append(averageRate)
                .toString();
    }
}
