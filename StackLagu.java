package Easy;

public class StackLagu {
    NodeLagu head;
    NodeLagu tail;

    public void addLagu(String JudulLagu, String NamaArtis, int TahunRilis, int Durasi, String Genre) {
        NodeLagu newLagu = new NodeLagu(JudulLagu, NamaArtis, TahunRilis, Durasi, Genre);
        if (head == null) {
            head = newLagu;
            tail = newLagu;
        } else {
            tail.next = newLagu;
            newLagu.prev = tail;
            tail = newLagu;
        }
    }

    public void showPlaylist() {
        int count = 1;
        System.out.println("========================================================");
        System.out.println("||                    LOL Playlist                    ||");
        System.out.println("========================================================");
        NodeLagu current = head;
        if (head == null) {
            System.out.println("       There is no song in the Playlist yet.");
            System.out.println("========================================================");
        }
        while (current != null) {
            System.out.println(count + " | " + current.NamaArtis + " - " + current.JudulLagu + " (" + current.TahunRilis + ")");
            System.out.println("\t" + current.Durasi / 60 + ":" + current.Durasi % 60 + "\t" + current.Genre);
            System.out.println("========================================================");
            count++;
            current = current.next;
        }
    }
    

    public void showPlaylistSortingDurasi() {
        if (head == null || head.next == null) {
            return;
        }

        long waktuMulai = System.nanoTime();

        boolean tukar;
        
        do {
            tukar = false;
            NodeLagu current = head;

            while (current.next != null) {
                if (current.Durasi > current.next.Durasi) {
                    TukarDurasi(current, current.next);
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);

        long waktuBerhenti = System.nanoTime();
        long durasi = waktuBerhenti - waktuMulai;

        System.out.println("\nPlaylist diurutkan berdasarkan durasi secara ascending:");
        showPlaylist();
        System.out.println("Durasi: " + durasi);
    }

    private void TukarDurasi(NodeLagu a, NodeLagu b) {
        String tempJudulLagu = a.JudulLagu;
        String tempNamaArtis = a.NamaArtis;
        int tempTahunRilis = a.TahunRilis;
        int tempDurasi = a.Durasi;
        String tempGenre = a.Genre;

        a.JudulLagu = b.JudulLagu;
        a.NamaArtis = b.NamaArtis;
        a.TahunRilis = b.TahunRilis;
        a.Durasi = b.Durasi;
        a.Genre = b.Genre;

        b.JudulLagu = tempJudulLagu;
        b.NamaArtis = tempNamaArtis;
        b.TahunRilis = tempTahunRilis;
        b.Durasi = tempDurasi;
        b.Genre = tempGenre;
    }

    public void showPlaylistSortingTahunRilis() {
        if (head == null || head.next == null) {
            return;
        }

        long waktuMulai = System.nanoTime();

        NodeLagu current = head;

        while (current != null) {
            NodeLagu maxNode = current;
            NodeLagu nextNode = current.next;

            while (nextNode != null) {
                if (nextNode.TahunRilis > maxNode.TahunRilis) {
                    maxNode = nextNode;
                }
                nextNode = nextNode.next;
            }

            if (maxNode != current) {
                TukarTahunRilis(current, maxNode);
            }

            current = current.next;
        }

        long waktuBerhenti = System.nanoTime();
        long durasi = waktuBerhenti - waktuMulai;

        System.out.println("\nPlaylist diurutkan berdasarkan tahun rilis secara descending:");
        showPlaylist();
        System.out.println("Durasi: " + durasi);
    }

    private void TukarTahunRilis(NodeLagu a, NodeLagu b) {
        String tempJudulLagu = a.JudulLagu;
        String tempNamaArtis = a.NamaArtis;
        int tempTahunRilis = a.TahunRilis;
        int tempDurasi = a.Durasi;
        String tempGenre = a.Genre;

        a.JudulLagu = b.JudulLagu;
        a.NamaArtis = b.NamaArtis;
        a.TahunRilis = b.TahunRilis;
        a.Durasi = b.Durasi;
        a.Genre = b.Genre;

        b.JudulLagu = tempJudulLagu;
        b.NamaArtis = tempNamaArtis;
        b.TahunRilis = tempTahunRilis;
        b.Durasi = tempDurasi;
        b.Genre = tempGenre;
    }

    public void cariLagu(String judulLaguDicari) {
        System.out.println("========================================================");
        System.out.println("||                    LOL Playlist                    ||");
        System.out.println("========================================================");
        System.out.println("Judul lagu yang ingin dicari : " + judulLaguDicari);

        NodeLagu current = head;
        int posisi = 1;
        boolean ditemukan = false;

        while (current != null) {
            if (current.JudulLagu.equalsIgnoreCase(judulLaguDicari)) {
                System.out.println("Lagu yang sesuai dengan judul '" + judulLaguDicari + "' ditemukan pada posisi ke - " + posisi);
                System.out.println("========================================================");
                System.out.println(posisi + " | " + current.NamaArtis + " - " + current.JudulLagu + " (" + current.TahunRilis + ")");
                System.out.println("\t" + current.Durasi / 60 + ":" + current.Durasi % 60 + "\t" + current.Genre);
                System.out.println("========================================================");
                ditemukan = true;
                break;
            }
            current = current.next;
            posisi++;
        }

        if (!ditemukan) {
            System.out.println("Lagu dengan judul '" + judulLaguDicari + "' tidak ditemukan dalam playlist.");
            System.out.println("========================================================");
        }
    }
}