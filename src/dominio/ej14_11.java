package dominio;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import java.util.stream.Collectors;

public class ej14_11 {
    public static List<String> noEmpiezaPorA(List<String> al){
        return Stream.iterate(0,i->i+1).limit(al.size()).map(i->al.get(i)).filter(i->!i.startsWith("A")).collect(Collectors.toCollection(ArrayList::new));
    }
}
