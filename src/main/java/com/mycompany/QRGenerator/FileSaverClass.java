/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.QRGenerator;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.image.*;
/**
 *
 * @author hoaf13
 */
public class FileSaverClass {
    JFileChooser jFileChooser = new JFileChooser();
    String path = null;
    public FileSaverClass() {
        
    }
    public void saveFile(BufferedImage imageS) {
        if (jFileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            path = jFileChooser.getSelectedFile().getAbsolutePath();
            System.out.println(path);
            try {
                ImageIO.write(imageS, "jpg", new File(path));
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }
}
