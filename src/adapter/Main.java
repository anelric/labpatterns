package adapter;

import domain.Covid19Pacient;
import factory.SymptomFactory;

import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Covid19Pacient pacient = new Covid19Pacient("aitor",30,new SymptomFactory());


        pacient.addSymptomByName("disnea",2);
        pacient.addSymptomByName("cefalea",1);
        pacient.addSymptomByName("astenia",3);
        pacient.addSymptomByName("tos seca",2);
        pacient.addSymptomByName("escalofrios",1);

        InvertedIterator ii = new Covid19PacientInvertedIteratorAdapter(pacient);
        Comparator compName = new NameComparator();
        Comparator compSeverity = new SeverityComparator();

        Iterator i = Sorting.sortedIterator(ii, compName);

        System.out.println("Sorted by name");
        while(i.hasNext()) System.out.println(i.next());

        ii.goLast();
        i = Sorting.sortedIterator(ii, compSeverity);

        System.out.println("Sorted by severity");
        while(i.hasNext()) System.out.println(i.next());
    }
}
