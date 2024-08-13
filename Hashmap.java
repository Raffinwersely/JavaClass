import java.util.HashMap;

public class Hashmap {
    public Hashmap() {
    }

    public static void main(String[] var0) {
        HashMap var1 = new HashMap();
        var1.put("vishal", 10);
        var1.put("sachin", 30);
        var1.put("vaibhav", 20);
        System.out.println("Size of map is: " + var1.size());
        System.out.println(var1);
        if (var1.containsKey("vishal")) {
            Integer var2 = (Integer)var1.get("vishal");
            System.out.println("value for key \"vishal\" is: " + var2);
        }

    }
}
