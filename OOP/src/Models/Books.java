package Models;

public class Books {
    private int Id;
    private String title;
    private String author;
    private int publicationyear;

    public void SetId(int id){
        this.Id=id;
    }
    public void Settitle(String title){
        this.title=title;
    }
    public void Setauthor(String author){
        this.author=author;
    }
    public void Setpublicationyear(int publicationyear){
        this.publicationyear=publicationyear;
    }
    public int getId(){
        return this.Id;
    }
    public String getauthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public int getpublicationyear(){
        return this.publicationyear;
    }
    public boolean IsEqualId(int id){
        return  this.Id==id;
    }
    public Books(String title,String author,int publicationyear){
        this.title=title;
        this.author=author;
        this.publicationyear=publicationyear;
    }




}
