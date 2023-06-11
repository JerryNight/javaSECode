package chapter12_collection.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * ClassName: Test14
 * Description:
 *
 * @Author lyt
 * @Create 2023/5/31 20:57
 * @Version 1.0
 */
public class Test14 {
    public static void main(String[] args) {

        HashMap map = new HashMap();

        ArrayList wangfei = new ArrayList();
        wangfei.add("《红豆》");
        wangfei.add("《匆匆那年》");
        wangfei.add("《百年孤寂》");

        ArrayList zxy = new ArrayList();
        zxy.add("《吻别》");
        zxy.add("《一路上有你》");
        zxy.add("《一千个伤心的理由》");

        map.put("王菲",wangfei);
        map.put("张学友",zxy);

        Set set = map.entrySet();
        for (Object o : set){
            System.out.println(o);
        }

    }
}
