/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Histogram<T> {
    
    private final Map <T,Integer> map = new HashMap();
    
    
    public int get(T key){
        return map.get(key);
    }
    
    public Set<T> KeySet(){
        return map.keySet();
    }
    
    public void increment(T key, int rep){
        
        for(int i = 0; i <= rep; i++)
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        
    }
    
}
