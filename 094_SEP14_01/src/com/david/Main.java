package com.david;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }

}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependentceDay extends Movie {


    public IndependentceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runnerererererer");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Start Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces ..... Star Wars";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

//    No plot method
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 1; i < 11 ; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
//            movie.plot() is the part polymorphism works.
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependentceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
//            default:
//                return null;
        }
        return null;
    }


}
