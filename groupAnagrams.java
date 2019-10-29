/* grouping anagrams together , the words which are anagrams should be grouped together
*/

// import java.util.*;


// class MyClass implements Comparator<String>{
    
//     public String sortChars(String s){
        
//         char []content = s.toCharArray();
//         Arrays.sort(content);
//         return new String(content);
//     }
//     public int compare(String s1,String s2){
        
//         return sortChars(s1).compareTo(sortChars(s2));
    
//     }
// }
// class groupAnagrams {
//     public static void main(String args[] ) throws Exception {
       
//       String []arr = {"armani","arce","race","juliusceaser","acre","water"};
    
//         Arrays.sort(arr,new MyClass());
//         for(String s:arr){
//             System.out.println(s);
//         }
//     }
// }
 
// Method two of the same problem

import java.util.*;

class groupAnagrams{
    public static String sortChars(String s){
        
        char []content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static void sort(String []arr){
        
        HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
        
        for(String s:arr){
            
            String key = sortChars(s);
            if(!hm.containsKey(key)){
                 hm.put(key,new ArrayList<String>());     
            }
            hm.get(key).add(s);
        }
        int index = 0;
        for(String key:hm.keySet()){
            ArrayList<String> al = hm.get(key);
            for(String t:al){
                arr[index] = t;
                index++;
            }
        }
        for(String p:arr){
            System.out.println(p);    
        }
        
        
    }
    
    public static void main(String[] args){
        
        String []arr = {"armani","race","juliusceasar","arce","water","acre"};
        sort(arr);
        
    }
    
    
}
