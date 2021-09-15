package haseeb3;
public class MoveRightCommand implements Command {

    private Racket racket;

    public MoveRightCommand(Racket racket)
    {
        this.racket=racket;
    }

    @Override
    public void execute() {

        racket.turnRight();
    }

    @Override
    public void undo() {
        racket.turnLeft();
    }
}