package jtabledb;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Updater extends javax.swing.JFrame {
    
    // Variables declaration - do not modify
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLPosicion;
    private javax.swing.JLabel JLEquipo;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField JFNombre;
    private javax.swing.JTextField JFPosicion;
    private javax.swing.JButton BtnVer;
    private javax.swing.JTextField JFEquipo;
    private javax.swing.JButton BtnActualizar;
    // End of variables declaration
    
    public Updater() {
        initComponents();
    }

    private void retrieve() {
        DefaultTableModel dm = new DBUpdater().getData();
        jTable1.setModel(dm);
    }

    //@SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JLNombre = new javax.swing.JLabel();
        JLPosicion = new javax.swing.JLabel();
        JLEquipo = new javax.swing.JLabel();
        JLTitulo = new javax.swing.JLabel();
        JFNombre=  new javax.swing.JTextField();
        JFEquipo = new javax.swing.JTextField();
        JFPosicion = new javax.swing.JTextField();
        BtnVer = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 200, 100));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JLNombre.setText("Nombre");
        JLPosicion.setText("Posición");
        JLEquipo.setText("Equipo");

        //Texto de botones
        BtnVer.setText("Ver");
        BtnAgregar.setText("Agregar");
        BtnActualizar.setText("Actualizar");
        BtnEliminar.setText("Eliminar");
        BtnLimpiar.setText("Limpiar");

        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveBtnActionPerformed(evt);
            }
        });

        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(JLNombre)
                                                                        .addComponent(JLPosicion))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(JFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(JFPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(21, 21, 21))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(JLEquipo)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(JFEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 9, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(BtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
        );
        
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(JLNombre)
                                                                        .addComponent(JFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(JLPosicion)
                                                                        .addComponent(JFPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(52, 52, 52))
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(JLEquipo)
                                                                .addComponent(JFEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(66, 66, 66)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BtnAgregar)
                                                        .addComponent(BtnVer))
                                                .addGap(51, 51, 51)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BtnActualizar)
                                                        .addComponent(BtnEliminar)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(BtnLimpiar)
                                .addGap(21, 21, 21))
        );

        JLTitulo.setText("Computadoras conectadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(JLTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    //RETRIEVE BUTTON CLICKED
    private void retrieveBtnActionPerformed(java.awt.event.ActionEvent evt) {
        retrieve();

    }

    //ADD OR SAVE
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if (new DBUpdater().add(JFNombre.getText(), JFPosicion.getText(), JFEquipo.getText())) {
            JOptionPane.showMessageDialog(null, "Guardado");

            //CLEAR TXT
            JFNombre.setText("");
            JFPosicion.setText("");
            JFEquipo.setText("");

            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "No se guardo");
        }
    }

    //SET SELECTED VALUE TO TEXTFIELDS
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String pos = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String team = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        JFNombre.setText(name);
        JFPosicion.setText(pos);
        JFEquipo.setText(team);

    }

    //UPDATE
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int index = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(index, 0).toString();

        if (new DBUpdater().update(id, JFNombre.getText(), JFPosicion.getText(), JFEquipo.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");

            //CLEAR TXT
            JFNombre.setText("");
            JFPosicion.setText("");
            JFEquipo.setText("");

            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "Not Updated");
        }
    }
    
    //DELETE
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String[] options = {"Si", "No"};
        
        int index = jTable1.getSelectedRow();
        System.out.println("ID:" + index);
        if (index != -1) {
            int answ = JOptionPane.showOptionDialog(null, "Estas seguro ??", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (answ == 0) {
                String id = jTable1.getValueAt(index, 0).toString();
                if (new DBUpdater().delete(id)) {
                    JOptionPane.showMessageDialog(null, "Eliminado");

                    //CLEAR TXT
                    JFNombre.setText("");
                    JFPosicion.setText("");
                    JFEquipo.setText("");

                    retrieve();
                } else {
                    JOptionPane.showMessageDialog(null, "No se elimino");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primero Selecciona una fila..");
        }

    }

    //CLEAR BUTTON CLICKED
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {
        jTable1.setModel(new DefaultTableModel());
    }

    

    
}
