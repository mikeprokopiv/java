package task;
public class FirstList<E> {

    private Node<E> root;

    public void add(E el) {
        Node<E> node = new Node<E>(el);
        if (root == null) {
            root = node;
        } else {
            Node<E> tempRoot = root;
            while (tempRoot.next != null) {
                tempRoot = tempRoot.next;
            }
            tempRoot.next = node;
        }
    }

    public E get(int n) {
        Node<E> node = new Node<E>(el);

        return n;
    }

    public class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        FirstList<String> list = new FirstList<>();
        list.add("First item");
        list.add("Second item");
        list.add("Third item");
        list.add("Fourth item");
        list.add("Fifth item");
        list.add("Sixth item");
        System.out.println();
    }



}
