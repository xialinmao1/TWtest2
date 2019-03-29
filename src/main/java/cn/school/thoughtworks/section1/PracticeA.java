package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。

        List<String> result = new ArrayList<>();
        if (collection1.isEmpty()||collection2.isEmpty()){
            return result;
        }

        for (int i=0;i<collection1.size();i++){
            String temp = collection1.get(i);
            if (collection2.contains(temp)){
                result.add(temp);
            }
        }

        return result;
    }
}
