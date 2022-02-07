package com.company.dep;

import com.github.tomaslanger.chalk.Chalk;

public class Dep {
    public void prettyPrint(String color) {
        if (color.equals("Red")) {
            System.out.println("This is the Output in " + Chalk.on("Red").red().underline());
        } else if (color.equals("Magenta")) {
            System.out.println("This is the Output in " + Chalk.on("Magenta").magenta().underline());
        } else if (color.equals("Yellow")) {
            System.out.println("This is the Output in " + Chalk.on("Yellow").yellow().underline());
        } else if (color.equals("Green")) {
            System.out.println("This is the Output in " + Chalk.on("Green").green().underline());
        }

    }

}
