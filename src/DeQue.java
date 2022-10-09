public class DeQue
{
    private int[] elements;
    private final int MAXSIZE = 100;
    private int numElements;
    protected int front = 0;
    protected int rear;

    public DeQue()
    {
        numElements = 0;
        elements = new int[MAXSIZE];
        rear = MAXSIZE - 1;
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

    public String toString()
    {
        String printData = "";

        if (isEmpty())
        {
            System.out.println("Print attempted on empty queue.");
        }
        else
        {
            //loops from the beginning of the queue to the end
            for(int i = front; i <= rear; i++)
            {
                //set the list to string and print it
                System.out.print(elements[i] + " ");
            }
        }
        return printData;
    }

    public void addToFront(int value)
    {
        int[] tempArr = new int[elements.length+1];
        System.out.println("\nAdding " + value + " to The Front:");

        if(isFull())
        {
            System.out.println("The Queue is Full.");
        }
        else
        {
            for (int i = 0, j = 0; i < elements.length; i++, j++)
            {
                if (i == 0)
                {
                    tempArr[j] = value;
                    j++;
                }
                tempArr[j] = elements[i];
            }
            rear++;
            elements = tempArr.clone();
            numElements++;
        }
    }

    public void addToEnd(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full.");
        }
        else
        {
            rear = (rear + 1) % elements.length;
            elements[rear] = value;
            numElements++;
        }
    }

    public int removeFirstElement()
    {
        int value = elements[0];
        System.out.println("\nRemoving First Element:");

        if(isEmpty())
        {
            System.out.println("Queue is empty.");
            return 0;
        }
        else
        {
            for (int i = 0; i < numElements - 1; i++)
            {
                elements[i] = elements[i + 1];
            }
            numElements--;
            rear--;
            return value;
        }
    }

    public int removeLastElement()
    {
        System.out.println("\nRemoving Last Element:");

        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return  0;
        }
        else {
            rear--;
            return elements[--numElements];
        }
    }
}
