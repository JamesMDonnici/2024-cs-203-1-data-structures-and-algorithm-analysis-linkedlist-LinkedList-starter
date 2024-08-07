// Lesson learned: do not bluntly trust GitHub Copilot

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

/** 
 * JUnit tests cases for LinkedList add, remove, size, and toString methods.
 * 
 * @author Vitaly Ford
 */ 
public class LinkedListTests {
    // Test a simple add method by adding 2 elements to the list.
    @Test
    public void testAdd() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        assertEquals("Hello World ", list.toString());
    }

    // Test a simple remove of the first element.
    @Test
    public void testRemoveFirst() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.remove("Hello");
        assertEquals("World ", list.toString());
    }

    // Test a simple remove of the last element in a 10 element LinkedList.
    @Test
    public void testRemoveLast() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(9);
        assertEquals("0 1 2 3 4 5 6 7 8 ", list.toString());
    }

    // Test the size method after three adds and one remove.
    @Test
    public void testSizeAfterAddRemove() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.remove("Hello");
        assertEquals(2, list.size());
    }

    // Test standard size method after adding two elements.
    @Test
    public void testSize() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        assertEquals(2, list.size());
    }

    // Test the toString method after adding seven elements.
    @Test
    public void testToStringAfterAdd() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("test");
        assertEquals("Hello World ! This is a test ", list.toString());
    }

    // Test remove method passing in a non-existent object.
    @Test
    public void testRemoveNonExistent() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.remove("!");
        assertEquals("Hello World ", list.toString());
    }

    // Test remove method passing in an index of the object to be removed.
    // Add five objects to the list and remove the third one.
    @Test
    public void testRemoveIndex() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("test");
        list.remove(2);
        assertEquals("Hello World This is a test ", list.toString());
    }

    // Test remove method passing the object to be removed.
    // Add five objects to the list and remove the third one.
    // Also test that the remove method returns the index of the removed object.
    @Test
    public void testRemoveObject() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("test");
        assertEquals(3, list.remove("This"));
        assertEquals("Hello World ! is a test ", list.toString());
    }

    // Test remove method passing in an index of the object to be removed.
    // Add five objects to the list and remove the first one.
    // Also test that the remove method returns the removed object itself.
    @Test
    public void testRemoveIndexAndObject() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("test");
        assertEquals("Hello", list.remove(0));
        assertEquals("World ! This is a test ", list.toString());
    }

    // Test LinkedList size and toString methods after adding 3 elements, 
    // then removing the first two elements, then adding 4 more elements, 
    // then removing the middle two elements, then adding 5 elements,
    // then removing the last two elements by their indices.
    @Test
    public void testSizeAndToStringAfterAddRemove() {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.remove("Hello");
        list.remove("World");
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("test");
        list.remove(0);
        list.remove(0);
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("test");
        list.add("!");
        list.remove(3);
        list.remove(3);
        assertEquals("is a test a test ! ", list.toString());
        assertEquals(6, list.size());
    }

    // Test add method by passing the object and the index of 
    // inserting that object. First add 2 elements by index 0, 
    // then add 3 elements by index 1, then add 4 elements by index 2.
    // Test size as well.
    @Test
    public void testAddByIndex() {
        LinkedList list = new LinkedList();
        list.add("Hello", 0);
        list.add("World", 0);
        list.add("!", 1);
        list.add("This", 1);
        list.add("is", 1);
        list.add("a", 1);
        list.add("test", 2);
        assertEquals("World a test is This ! Hello ", list.toString());
        assertEquals(7, list.size());
    }
}
