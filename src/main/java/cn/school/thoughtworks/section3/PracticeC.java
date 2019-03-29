package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String,Integer> collectionB = new HashMap<>();
        for (int i=0;i<collectionA.size();i++){
            if (!collectionB.containsKey(collectionA.get(i))){
                collectionB.put(collectionA.get(i),1);
            }
            else {
                Integer num = collectionB.get(collectionA.get(i));
                num = num + 1;
                collectionB.put(collectionA.get(i),num);
            }
        }
        List<String> temp = object.get("value");
        if(temp.isEmpty()){
            return collectionB;
        }

        for (int i = 0;i < temp.size();i++){
            if (collectionB.containsKey(temp.get(i))){
                Integer num = collectionB.get(temp.get(i));
                Integer cur = num / 3;
                num = num -cur;
                collectionB.put(temp.get(i),num);
            }
        }

        return collectionB;
    }
}
