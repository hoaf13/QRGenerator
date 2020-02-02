/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.QRGenerator;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.*;
import java.awt.*;

import java.awt.image.BufferedImage;

/**
 *
 * @author hoaf13
 */
public class QRcode {
    
    public BufferedImage generate(JLabel label , String data) throws IOException, WriterException{
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix matrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, 200, 200);
  
        // Write to file image
//        String outputFile = "/home/hoaf13/Pictures/image.png";
//        Path path = FileSystems.getDefault().getPath(outputFile);
//        MatrixToImageWriter.writeToPath(matrix, "PNG", path);
        
        BufferedImage buffIcon = MatrixToImageWriter.toBufferedImage(matrix);
        label.setIcon(new ImageIcon(new ImageIcon(buffIcon).getImage().getScaledInstance(200, 200,Image.SCALE_SMOOTH)));
        return buffIcon;
    }
}
