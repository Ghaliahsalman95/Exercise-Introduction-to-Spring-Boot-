package com.example.exerciseonespringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class
WelcomeExercise {


    @GetMapping(path = "/myName")
    public String myName(){
        return "My name is: Ghaliah";

    }
    @GetMapping(path = "/age")
    public String myge(){
        return "My age is 27";

    }

    @GetMapping(path = "/check/status")
    public String check(){
        return "Everything OK";

    }

    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";

    }

    @GetMapping(path = "/names")
    public ArrayList<String> names(){
        ArrayList<String> names=new ArrayList<String>();
        names.add("Ghaliah");names.add("Abrar");
        //names.add("Hind");

        return names;
                //new String[]{"Ghaliah","Abrar","Hind"};

   }
    }


