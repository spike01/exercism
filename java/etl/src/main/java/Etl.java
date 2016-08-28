import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
       ImmutableMap.Builder<String, Integer> newMap = ImmutableMap.builder();
       for(Map.Entry<Integer, List<String>> entry: old.entrySet()) {
           for(String s: entry.getValue()) {
               newMap.put(s.toLowerCase(), entry.getKey());
           }
       }
       return newMap.build();
   }
}
