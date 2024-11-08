package tambahan;

public class SearchandSort {
    Node head, tail;
    int size;

    public SearchandSort() {
        head = null;
        size = 0;
    }

    public void addNode(String earth, String name, String alterEgo, String status, int powerLevel) {
        Node newNode = new Node(earth, name, alterEgo, status, powerLevel);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
        size++;
    }

    public void addNodeDesc(String earth, String name, String alterEgo, String status, int powerLevel) {
        Node newNode = new Node(earth, name, alterEgo, status, powerLevel);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        size++;
    }

    public void addNodeRandom(String earth, String name, String alterEgo, String status, int powerLevel) {
        Node newNode = new Node(earth, name, alterEgo, status, powerLevel);
    
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            int position = (int) (Math.random() * (size + 1));
            
            if (position == 0) {
                Node tail = head.prev;
    
                newNode.next = head;
                newNode.prev = tail;
                head.prev = newNode;
                tail.next = newNode;
                head = newNode;
            } else if (position == size) {
                // Insert at the end
                Node tail = head.prev;
    
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = head;
                head.prev = newNode;
            } else {
                Node current = head;
                for (int i = 0; i < position; i++) {
                    current = current.next;
                }
                Node previous = current.prev;
                previous.next = newNode;
                newNode.prev = previous;
                newNode.next = current;
                current.prev = newNode;
            }
        }
        size++;
    } 
    

    public void display() {
        Node current = head;
        if (head != null) {            
            do {
                System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------+");
                System.out.printf("| From: %-10s  ||   Real Name: %-18s || Alter Ego: %-15s || Status : %-13s || Tingkat Kekuatan : %-3d |\n", 
                                  current.earth, current.name, current.alterEgo, current.status, current.powerLevel);
                System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------+");
                current = current.next;
            } while (current != head);
        }
    }

    public void editearth(String lama, String baru) {
        Node current = head;
        do {
            if (current.earth.equals(lama)) {
                current.earth = baru;
                return;
            }
            current = current.next;
        } while (current != head);
    }   

    public void insertionNode() {
        if (head == null || head.next == head) return;
        
        Node urutan = null;
        Node current = head;
        head.prev.next = null;
        
        while (current != null) {
            Node next = current.next;
            if (urutan == null || urutan.alterEgo.compareToIgnoreCase(current.alterEgo) >= 0) {
                current.next = urutan;
                current.prev = null;
                if (urutan != null) urutan.prev = current;
                urutan = current;
            } else {
                Node temp = urutan;
                while (temp.next != null && temp.next.alterEgo.compareToIgnoreCase(current.alterEgo) < 0) 
                    temp = temp.next;
                current.next = temp.next;
                if (temp.next != null) temp.next.prev = current;
                temp.next = current;
                current.prev = temp;
            }
            current = next;
        }
        
        head = urutan;
        Node tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head;
        head.prev = tail;
    }

    public void insertionvalue() {
        if (head == null || head.next == head) return;
        
        Node current = head.next;
        do {
            String tempAlterEgo = current.alterEgo;
            String tempEarth = current.earth;
            String tempName = current.name;
            String tempStatus = current.status;
            int tempPowerLevel = current.powerLevel;
    
            Node prev = current.prev;
            while (prev != head.prev && prev.alterEgo.compareToIgnoreCase(tempAlterEgo) > 0) {
                prev.next.earth = prev.earth;
                prev.next.name = prev.name;
                prev.next.alterEgo = prev.alterEgo;
                prev.next.status = prev.status;
                prev.next.powerLevel = prev.powerLevel;
                
                prev = prev.prev;
            }
            
            prev.next.earth = tempEarth;
            prev.next.name = tempName;
            prev.next.alterEgo = tempAlterEgo;
            prev.next.status = tempStatus;
            prev.next.powerLevel = tempPowerLevel;
    
            current = current.next;
        } while (current != head);
    }

    public void shellNode() {
        if (head == null || head.next == head) return;
        head.prev.next = null;
        Node current = head;
        
        int jumlahNode = 0;
        while (current != null) {
            jumlahNode++;
            current = current.next;
        }
        
        for (int gap = jumlahNode / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < jumlahNode; i++) {
                Node now = head;
                for (int k = 0; k < i; k++) now = now.next;
                
                for (int j = i; j >= gap; j -= gap) {
                    Node banding = head;
                    for (int k = 0; k < j - gap; k++) banding = banding.next;
                    
                    if (banding.powerLevel <= now.powerLevel) break;
                    
                    int tempPower = banding.powerLevel;
                    String tempEarth = banding.earth;
                    String tempName = banding.name;
                    String tempAlter = banding.alterEgo;
                    String tempStatus = banding.status;
                    
                    banding.powerLevel = now.powerLevel;
                    banding.earth = now.earth;
                    banding.name = now.name;
                    banding.alterEgo = now.alterEgo;
                    banding.status = now.status;
                    
                    now.powerLevel = tempPower;
                    now.earth = tempEarth;
                    now.name = tempName;
                    now.alterEgo = tempAlter;
                    now.status = tempStatus;
                    
                    now = banding;
                }
            }
        }
        
        current = head;
        while (current.next != null) current = current.next;
        current.next = head;
        head.prev = current;
    }

    public void shellValue() {
        if (head == null || head.next == head) return;
        
        int jumlahNode = 0;
        Node temp = head;
        do {
            jumlahNode++;
            temp = temp.next;
        } while (temp != head);
        
        for (int gap = jumlahNode / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < jumlahNode; i++) {
                Node current = head;
                for (int k = 0; k < i; k++) {
                    current = current.next;
                }
                
                int tempPower = current.powerLevel;
                
                int j = i;
                Node prevNode = current;
                while (j >= gap) {
                    Node gapNode = head;
                    for (int k = 0; k < j - gap; k++) {
                        gapNode = gapNode.next;
                    }
                    
                    if (gapNode.powerLevel <= tempPower) break;
                    
                    prevNode.powerLevel = gapNode.powerLevel;
                    prevNode = gapNode;
                    j -= gap;
                }
                prevNode.powerLevel = tempPower;
            }
        }
    }

    public void search1(String temp) {
        Node current = head;
        boolean found = false;

        System.out.println("Binaryvrine melakukan pencarian Alter ego: " + temp);

        do {
            if (current.alterEgo.equalsIgnoreCase(temp)) {
                found = true;
                LevelStatus levelStatus = getLevel(current);
                displayCharacterInfo(current, levelStatus);
                break;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("+-----------------------------DATA TIDAK DITEMUKAN----------------------------------+");
        }
    }

    public void search2(int temp) {
        Node current = head;
        boolean found = false;

        System.out.println("Binaryvrine melakukan pencarian power level: " + temp);

        do {
            if (current.powerLevel == temp) {
                found = true;
                LevelStatus levelStatus = getLevel(current);
                displayCharacterInfo(current, levelStatus);
                break;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("+-----------------------------DATA TIDAK DITEMUKAN----------------------------------+");
        }
    }
    
    public void displayCharacterInfo(Node node, LevelStatus levelStatus) {
        System.out.println("+---------------------------------------------------------------------------------------------------+");
        System.out.printf("| Alter Ego              : %-25s  ||   Nama Asli         : %-20s |\n", node.alterEgo, node.name);
        System.out.printf("| Level                  : %-25s  ||   Eksistensi        : %-20s |\n", levelStatus.level, levelStatus.status);
        System.out.printf("| Tingkat Kekuatan       : %-25s  ||   Status            : %-20s |\n", node.powerLevel, node.status);
        System.out.println("+---------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                 " + node.earth + "                                           |");
        System.out.println("+---------------------------------------------------------------------------------------------------+");
    }

    public void insertionSortByStatusAndPowerLevel() {
        if (head == null || head.next == head) return;
    
        Node urutan = null;
        Node current = head;
        head.prev.next = null;
    
        while (current != null) {
            Node next = current.next;
    
            if (urutan == null || urutan.status.compareToIgnoreCase(current.status) > 0 ||
                (urutan.status.equalsIgnoreCase(current.status) && urutan.powerLevel < current.powerLevel)) {
                current.next = urutan;
                current.prev = null;
                if (urutan != null) urutan.prev = current;
                urutan = current;
            } else {
                Node temp = urutan;
                while (temp.next != null && 
                       (temp.next.status.compareToIgnoreCase(current.status) < 0 || 
                       (temp.next.status.equalsIgnoreCase(current.status) && temp.next.powerLevel > current.powerLevel))) {
                    temp = temp.next;
                }
                current.next = temp.next;
                if (temp.next != null) temp.next.prev = current;
                temp.next = current;
                current.prev = temp;
            }
            current = next;
        }
    
        head = urutan;
        Node tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head;
        head.prev = tail;
    }

    public void shellStatus() {
        if (head == null || head.next == head) return;
    
        head.prev.next = null;
        Node current = head;
        
        int nodeCount = 0;
        while (current != null) {
            nodeCount++;
            current = current.next;
        }
    
        for (int gap = nodeCount / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < nodeCount; i++) {
                Node now = head;
                for (int k = 0; k < i; k++) now = now.next;
    
                for (int j = i; j >= gap; j -= gap) {
                    Node compareNode = head;
                    for (int k = 0; k < j - gap; k++) compareNode = compareNode.next;
    
                    if (compareNode.status.compareToIgnoreCase(now.status) < 0 ||
                        (compareNode.status.equalsIgnoreCase(now.status) && compareNode.powerLevel >= now.powerLevel)) {
                        break;
                    }
    
                    int tempPower = compareNode.powerLevel;
                    String tempEarth = compareNode.earth;
                    String tempName = compareNode.name;
                    String tempAlterEgo = compareNode.alterEgo;
                    String tempStatus = compareNode.status;
    
                    compareNode.powerLevel = now.powerLevel;
                    compareNode.earth = now.earth;
                    compareNode.name = now.name;
                    compareNode.alterEgo = now.alterEgo;
                    compareNode.status = now.status;
    
                    now.powerLevel = tempPower;
                    now.earth = tempEarth;
                    now.name = tempName;
                    now.alterEgo = tempAlterEgo;
                    now.status = tempStatus;
    
                    now = compareNode;
                }
            }
        }

        current = head;
        while (current.next != null) current = current.next;
        current.next = head;
        head.prev = current;
    }

    public void linearalterego(String alterEgo) {
        Node current = head;
        boolean found = false;
        
        System.out.println("Pencarian Linearvrine : " + alterEgo);
        
        do {
            if (current.alterEgo.toLowerCase().contains(alterEgo.toLowerCase())) {
                found = true;
                LevelStatus levelStatus = getLevel(current);
                displayCharacterInfo(current, levelStatus);
            }
            current = current.next;
        } while (current != head);
        
        if (!found) {
            System.out.println("+-----------------------------DATA TIDAK DITEMUKAN----------------------------------+");
        }
    }
    
    public void linearpowerlevel(int powerLevel) {
        Node current = head;
        boolean found = false;
        
        System.out.println("Pencarian Linearvrine : " + powerLevel);
        
        do {
            if (current.powerLevel == powerLevel) {
                found = true;
                LevelStatus levelStatus = getLevel(current);
                displayCharacterInfo(current, levelStatus);
            }
            current = current.next;
        } while (current != head);
        
        if (!found) {
            System.out.println("+-----------------------------DATA TIDAK DITEMUKAN----------------------------------+");
        }
    }

    public LevelStatus getLevel(Node node) {
        switch (node.alterEgo) {
            case "Iron Man":
                return new LevelStatus("Tech", "dead");
            case "Iron Fist":
                return new LevelStatus("Mid-Tier", "alive");
            case "Iron Patriot":
                return new LevelStatus("Tech", "alive");
            case "Iron Spider":
                return new LevelStatus("Tech", "alive");
            case "Thanos":
                return new LevelStatus("Cosmic", "dead");
            case "Ultron":
                return new LevelStatus("Tech", "alive");
            case "Photon":
                return new LevelStatus("Cosmic", "alive");
            case "Scarlet Witch":
                return new LevelStatus("Mutants", "dead");
            case "Iron Man 2":
                return new LevelStatus("Tech", "alive");
            case "Raven":
                return new LevelStatus("Mutants", "alive");
            case "Starfire":
                return new LevelStatus("Mutants", "dead");
            case "Beast Boy":
                return new LevelStatus("Cosmic", "alive");
            default:
                return new LevelStatus("?", "?");
        }
    }
}