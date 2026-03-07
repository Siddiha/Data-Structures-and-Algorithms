public class Main {

    public static void main(String[] args) {

        MinHeap heap = new MinHeap();

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        heap.printHeap();
    }

    static class MinHeap {

        int[] items;
        int size;

        public static final int INITIAL_CAPACITY = 1000;

        public MinHeap() {
            items = new int[INITIAL_CAPACITY];
            size = 0;
        }

        public void insert(int newItem) {
            int index = size++;

            while (index > 0) {
                int parent = (index - 1) / 2;

                if (items[parent] <= newItem) {
                    break;
                }

                items[index] = items[parent];
                index = parent;
            }

            items[index] = newItem;
        }

        public void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(items[i] + " ");
            }
        }
    }
}