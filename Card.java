
public class Card {
private String cardShape;
private String cardColor;
private String cardNumber;
private String cardTexture;
// private GraphicsObject shape;

    public Card(String color, String shape, String fill, String number){
        this.cardShape=shape;
        this.cardColor=color;
        this.cardNumber=number;
        this.cardTexture=fill;

    }
    public String toString(){
        return "["+this.cardColor+this.cardShape+this.cardTexture+this.cardNumber+"]";
    }
}
