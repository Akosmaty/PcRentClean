package pc;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface Cases {
    public String getName() throws FileNotFoundException;

    public String getSize() throws FileNotFoundException;

    public String getPrice() throws FileNotFoundException;
}
