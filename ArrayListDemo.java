/* index is very important factor in arraylist , by using that we can keep track of the postion of elements
in the arraylist ...*/
import java.util.*;

class ArrayListDemo {
    public static void main(String args[] ) throws Exception {
        
        /*
        Different types of data can be stored in an array list or we can specify the type of data we 
        want to store in the arraylist,
        an array list which stores integer variables can be declared as follows..
        */
        ArrayList<Integer> myList = new ArrayList<Integer>();
        
        /* there are 3 constructors to create an arraylist , they are
        1. ArrayList() -> creates an empty arrayList
        2. ArrayList(int capacity) -> creates an arraylist of size capacity
            -> example ArrayList<Integer> list1 = new ArrayList(4); creates array list of size 4;
        3. ArrayList(Collection c) -> creates an arrayList from collection c
        */
        
        /* adding the elements into the arraylist using loops 
        */
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int p = sc.nextInt();
            myList.add(p);
        }
        /* removing an element from the arraylist using its index, removes 0th index element 
            from the arraylist */
        myList.remove(0);
        
        /* displaying the elements of the arraylist using normal for loop */
        
        for(int i=0;i<myList.size();i++){
            
            System.out.println(myList.get(i));
        }
        
        /* 
        creating an arraylist from  a set--->
        
        Set<String> s = new HashSet<String>(); 
            s.add("Geeks"); 
            s.add("for"); 
            // Creating an array list using constructor 
            List<String> aList = new ArrayList<String>(s); 
        */
        
    }
}
/* for more info and demonstration check this out https://www.geeksforgeeks.org/arraylist-in-java/
*/
