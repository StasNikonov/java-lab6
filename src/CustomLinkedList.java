/**
 * Represents a custom implementation of a singly linked list.
 * This class implements the List interface and is specifically designed
 * to handle objects of type Tariff and its subclasses.
 *
 * @param <T> the type of elements in this list, restricted to Tariff or its subclasses
 */
import java.util.*;

public class CustomLinkedList<T extends Tariff> implements List<T> {

    /**
     * Node class represents an element in the singly linked list.
     * This class should remain private to encapsulate the structure.
     */
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    /**
     * Default constructor initializes an empty list.
     */
    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Constructor initializes a list with a single element.
     *
     * @param element the initial element to add to the list
     */
    public CustomLinkedList(T element) {
        this();
        add(element);
    }

    /**
     * Constructor initializes a list with all elements from a given collection.
     *
     * @param collection the collection of elements to initialize the list with
     */
    public CustomLinkedList(Collection<? extends T> collection) {
        this();
        for (T item : collection) {
            add(item);
        }
    }

    @Override
    public boolean add(T t) {
        Node newNode = new Node(t);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int size() {
        return size;
    }

    // Additional utility methods

    /**
     * Checks if the given index is within the bounds of the list.
     *
     * @param index the index to check
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Unimplemented methods from List interface (throw UnsupportedOperationException for simplicity)

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("add(index, element) is not supported.");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("remove(Object) is not supported.");
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("remove(int) is not supported.");
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("contains(Object) is not supported.");
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("iterator() is not supported.");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("toArray() is not supported.");
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException("toArray(T1[]) is not supported.");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("containsAll(Collection) is not supported.");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("addAll(Collection) is not supported.");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("addAll(index, Collection) is not supported.");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("removeAll(Collection) is not supported.");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("retainAll(Collection) is not supported.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("clear() is not supported.");
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("set(index, element) is not supported.");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("indexOf(Object) is not supported.");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("lastIndexOf(Object) is not supported.");
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("listIterator() is not supported.");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("listIterator(index) is not supported.");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("subList(fromIndex, toIndex) is not supported.");
    }
}