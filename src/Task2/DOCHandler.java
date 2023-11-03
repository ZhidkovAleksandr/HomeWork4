package Task2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DOCHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Opening Doc file");
        JFileChooser fileToOpen = new JFileChooser();
        FileNameExtensionFilter theFilt = new FileNameExtensionFilter("DOC","doc");
        fileToOpen.setFileFilter(theFilt);
        int ret = fileToOpen.showDialog(null,"Your Doc file");
        if (ret == JFileChooser.APPROVE_OPTION) {
            System.out.println(fileToOpen.getSelectedFile().getName());
        }
    }

    @Override
    public void create() {
        System.out.println("Creating doc file");
    }

    @Override
    public void change() {
        System.out.println("Changing doc file");
    }

    @Override
    public void save() {
        System.out.println("Saving doc file");
    }
}
