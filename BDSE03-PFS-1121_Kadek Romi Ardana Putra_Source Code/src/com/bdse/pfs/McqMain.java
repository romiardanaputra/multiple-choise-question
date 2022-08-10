/*
 using jdk 16.0 version
 created by Kadek Romi Ardana Putra
 Java McqSystem
 McqMain class
 */


package com.bdse.pfs;

import java.util.Scanner;

public class McqMain {

    // global variable declaration
    public final static String splitBy = ",";
    public static String line = "";
    public static String name;

    // scanner variable
    static Scanner input = new Scanner(System.in);

    // main function
    public static void main(String[] args) {

        SetTopic doShow = new SetTopic(); // declare the doShow object by creating a new instance from SetTopic class
        Display doDisplay = new Display(); // declare the doDisplay object by creating a new instance from Display class
        CalculateScore doCalculate = new CalculateScore(); // declare the doCalculate object by creating a new instance from CalculateScore class

        // Input User Name
        doDisplay.inputName();

        // choose the topic from the csv file and show the questions
        doShow.setTopics();

        //calculate the score
        doCalculate.calculateScore();
    }


}

