public class DeQue
{
    private int[] elements;
    private int maxSize;
    private int numElements;

    public DeQue(int maxSize) {
        this.maxSize = maxSize;
        numElements = 0;
        elements = new int[maxSize];
    }

    public boolean isEmpty()
    // Returns true if this queue is empty; otherwise, returns false.
    {
        return (numElements == 0);
    }

    public boolean isFull()
    // Returns true if this queue is full; otherwise, returns false.
    {
        return (numElements == elements.length);
    }

    public int size()
    // Returns the number of elements in this queue.
    {
        return numElements;
    }

    public void addFront(int value) {
        for (int i = numElements; i > 0; i--) {
            elements[i] = elements[i-1];
        }
        elements[0] = value;
        numElements++;
    }

    public void addLast(int value) {
        elements[numElements++] = value;
    }

    public int removeFront() {
        int value = elements[0];
        for (int i = 0; i < numElements-1; i++) {
            elements[i] = elements[i+1];
        }
        numElements--;
        return value;
    }

    public int removeLast() {
        return elements[--numElements];
    }
}
