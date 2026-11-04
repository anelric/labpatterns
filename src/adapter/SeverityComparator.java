package adapter;

import domain.Symptom;

import java.util.Comparator;

public class SeverityComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int s1 = ((Symptom)o1).getSeverityIndex();
        int s2 = ((Symptom)o1).getSeverityIndex();
        if (s1>s2) return 1;
        if (s1<s2) return -1;
        return 0;
    }
}
