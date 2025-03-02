package inventario;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal(String usuario) {

        initComponents();
          this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons/almacen.png")));
        lblUsuario.setText(usuario);
    }

    public MenuPrincipal() {
       
        initComponents();
       
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mUsuario = new javax.swing.JMenu();
        subNuevo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        subProducto = new javax.swing.JMenuItem();
        subVer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InventoryStore v1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\B14573R\\Desktop\\inventiaro.png")); // NOI18N

        jLabel2.setText("Logeado Como:");

        mUsuario.setText("Usuarios");

        subNuevo.setText("Nuevo");
        subNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subNuevoActionPerformed(evt);
            }
        });
        mUsuario.add(subNuevo);

        jMenuBar1.add(mUsuario);

        jMenu1.setText("Productos");

        subProducto.setText("Nuevo");
        subProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subProductoActionPerformed(evt);
            }
        });
        jMenu1.add(subProducto);

        subVer.setText("Ver");
        subVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subVerActionPerformed(evt);
            }
        });
        jMenu1.add(subVer);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subNuevoActionPerformed
        RegistroUsuario nuevo = new RegistroUsuario();
        nuevo.setVisible(true);
    }//GEN-LAST:event_subNuevoActionPerformed

    private void subProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subProductoActionPerformed
        RegistrarProducto nuevoProducto = new RegistrarProducto();
        nuevoProducto.setVisible(true);
    }//GEN-LAST:event_subProductoActionPerformed

    private void subVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subVerActionPerformed
        ListadoProductos listarProducto = new ListadoProductos();
        listarProducto.setVisible(true);
    }//GEN-LAST:event_subVerActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu mUsuario;
    private javax.swing.JMenuItem subNuevo;
    private javax.swing.JMenuItem subProducto;
    private javax.swing.JMenuItem subVer;
    // End of variables declaration//GEN-END:variables
}
