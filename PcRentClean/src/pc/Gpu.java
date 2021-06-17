package pc;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface Gpu {
    public String getName() throws FileNotFoundException;

    public String getMemory() throws FileNotFoundException;

    public String getCLock() throws FileNotFoundException;

    public String getPrice() throws FileNotFoundException;
}
