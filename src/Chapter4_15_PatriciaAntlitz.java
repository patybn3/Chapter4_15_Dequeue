public class Chapter4_15_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        DeQue deQue = new DeQue(10);
        deQue.addFront(2);
        deQue.addFront(4);
        deQue.addFront(1);
        deQue.addLast(7);
        System.out.println(deQue.removeFront());
        System.out.println(deQue.removeFront());
        System.out.println(deQue.removeLast());
        System.out.println(deQue.removeLast());
    }
}
