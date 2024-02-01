import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class CheckString implements StringChecker {
    String str;

    public CheckString(String s) {
        this.str = s;
    }

    @Override
    public boolean checkString(String s) {
        return s.contains(this.str);
    }
}

public class ListTests {
    @Test
    public void filterTest() {
        StringChecker sc = new CheckString("str");    
        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("bob");

        List<String> filtered = ListExamples.filter(list, sc);

        String[] filteredArr = {"str1", "str2"};
        assertArrayEquals(filteredArr, filtered.toArray());
    }
}