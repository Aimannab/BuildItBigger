package com.example.android.joketellerlib;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 * Created by Aiman Nabeel on 31/07/2018.
 */
//Java Library
public class JokeTeller {

    public String tellAJoke() {
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size() - 1));
    }

    private List<String> jokes;
    public JokeTeller() {
        jokes = new ArrayList<String>();

        jokes.add("Mia: Three tomatoes are walkin' down the street.\n"+
            "Papa Tomato, Mama Tomato and Baby Tomato.\n"+
            "Baby Tomato starts lagging behind, and Papa Tomato gets really angry.\n"+
            "Goes back and squishes him and says:\n"+
            "Ketchup. -Pulp Fiction");
        jokes.add("Rocky: Knock knock\n" +
                "Rocky Jr.: Whose there?\n" +
                "Rocky: Tuna fish\n" +
                "Rocky Jr.: Tuna fish who?\n" +
                "Rocky: You can tune a piano, but you can't tun-a fish! - Rocky V");
        jokes.add("Andrew: Two cannibals were eating a clown. One turns to the other and says:\n" +
                "Does this taste funny to you? - Bicentennial Man");
        jokes.add("What is the difference between the Cub Scouts and the military? \n" +
                "Bzzzzzt! Cub Scouts don't have heavy artillery!\n" +
                "- Good Morning Vietnam");
        jokes.add("What do you call a blind dinosaur?\n" +
                "I don't know.\n" +
                "A Do-you-think-he-saurus.\n" +
                "What do you call a blind dinosaur's dog?\n" +
                "You got me.\n" +
                "A Do-you-think-he-saurus Rex. - Jurassic Park");
    }
}
