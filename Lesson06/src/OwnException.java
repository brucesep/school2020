public class OwnException extends Exception {

    private int code;
    private String description;

    public OwnException(String message){
        this(0, "Attention! Something happen!", message);
    }

    public OwnException(int code, String description, String message) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public int getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }

}
