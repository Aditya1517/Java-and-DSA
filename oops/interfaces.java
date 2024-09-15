package oops;

public class interfaces {

    public static void main(String args[]){
        Queen q = new Queen();
        q.move();
    }
    
}

// interfaces are used for implimenting multiple inheritence 
// in c++ we can impiment it by classed but not in java 

interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    public void move(){
        // here we have written the keyword public coz if we dont write it then its type will be default and interface has created it as public so we have to write public keyword
        System.out.println("up,down,left,right,diagonal(in all direction)");
    }
}

class Rook implements ChessPlayer {
    public void move(){
        // here we have written the keyword public coz if we dont write it then its type will be default and interface has created it as public so we have to write public keyword
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void move(){
        // here we have written the keyword public coz if we dont write it then its type will be default and interface has created it as public so we have to write public keyword
        System.out.println("up,down,left,right,diagonal(by one step)");
    }
}


// if we want to implemet to interface we write their name after interface keyword separated by ,