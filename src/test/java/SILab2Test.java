import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> createList(String...elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void everyStatementTest() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().equals("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "0", "0", "0", "0", "0", "0","0")));
        assertTrue(ex.getMessage().equals("List length should be a perfect square"));

        List<String> vlez = List.of("0", "#", "0", "#", "0", "#", "0", "#", "#");
//        "0", "#", "0"
//        "#", "0", "#"
//        "0", "#", "#"
        List<String> izlez = List.of("2", "#", "2", "#", "4", "#", "2", "#", "#");
//        "2", "#", "2"
////      "#", "4", "#"
////      "2", "#", "#"
        assertEquals(SILab2.function(vlez), izlez);
    }

    @Test
    void everyBracnhTest(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().equals("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "0", "0", "0", "0", "0", "0","0")));
        assertTrue(ex.getMessage().equals("List length should be a perfect square"));
    }
}