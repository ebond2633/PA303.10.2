abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class BookList extends Book{

    @Override

    void setTitle(String s){
        title = s;
    }
}