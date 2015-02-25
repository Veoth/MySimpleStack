package dcll.hode;

import sun.org.mozilla.javascript.internal.ast.ArrayLiteral;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by 21206989 on 25/02/2015.
 */
public class Stack implements SimpleStack
{
    int size;
    int max;
    Item stack[];

    public Stack(int size) {
        this.max = size;
        this.size = 0;

        stack = new Item[max];
    }
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty() {
        return (size==0);
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize() {
        return size;
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item) {
        if (item == null)
            stack[size] = new Item();
        else
            stack[size] = item;

        size++;
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        return stack[size-1];
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        Item i = stack[size-1];
        size = size-1;
        return i;
    }
}
