package haseeb3;
public class Move {
    private Command MoveRight;
    private Command MoveLeft;
    private Command NoMove;

    public Move(Command MoveRight, Command MoveLeft) {
        this.MoveRight = MoveRight;
        this.MoveLeft = MoveLeft;
    }

    public void switchMoveRight() {
        MoveRight.execute();
        NoMove = MoveRight;
    }

    public void switchMoveLeft() {
        MoveLeft.execute();
        NoMove = MoveLeft;
    }

    public void undo() {
        NoMove.undo();
    }

}