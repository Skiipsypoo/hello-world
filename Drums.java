import java.util.ArrayList;
/**
 * Write a description of class Drums here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drums
{
    // instance variables - replace the example below with your own
    private ArrayList<String> drums;
    private boolean drumstock; 
    /**
     * Constructor for objects of class Drums
     */
    public Drums()
    {
        // initialise instance variables
        drums = new ArrayList<>(); 
        drums.add("Ludwig");
        drums.add("Gretsch");
        drums.add("Pearl");

    }

    public void addDrums(String drumname)
    {

        drums.add(drumname);
        System.out.println("You have added " + drumname + " drums"+" to the list");

    }

    public void removeDrums(int index)
    {
        if(index >= 0 && index < drums.size()){
            String drumname = drums.get(index);
            drums.remove(index);
            System.out.println("You have removed "+ drumname +" drums"+" from the list" );
        }

    }

    public void listDrums()
    {
        for(String drum : drums){
           System.out.println(drum + " drums");
        }
       
    
    }
    
    public void sellAllDrums()
    {
        drums.clear(); 
    }
    
    public int size()
    {
       return drums.size(); 
    }
    
    public int findDrums(String searchString)
    {
        int index = 0;
        boolean searching = true; 
        while(searching && index < drums.size()){
            String drumname = drums.get(index);
            if(drumname.contains(searchString)){
                System.out.println(drumname + " drums");
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
        while(searching && index < drums.size()){
            String drumname = drums.get(index);
            if(drumname.contains(searchString)){
                System.out.println(drumname + " drums");
                drumstock = true; 
                searching = false; 
            }
             else {
            
                index++;
            }
        
        }
        
        if(searching){
            
            drumstock = false; 
            return -1; 
        
        }
         else{
            
            return index; 
        }
    }
    
    public boolean getStock()
    {
        return drumstock;
    }
}

