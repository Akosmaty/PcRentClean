package pc.procesors;

import pc.Procesors;
import pc.TextReader;
import pc.TextReaderArr;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class I7 implements Procesors {

    public String getName() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I7.txt");
        return data.get(1);
    }
    public String getClock() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I7.txt");
        return data.get(2);
    }
    public String getGeneration() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I7.txt");
        return data.get(3);
    }
    public String getPrice() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I7.txt");
        return data.get(4);
    }
}
