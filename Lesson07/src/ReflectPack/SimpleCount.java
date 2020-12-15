package ReflectPack;

public class SimpleCount {

    public int simpleCount(int a, int b) throws OwnException{
        if ((a <= 0) || (b <= 0)) {
            OwnException oe = new OwnException(101, "Wrong number detected!", "Numbers should be less then 1000!");
            throw oe;
        }
        return a /b;
    }


}
