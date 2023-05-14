/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tulisnilai;

import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.WindowStateListener;

/**
 *
 * @author Fikri
 */
public class tulis_menu extends javax.swing.JFrame {

    /**
     * Creates new form tulis_menu
     */
    public tulis_menu() {
        initComponents();
        ImageIcon img = new ImageIcon("C:\\Users\\Fikri\\Pictures\\2x/TulisNilaiAsset 1@2x.png");
        this.setIconImage(img.getImage());
        this.setState(MAXIMIZED_BOTH);
        System.out.println(this.getExtendedState());
        System.out.println(this.getState());
    }

    private void statemenu(){
        if(this.getExtendedState()== Frame.MAXIMIZED_BOTH){
        panel_menu.setLayout(new GridBagLayout());
        GridBagConstraints option = new GridBagConstraints();
      //  option.fill = GridBagConstraints.HORIZONTAL;
        option.anchor = GridBagConstraints.FIRST_LINE_START;
        option.ipadx  = 400;
        option.ipady  = 120;
        option.gridx = 0;
        option.gridy = 0;
        panel_menu.add(btn_temp1, option);
        option.gridx = 1;
        option.gridy = 0;
       // option.fill = GridBagConstraints.HORIZONTAL;
        option.anchor = GridBagConstraints.PAGE_START;
        panel_menu.add(btn_temp2, option);
        option.gridx = 0;
        option.gridy = 1;
        //option.fill = GridBagConstraints.HORIZONTAL;
        option.anchor = GridBagConstraints.LINE_START;
        panel_menu.add(btn_temp3, option);
        option.gridx = 1;
        option.gridy = 1;
       // option.fill = GridBagConstraints.HORIZONTAL;
        option.anchor = GridBagConstraints.CENTER;
        panel_menu.add(btn_temp4, option);
        } else  if(this.getExtendedState()== Frame.NORMAL){
        panel_menu.setLayout(new GridBagLayout());
        GridBagConstraints option = new GridBagConstraints();
        option.insets = new Insets(71,0,0,0);  //top padding
        option.anchor = GridBagConstraints.FIRST_LINE_START;
        option.ipadx  = 192;
        option.ipady  = 55;
        option.gridx = 0;
        option.gridy = 0;
        panel_menu.add(btn_temp1, option);
        option.insets = new Insets(18,0,0,0);  //top padding
        option.gridx = 0;
        option.gridy = 1;
       // option.fill = GridBagConstraints.HORIZONTAL;
        option.anchor = GridBagConstraints.LINE_START;
        panel_menu.add(btn_temp2, option);
        option.gridx = 0;
        option.gridy = 2;
        //option.fill = GridBagConstraints.HORIZONTAL;
        option.anchor = GridBagConstraints.LAST_LINE_START;
        panel_menu.add(btn_temp3, option);
        option.gridx = 0;
        option.gridy = 3;
        panel_menu.add(btn_temp4, option);
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        main_panel = new javax.swing.JPanel();
        panel_profile = new javax.swing.JPanel();
        icon_fotoprofil = new javax.swing.JLabel();
        text_nuptk1 = new javax.swing.JLabel();
        text_namaguru2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        text_pengajarguru = new javax.swing.JLabel();
        text_nuptkguru1 = new javax.swing.JLabel();
        text_nuptk = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        text_namaguru1 = new javax.swing.JLabel();
        text_nuptkguru = new javax.swing.JLabel();
        text_pengajar = new javax.swing.JLabel();
        panel_logout = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        panel_menu = new javax.swing.JPanel();
        btn_temp1 = new javax.swing.JButton();
        btn_temp2 = new javax.swing.JButton();
        btn_temp3 = new javax.swing.JButton();
        btn_temp4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tulis Menu");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        main_panel.setBackground(new java.awt.Color(145, 216, 228));

        panel_profile.setBackground(new java.awt.Color(255, 255, 255));

        icon_fotoprofil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tulisnilai/TulisNilaiAsset 3.png"))); // NOI18N

        text_nuptk1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text_nuptk1.setText("No. Telepon    :");

        text_namaguru2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setText("Walikelas        :");

        text_pengajarguru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        text_nuptkguru1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        text_nuptk.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text_nuptk.setText("NUPTK           :");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setText("Nama              :");

        text_namaguru1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        text_nuptkguru.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        text_pengajar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text_pengajar.setText("Pengajar         :");

        javax.swing.GroupLayout panel_profileLayout = new javax.swing.GroupLayout(panel_profile);
        panel_profile.setLayout(panel_profileLayout);
        panel_profileLayout.setHorizontalGroup(
            panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_profileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_profileLayout.createSequentialGroup()
                        .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_profileLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(text_nuptk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_namaguru1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_profileLayout.createSequentialGroup()
                                .addComponent(text_nuptkguru, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panel_profileLayout.createSequentialGroup()
                        .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(text_pengajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_nuptk1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_nuptkguru1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_pengajarguru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_namaguru2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_profileLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(icon_fotoprofil, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );
        panel_profileLayout.setVerticalGroup(
            panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_profileLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(icon_fotoprofil)
                .addGap(18, 18, 18)
                .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(text_namaguru1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_nuptk)
                    .addComponent(text_nuptkguru, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_pengajar)
                    .addComponent(text_pengajarguru, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_profileLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(text_nuptk1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_profileLayout.createSequentialGroup()
                        .addComponent(text_namaguru2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(text_nuptkguru1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(214, 214, 214))
        );

        panel_logout.setBackground(new java.awt.Color(145, 216, 228));

        btn_logout.setBackground(new java.awt.Color(255, 51, 51));
        btn_logout.setText("Logout");

        javax.swing.GroupLayout panel_logoutLayout = new javax.swing.GroupLayout(panel_logout);
        panel_logout.setLayout(panel_logoutLayout);
        panel_logoutLayout.setHorizontalGroup(
            panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addContainerGap())
        );
        panel_logoutLayout.setVerticalGroup(
            panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addGap(31, 31, 31))
        );

        panel_menu.setBackground(new java.awt.Color(145, 216, 228));

        btn_temp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temp1ActionPerformed(evt);
            }
        });

        btn_temp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temp2ActionPerformed(evt);
            }
        });

        btn_temp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temp4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_temp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_temp3, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(btn_temp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_temp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_temp1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_temp2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_temp3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_temp4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(panel_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jMenuBar1.setName("Tulis Menu"); // NOI18N

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_temp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_temp1ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
        statemenu();
    }//GEN-LAST:event_formWindowStateChanged

    private void btn_temp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_temp2ActionPerformed

    private void btn_temp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_temp4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tulis_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tulis_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tulis_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tulis_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tulis_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_temp1;
    private javax.swing.JButton btn_temp2;
    private javax.swing.JButton btn_temp3;
    private javax.swing.JButton btn_temp4;
    private javax.swing.JLabel icon_fotoprofil;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel panel_logout;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_profile;
    private javax.swing.JLabel text_namaguru1;
    private javax.swing.JLabel text_namaguru2;
    private javax.swing.JLabel text_nuptk;
    private javax.swing.JLabel text_nuptk1;
    private javax.swing.JLabel text_nuptkguru;
    private javax.swing.JLabel text_nuptkguru1;
    private javax.swing.JLabel text_pengajar;
    private javax.swing.JLabel text_pengajarguru;
    // End of variables declaration//GEN-END:variables
}
