package Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String pot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to rake over earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner( ) {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze ";
    }
}

class StarWrs extends Movie {
    public StarWrs() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
