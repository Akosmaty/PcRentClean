package pc;

import java.io.FileNotFoundException;

public interface Procesors  {
    public  String getName() throws FileNotFoundException;
    public String getClock() throws FileNotFoundException;
    public String getGeneration() throws FileNotFoundException;
    public String getPrice() throws FileNotFoundException;

}
