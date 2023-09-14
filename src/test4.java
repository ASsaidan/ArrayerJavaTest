import java.util.ArrayList;
import java.util.Collections;
public class test4 {
    public static void main(String[] args) {
        ArrayList <Integer> helTalLista = new ArrayList<>() ;
        Collections.addAll(helTalLista, 99,0, 22,23,764,564,87126,99,22,23,764,564,87126,65);
         findUniqe(helTalLista);

}
    public static void findUniqe(ArrayList<Integer> helTalLista ) {

        for (int s : helTalLista) {
            if (Collections.frequency (helTalLista, s) == 1) {
                System.out.println(s);
            }
        }
    }
}
