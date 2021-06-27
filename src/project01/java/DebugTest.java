package project01.java;

import javax.xml.bind.SchemaOutputResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author pangfg
 * @date 2021/6/27 - 18:46
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        Map<String,String> map = new HashMap<>();
        map.put("1","xiaoming");
        map.put("2","xiaohong");
        String str = map.get("1");
        System.out.println(str);
    }
}
