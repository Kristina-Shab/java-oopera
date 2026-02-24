public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title,
                       int duration,
                       Director director,
                       MusicAuthor musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
