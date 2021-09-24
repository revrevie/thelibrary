package librarysystem;

public class Comics {
    private String comicTitle;
    private String comicAuthor;
    private Long refNumber;

    public Comics(String comicTitle, String comicAuthor, Long refNumber){
        this.comicTitle = comicTitle;
        this.comicAuthor = comicAuthor;
        this.refNumber = refNumber;
    }

    public Comics(){

    }

    public void setComicTitle(String comicTitle){
        this.comicTitle =  comicTitle;
    }
    public String getComicTitle(){
        return comicTitle;
    }

    public void setComicAuthor(String comicAuthor){
        this.comicAuthor = comicAuthor;
    }
    public String getComicAuthor(){
        return comicAuthor;
    }

    public void setRefNumber(Long refNumber) {
        this.refNumber = refNumber;
    }
    public Long getRefNumber(){
        return refNumber;
    }
}
