import java.util.ArrayList;

public class Musicstore
{
    private Keyboards keyboard; 
    private Drums drum;
    private Guitar guitar;
    
    
    public Musicstore()
    {
        keyboard = new Keyboards(); 
        drum = new Drums();
        guitar = new Guitar(); 
        
    }
    
    public void listAll()
    {
       
        keyboard.listKeyboards(); 
        guitar.listGuitar(); 
        drum.listDrums(); 
    
    }
    
    public void listKeyboard()
    {
        keyboard.listKeyboards();
    
    }
    
    public void listGuitar()
    {
        guitar.listGuitar();
    
    }
    
    public void listDrums()
    {
        drum.listDrums();
    }
    
    public void sellOut()
    {
        keyboard.sellAllKeyboards();
        guitar.sellAllGuitars();
        drum.sellAllDrums(); 

    }
    
    public void findGuitar(String search)
    {
        guitar.findGuitar(search);
    }
    
    public void findDrum(String search)
    {
        drum.findDrums(search);
    }
    
    public void findKeyboard(String search)
    {
        keyboard.findKeyboard(search);
    }
    
    public void findInstrument(String search)
    {
      if(search != null)
      {
        guitar.findInstrument(search);
        
        if(guitar.getStock() == false)
          {
            drum.findInstrument(search);
              
            if(drum.getStock() == false)
            {
              keyboard.findInstrument(search);
              
              if(keyboard.getStock()== false)
              {
               System.out.println("Sorry, it doesnt look like we have it");
              }  
            }
         }
      }
       else {
              
          System.out.println("You need to search for something else");
        
        }
    }
}
