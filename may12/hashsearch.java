package may12;

import java.util.HashMap;

public class hashsearch {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("priya",1);
        hm.put("roy",2);
        hm.put("rahul",3);
        hm.put("dushyant",4);

        String key ="rahul";
        if(hm.containsKey(key)){
            int value=hm.get(key);
                System.out.println(key+ " : "+value);
            }
        else System.out.println(key+" key not found");
        }
    }
