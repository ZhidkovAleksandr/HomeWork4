package Task2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TXTHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Opening TXT file");
        JFileChooser fileToOpen = new JFileChooser();
        FileNameExtensionFilter theFilt = new FileNameExtensionFilter("TXT","txt");
        fileToOpen.setFileFilter(theFilt);
        int ret = fileToOpen.showDialog(null,"Your TXT file");
        if (ret == JFileChooser.APPROVE_OPTION) {
            System.out.println(fileToOpen.getSelectedFile().getName());
        }
    }

    @Override
    public void create() {
        System.out.println("Creating txt file");
    }

    @Override
    public void change() {
        System.out.println("Changing txt file");
    }

    @Override
    public void save() {
        System.out.println("Saving txt file");
    }
}
