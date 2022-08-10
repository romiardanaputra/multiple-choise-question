package com.bdse.pfs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class McqQuestion extends McqMain {
    //variable declaration
    static int score = 0;
    static int getWrongQuestion = 0;
    static String setUserAnswer;
    static String getUserAnswer;

    // create the method that read the path file of mcq's selected and pass them to the String quizChosen variable
    public void showMcqQuestion(String quizChosen) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(quizChosen));
        // while read the line and contain the text and not null then do the loop
        while ((line = in.readLine()) != null) {
            String[] mcqQuestion = line.split(splitBy);
            do {
                // print the question by for looping
                for (int i = 0; i < 5; i++) {
                    System.out.println(mcqQuestion[i]);
                }
                //print the message and take the user's option input
                System.out.print("Please Input Your Option : ");
                setUserAnswer = input.nextLine();
                System.out.println();
                //checking one by one if the user choose A, B ,C, or D. if one get chosen then return it to getUserAnswer Variable
                if (setUserAnswer.equalsIgnoreCase("A")) {
                    getUserAnswer = mcqQuestion[1];
                } else if (setUserAnswer.equalsIgnoreCase("B")) {
                    getUserAnswer = mcqQuestion[2];
                } else if (setUserAnswer.equalsIgnoreCase("C")) {
                    getUserAnswer = mcqQuestion[3];
                } else if (setUserAnswer.equalsIgnoreCase("D")) {
                    getUserAnswer = mcqQuestion[4];
                } else {
                    // if false return the wrong message then getUserAnswer is equal to null
                    System.out.println("== >> Please type A, B, C or D << ==");
                    System.out.println();
                    getUserAnswer = null;
                }
            } while (!(setUserAnswer.equalsIgnoreCase("A") || setUserAnswer.equalsIgnoreCase("B")
                    || setUserAnswer.equalsIgnoreCase("C") || setUserAnswer.equalsIgnoreCase("D"))); // repeat if the user input is not one of the option

            // checking for the score
            assert getUserAnswer != null;
            //if the user's answer is equal the mcqQuestion with array index 5 which is the correct answer based on the csv file.
            if (getUserAnswer.equals(mcqQuestion[5])) {
                System.out.println("Your Answer Is Correct");
                System.out.println();
                score++;
            } else if (!getUserAnswer.equals(mcqQuestion[5])) { // otherwise
                System.out.println("Wrong!, the correct answer is : " + mcqQuestion[5]);
                System.out.println();
                getWrongQuestion++;
            } else {
                System.out.println("Please type A, B, C or D");
            }
        }
    }
}
