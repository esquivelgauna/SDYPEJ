package jtabledb;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

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
    private javax.swing.JTable JTConexiones;
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
        JTConexiones.setModel(dm);
    }

    //@SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTConexiones = new javax.swing.JTable();
        JLNombre = new javax.swing.JLabel();
        JLPosicion = new javax.swing.JLabel();
        JLEquipo = new javax.swing.JLabel();
        JLTitulo = new javax.swing.JLabel();
        JFNombre = new javax.swing.JTextField();
        JFEquipo = new javax.swing.JTextField();
        JFPosicion = new javax.swing.JTextField();
        BtnVer = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 200, 100));

        JTConexiones.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
        JTConexiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTConexiones);

        JLTitulo.setText("Computadoras conectadas");
        JLNombre.setText("Nombre");
        JLPosicion.setText("Posición");
        JLEquipo.setText("Equipo");
        //Centramos
        JLTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        JLNombre.setHorizontalAlignment(SwingConstants.CENTER);
        JLPosicion.setHorizontalAlignment(SwingConstants.CENTER);
        JLEquipo.setHorizontalAlignment(SwingConstants.CENTER);
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

        jPanel2Layout.setAutoCreateGaps(true);
        jPanel2Layout.setAutoCreateContainerGaps(true);

        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(BtnLimpiar, 100, 200, 400)
                                )
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(JLNombre, 100, 200, Short.MAX_VALUE)
                                                                        .addComponent(JLPosicion, 100, 200, Short.MAX_VALUE)
                                                                        .addComponent(JLEquipo, 100, 200, Short.MAX_VALUE)
                                                                )
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(JFNombre, 100, 200, Short.MAX_VALUE)
                                                                        .addComponent(JFPosicion, 100, 200, Short.MAX_VALUE)
                                                                        .addComponent(JFEquipo, 100, 200, Short.MAX_VALUE)
                                                                )
                                                        )
                                                )
                                        )
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(BtnActualizar, 100, 200, Short.MAX_VALUE)
                                                                .addComponent(BtnEliminar, 100, 200, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(BtnAgregar, 100, 200, Short.MAX_VALUE)
                                                                .addComponent(BtnVer, 100, 200, Short.MAX_VALUE))
                                                )
                                        )
                                )
                        )
        );

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(JLNombre)
                                                                        .addComponent(JFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(JLPosicion)
                                                                        .addComponent(JFPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(JLEquipo)
                                                                        .addComponent(JFEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                )
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BtnAgregar)
                                                        .addComponent(BtnVer))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BtnActualizar)
                                                        .addComponent(BtnEliminar)
                                                )
                                        )
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BtnLimpiar)
                                        )
                                )
                        )
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLTitulo, 0, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, 800, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLTitulo)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
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
        String name = JTConexiones.getValueAt(JTConexiones.getSelectedRow(), 1).toString();
        String pos = JTConexiones.getValueAt(JTConexiones.getSelectedRow(), 2).toString();
        String team = JTConexiones.getValueAt(JTConexiones.getSelectedRow(), 3).toString();
        JFNombre.setText(name);
        JFPosicion.setText(pos);
        JFEquipo.setText(team);

    }

    //UPDATE
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int index = JTConexiones.getSelectedRow();
        String id = JTConexiones.getValueAt(index, 0).toString();

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

        int index = JTConexiones.getSelectedRow();
        System.out.println("ID:" + index);
        if (index != -1) {
            int answ = JOptionPane.showOptionDialog(null, "Estas seguro ??", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (answ == 0) {
                String id = JTConexiones.getValueAt(index, 0).toString();
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
        JTConexiones.setModel(new DefaultTableModel());
    }

}
