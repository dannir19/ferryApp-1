package pl.exercise.ferry.screen;

public class ExitScreen implements Screen{
    @Override
    public int interact() {
        System.exit(0);
        return 2;
    }
}
