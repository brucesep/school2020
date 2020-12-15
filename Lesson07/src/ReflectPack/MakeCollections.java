package ReflectPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MakeCollections {
    public static void main(String[] args) {

        ArrayList<ClientId> clientsList = createClientBase(); // создал массив клиентов с ID
        System.out.println(clientsList.get(0));
        ArrayList<Billing> billList = createBillList(clientsList); // создал массив клиентов с ID и суммой потраченного
        System.out.println(billList.get(1));
        Map<ClientId, Billing> fullBill = fullBillList(clientsList, billList); //создал Мапу, где ключ - клиент с ID, а значение - клиент, ID, сумма
        System.out.println(fullBill.get(clientsList.get(2)));

        FinderClient.findIt(clientsList, "Andrey"); // находим клиента по имени Андрей
        FinderClient.countIt(billList); // находим кто больше всего потратил


    }

    public static Map<ClientId, Billing> fullBillList(ArrayList<ClientId> clientsList, ArrayList<Billing> billingList){
        Map<ClientId, Billing> fullBill = new HashMap<>();
        fullBill.put(clientsList.get(0), billingList.get(0));
        fullBill.put(clientsList.get(1), billingList.get(1));
        fullBill.put(clientsList.get(2), billingList.get(2));
        return fullBill;
    }

    public static ArrayList createBillList(ArrayList<ClientId> clientsList){
        Billing bill01 = new Billing(clientsList.get(0), 1000);
        Billing bill02 = new Billing(clientsList.get(1), 1500);
        Billing bill03 = new Billing(clientsList.get(2), 2000);
        ArrayList<Billing> billList = new ArrayList<>();
        billList.add(bill01);
        billList.add(bill02);
        billList.add(bill03);
        return billList;
    }

    public static ArrayList createClientBase(){
        ArrayList<ClientId> clientList = new ArrayList<>();
        ClientId client01 = new ClientId();
        client01.setIdClient("001");
        client01.setName("Andrey");
        clientList.add(client01);

        ClientId client02 = new ClientId();
        client02.setIdClient("002");
        client02.setName("Masha");
        clientList.add(client02);

        ClientId client03 = new ClientId();
        client03.setIdClient("003");
        client03.setName("Petya");
        clientList.add(client03);

        return clientList;
    }
}
