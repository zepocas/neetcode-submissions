class Node {
    Node[] children = new Node[26];
    boolean isEndOfWord = false;
}

class PrefixTree {

    Node head;

    public PrefixTree() {
        head = new Node();
    }

    public void insert(String word) {
        Node curr = head;

        for (Character c : word.toCharArray()) {
            int i = c - 'a';

            if (curr.children[i] != null) {
                curr = curr.children[i];
            } else {
                Node addition = new Node();
                curr.children[i] = addition;
                curr = curr.children[i];
            }
        }

        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        Node curr = head;

        for (Character c : word.toCharArray()) {
            int i = c - 'a';

            if (curr.children[i] == null) {
                return false;
            } else {
                curr = curr.children[i];
            }
        }

        return curr.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        Node curr = head;

        for (Character c : prefix.toCharArray()) {
            int i = c - 'a';

            if (curr.children[i] == null) {
                return false;
            } else {
                curr = curr.children[i];
            }
        }

        return true;
    }
}
