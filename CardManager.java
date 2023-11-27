import java.util.HashMap;
import java.util.List;

public class CardManager {
    private HashMap<String,Card> deck=new HashMap<String,Card>();
    private HashMap<Integer,List<String>> help=new HashMap<Integer,List<String>>();


    public CardManager(){
        help.put(1, List.of("Red","Diamond","Filled","One"));
        help.put(2, List.of("Blue","Oval","Empty","Two"));
        help.put(3, List.of("Purple","Squiggle","Dashed","Three"));
        createDeck();
         
            
    
        
    }

    private void createDeck(){
        int total=0;
        for(int color = 1; color<=3;color++){
            for(int shape = 1; shape<=3;shape++){
                for(int fill =1; fill<=3; fill++){
                    for(int number =1; number<=3; number++){
                        deck.put("["+color+shape+fill+number+"]",
                        new Card(
                            help.get(color).get(0), 
                            help.get(shape).get(1), 
                            help.get(fill).get(2), 
                            help.get(number).get(3))
                            );
                            System.out.print("["+color+shape+fill+number+"]");
                            total++;

                    }System.out.println();
                }System.out.println();


            }System.out.println();
            
        }
        System.out.println("total cards: "+ total);
    }
}
