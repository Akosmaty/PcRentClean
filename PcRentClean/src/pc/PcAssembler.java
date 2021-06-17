package pc;

import java.io.File;
import java.io.FileNotFoundException;

public class PcAssembler implements PC {
    public Procesors procesors;
    public Cases cases;
    public Gpu gpu;

    public PcAssembler(Procesors procesors, Cases cases,Gpu gpu) {
        this.procesors = procesors;
        this.cases = cases;
        this.gpu=gpu;
    }

    public String getModel() throws FileNotFoundException{
       return procesors.getName();
    }
    public String getClock() throws FileNotFoundException{
        return procesors.getClock();
    }
    public String getGeneration() throws FileNotFoundException{
        return procesors.getGeneration();
    }
    public String getPrice() throws FileNotFoundException{
        return procesors.getPrice();
        }
    public String getC_model() throws  FileNotFoundException{
        return cases.getName();
    }
    public String getC_Size() throws FileNotFoundException{
        return cases.getSize();
    }
    public String getC_Price()throws FileNotFoundException{
        return cases.getPrice();}
    public String getG_model() throws FileNotFoundException{
        return gpu.getName();
    }
    public String getG_Clock() throws  FileNotFoundException{
        return gpu.getCLock();
    }
    public String getG_Memory() throws FileNotFoundException{
        return gpu.getMemory();
    }
    public String getG_Price()throws FileNotFoundException{
        return gpu.getPrice();}


    }




