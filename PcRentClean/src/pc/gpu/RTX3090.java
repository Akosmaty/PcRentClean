package pc.gpu;

import pc.Gpu;
import pc.TextReaderArr;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RTX3090 implements Gpu {
    public String getName() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("RTX.txt");
        return data.get(1);
    }

    public String getMemory() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("RTX.txt");
        return data.get(2);
    }

    public String getCLock() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("RTX.txt");
        return data.get(3);
    }

    public String getPrice() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("RTX.txt");
        return data.get(4);
    }



}
