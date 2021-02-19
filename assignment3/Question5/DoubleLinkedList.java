package assignment3.Question5;


class DoubleLinkedList<E> {
        private DoubleLinkedList.Node<E> first;


        private DoubleLinkedList.Node<E> last;

        private int size = 0;

        private static class Node<E> {
            E item;
            DoubleLinkedList.Node<E> next;
            DoubleLinkedList.Node<E> prev;

            Node(DoubleLinkedList.Node<E> prev, E element, DoubleLinkedList.Node<E> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }

            public String toString () {
                return "item:" + item.toString() + " ,next: " + next.toString() + " ,prev:" + prev.toString();
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }

            public Node<E> getPrev() {
                return prev;
            }

            public void setPrev(Node<E> prev) {
                this.prev = prev;
            }

            public E getItem() {
                return item;
            }

            public void setItem(E item) {
                this.item = item;
            }
        }

        public void addFirst(E e) {
            final DoubleLinkedList.Node<E> f = first;
            final DoubleLinkedList.Node<E> newNode = new DoubleLinkedList.Node<>(null, e, f);
            first = newNode;
            if (f == null)
                last = newNode;
            else
                f.prev = newNode;
            size++;
        }

        public void addLast(E e) {
            final DoubleLinkedList.Node<E> l = last;
            final DoubleLinkedList.Node<E> newNode = new DoubleLinkedList.Node<>(l, e, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
        }

        public int size() {
            return size;
        }

        public void print() {
            String result = "";
            DoubleLinkedList.Node<E> current = first;
            while(current.getNext() != null){
                result += current.getItem();
                if(current.getNext() != null){
                    result += ", ";
                }
                current = current.getNext();
            }
            System.out.println(result);
        }

    }




