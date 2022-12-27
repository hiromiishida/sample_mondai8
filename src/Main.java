public class Main {
    public static void main(String[] args) {

        prioSched();
    }

    private static void prioSched(){
        PrioQueue prioQueue = new PrioQueue();

        prioQueue.enqueue("A", 1);
        prioQueue.enqueue("B", 2);
        prioQueue.enqueue("C", 2);
        prioQueue.enqueue("D", 3);
        prioQueue.dequeue(); /* 戻り値は仕様しない */
        prioQueue.dequeue(); /* 戻り値は仕様しない */
        prioQueue.enqueue("D", 3);
        prioQueue.enqueue("B", 2);
        prioQueue.dequeue(); /* 戻り値は仕様しない */
        prioQueue.dequeue(); /* 戻り値は仕様しない */
        prioQueue.enqueue("C", 2);
        prioQueue.enqueue("A", 1);
        while(prioQueue.data.size() > 0){
            System.out.print(prioQueue.dequeue());
        }
    }
}