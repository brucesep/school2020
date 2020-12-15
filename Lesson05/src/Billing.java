import java.security.PublicKey;
import java.util.Objects;

public class Billing extends ClientId {

    int summa;

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }


    public ClientId getClientId() {
        return clientId;
    }

    public void setClientId(ClientId clientId) {
        this.clientId = clientId;
    }

    ClientId clientId;

    public Billing(ClientId clientId, int summa) {
        this.clientId = clientId;
        this.summa = summa;
    }

    @Override
    public String toString(){
        return  clientId + "; Total pay: " + summa;
    }

}
