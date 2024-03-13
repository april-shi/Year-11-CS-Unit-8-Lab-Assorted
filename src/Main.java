import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("NORTH", "NORTH", "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "SOUTH", "WEST", "WEST");
        List<String> stuff = Assorted.wildWest(list);
        System.out.println(stuff.size());

        for (int i = 0; i < stuff.size();i++) {

            System.out.println(stuff.get(i));

        }

    }

}
