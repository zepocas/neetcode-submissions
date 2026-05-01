class Node {
    Node[] children = new Node[26];
    boolean isWord = false;

    public Node(boolean isWord) {
        this.isWord = isWord;
    }

    public Node(){}
}

class PrefixTree {
    
    Node head;

    public PrefixTree() {
        this.head = new Node(); 
    }

    public void insert(String word) {
        Node pointer = head;

        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (pointer.children[i] == null) {
                pointer.children[i] = new Node();
            } 

            pointer = pointer.children[i];
        }

        pointer.isWord = true;
    }

    public boolean search(String word) {
        Node curr = head;

        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null) {
                return false;
            }

            curr = curr.children[i];
        }

        return curr.isWord;
    }

    public boolean startsWith(String prefix) {
        Node curr = head;

        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null) {
                return false;
            }

            curr = curr.children[i];
        }

        return true;
    }
}
