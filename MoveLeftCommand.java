package haseeb3;
public class MoveLeftCommand implements Command {

    private Racket racket;

    public MoveLeftCommand(Racket racket)
    {
        this.racket=racket;
    }

    @Override
    public void execute() {

        racket.turnLeft();
    }

    @Override
    public void undo() {
        racket.turnRight();
    }
}
