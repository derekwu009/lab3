import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListsTests {
    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();

        list.prepend(5);
        assertEquals(5, list.root.value);
        list.prepend(1);
        assertEquals(1, list.root.value);
    }

    @Test
    public void append() {
        LinkedList list = new LinkedList();

        list.append(5);
    }
}