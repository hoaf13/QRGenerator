/*
 Developed By Hoaf13 
 PROPTIT - PROGAPP 2020
 BE HAPPIER THAN EVER BEFORE !
 */
package com.mycompany.QRGenerator;


import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
//import javax.swing.UIManager;

/**
 * ...xa cách ta vời vợi như cách yêu trả lời :( 
 * Đợi chờ lòng với chút đau, đành hẹn ngày yêu lúc sau để tim xanh màu.
 * @author hoaf13
 */
public class QRGenerator extends javax.swing.JFrame {

    /**
     * Creates new form QRTranslator
     */
    public QRGenerator() {
        initComponents();
        isImageQR = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QRImage = new javax.swing.JLabel();
        AuthorImage = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Facebook = new javax.swing.JPanel();
        fbTextField = new javax.swing.JTextField();
        fbSymbol = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        instagram = new javax.swing.JPanel();
        InTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        URL = new javax.swing.JPanel();
        URLTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Text = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textTextArea = new javax.swing.JTextArea();
        textLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Credit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Author = new javax.swing.JLabel();
        Version = new javax.swing.JLabel();
        PROGAPP2020 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QR Generator    |    ver  1.0.0");
        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QRImage.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/resizeQRCODE.png")); // NOI18N
        QRImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        QRImage.setMaximumSize(new java.awt.Dimension(200, 200));
        QRImage.setMinimumSize(new java.awt.Dimension(200, 200));
        QRImage.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(QRImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 31, -1, -1));

        AuthorImage.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/authorImage.jpg")); // NOI18N
        AuthorImage.setText("jLabel1");
        AuthorImage.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 2, true));
        AuthorImage.setMaximumSize(new java.awt.Dimension(200, 200));
        AuthorImage.setMinimumSize(new java.awt.Dimension(200, 200));
        AuthorImage.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(AuthorImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 281, -1, -1));

        generate.setBackground(new java.awt.Color(61, 202, 128));
        generate.setFont(new java.awt.Font("DejaVu Sans Light", 1, 15)); // NOI18N
        generate.setForeground(new java.awt.Color(254, 254, 254));
        generate.setText("Generate");
        generate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(253, 215, 249), new java.awt.Color(196, 0, 255), new java.awt.Color(1, 18, 135), new java.awt.Color(123, 103, 254)));
        generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generate.setMaximumSize(new java.awt.Dimension(100, 30));
        generate.setMinimumSize(new java.awt.Dimension(100, 30));
        generate.setPreferredSize(new java.awt.Dimension(100, 30));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        getContentPane().add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        clear.setBackground(new java.awt.Color(85, 192, 136));
        clear.setFont(new java.awt.Font("DejaVu Sans Light", 1, 15)); // NOI18N
        clear.setForeground(new java.awt.Color(254, 254, 254));
        clear.setText("Clear");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(253, 211, 253), new java.awt.Color(250, 139, 255), new java.awt.Color(141, 162, 253), new java.awt.Color(1, 4, 143)));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.setDoubleBuffered(true);
        clear.setPreferredSize(new java.awt.Dimension(80, 30));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 451, -1, -1));

        save.setBackground(new java.awt.Color(85, 192, 136));
        save.setFont(new java.awt.Font("DejaVu Sans Light", 1, 15)); // NOI18N
        save.setForeground(new java.awt.Color(254, 254, 254));
        save.setText("Save");
        save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(254, 209, 251), new java.awt.Color(249, 70, 254), new java.awt.Color(133, 123, 255), new java.awt.Color(30, 0, 152)));
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setDoubleBuffered(true);
        save.setPreferredSize(new java.awt.Dimension(80, 30));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 451, -1, -1));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane2.setAutoscrolls(true);
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane2.setMaximumSize(new java.awt.Dimension(100, 100));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(50, 50));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(90, 35));

        Facebook.setBackground(java.awt.Color.white);
        Facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Facebook.setRequestFocusEnabled(false);
        Facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FacebookMouseExited(evt);
            }
        });
        Facebook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fbTextField.setText("https://www.facebook.com/");
        fbTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fbTextField.setPreferredSize(new java.awt.Dimension(213, 40));
        fbTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbTextFieldActionPerformed(evt);
            }
        });
        Facebook.add(fbTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 84, 417, 50));

        fbSymbol.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/resizeFaceb.png")); // NOI18N
        fbSymbol.setLabelFor(fbTextField);
        fbSymbol.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 2, true));
        fbSymbol.setMaximumSize(new java.awt.Dimension(100, 100));
        fbSymbol.setMinimumSize(new java.awt.Dimension(100, 100));
        fbSymbol.setOpaque(true);
        fbSymbol.setPreferredSize(new java.awt.Dimension(50, 50));
        fbSymbol.setRequestFocusEnabled(false);
        Facebook.add(fbSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 84, -1, -1));

        jLabel6.setText("Nhập Link Facebook.");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 18));
        Facebook.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 186, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/fbBG.jpg")); // NOI18N
        Facebook.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 380));

        jTabbedPane2.addTab("Facebook", new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/fbTab.png"), Facebook, "QRCode\n"); // NOI18N

        instagram.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instagramMouseExited(evt);
            }
        });
        instagram.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InTextField.setText("https://www.instagram.com/");
        InTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        InTextField.setMinimumSize(new java.awt.Dimension(213, 40));
        InTextField.setPreferredSize(new java.awt.Dimension(213, 40));
        instagram.add(InTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 84, 424, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/resizeInsta.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
        instagram.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 84, -1, -1));

        jLabel3.setText("Nhập Link Instagram.");
        instagram.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 186, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/inBG.png")); // NOI18N
        instagram.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 380));

        jTabbedPane2.addTab("Instagram", new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/instaTab.png"), instagram); // NOI18N

        URL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        URL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                URLMouseExited(evt);
            }
        });
        URL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        URLTextField.setText("https://");
        URLTextField.setMinimumSize(new java.awt.Dimension(218, 28));
        URLTextField.setPreferredSize(new java.awt.Dimension(213, 50));
        URLTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URLTextFieldActionPerformed(evt);
            }
        });
        URL.add(URLTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 84, 421, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nhập Địa Chỉ Liên Kết.");
        URL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 186, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/resizeURL.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));
        URL.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 84, 56, 53));

        jLabel10.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/urlBG.jpg")); // NOI18N
        URL.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 380));

        jTabbedPane2.addTab("       URL      ", new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/urlTab.png"), URL); // NOI18N

        Text.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextMouseExited(evt);
            }
        });
        Text.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTextArea.setColumns(20);
        textTextArea.setRows(5);
        textTextArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 152, 241), new java.awt.Color(217, 1, 168), new java.awt.Color(88, 121, 253), new java.awt.Color(1, 66, 143)));
        jScrollPane1.setViewportView(textTextArea);

        Text.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 566, 160));

        textLabel.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 15)); // NOI18N
        textLabel.setText("200 kí tự.");
        Text.add(textLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/textBG.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        Text.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 380));

        jTabbedPane2.addTab("    Text     ", new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/textTab.png"), Text); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/aboutBG.png")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout CreditLayout = new javax.swing.GroupLayout(Credit);
        Credit.setLayout(CreditLayout);
        CreditLayout.setHorizontalGroup(
            CreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreditLayout.setVerticalGroup(
            CreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("About", new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/logoTab.png"), Credit); // NOI18N

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 31, 598, 414));

        Author.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        Author.setText("D e v e l o p e d   B y  hoaf13");
        getContentPane().add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 487, -1, -1));

        Version.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        Version.setForeground(new java.awt.Color(1, 1, 1));
        Version.setText("Version 1.0.0");
        Version.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(Version, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        PROGAPP2020.setFont(new java.awt.Font("URW Bookman L", 1, 24)); // NOI18N
        PROGAPP2020.setForeground(new java.awt.Color(95, 95, 95));
        PROGAPP2020.setText("  PROGAPP 2020");
        getContentPane().add(PROGAPP2020, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 230, 30));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("PREVIEW");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 237, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon("/home/hoaf13/NetBeansProjects/QRGenerator/Images/hoa.jpeg")); // NOI18N
        Background.setText("jLabel9");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        try {
            if (getTextfiled.trim().equals("https://www.instagram.com/") == true || getTextfiled.trim().equals("https://www.facebook.com/") == true || getTextfiled.trim().equals("https://") == true || getTextfiled.trim().equals("") == true ){
                JOptionPane.showMessageDialog(rootPane, "Dữ liệu không hợp lệ.");
                return;
            }
            QRcode qrcode = new QRcode();
            imageS = qrcode.generate(QRImage, getTextfiled);
            isImageQR = true;
        } catch (IOException | WriterException ex) {
            Logger.getLogger(QRGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("/home/hoaf13/Downloads/white.png");
        QRImage.setIcon(icon);
        getTextfiled = "";
        isImageQR = false;
    }//GEN-LAST:event_clearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if (isImageQR == false){
            JOptionPane.showMessageDialog(rootPane, "Chưa có dữ liệu nhập vào.");
            return;
        }
        new FileSaverClass().saveFile(imageS);
    }//GEN-LAST:event_saveActionPerformed

    private void FacebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacebookMouseExited
        // TODO add your handling code here:
        getTextfiled = fbTextField.getText();
    }//GEN-LAST:event_FacebookMouseExited

    private void instagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseExited
        // TODO add your handling code here:
        getTextfiled = InTextField.getText();
    }//GEN-LAST:event_instagramMouseExited

    private void URLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URLMouseExited
        // TODO add your handling code here:  
        getTextfiled = URLTextField.getText();
    }//GEN-LAST:event_URLMouseExited

    private void TextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextMouseExited
        // TODO add your handling code here:
        getTextfiled = textTextArea.getText();
    }//GEN-LAST:event_TextMouseExited

    private void URLTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URLTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_URLTextFieldActionPerformed

    private void fbTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fbTextFieldActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws com.google.zxing.WriterException
     */
    public static void main(String args[]) throws IOException, WriterException {
        /**
         *  Nothing in Main
         */
        java.awt.EventQueue.invokeLater(() -> {
            new QRGenerator().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author;
    private javax.swing.JLabel AuthorImage;
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Credit;
    private javax.swing.JPanel Facebook;
    private javax.swing.JTextField InTextField;
    private javax.swing.JLabel PROGAPP2020;
    private javax.swing.JLabel QRImage;
    private javax.swing.JPanel Text;
    private javax.swing.JPanel URL;
    private javax.swing.JTextField URLTextField;
    private javax.swing.JLabel Version;
    private javax.swing.JButton clear;
    private javax.swing.JLabel fbSymbol;
    private javax.swing.JTextField fbTextField;
    private javax.swing.JButton generate;
    private javax.swing.JPanel instagram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton save;
    private javax.swing.JLabel textLabel;
    private javax.swing.JTextArea textTextArea;
    // End of variables declaration//GEN-END:variables
    
    // Optional variables declaration
    private String getTextfiled = "";
    private BufferedImage imageS = null;
    private boolean isImageQR = false;
    // End of variables declaration
    private void JOptionPane(JRootPane rootPane, String dữ_liệu_không_hợp_lệ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
