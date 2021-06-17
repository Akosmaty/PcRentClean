package pc;

import java.io.FileNotFoundException;

public interface PC {
    public String getModel() throws FileNotFoundException;
    public String getClock() throws FileNotFoundException;
    public String getGeneration() throws FileNotFoundException;
   //niech narazie zostanie String cena, jak bede robic sume to zrobie Integer.parseInt(getPriace());
    public String getPrice() throws FileNotFoundException;
    public String getC_model() throws  FileNotFoundException;
    public String getC_Size() throws FileNotFoundException;
    public String getC_Price()throws FileNotFoundException;
    public String getG_model() throws FileNotFoundException;
    public String getG_Clock() throws  FileNotFoundException;
    public String getG_Memory() throws FileNotFoundException;
    public String getG_Price()throws FileNotFoundException;

}
