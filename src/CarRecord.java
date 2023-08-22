public record CarRecord(String name,String color) implements Runnable{
    // Record can have static fields
    // Record can have static methods
    // Record can have instance methods
    // Record can not have instance fields
    // Attributes of records are final be default
    // Record can have canonical constructor
    // it can also have compact constructor
    // Record can not extends
    // Record can implement

    public static String ENGINE_TYPE = "Petrol";

    //public String buildType;

    public  CarRecord{
        if(name.contains("M5")){
            throw new IllegalArgumentException("M5 is not allowed in name");
        }
    }

    public static void print(){
        System.out.println("Print xyz!");
    }

    public void makeNoise(){
        System.out.println(this.name + " Vrooom!");
    }

    @Override
    public void run() {

    }

   /* public void repaint(String updatedColor){
        this.color = updatedColor;
    }*/
}
