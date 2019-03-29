package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>();
        List<String> tem = collection2.get("value");

        if (collection1.isEmpty()||tem.isEmpty()){
            return result;
        }

        for (int i=0;i<collection1.size();i++){
            String temp = collection1.get(i);
            if (tem.contains(temp)){
                result.add(temp);
            }
        }

        return result;
    }
}
