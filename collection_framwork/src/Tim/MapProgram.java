package Tim;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        language.put("java","a compiled high level,object oriented ,platform independent");
        language.put("python","interpreted onject oriented language with dynamic symmetry ");
        language.put("Algol","an algorithmic language");
        language.put("BASIC","Begining All purpose symbolic Instruction Code");
        language.put("Lisp","There lies madness");
        System.out.println(language.put("Calm","phase of the person which is take the any thing in lightly"));
        if(language.containsKey("java")){
            System.out.println("java is already is present");
        }else{
            language.put("java","it is the object oriented language and platform independent ");
        }
        System.out.println(language.get("java"));
        language.remove("java","it is the object oriented language");
        language.replace("java","it is the high level language");
        for(String key:language.keySet()){
            System.out.println(key+" : "+language.get(key));
        }
    }
}
