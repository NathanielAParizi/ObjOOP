package com.example.objoopsimplealgodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.objoopsimplealgodemo.Animals.Animals;
import com.example.objoopsimplealgodemo.Animals.Food;
import com.example.objoopsimplealgodemo.Animals.Monkey;
import com.example.objoopsimplealgodemo.Animals.Parrot;
import com.example.objoopsimplealgodemo.Animals.Snake;
import com.example.objoopsimplealgodemo.Animals.Tiger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int[] arr;
    private ArrayList<Integer> dups;
    private int[] count;
    int c = 0;
    private HashSet<Integer> hs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //***************************************
        //   #1

        arr = new int[10];
        dups = new ArrayList<>();
        count = new int[10];

        Random rand = new Random();


        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(10);


        }

        findHighestVal(arr);


        //*****************************************
        //  #2  Armstrong

        armstrongNum();

        //*****************************************
        //  #3 Jungle

        Tiger tiger = new Tiger(15);
        Monkey monkey = new Monkey(10);
        Snake snake = new Snake(10);
        Parrot parrot = new Parrot(10);


        tiger.soundOff();
        snake.soundOff();
        monkey.soundOff();
        parrot.soundOff();


        Food grain = new Food("grain");
        Food meat = new Food("meat");
        Food bugs = new Food("Bugs");
        Food fish = new Food("Fish");

        tiger.eatFood(grain);
        tiger.eatFood(meat);
        monkey.eatFood(grain);
        parrot.eatFood(grain);
        snake.eatFood(meat);

        tiger.sleep();
        parrot.sleep();
        snake.sleep();

        snake.makeSound();


        tiger.soundOff();
        snake.soundOff();
        monkey.soundOff();
        parrot.soundOff();

        System.out.println("tiger population:" +
                tiger.getPopulation() + " tiger energy:" +
                tiger.getEnergy() + " \n snake population:" +
                snake.getPopulation() + " snake energy: " +
                snake.getEnergy() + " \nmonkey population:" +
                monkey.getPopulation() + " monkey energy: " +
                monkey.getEnergy() + " \nparrot population: " +
                parrot.getPopulation() + " parrot energy: " +
                parrot.getEnergy()
        );


    }


    //**** Method is under construction

    public void findHighestVal(int[] arr) {

        Arrays.sort(arr);

        int highVal = 0;
        int count = 0;
        int maxCount = 0;

        for (int i = 1; i < arr.length; i++) {
            Log.v("Test", String.valueOf(arr[i]));
            if (arr[i - 1] == arr[i]) {
                count++;
            } else {
                if (count > maxCount) {

                    maxCount = count;
                    highVal = arr[i - 1];

                }
                count = 1;
            }

            Log.v("High", "high value:" + highVal);

        }


    }


    public void armstrongNum() {

        int count = 0;
        int k;
        int num = 153;
        int temp = num;

        do {
            k = num % 10;
            num = num / 10;
            count += (k * k * k);
        }
        while (num > 0);

        if (count == temp) {
            Log.v("Armstrong", "This is an Armstrong number");
        } else {
            Log.v("Armstrong", "This is not an Armstrong number");
        }


    }

}
