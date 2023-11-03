package Task2;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Opening xml file");
        JFileChooser fileToOpen = new JFileChooser();
        FileNameExtensionFilter theFilt = new FileNameExtensionFilter("XML","xml");
        fileToOpen.setFileFilter(theFilt);
        int ret = fileToOpen.showDialog(null,"Your XML file");
        if (ret == JFileChooser.APPROVE_OPTION) {
            System.out.println(fileToOpen.getSelectedFile().getName());
        }
    }

    @Override
    public void create() {
        /*

        зараз не працює, не розібрався чому шлях для файлу не працює, а тому файл і не створюється

        JFileChooser fileToOpen = new JFileChooser();
        fileToOpen.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return false;
            }

            @Override
            public String getDescription() {
                return null;
            }
        });
        fileToOpen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int ret = fileToOpen.showDialog(null,"File");
        if (ret == JFileChooser.APPROVE_OPTION) {
           String ap = fileToOpen.getSelectedFile().getAbsolutePath();
        }

         */

        System.out.println("Creating Xml");

    }

    @Override
    public void change() {
        System.out.println("Changing Xml");
    }

    @Override
    public void save() {
        System.out.println("Saving Xml");
    }
}
