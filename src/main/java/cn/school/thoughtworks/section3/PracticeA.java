package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

//        HashMap<String,Integer> result = new HashMap<>();
        List<String> temp = object.get("value");
        if(temp.isEmpty()){
            return collectionA;
        }

        for (int i = 0;i < temp.size();i++){
            if (collectionA.containsKey(temp.get(i))){
                Integer num = collectionA.get(temp.get(i));
                num = num -1;
                collectionA.put(temp.get(i),num);
            }
        }
        return collectionA;
    }
}
