/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Volunteer;

/**
 *
 * @author kichl
 */
public class ManageVolunteerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ManageVolunteerWorkArea
     */
    public ManageVolunteerWorkArea() {
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

        VolunteerMangementHeaderjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 706));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VolunteerMangementHeaderjLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        VolunteerMangementHeaderjLabel.setForeground(new java.awt.Color(25, 56, 82));
        VolunteerMangementHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VolunteerMangementHeaderjLabel.setText(" Volunteer Management Work Area");
        add(VolunteerMangementHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 431, -1));

        workRequestJTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        workRequestJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(51, 51, 51));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Email ID", "City", "Status", "Disaster Type", "Network", "Enterprise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setToolTipText(" Manage Volunteer Table");
        workRequestJTable.setCellSelectionEnabled(true);
        workRequestJTable.setDragEnabled(true);
        workRequestJTable.setGridColor(new java.awt.Color(204, 204, 204));
        workRequestJTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 810, 160));

        jButton1.setText("Activate Volunteer");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jButton2.setText("Assign Volunteer");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 140, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Volunteer/volunteer.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 840, 510));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VolunteerMangementHeaderjLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
