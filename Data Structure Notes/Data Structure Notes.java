import java.util.*;
class Testing{
    public static void main(String[] args){
        ArrayList();     // dynamic array
        LinkedList();    // dynamic array doubley linkedList. Can add and remove from any index.
        Stack();         // LIFO,                    
        Queue();         // FIFO,     
        HashSet();       // List of elements
        HashMap();       // Key Value pair 
        TreeSet();       // List of elements
        TreeMap();       // Key Value pair
        PriorityQueue(); // keeps elements with priority, by default it takes smallest element as highest priority, uses heap to store elements. 


        // ArrayList();     Duplicates:YES, Maintains order of Insertion: YES, Sorted:NO
        // LinkedList();    Duplicates:YES, Maintains order of Insertion: YES, Sorted:NO
        // Stack();         Duplicates:YES, Maintains order of Insertion: YES, Sorted:NO

        // Queue();         Duplicates:YES, Maintains order of Insertion: YES, Sorted:NO
        // PriorityQueue(); Duplicates:NO,  Maintains order of Insertion: NO,  Sorted:NO 

        // HashSet();       Duplicates:NO,  Maintains order of Insertion: NO,  Sorted:NO
        // TreeSet();       Duplicates:NO,  Maintains order of Insertion: NO,  Sorted:YES

        // HashMap();       Duplicates:YES, Maintains order of Insertion: NO,  Sorted:NO
        // TreeMap();       Duplicates:NO,  Maintains order of Insertion: NO,  Sorted:YES
    }

    public static void ArrayList(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.add("World");
        System.out.println(arrayList);
    }
    public static void LinkedList(){
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("Java");
        linkedList.add("World");
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        linkedList.add(1,"Sudha");
        System.out.println(linkedList);

    }
    public static void Stack(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Java");
        stack.push("World");
        System.out.println(stack);
    }
    public static void Queue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        queue.add("Java");
        queue.add("World");
        System.out.println(queue.poll());
        System.out.println(queue);

    }
    public static void HashSet(){
        Set<String> set = new HashSet<>();
        set.add("geeks"); 
        set.add("practice"); 
        set.add("contribute"); 
        set.add("ide"); 
        System.out.println(set);
    }
    public static void HashMap(){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "B");
        hashMap.put("B", "B");
        System.out.println(hashMap);
    }
    public static void TreeSet(){
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);
        System.out.println(treeSet);
    }
    public static void TreeMap(){
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Language", "Java");
        treeMap.put("Version", "11");
        treeMap.put("AA", "11");
        treeMap.put("AA", "11");
        System.out.println(treeMap);
    }
    public static void PriorityQueue(){
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(10);
        priorityQueue.add(2);
        System.out.println(priorityQueue);
        priorityQueue.remove(1);
        System.out.println(priorityQueue);

    }
}