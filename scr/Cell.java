import java.util.ArrayList;

public class Cell {
    private int strength;
    private int x;
    private int y;
    private int id;

    public Cell(int strength, int x, int y, int id){
        setStrength(strength);
        setX(x);
        setY(y);
        setId(id);
    }

    public Cell(){
        this(0, 0, 0, 0);
    }

    public void interactNeighbors(ArrayList<Cell> neighbors){

    }

     public void setStrength(int strength){
         this.strength = Math.max(strength, 0);
     }

     public int getStrength(){
        return this.strength;
     }

     public void setX(int x){
         this.x = Math.max(x, 0);
     }

     public int getX(){
        return this.x;
     }

    public void setY(int y){
        this.y = Math.max(y, 0);
    }

    public int getY(){
        return this.y;
    }

    public void setId(int id){
        this.id = Math.max(id, 0);
    }

    public int getId() {
        return this.id;
    }
}
