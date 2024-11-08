package Easy;

public class MainDesc {
    public static void main(String[] args) {
        StackLagu Playlist = new StackLagu();

        //Lagu Descending
        Playlist.addLagu("Blinding Lights", "The Weeknd", 2020, 200, "Synth-pop");
        Playlist.addLagu("Old Town Road", "Lil Nas X", 2019, 157, "Country Rap");
        Playlist.addLagu("Shallow", "Lady Gaga & Bradley Cooper", 2018, 217, "Pop");
        Playlist.addLagu("Despacito", "Luis Fonsi ft. Daddy Yankee", 2017, 227, "Reggaeton");
        Playlist.addLagu("Closer", "The Chainsmokers ft. Halsey", 2016, 244, "Electronic");
        Playlist.addLagu("Uptown Funk", "Mark Ronson ft. Bruno Mars", 2014, 269, "Funk");
        Playlist.addLagu("Happy", "Pharrell Williams", 2013, 233, "Pop");
        Playlist.addLagu("Radioactive", "Imagine Dragons", 2012, 187, "Alternative Rock");
        Playlist.addLagu("Rolling in the Deep", "Adele", 2010, 228, "Soul");
        Playlist.addLagu("Fireflies", "Owl City", 2009, 228, "Synth-pop");
        Playlist.addLagu("Viva La Vida", "Coldplay", 2008, 242, "Alternative Rock");
        Playlist.addLagu("Bleeding Love", "Leona Lewis", 2007, 262, "Pop");
        Playlist.addLagu("Rehab", "Amy Winehouse", 2006, 214, "Soul");
        Playlist.addLagu("Fix You", "Coldplay", 2005, 295, "Alternative Rock");
        Playlist.addLagu("Hey Ya!", "Outkast", 2003, 235, "Hip-Hop");

        Playlist.showPlaylistSortingDurasi();
        Playlist.showPlaylistSortingTahunRilis();
    }
}
