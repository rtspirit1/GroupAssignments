/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PoliceWorkArea;

/**
 *
 * @author kichl
 */
public class PoliceAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PoliceAdmin
     */
    public PoliceAdminWorkArea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestTable = new javax.swing.JTable();
        acceptDispatchBtn = new javax.swing.JButton();
        processDispatchBtn = new javax.swing.JButton();
        completeDispatchBtn = new javax.swing.JButton();
        rejectdispatchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("POLICE ADMIN WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        workRequestTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        workRequestTable.setForeground(new java.awt.Color(25, 56, 82));
        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Disaster Id", "Disaster Type ", "Location", "Casuality", "Status", "Reported By", "Reporting Organization", "Reporting Network", "Date of Incident", "Additional Details", "Dispatch Denial Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane2.setViewportView(workRequestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1250, 110));

        acceptDispatchBtn.setBackground(new java.awt.Color(255, 255, 255));
        acceptDispatchBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        acceptDispatchBtn.setForeground(new java.awt.Color(25, 56, 82));
        acceptDispatchBtn.setText("Accept Dispatch");
        acceptDispatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptDispatchBtnActionPerformed(evt);
            }
        });
        add(acceptDispatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        processDispatchBtn.setBackground(new java.awt.Color(255, 255, 255));
        processDispatchBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        processDispatchBtn.setForeground(new java.awt.Color(25, 56, 82));
        processDispatchBtn.setText("Process Dispatch");
        processDispatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processDispatchBtnActionPerformed(evt);
            }
        });
        add(processDispatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        completeDispatchBtn.setBackground(new java.awt.Color(255, 255, 255));
        completeDispatchBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        completeDispatchBtn.setForeground(new java.awt.Color(25, 56, 82));
        completeDispatchBtn.setText("Complete Dispatch");
        completeDispatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeDispatchBtnActionPerformed(evt);
            }
        });
        add(completeDispatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        rejectdispatchBtn.setBackground(new java.awt.Color(255, 255, 255));
        rejectdispatchBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        rejectdispatchBtn.setForeground(new java.awt.Color(25, 56, 82));
        rejectdispatchBtn.setText("Reject Dispatch");
        rejectdispatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectdispatchBtnActionPerformed(evt);
            }
        });
        add(rejectdispatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/policeadminworkareapanel.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 620, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void acceptDispatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptDispatchBtnActionPerformed

        //emerReq.setStatus("Accepted");
        
    }//GEN-LAST:event_acceptDispatchBtnActionPerformed

    private void processDispatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processDispatchBtnActionPerformed
        // TODO add your handling code here:

        
        
    }//GEN-LAST:event_processDispatchBtnActionPerformed

    private void completeDispatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeDispatchBtnActionPerformed

    }//GEN-LAST:event_completeDispatchBtnActionPerformed

    private void rejectdispatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectdispatchBtnActionPerformed

        
        
    }//GEN-LAST:event_rejectdispatchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptDispatchBtn;
    private javax.swing.JButton completeDispatchBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processDispatchBtn;
    private javax.swing.JButton rejectdispatchBtn;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables
}
