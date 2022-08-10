package com.bdse.pfs;

import java.io.IOException;

public class SetTopic extends Display {

    // Create the function that's printing the mcq's topics
    public void setTopics() {
    // variable declaration
    String chooseTopic;
        // print the MCQ's topic
        showMenu();
        chooseTopic = input.nextLine();
        switch (chooseTopic) {
            case "1" -> {
                System.out.println(name + " have chosen HTML");
                System.out.println();
                try {
                    this.showMcqQuestion("src\\com\\bdse\\pfs\\HtmlQuestion.csv");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            case "2" -> {
                System.out.println(name + " have chosen Javascript");
                System.out.println();
                try {
                    this.showMcqQuestion("src\\com\\bdse\\pfs\\JavascriptQuestion.csv");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
            default -> {
                String isCorrectChoose = "^[1]|[2]*$";
                // check if the user choose the topic out of the number then repeat till correct
                if (!chooseTopic.equals(isCorrectChoose)) {
                    System.out.println("Wrong Input please Try Again !");
                    this.setTopics();
                }
            }
        }
    }
}
