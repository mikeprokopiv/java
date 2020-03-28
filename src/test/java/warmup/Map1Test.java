package warmup;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

public class Map1Test {
    private Map1 mp = new Map1();

    //MapBully method test
    @Test
    public void testThatifakeyhasvalueitwillbeassigntobkey() {
        Map<String, String> MapBully = new HashMap<>();
        MapBully.put("a", "candy");
        MapBully.put("b", "dirt");
        mp.mapBully(MapBully);
        assertThat(MapBully.get("a"), is(""));
        assertThat(MapBully.get("b"), is("candy"));
    }

    //MapBully method test
    @Test
    public void assertMapBullyMapSize() {
        Map<String, String> MapBully = new HashMap<>();
        MapBully.put("a", "candy");
        MapBully.put("b", "dirt");
        MapBully.put("c", "red");
        MapBully.put("d", "yellow");
        mp.mapBully(MapBully);
        assertThat(MapBully.size(), is(4));
    }

    //mapShare method test
    @Test
    public void testMapShareTaskFunctionality() {
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "one");
        map2.put("b", "second");
        map2.put("c", "third");
        mp.mapShare(map2);
        assertThat(map2.get("a"), is("one"));
        assertThat(map2.get("b"), is("one"));
        assertFalse(map2.containsKey("c"));
        assertFalse(map2.containsValue("third"));
    }

    //mapAB method test
    @Test
    public void testMapABTaskFunctionality() {
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "First ");
        map3.put("b", "part");
        mp.mapAB(map3);
        assertThat(map3.get("a"), is("First "));
        assertThat(map3.get("b"), is("part"));
        assertThat(map3.get("ab"), is("First part"));
    }

    //mapAB method test
    @Test
    public void testMapABCheckWhenAIsNull() {
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", null);
        map3.put("b", "part");
        mp.mapAB(map3);
        assertThat(map3.get("b"), is("part"));
        assertFalse(map3.containsKey("ab"));
        assertFalse(map3.containsValue("First part"));
    }

    //mapAB method test
    @Test
    public void testMapABCheckWhenBIsNull() {
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "First ");
        map3.put("b", null);
        mp.mapAB(map3);
        assertThat(map3.get("a"), is("First "));
        assertFalse(map3.containsKey("ab"));
        assertFalse(map3.containsValue("First part"));
    }

    //topping1 method test
    @Test
    public void testTopping1TaskFunctionalityWhenThereAreIceCream (){
        Map<String, String> map4 = new HashMap<>();
        map4.put("ice cream", "test");
        mp.topping1(map4);
        assertThat(map4.get("ice cream"), is("cherry"));
        assertThat(map4.get("bread"), is("butter"));
        assertThat(map4.size(), is(2));
    }

    //topping1 method test
    @Test
    public void testTopping1TaskFunctionalityWhenThereAreNoIceCream (){
        Map<String, String> map5 = new HashMap<>();
        map5.put("ice", "test");
        mp.topping1(map5);
        assertThat(map5.get("ice"), is("test"));
        assertThat(map5.get("bread"), is("butter"));
        assertThat(map5.size(), is(2));
    }

    //topping2 method test
    @Test
    public void testTopping2TaskFunctionality (){
        Map <String, String> map6 = new HashMap<>();
        map6.put("ice cream", "value to re assign");
        map6.put("spinach", "value to be changed");
        mp.topping2(map6);
        assertThat(map6.get("ice cream"), is("value to re assign"));
        assertThat(map6.get("spinach"), is("nuts"));
        assertThat(map6.get("yogurt"), is("value to re assign"));
        assertThat(map6.size(), is(3));
    }

    //topping2 method test
    @Test
    public void testTopping2TaskifThereAreLackOfRequiredKeys (){
        Map <String, String> map6 = new HashMap<>();
        map6.put("ice", "vegetables");
        map6.put("corn", "worm");
        mp.topping2(map6);
        assertThat(map6.get("ice"), is("vegetables"));
        assertThat(map6.get("corn"), is("worm"));
        assertFalse(map6.containsKey("yogurt"));
        assertThat(map6.size(), is(2));
    }

    //topping3 method test
    @Test
    public void testTopping3TaskFunctionality (){
        Map <String, String> map7 = new HashMap<>();
        map7.put("potato", "value to re assign to fries");
        map7.put("salad", "value to re assign to spinach");
        mp.topping3(map7);
        assertThat(map7.get("potato"), is("value to re assign to fries"));
        assertThat(map7.get("fries"), is("value to re assign to fries"));
        assertThat(map7.get("salad"), is("value to re assign to spinach"));
        assertThat(map7.get("spinach"), is("value to re assign to spinach"));
        assertThat(map7.size(), is(4));
    }

    //topping3 method test
    @Test
    public void testTopping3TaskifThereAreLackOfRequiredKeys (){
        Map <String, String> map7 = new HashMap<>();
        map7.put("ice", "vegetables");
        map7.put("corn", "worm");
        mp.topping3(map7);
        assertThat(map7.get("ice"), is("vegetables"));
        assertThat(map7.get("corn"), is("worm"));
        assertFalse(map7.containsKey("fries"));
        assertFalse(map7.containsKey("spinach"));
        assertThat(map7.size(), is(2));
    }

    //mapAB2 method test
    @Test
    public void testMapAB2TaskFunctionalityWhenAequalsB() {
        Map <String,String> map8 = new HashMap<>();
        map8.put("a", "aaa");
        map8.put("b", "aaa");
        mp.mapAB2(map8);
        assertFalse(map8.containsKey("a"));
        assertFalse(map8.containsKey("b"));
        assertThat(map8.size(), is(0));
    }

    //mapAB2 method test
    @Test
    public void testMapAB2TaskFunctionalityWhenANotequalsB() {
        Map <String,String> map8 = new HashMap<>();
        map8.put("a", "aaa");
        map8.put("b", "bbb");
        mp.mapAB2(map8);
        assertThat(map8.get("a"), is("aaa"));
        assertThat(map8.get("b"), is("bbb"));
        assertThat(map8.size(), is(2));
    }

    //mapAB3 method test
    @Test
    public void testMapAB3TaskFunctionalityWhenAkeyisPresentandBisAbsent() {
        Map <String,String> mapAB3 = new HashMap<>();
        mapAB3.put("a", "aaa");
        mp.mapAB3(mapAB3);
        assertThat(mapAB3.get("a"), is("aaa"));
        assertThat(mapAB3.get("b"), is("aaa"));
        assertThat(mapAB3.size(), is(2));
    }

    //mapAB3 method test
    @Test
    public void testMapAB3TaskFunctionalityWhenBkeyisPresentandAisAbsent() {
        Map <String,String> mapAB3 = new HashMap<>();
        mapAB3.put("b", "bbb");
        mp.mapAB3(mapAB3);
        assertThat(mapAB3.get("a"), is("bbb"));
        assertThat(mapAB3.get("b"), is("bbb"));
        assertThat(mapAB3.size(), is(2));
    }

    //mapAB3 method test
    @Test
    public void testMapAB3TaskFunctionalityWhenAandBkeyisPresent() {
        Map <String,String> mapAB3 = new HashMap<>();
        mapAB3.put("a", "aaa");
        mapAB3.put("b", "bbb");
        mp.mapAB3(mapAB3);
        assertThat(mapAB3.get("a"), is("aaa"));
        assertThat(mapAB3.get("b"), is("bbb"));
        assertThat(mapAB3.size(), is(2));
    }

    //mapAB3 method test
    @Test
    public void testMapAB3TaskFunctionalityWhenAandBkeyisAbsent() {
        Map <String,String> mapAB3 = new HashMap<>();
        mapAB3.put("c", "c");
        mapAB3.put("d", "d");
        mp.mapAB3(mapAB3);
        assertThat(mapAB3.get("c"), is("c"));
        assertThat(mapAB3.get("d"), is("d"));
        assertThat(mapAB3.size(), is(2));
    }

    //mapAB3 method test
    @Test
    public void testMapAB4TaskFunctionalityWhenAbiggerThanB() {
        Map <String,String> mapAB4 = new HashMap<>();
        mapAB4.put("a", "aa");
        mapAB4.put("b", "b");
        mapAB4.put("c","candy");
        mp.mapAB4(mapAB4);
        assertThat(mapAB4.get("a"), is("aa"));
        assertThat(mapAB4.get("b"), is("b"));
        assertThat(mapAB4.get("c"), is("aa"));
        assertThat(mapAB4.size(), is(3));
    }

    //mapAB3 method test
    @Test
    public void testMapAB4TaskFunctionalityWhenBbiggerThanA() {
        Map <String,String> mapAB4 = new HashMap<>();
        mapAB4.put("a", "aa");
        mapAB4.put("b", "bbbb");
        mapAB4.put("c","candy");
        mp.mapAB4(mapAB4);
        assertThat(mapAB4.get("a"), is("aa"));
        assertThat(mapAB4.get("b"), is("bbbb"));
        assertThat(mapAB4.get("c"), is("bbbb"));
        assertThat(mapAB4.size(), is(3));
    }

    //mapAB3 method test
    @Test
    public void testMapAB4TaskFunctionalityWhenAequalB() {
        Map <String,String> mapAB4 = new HashMap<>();
        mapAB4.put("a", "aa");
        mapAB4.put("b", "bb");
        mapAB4.put("c","candy");
        mp.mapAB4(mapAB4);
        assertThat(mapAB4.get("a"), is(""));
        assertThat(mapAB4.get("b"), is(""));
        assertThat(mapAB4.get("c"), is("candy"));
        assertThat(mapAB4.size(), is(3));
    }

}