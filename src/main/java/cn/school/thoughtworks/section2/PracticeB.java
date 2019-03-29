package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        HashMap<String,Integer> result = new HashMap<>();
        if (collection1.isEmpty()){
            return result;
        }

        for (int i=0;i<collection1.size();i++){
            String temp = collection1.get(i);
            Integer count = 1;
            if (temp.length()!=1){
                String[] tem = temp.split("-");
                temp = tem[0];
                count = Integer.parseInt(tem[1]);
            }

            if (!result.containsKey(temp)) {
                result.put(temp, count);
            } else {
                Integer num = result.get(temp);
                result.put(temp, num + count);
            }

        }
        return result;

    }
}
