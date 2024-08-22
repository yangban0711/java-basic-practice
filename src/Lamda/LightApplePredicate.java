package Lamda;

public class LightApplePredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWight() <= 100;
    }
}
