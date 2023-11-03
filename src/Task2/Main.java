package Task2;


import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    static void makeActions(AbstractHandler redactor){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose type of action: open-o/create-c/change-e/");
        String actionOfUser = sc.next();

        switch (actionOfUser){

            case "o":
                redactor.open();
                redactor.save();
                break;
            case "c":
                redactor.create();
                redactor.save();
                break;
            case "e":
                redactor.change();
                redactor.save();
                break;
            default:
                return;

        }



    }

    public static void main(String[] args) {


        System.out.println("Type in the type of file: txt, xml, doc");
        Scanner userAction = new Scanner(System.in);
        String chosenType = userAction.next().toLowerCase();


        AbstractHandler redactor;

        switch (chosenType){

            case "txt":
                redactor = new TXTHandler();
                makeActions(redactor);
                break;
            case "xml":
                redactor = new XMLHandler();
                makeActions(redactor);
                break;
            case "doc":
                redactor = new DOCHandler();
                makeActions(redactor);
                break;
            default:
                return;

        }


        userAction.close();






    }

}
