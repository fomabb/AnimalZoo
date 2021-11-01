package by.overone.lesson;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public void zoo() {
        List<String> animals = new ArrayList<>();

        animals.add("Волк");
        animals.add("Жераф");
        animals.add("Енот");
        animals.add("Носорог");
        animals.add("Зубр");

        System.out.println("В нашем зоопарке на сегоняшний день " + animals.size() + " животных");
        System.out.println("Это наши люьимые: " + animals);
    }
}
