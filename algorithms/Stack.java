public class Stack<E> implements StackInterface<E> {

private StackElement<E> top;

public Stack() {
    this.top = new StackElement<E>(null);
}

public E pop() {
    assert !this.empty();
    StackElement<E> topBuffer = this.top;
    assert topBuffer.next != null;
    this.top = topBuffer.next;
    return topBuffer.item;
}

public void push(E item) {
    StackElement<E> topBuffer = new StackElement<E>(this.top, item);
    this.top = topBuffer;
}

public E peek() {
    assert !this.empty();
    return this.top.item;
}

public boolean empty() {
    return this.top.next == null;
}

private class StackElement<E> {

private StackElement<E> next;
private E item;

private StackElement(StackElement<E> next) {
    this(next, null);
}

private StackElement(StackElement<E> next, E item) {
    this.next = next;
    this.item = item;
}

}

public static void main(String... args) {
    StackInterface<String> myStack = new Stack<String>();
    assert myStack.empty();
    myStack.push("Welt!");
    myStack.push("Hallo");
    assert "Hallo".equals(myStack.peek());
    assert !myStack.empty();
    System.out.print(myStack.pop());
    assert "Welt!".equals(myStack.peek());
    assert !myStack.empty();
    System.out.println(" " + myStack.pop());
}

}
