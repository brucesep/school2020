package ReflectPack;

public class ClientId extends Client {

    String idClient;

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdClient() {
        return idClient;
    }

    @Override
    public String toString() {
        return "Client: " + name + "; id: " + idClient;
    }

}
