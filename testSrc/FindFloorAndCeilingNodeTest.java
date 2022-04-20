import org.junit.Assert;
import org.junit.Test;
import ru.vsu.sc.tretyakov_d_s.SimpleBSTree;

public class FindFloorAndCeilingNodeTest {

    SimpleBSTree<Integer> tree = new SimpleBSTree<>(Integer::parseInt);

    @Test
    public void testFindFloorValue1() throws Exception {
        tree.fromBracketNotation("80 (62 (55 (26 (5, 39), 57)), 94)");
        int current = tree.getFloor(30);
        int correct = 26;
        Assert.assertEquals(current, correct);
    }

    @Test
    public void testFindFloorValue2() throws Exception {
        tree.fromBracketNotation("85 (42 (25 (10 (9), 28 (, 40 (32))), 64 (50 (, 58), 79 (73, 81))), 96 (91 (88), 99))");
        int current = tree.getFloor(55);
        int correct = 50;
        Assert.assertEquals(current, correct);
    }

    @Test
    public void testFindFloorValue3() throws Exception {
        tree.fromBracketNotation("13 (7 (5 (1), 10), 84 (83 (19 (, 20 (, 64 (34 (, 50 (47 (42 (35 (, 36))), 54 (52, 57))), 69 (68, 70 (, 81)))))), 85 (, 87 (, 99))))");
        int current = tree.getFloor(25);
        int correct = 20;
        Assert.assertEquals(current, correct);
    }

    @Test
    public void testFindCeilingValue1() throws Exception {
        tree.fromBracketNotation("80 (62 (55 (26 (5, 39), 57)), 94)");
        int current = tree.getCeiling(30);
        int correct = 39;
        Assert.assertEquals(current, correct);
    }

    @Test
    public void testFindCeilingValue2() throws Exception {
        tree.fromBracketNotation("85 (42 (25 (10 (9), 28 (, 40 (32))), 64 (50 (, 58), 79 (73, 81))), 96 (91 (88), 99))");
        int current = tree.getCeiling(55);
        int correct = 58;
        Assert.assertEquals(current, correct);
    }

    @Test
    public void testFindCeilingValue3() throws Exception {
        tree.fromBracketNotation("13 (7 (5 (1), 10), 84 (83 (19 (, 20 (, 64 (34 (, 50 (47 (42 (35 (, 36))), 54 (52, 57))), 69 (68, 70 (, 81)))))), 85 (, 87 (, 99))))");
        int current = tree.getCeiling(25);
        int correct = 34;
        Assert.assertEquals(current, correct);
    }
}
