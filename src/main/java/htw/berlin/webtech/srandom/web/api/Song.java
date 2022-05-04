/**
 * Datenhaltungs Klasse Song mit Variablen, Setter und Getter Methoden
 * This is the Java Object containing all the Information for further processing
 */

package htw.berlin.webtech.srandom.web.api;

public class Song {
    private long id;
    private String titel;
    private String genre;
    private String songLink;
    private String autor;
    private long erscheinungsdatum;

    public Song(long id, String titel, String genre, String songLink, String autor, long erscheinungsdatum) {
        this.id = id;
        this.titel = titel;
        this.genre = genre;
        this.autor = autor;
        this.songLink = songLink;
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getSongLink() {
        return songLink;
    }

    public void setSongLink(String songLink) {
        this.songLink = songLink;
    }

    public long getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(long erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }
}
