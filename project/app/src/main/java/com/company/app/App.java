package com.company.app;

import com.company.dep.Dep;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Dep pn = new Dep();

        System.out.println("Choose choose:- (Red/Yellow/Magenta/Green)");
        String colour = scn.nextLine();

        // System.out.println(colour);

        pn.prettyPrint(colour);
    }
}
