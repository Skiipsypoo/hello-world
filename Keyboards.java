import java.util.ArrayList;
/**
 * Write a description of class Keyboards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Keyboards
{
    
     private ArrayList<String> keyboards;
     private boolean keyboardstock; 
    /**
     * Constructor for objects of class Keyboards
     */
    public Keyboards()
    {
        keyboards = new ArrayList<>(); 
        keyboards.add("Yamaha");
        keyboards.add("Casio");
        keyboards.add("Akai");
    }
    //Add a keyboard to the list of keyboards
    public void addKeyboard(String keyboardname)
    {
    
        keyboards.add(keyboardname);
        System.out.println("You have added " + keyboardname +" keyboard" +" to the list");
        
    }
   
    public void removeKeyboard(int index)
    {
        if(index >= 0 && index < keyboards.size()){
            String keyname = keyboards.get(index);
            keyboards.remove(index);
            System.out.println("You have removed "+ keyname +" keyboard" +" from the list" );
        }
      
    }
    
    public void listKeyboards()
    {
       for(String keyboard: keyboards){
           System.out.println(keyboard + " keyboards");
        } 
    
    }
    
    public void sellAllKeyboards()
    {
       keyboards.clear(); 
    }
    
     public int size()
    {
        return keyboards.size(); 
    }
    
    public int findKeyboard(String searchString)
    {
        int index = 0;
        boolean searching = true; 
        while(searching && index < keyboards.size()){
            String keyboardname = keyboards.get(index);
            if(keyboardname.contains(searchString)){
                System.out.println(keyboardname + " keyboard");
                searching = false; 
            }
             else {
            
                index++;
            }
        
        }
        
        if(searching){
            System.out.println("Sorry we didnt find it");
            return -1; 
        
        }
         else{
            
            return index; 
        }
    }
    
    public int findInstrument(String searchString)
    {
        int index = 0;
        boolean searching = true; 
        while(searching && index < keyboards.size()){
            String keyboardname = keyboards.get(index);
            if(keyboardname.contains(searchString)){
                System.out.println(keyboardname + " keyboard");
                searching = false; 
                keyboardstock= true; 
            }
             else {
            
                index++;
            }
        
        }
        
        if(searching){
            keyboardstock = false; 
            return -1; 
        
        }
         else{
            
            return index; 
        }
    }
    
    public boolean getStock()
    {
        return keyboardstock; 
    }
}
