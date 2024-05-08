public class Computer {
    // PROPERTIES
    private int storage;
    private String model;
    private String printer;
    private int extraStorage;

    // CONSTRUCTORS
    public Computer(int inputStorage, String inputModel, String inputPrinter, int inputExtraStorage){
        this.storage = inputStorage;
        this.model = inputModel;
        this.printer = inputPrinter;
        this.extraStorage = inputExtraStorage;
    }

    // BEHAVIOURS
    public int storageAdd(){
        return (this.storage += this.extraStorage);
    }

    // Method: get Storage
    public int getStorage(){
        return this.storage;
    }
    // Method: get Printer
    public String getPrinter(){
        return this.printer;
    }

    // Method: set Printer
    public void setPrinter(String printer){
        this.printer = printer;
    }

    // Method print Message if Printer
    public void printMessage(String yesPrinterMessage){
        if (this.printer != null){
            System.out.println(yesPrinterMessage);
        }
        else;
    }

}
