package QuanLyCuaHang.GUI;

import QuanLyCuaHang.BUS.NhanVienBUS;
import QuanLyCuaHang.DTO.NhanVienDTO;
public class updateNhanVienGUI extends javax.swing.JFrame {

    NhanVienBUS nhanvienBUS = new NhanVienBUS();
    public boolean flag = false;
    
    public updateNhanVienGUI() {
        initComponents();
        jTHo.setText(NhanVienGUI.nhanvienDTO.Ho);
        jTTen.setText(NhanVienGUI.nhanvienDTO.Ten);
        jTGioiTinh.setText(NhanVienGUI.nhanvienDTO.GioiTinh);
        jTChucVu.setSelectedItem(NhanVienGUI.nhanvienDTO.ChucVu);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLHo = new javax.swing.JLabel();
        jLTen = new javax.swing.JLabel();
        jTHo = new javax.swing.JTextField();
        jTTen = new javax.swing.JTextField();
        jBLuu = new javax.swing.JButton();
        jTGioiTinh = new javax.swing.JTextField();
        jLGioiTinh = new javax.swing.JLabel();
        jLHeader = new javax.swing.JLabel();
        jLChucVu = new javax.swing.JLabel();
        jTChucVu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm Nhân Viên");

        jLHo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLHo.setText("Họ:");

        jLTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTen.setText("Tên:");

        jBLuu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBLuu.setText("Lưu");
        jBLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLuuActionPerformed(evt);
            }
        });

        jLGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLGioiTinh.setText("Giới tính:");

        jLHeader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLHeader.setText("Thông Tin Nhân Viên");

        jLChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLChucVu.setText("Chức vụ:");

        jTChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Quan Ly", "Nhan Vien" }));
        jTChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTChucVuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLHeader)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLHo)
                                    .addGap(91, 91, 91))
                                .addComponent(jLTen))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLGioiTinh)
                                    .addComponent(jLChucVu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTTen)
                            .addComponent(jTHo)
                            .addComponent(jTGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBLuu)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHo)
                    .addComponent(jTHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLGioiTinh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLChucVu)
                    .addComponent(jTChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jBLuu)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLuuActionPerformed
        // TODO add your handling code here:
        flag = nhanvienBUS.updateNhanVien(Integer.toString(NhanVienGUI.nhanvienDTO.MaNV),jTHo.getText(),jTTen.getText(), jTGioiTinh.getText(),jTChucVu.getSelectedItem().toString());
        if (flag){
            NhanVienGUI.upDTB();
            NhanVienGUI.nhanvienDTO = new NhanVienDTO();
            this.dispose();   
        }
    }//GEN-LAST:event_jBLuuActionPerformed

    private void jTChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTChucVuActionPerformed

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
            java.util.logging.Logger.getLogger(updateNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateNhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateNhanVienGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLuu;
    private javax.swing.JLabel jLChucVu;
    private javax.swing.JLabel jLGioiTinh;
    private javax.swing.JLabel jLHeader;
    private javax.swing.JLabel jLHo;
    private javax.swing.JLabel jLTen;
    private javax.swing.JComboBox<String> jTChucVu;
    private javax.swing.JTextField jTGioiTinh;
    private javax.swing.JTextField jTHo;
    private javax.swing.JTextField jTTen;
    // End of variables declaration//GEN-END:variables
}
