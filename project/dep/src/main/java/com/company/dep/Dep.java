package com.company.dep;

import com.github.tomaslanger.chalk.Chalk;

public class Dep {
    public void prettyPrint(String color) {
        if (color == "Red") {
            System.out.println("This is the Output in " + Chalk.on("Red").red().underline());
        } else if (color == "Magenta") {
            System.out.println("This is the Output in " + Chalk.on("Magenta").magenta().underline());
        } else if (color == "Yellow") {
            System.out.println("This is the Output in " + Chalk.on("Yellow").yellow().underline());
        } else if (color == "Green") {
            System.out.println("This is the Output in " + Chalk.on("Green").green().underline());
        }

    }

}
