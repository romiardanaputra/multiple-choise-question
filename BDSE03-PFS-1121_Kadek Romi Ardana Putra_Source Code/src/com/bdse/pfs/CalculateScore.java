package com.bdse.pfs;

public class CalculateScore extends McqQuestion {

    // create the calculation for the Score result
    public void calculateScore(){
        System.out.print(name + ", "); //take the username
        System.out.print("you answered : " + score + " Questions right, "); // take the right question and print the correct user's answer
        System.out.print(getWrongQuestion + " Questions Wrong" + " for a total of 10 Question"); // otherwise from the above
        System.out.println(" You scored : " + score * 10 + "%"); //print the score
    }
}
