import java.util.ArrayList;
/**
 * Write a description of class Guitar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Guitar
{
    // instance variables - replace the example below with your own
    private ArrayList<String> guitar;
    private boolean guitarstock; 
    /**
     * Constructor for objects of class Guitar
     */
    public Guitar()
    {
        guitar = new ArrayList<>();
        guitar.add("Les Paul");
        guitar.add("Gibson");
        guitar.add("Morgan");
    }
    
    public void addGuitar(String guitarname)
    {
    
        guitar.add(guitarname);
        System.out.println("You have added " + guitarname + " guitar"+" to the list");
        
    }
    
    public void removeGuitar(int index)
    {
        if(index >= 0 && index < guitar.size()){
            String guitarname = guitar.get(index);
            guitar.remove(index);
            System.out.println("You have removed "+ guitarname +" guitar"+" from the list" );
        }
      
    }
    
    public void listGuitar()
    {
        for(String guitars : guitar){
            System.out.println(guitars + " guitars");
        }
    
    }
    
    public void sellAllGuitars()
    {
        guitar.clear(); 
    }
    
     public int sizze()
    {
         return guitar.size(); 
        
    }
    
    public int findGuitar(String searchString)
    {
        int index = 0;
        boolean searching = true; 
        while(searching && index < guitar.size()){
            String guitarname = guitar.get(index);
            if(guitarname.contains(searchString)){
                System.out.println(guitarname + " guitar");
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
        while(searching && index < guitar.size()){
            String guitarname = guitar.get(index);
            if(guitarname.contains(searchString)){
                System.out.println(guitarname + " guitar");
                guitarstock = true; 
                searching = false; 
            }
             else {
            
                index++;
            }
        
        }
        
        if(searching){
            
            guitarstock = false; 
            return -1; 
        
        }
         else{
            
            return index; 
        }
    }
    
    public boolean getStock(){
    
        return guitarstock; 
    }
}
