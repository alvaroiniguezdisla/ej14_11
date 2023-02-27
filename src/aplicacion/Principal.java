package aplicacion;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import dominio.ej14_11;
public class Principal {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("Hola mundo");
        al.add("alvaro");
        System.out.println(ej14_11.noEmpiezaPorA(al));
    }
}
