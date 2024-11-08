package Easy;

public class MainAsc {
    public static void main(String[] args) {
        StackLagu Playlist = new StackLagu();

        //Lagu Ascending
        Playlist.addLagu("Imagine", "John Lennon", 1971, 184, "Rock");
        Playlist.addLagu("Hotel California", "Eagles", 1977, 390, "Rock");
        Playlist.addLagu("Billie Jean", "Michael Jackson", 1982, 294, "Pop");
        Playlist.addLagu("Sweet Child O' Mine", "Guns N' Roses", 1987, 356, "Rock");
        Playlist.addLagu("Nothing Compares 2 U", "Sinéad O'Connor", 1990, 310, "Pop");
        Playlist.addLagu("Smells Like Teen Spirit", "Nirvana", 1991, 301, "Rock");
        Playlist.addLagu("Creep", "Radiohead", 1992, 238, "Rock");
        Playlist.addLagu("Wonderwall", "Oasis", 1995, 258, "Alternative");
        Playlist.addLagu("Torn", "Natalie Imbruglia", 1997, 245, "Pop");
        Playlist.addLagu("Baby One More Time", "Britney Spears", 1998, 211, "Pop");
        Playlist.addLagu("Stan", "Eminem", 2000, 404, "Hip-Hop");
        Playlist.addLagu("In the End", "Linkin Park", 2000, 216, "Nu-Metal");
        Playlist.addLagu("Boulevard of Broken Dreams", "Green Day", 2004, 260, "Rock");
        Playlist.addLagu("Rolling in the Deep", "Adele", 2010, 228, "Soul");
        Playlist.addLagu("Shape of You", "Ed Sheeran", 2017, 233, "Pop");

        Playlist.showPlaylistSortingDurasi();
        Playlist.showPlaylistSortingTahunRilis();
    }
}
