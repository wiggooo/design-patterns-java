package assignment1_strategy;

public class NoPopFilter implements GenreFilter {
    @Override
    public boolean permit(Album a) {
        return !a.genre().equals("Pop");
    }
}
