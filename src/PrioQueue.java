import java.util.*;

public class PrioQueue {
    ArrayList<Data> data = new ArrayList<>();

    public void enqueue(String value, int priority){
        Data _data = new Data();
        _data.value = value;
        _data.priority = priority;

        data.add(_data);
    }

    public String dequeue(){
        String returnValue = "";
        int minPriority = -1;
        int targetIndex = -1;
        int i = 0;
        for(Data row: data){
            if(row.priority < minPriority || minPriority == -1){
                minPriority = row.priority;
                returnValue = row.value;
                targetIndex = i;
            }
            i++;
        }

        i = 0;
        for(Data row: data){
            if(targetIndex == i){
                data.remove(row);
                break;
            }
            i++;
        }
        return returnValue;
    }
}
