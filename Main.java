package Easy;

public class Main {
    public static void main(String[] args) {
        StackLagu Playlist = new StackLagu();

        Playlist.showPlaylist();
        Playlist.addLagu("Piano Man", "Billy Joel", 1973, 339, "Folk");
        Playlist.addLagu("Die With A Smile", "Bruno Mars dan Lady Gaga", 2024, 251, "Pop");
        Playlist.addLagu("Nina", ".Feast", 2024, 277, "Indonesian Rock");
        Playlist.addLagu("Bad", "Wave to Earth", 2023, 263, "Korean Rock, Thai Indie");
        Playlist.addLagu("8 Letters", "Why Don't We", 2018, 190, "Pop");
        Playlist.addLagu("There is A Light That Never Goes Out", "The Smiths", 1986, 244, "Indie");
        Playlist.addLagu("To the Bone", "Pamungkas", 2020, 344, "Indonesian Indie");
        Playlist.addLagu("We are", "One Ok Rock", 2017, 255, "Pop Rock");
        Playlist.addLagu("Small girl", "Lee Young Ji", 2024, 189, "R&B");
        Playlist.addLagu("21 Guns", "Green Day", 2009, 321, "Punk Pop");
        Playlist.showPlaylist();

        Playlist.showPlaylistSortingDurasi();

        Playlist.showPlaylistSortingTahunRilis();

        Playlist.cariLagu("We are");

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
