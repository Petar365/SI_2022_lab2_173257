Втора лабораториска вежба по Софтверско инженерство



Petar Milchevski¸ 173257

Control Flow Graph
 
![Control Flow Graph](https://user-images.githubusercontent.com/63505206/171442339-5a02b65b-e6da-496a-8f41-d7a6dee8884b.png)


Nodes=27

Edges=34

Ja koristime formulata E-n+2

34-27+2=9

Kompleksnosta e 9

Тест случаи според критериумот Every statement

IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().equals("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "0", "0", "0", "0", "0", "0","0")));
        assertTrue(ex.getMessage().equals("List length should be a perfect square"));

        List<String> vlez = List.of("0", "#", "0", "0", "0", "#", "#", "#", "#");
//        "0", "#", "0"
//        "0", "0", "#"
//        "#", "#", "#"
        List<String> izlez = List.of("1", "#", "2", "1", "3", "#", "#", "#", "#");
//        "1", "#", "2"
//        "1", "3", "#"
//        "#", "#", "#"
        assertEquals(SILab2.function(vlez), izlez);

Тест случаи според критериумот Every path
 
IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().equals("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "0", "0", "0", "0", "0", "0","0")));
        assertTrue(ex.getMessage().equals("List length should be a perfect square"));































