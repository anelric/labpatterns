package adapter;

import domain.Symptom;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = ((Symptom)o1).getName();
        String s2 = ((Symptom)o2).getName();
        return s1.compareTo(s2);
    }
}
