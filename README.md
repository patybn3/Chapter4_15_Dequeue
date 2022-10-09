<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 4 - Exercise 15</h5>

####variables used:

```java
    protected final int NAXSIZE = 100; // default capacity
    protected int[] elements;           // array that holds queue elements
    protected int numElements = 0;    // number of elements in this queue
    protected int front = 0;          // index of front of queue
    protected int rear;               // index of rear of queue
```

###Methods added to `DeQue.java`:

a. `String toString()` creates and returns a string that correctly represents
the current queue. Such a method could prove useful for testing and debugging
the class and for testing and debugging applications that use the class. Assume
each stacked element already provided its own reasonable `toString` method.<br>
```java
    public String toString();     //will loop the array, turn it to a string and print it
```
b. `int size()` prints the size of the queue
```java
    public int size();           //will print the array size
```
c. `void addToFront(int num)` This method adds a number to the front of the queue, all other numbers shift
```java
    public void addToFront(int num);     //add a given number to the front to the queue
```

d. `void addToEnd(int num)` Method used to add all numbers to the queue through a loop, and individually.
```java
  public void addToEnd(int num)        //add number(s) to the end
```
e. `int removeFirstElement()` Used to remove the element stored at index 0

```java
  public int removeFirstElement()        //removes index 0
```

f. `int removeLastElement()` Removes the last element on the list

###Main class: Chapter4_15_PatriciaAntlitz.java

<hr>
<h5>Problems:</h5>

I had problems coming to a solution for addToFront. I have the link below for the source used. I was trying to insert into index 0 without having to create a new array, but my loop was swapping the value given instead.
My solution includes storing all items in a new, temporary array, then copying this array into the element array.


removing the elements were not a huge problem, even though I did spend a good amount of time figuring that out. Ultimately I needed to decrement/increments the rear of the list, and that solved my problems.
source:<br>
temp array:<br>
https://www.techiedelight.com/insert-element-array-specific-index-java/


<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter4_15_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter4_15_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter4_15_PatriciaAntlitz.java => compile
    * java Chapter4_15_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)