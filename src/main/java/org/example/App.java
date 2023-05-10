package org.example;

import model.Cat;
import service.Mapper;
import service.RestService;

import javax.management.NotificationFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main( String[] args ) throws IOException {

        FileWriter fileWriter = new FileWriter("cat.txt");

        RestService restService = new RestService();

        Mapper mapper = new Mapper();

        String response = restService.run("https://cat-fact.herokuapp.com/facts");
        System.out.println(response);

        Cat[] cats = mapper.getModels(response);

        for (Cat cat: cats){
            System.out.println(cat.toString());
        }

        fileWriter.write(Arrays.toString(cats));
        fileWriter.close();
    }
}
