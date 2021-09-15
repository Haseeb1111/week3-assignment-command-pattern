package haseeb3;
public class Main {

    public static void main(String[] args) {


        Racket rack = new Racket();
        MoveRightCommand moverightCommand = new MoveRightCommand(rack);
        MoveLeftCommand moveleftCommand = new MoveLeftCommand(rack);
        Move move=new Move(moverightCommand,moveleftCommand);
        move.switchMoveRight();
        move.switchMoveLeft();
        move.undo();
    }


}
    

