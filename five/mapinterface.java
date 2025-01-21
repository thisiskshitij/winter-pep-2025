//Map interface implementation helps store and manage key value pairs.
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class mapinterface {
    HashMap<Integer, String> employeeRecords = new HashMap<Integer,String>();

    void registerEmployees(){
        employeeRecords.put(101,"Peter");
        employeeRecords.put(102,"Laura");
        employeeRecords.put(103,"Casselyn");
        employeeRecords.put(104,"Andika");
        employeeRecords.put(105,"Jessica");
    }

    void showKeyValuePairs(){

        System.out.println(employeeRecords.get(103));
        System.out.println(employeeRecords.remove(103));

        for(Entry <Integer, String>pair : employeeRecords.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

    }

    public static void main(String[] args) {
        mapinterface mi = new mapinterface();
        mi.registerEmployees();
        mi.showKeyValuePairs();
    }
}
