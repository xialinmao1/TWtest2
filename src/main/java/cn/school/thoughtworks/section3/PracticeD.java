package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String,Integer> collectionB = new HashMap<>();

        for (int i=0;i<collectionA.size();i++){
            String temp = collectionA.get(i);
            Integer count = 1;
            if (temp.length()!=1){
                String[] tem = temp.split("-");
                temp = tem[0];
                count = Integer.parseInt(tem[1]);
            }

            if (!collectionB.containsKey(temp)) {
                collectionB.put(temp, count);
            } else {
                Integer num = collectionB.get(temp);
                collectionB.put(temp, num + count);
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
