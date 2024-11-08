package Easy;

public class NodeLagu {
    String JudulLagu;
    String NamaArtis;
    int TahunRilis;
    int Durasi;
    String Genre;
    NodeLagu next;
    NodeLagu prev;

    public NodeLagu(String JudulLagu, String NamaArtis, int TahunRilis, int Durasi, String Genre) {
        this.JudulLagu = JudulLagu;
        this.NamaArtis = NamaArtis;
        this.TahunRilis = TahunRilis;
        this.Durasi = Durasi;
        this.Genre = Genre;
        this.next = null;
        this.prev = null;
    }
}
