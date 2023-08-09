package com.singlesoap1;

import jakarta.jws.WebService;

import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "com.singlesoap1.ITranslate")
public class Translate implements ITranslate{
    @Override
    public String translate(String word) {

        Map<String, String> dictionary = getDictionary();

        return dictionary.get(word);
    }

    public static Map<String, String> getDictionary(){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("word","слово" );
        dictionary.put("world","світ" );
        dictionary.put("work","робота" );
        dictionary.put( "age","вік");
        dictionary.put("book","книга" );
        dictionary.put("life","життя"  );
        dictionary.put("love","кохання" );
        dictionary.put("kick","удар" );
        dictionary.put("food","їжа");
        dictionary.put("dog", "собака" );
        dictionary.put("cat","кіт");
        dictionary.put("house","будинок"  );
        dictionary.put("horse","кінь" );
        dictionary.put("source","джерело" );
        dictionary.put("wizard","чарівник" );
        dictionary.put("magick","магія" );
        dictionary.put("sword","меч"  );
        dictionary.put("bow","лук" );
        dictionary.put("java","джава" );
        dictionary.put("coffe","кава" );
        dictionary.put("tee","чай" );
        return dictionary;
    }
}
