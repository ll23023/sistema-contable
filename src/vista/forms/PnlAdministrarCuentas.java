package vista.forms;

import consultas_sql.cuenta;
import consultas_sql.cuenta.CuentaData;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class PnlAdministrarCuentas extends javax.swing.JPanel {

    public PnlAdministrarCuentas() {
        initComponents();
        cargarCuentasEnArbol();
        //faltaria refrescar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        sctnCatalogo = new javax.swing.JPanel();
        lblSubtitulo = new javax.swing.JLabel();
        btnNuevaCuenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCatalogo = new javax.swing.JTree();
        pnlbackground = new javax.swing.JPanel();
        lblPartida = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        chkFechaActual = new javax.swing.JCheckBox();
        lblNota = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        lblEnviarTotal = new javax.swing.JLabel();
        rbtDebe = new javax.swing.JRadioButton();
        rbtHaber = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCuentas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        content = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        sctnCatalogo1 = new javax.swing.JPanel();
        lblSubtitulo1 = new javax.swing.JLabel();
        btnNuevaCuenta1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaCatalogo1 = new javax.swing.JTree();

        pnlContenido.setBackground(new java.awt.Color(241, 242, 238));

        sctnCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        sctnCatalogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 183, 182), 1, true));

        lblSubtitulo.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtitulo.setText("Todas las cuentas");

        btnNuevaCuenta.setBackground(new java.awt.Color(228, 130, 0));
        btnNuevaCuenta.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnNuevaCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta.setText("+");
        btnNuevaCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuentaActionPerformed(evt);
            }
        });

        listaCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        listaCatalogo.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        listaCatalogo.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("1101 Efectivo y quivalentes");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("110101 Efectivo en Caja General");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("110102 Efectivo en Bancos");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("1102 Deudores Comerciales");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("110201 Clientes locales");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        listaCatalogo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        listaCatalogo.setToolTipText("");
        listaCatalogo.setLargeModel(true);
        listaCatalogo.setRootVisible(false);
        listaCatalogo.setShowsRootHandles(true);
        jScrollPane1.setViewportView(listaCatalogo);

        javax.swing.GroupLayout sctnCatalogoLayout = new javax.swing.GroupLayout(sctnCatalogo);
        sctnCatalogo.setLayout(sctnCatalogoLayout);
        sctnCatalogoLayout.setHorizontalGroup(
            sctnCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sctnCatalogoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(btnNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jScrollPane1)
        );
        sctnCatalogoLayout.setVerticalGroup(
            sctnCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sctnCatalogoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(sctnCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSubtitulo)
                    .addComponent(btnNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
        );

        pnlbackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlbackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 183, 182), 1, true));
        pnlbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPartida.setFont(new java.awt.Font("Corbel", 1, 26)); // NOI18N
        lblPartida.setText("Partida 1");
        pnlbackground.add(lblPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 860, -1));

        lblFecha.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        lblFecha.setText("Fecha");
        pnlbackground.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, -1));

        txtDia.setColumns(4);
        txtDia.setForeground(new java.awt.Color(204, 204, 204));
        txtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDia.setText("20");
        txtDia.setCaretColor(new java.awt.Color(153, 153, 153));
        pnlbackground.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        txtMes.setColumns(4);
        txtMes.setForeground(new java.awt.Color(204, 204, 204));
        txtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMes.setText("05");
        pnlbackground.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 30));

        txtAnio.setColumns(6);
        txtAnio.setForeground(new java.awt.Color(204, 204, 204));
        txtAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnio.setText("2025");
        pnlbackground.add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 30));

        chkFechaActual.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        chkFechaActual.setSelected(true);
        chkFechaActual.setText("Fecha Actual");
        chkFechaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFechaActualActionPerformed(evt);
            }
        });
        pnlbackground.add(chkFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, -1));

        lblNota.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        lblNota.setText("Nota");
        pnlbackground.add(lblNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 40, -1));

        txtNota.setColumns(20);
        txtNota.setForeground(new java.awt.Color(204, 204, 204));
        txtNota.setLineWrap(true);
        txtNota.setRows(5);
        txtNota.setText("Describe el movimiento");
        txtNota.setWrapStyleWord(true);
        txtNota.setMinimumSize(new java.awt.Dimension(240, 20));
        jScrollPane2.setViewportView(txtNota);

        pnlbackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, 110));

        lblEnviarTotal.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        lblEnviarTotal.setText("Enviar Total");
        pnlbackground.add(lblEnviarTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        rbtDebe.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        rbtDebe.setText("Debe");
        pnlbackground.add(rbtDebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        rbtHaber.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        rbtHaber.setText("Haber");
        pnlbackground.add(rbtHaber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        tblCuentas.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        tblCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cuenta", "Detalle", "Debe", "Haber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCuentas.setGridColor(new java.awt.Color(204, 204, 204));
        tblCuentas.setRowHeight(30);
        jScrollPane3.setViewportView(tblCuentas);

        pnlbackground.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 570, 330));

        btnGuardar.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        btnGuardar.setText(" Guardar");
        pnlbackground.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Corbel", 0, 13)); // NOI18N
        btnCancelar.setText(" Cancelar");
        pnlbackground.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, -1));
        pnlbackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 890, 10));

        content.setBackground(new java.awt.Color(241, 242, 238));

        sctnCatalogo1.setBackground(new java.awt.Color(255, 255, 255));
        sctnCatalogo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 183, 182), 1, true));

        lblSubtitulo1.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        lblSubtitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtitulo1.setText("Todas las cuentas");

        btnNuevaCuenta1.setBackground(new java.awt.Color(228, 130, 0));
        btnNuevaCuenta1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnNuevaCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta1.setText("+");
        btnNuevaCuenta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuenta1ActionPerformed(evt);
            }
        });

        listaCatalogo1.setBackground(new java.awt.Color(255, 255, 255));
        listaCatalogo1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        listaCatalogo1.setForeground(new java.awt.Color(0, 0, 0));
        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("1101 Efectivo y quivalentes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("110101 Efectivo en Caja General");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("110102 Efectivo en Bancos");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("1102 Deudores Comerciales");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("110201 Clientes locales");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        listaCatalogo1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        listaCatalogo1.setToolTipText("");
        listaCatalogo1.setLargeModel(true);
        listaCatalogo1.setRootVisible(false);
        listaCatalogo1.setShowsRootHandles(true);
        jScrollPane4.setViewportView(listaCatalogo1);

        javax.swing.GroupLayout sctnCatalogo1Layout = new javax.swing.GroupLayout(sctnCatalogo1);
        sctnCatalogo1.setLayout(sctnCatalogo1Layout);
        sctnCatalogo1Layout.setHorizontalGroup(
            sctnCatalogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sctnCatalogo1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSubtitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(btnNuevaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jScrollPane4)
        );
        sctnCatalogo1Layout.setVerticalGroup(
            sctnCatalogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sctnCatalogo1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(sctnCatalogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSubtitulo1)
                    .addComponent(btnNuevaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addGap(16, 969, Short.MAX_VALUE)
                .addComponent(sctnCatalogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sctnCatalogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnlbackground, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(sctnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sctnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
//TODO: creo una clase para heredar estos metodos y asi no sobrecargar aqui?
//TODO: no supe como quitarle las cuentas ejemplo del jtree
    
    private void cargarCuentasEnArbol() {
        cuenta cuentaDAO = new cuenta();
        List<CuentaData> cuentas = cuentaDAO.obtenerTodas();

        // Crear el nodo raíz (invisible)
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Cuentas");

        // Agrupar cuentas por los primeros dígitos (jerarquía)
        Map<String, DefaultMutableTreeNode> grupos = new TreeMap<>();

        for (CuentaData c : cuentas) {
            String codigoStr = String.valueOf(c.getCodigoCuenta());
            String grupoKey;
            DefaultMutableTreeNode nodoGrupo;

            // Determinar nivel jerárquico según la longitud del código
            if (codigoStr.length() >= 4) {
                // Grupo principal (osea la cuenta mayor la de 4 dígitos)
                grupoKey = codigoStr.substring(0, 4);
                nodoGrupo = grupos.get(grupoKey);

                if (nodoGrupo == null) {
                    // Buscar el nombre del grupo de la primera cuenta que coincida
                    String nombreGrupo = grupoKey + " " + obtenerNombreGrupo(grupoKey, cuentas);
                    nodoGrupo = new DefaultMutableTreeNode(nombreGrupo);
                    grupos.put(grupoKey, nodoGrupo);
                    root.add(nodoGrupo);
                }

                // Crear nodo hijo (cuenta específica)
                DefaultMutableTreeNode nodoCuenta = new DefaultMutableTreeNode(
                        c.getCodigoCuenta() + " " + c.getNombre()
                );
                nodoGrupo.add(nodoCuenta);
            }
        }

        // Aplicar el modelo al JTree
        listaCatalogo.setModel(new DefaultTreeModel(root));
        listaCatalogo.setRootVisible(false); // Ocultar nodo raíz
        listaCatalogo.setShowsRootHandles(true); // Mostrar manijas para expandir/colapsar

        // Expandir todos los nodos
        expandirTodosNodos(listaCatalogo, 0, listaCatalogo.getRowCount());
    }

    private String obtenerNombreGrupo(String codigoGrupo, List<CuentaData> cuentas) {
        // Busca un nombre de ejemplo para el grupo
        for (CuentaData c : cuentas) {
            if (String.valueOf(c.getCodigoCuenta()).startsWith(codigoGrupo)) {
                String nombreCompleto = c.getNombre();
                // Extrae solo la parte principal del nombre
                if (nombreCompleto.length() > 20) {
                    return nombreCompleto.substring(0, 20) + "...";
                }
                return nombreCompleto;
            }
        }
        return "Grupo " + codigoGrupo;
    }

    private void expandirTodosNodos(javax.swing.JTree tree, int startingIndex, int rowCount) {
        for (int i = startingIndex; i < rowCount; ++i) {
            tree.expandRow(i);
        }
        if (tree.getRowCount() != rowCount) {
            expandirTodosNodos(tree, rowCount, tree.getRowCount());
        }
    }
    private void btnNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuentaActionPerformed

    }//GEN-LAST:event_btnNuevaCuentaActionPerformed

    private void chkFechaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFechaActualActionPerformed
        boolean usar = chkFechaActual.isSelected();
        txtDia.setEnabled(usar);
        txtMes.setEnabled(usar);
        txtAnio.setEnabled(usar);

        if (!usar) {
            java.time.LocalDate hoy = java.time.LocalDate.now();
            txtDia.setText(String.valueOf(hoy.getDayOfMonth()));
            txtMes.setText(String.valueOf(hoy.getMonthValue()));
            txtAnio.setText(String.valueOf(hoy.getYear()));
        }
    }//GEN-LAST:event_chkFechaActualActionPerformed

    private void btnNuevaCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaCuenta1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevaCuenta;
    private javax.swing.JButton btnNuevaCuenta1;
    private javax.swing.JCheckBox chkFechaActual;
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEnviarTotal;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblPartida;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblSubtitulo1;
    private javax.swing.JTree listaCatalogo;
    private javax.swing.JTree listaCatalogo1;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlbackground;
    private javax.swing.JRadioButton rbtDebe;
    private javax.swing.JRadioButton rbtHaber;
    private javax.swing.JPanel sctnCatalogo;
    private javax.swing.JPanel sctnCatalogo1;
    private javax.swing.JTable tblCuentas;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextArea txtNota;
    // End of variables declaration//GEN-END:variables
}
