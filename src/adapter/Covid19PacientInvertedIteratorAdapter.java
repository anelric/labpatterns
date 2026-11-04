package adapter;

import domain.Covid19Pacient;
import domain.Symptom;

import java.util.Vector;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator{
    Vector<Symptom> sintomas;
    int pos = 0;

    public Covid19PacientInvertedIteratorAdapter(Covid19Pacient p) {
        sintomas = new Vector<Symptom>(p.getSymptoms());
    }

    @Override
    public Object previous() {
        Symptom s = sintomas.elementAt(pos);
        pos = pos-1;
        return s;
    }

    @Override
    public boolean hasPrevious() {
        return pos>=0;
    }

    @Override
    public void goLast() {
        pos = sintomas.size()-1;

    }
}
