package streams;

public class DummyMovie {
    private String name;
    private int likes;

    public DummyMovie(String name, int likes){
        this.name = name;
        this.likes = likes;
    }

    public int getLikes(){
        return likes;
    }
    public String getName(){
        return name;
    }
}
