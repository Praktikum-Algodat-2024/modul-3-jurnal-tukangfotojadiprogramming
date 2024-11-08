package Easy;

public class MainRand {
    public static void main(String[] args) {
        StackLagu Playlist = new StackLagu();

        //Lagu Random
        Playlist.addLagu("All Star", "Smash Mouth", 1999, 200, "Alternative Rock");
        Playlist.addLagu("Halo", "Beyoncé", 2008, 261, "Pop");
        Playlist.addLagu("Uptown Girl", "Billy Joel", 1983, 198, "Pop");
        Playlist.addLagu("Africa", "Toto", 1982, 295, "Rock");
        Playlist.addLagu("Born to Run", "Bruce Springsteen", 1975, 271, "Rock");
        Playlist.addLagu("Heroes", "David Bowie", 1977, 215, "Rock");
        Playlist.addLagu("Dancing Queen", "ABBA", 1976, 232, "Disco");
        Playlist.addLagu("Losing My Religion", "R.E.M.", 1991, 268, "Alternative Rock");
        Playlist.addLagu("Stayin' Alive", "Bee Gees", 1977, 285, "Disco");
        Playlist.addLagu("Call Me Maybe", "Carly Rae Jepsen", 2011, 193, "Pop");
        Playlist.addLagu("Radioactive", "Imagine Dragons", 2012, 187, "Alternative Rock");
        Playlist.addLagu("American Pie", "Don McLean", 1971, 513, "Folk Rock");
        Playlist.addLagu("I Will Survive", "Gloria Gaynor", 1978, 199, "Disco");
        Playlist.addLagu("Smells Like Teen Spirit", "Nirvana", 1991, 301, "Grunge");
        Playlist.addLagu("Uptown Funk", "Mark Ronson ft. Bruno Mars", 2014, 269, "Funk");
        Playlist.addLagu("Girls Just Want to Have Fun", "Cyndi Lauper", 1983, 235, "Pop");
        Playlist.addLagu("Eye of the Tiger", "Survivor", 1982, 245, "Rock");
        Playlist.addLagu("I Want to Break Free", "Queen", 1984, 261, "Rock");
        Playlist.addLagu("Every Breath You Take", "The Police", 1983, 253, "Rock");
        Playlist.addLagu("Purple Rain", "Prince", 1984, 521, "Rock");

        Playlist.showPlaylistSortingDurasi();
        Playlist.showPlaylistSortingTahunRilis();
    }
}
