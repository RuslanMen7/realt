/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uslugi;

import java.awt.Component;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class delete_uslugi extends javax.swing.JFrame {

    /**
     * Creates new form delete_uslugi
     */
    public delete_uslugi() {
        initComponents();
         String[] columnNames = {"Номер", "Наменование", "Стоимость", "Время работы", "Id_Персонел" };
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        jTable1.setModel(model);
        try {
            String Url = "jdbc:mysql://localhost/cto_buryatia?autoReconnection=true&useSSL=false";
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(Url, "root", "123456");
            
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM   cto_buryatia.uslugi  ");
            int i = 0;
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4), resultSet.getString(5)});
                i++;
            }
              } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Удаление услуг");

        jPanel1.setBackground(new java.awt.Color(255, 99, 177));

        jTable1.setBackground(new java.awt.Color(245, 245, 220));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Удалить услугу");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu1.setText("Файл");

        jMenuItem1.setText("Удалить услугу");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Выход");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Помощь");

        jMenuItem3.setText("О программе");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Справка");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable1.getSelectedRow()==-1){Component c = null;
         JOptionPane.showMessageDialog(c, "Вы невыбрали услугу!");}
     else{
        Component frame = null;
        int n = JOptionPane.showConfirmDialog(
            frame,
            "Вы дествительно хотите удалить запись?",
            "",
            JOptionPane.YES_NO_OPTION);
        if (n == 0) {
        String id_uslugi = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String name_uslugi = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String stoim = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String prodolj_raboti = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String id_personal = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        
        
        try {
             String Url = "jdbc:mysql://localhost/cto_buryatia?autoReconnection=true&useSSL=false";
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(Url, "root", "123456");
            
            String query = "INSERT INTO cto_buryatia.delet_uslugi(id_delet_uslugi,name_uslugi, stoim,prodolj_raboti,id_persnal)"+" VALUES (?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
            
          
            ps.setInt(1, Integer.parseInt(id_uslugi));
            ps.setString(2, name_uslugi);
            ps.setDouble(3, Double.parseDouble(stoim));
            ps.setString(4, prodolj_raboti);
            ps.setInt(5, Integer.parseInt(id_personal));
            
            ps.execute();
           
            String sql = "delete from cto_buryatia.uslugi where id_uslugi="+id_uslugi;
            
            stmt.executeUpdate(sql);
            Component c = null;
         JOptionPane.showMessageDialog(c, "Запись удалена!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }  
                    
                              
            int sr = jTable1.getSelectedRow();
                    if (sr > -1) {
                        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                        tm.removeRow(sr);
                    }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      if (jTable1.getSelectedRow()==-1){Component c = null;
         JOptionPane.showMessageDialog(c, "Вы невыбрали услугу!");}
     else{
        Component frame = null;
        int n = JOptionPane.showConfirmDialog(
            frame,
            "Вы дествительно хотите удалить запись?",
            "",
            JOptionPane.YES_NO_OPTION);
        if (n == 0) {
        String id_uslugi = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String name_uslugi = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String stoim = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String prodolj_raboti = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String id_personal = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        
        
        try {
             String Url = "jdbc:mysql://localhost/cto_buryatia?autoReconnection=true&useSSL=false";
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(Url, "root", "123456");
            
            String query = "INSERT INTO cto_buryatia.delet_uslugi(id_delet_uslugi,name_uslugi, stoim,prodolj_raboti,id_persnal)"+" VALUES (?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
            
          
            ps.setInt(1, Integer.parseInt(id_uslugi));
            ps.setString(2, name_uslugi);
            ps.setDouble(3, Double.parseDouble(stoim));
            ps.setString(4, prodolj_raboti);
            ps.setInt(5, Integer.parseInt(id_personal));
            
            ps.execute();
           
            String sql = "delete from cto_buryatia.uslugi where id_uslugi="+id_uslugi;
            
            stmt.executeUpdate(sql);
            Component c = null;
         JOptionPane.showMessageDialog(c, "Запись удалена!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }  
                    
                              
            int sr = jTable1.getSelectedRow();
                    if (sr > -1) {
                        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                        tm.removeRow(sr);
                    }
        }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(null, "Программа СТО Бурятия \n"
            + " Разработчик:Хуснутдинов Руслан Фиргатович \n Проектировщик:Сизинцев Денис Сергевич");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null, "Для удаление услуги выдилите его в таблице нажмите кнопку удалить услугу. ");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(delete_uslugi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_uslugi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_uslugi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_uslugi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_uslugi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
