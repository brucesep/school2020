package ReflectPack;

public class RunCount {

    public static void main(String[] args) throws OwnException{
        SimpleCount simpleCount = new SimpleCount();
        try{
            System.out.println("Result is: " + simpleCount.simpleCount(-100, -5));
        } catch(OwnException oe){
            System.out.println(oe.getCode());
            System.out.println(oe.getDescription());
            System.out.println(oe.getMessage());
            oe.printStackTrace();
        }

        try{
            System.out.println("Second result is: " + simpleCount.simpleCount(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Uncheked exception");
        }

//        int e = Integer.parseInt(args[0]);
//        int f = Integer.parseInt(args[1]);
    }




}
