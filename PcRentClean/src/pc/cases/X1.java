package pc.cases;

import pc.Cases;
import pc.TextReaderArr;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class X1 implements Cases {




    public String getName() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("X1.txt");
        return data.get(1);
    }

    public String getSize() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("X1.txt");
        return data.get(2);
    }

    public String getPrice() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("X1.txt");
        return data.get(3);
    }

}