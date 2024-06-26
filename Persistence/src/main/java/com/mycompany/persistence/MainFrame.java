package com.mycompany.persistence;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;


/**
 *
 * @author migue
 */
public class MainFrame extends javax.swing.JFrame {

    TableRowSorter trs;

    /**
     * Creates new form MainFrame
     */
    Listing modelList = new Listing();

    public MainFrame() {
        initComponents();

        modelList.readFile();
        DefaultTableModel model = modelList.getTableModel();
        model.addColumn("Item Name");
        model.addColumn("Price");
        model.addColumn("Amout");
        modelList.updateModelList(modelList.getTableModel(), modelList.getProducts());

        mainTable.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        searchTf = new javax.swing.JTextField();
        removeBtn = new javax.swing.JButton();
        ModifyBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        priceTf = new javax.swing.JTextField();
        amountTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        newNameTf = new javax.swing.JTextField();
        newPriceTf = new javax.swing.JTextField();
        newAmountTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        copytBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(mainTable);

        searchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTfKeyTyped(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        ModifyBtn.setText("Modify");
        ModifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("New Product:");

        jLabel3.setText("Name: ");

        jLabel4.setText("Price: ");

        jLabel5.setText("Amount: ");

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        priceTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTfActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Intem Name");

        jLabel6.setText("Price");

        jLabel7.setText("Amount");

        copytBtn.setText("Copy Values");
        copytBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copytBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Filtrar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(priceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(amountTf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(removeBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(newNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(19, 19, 19)
                                                    .addComponent(newPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel6)
                                                    .addGap(28, 28, 28))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ModifyBtn)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(copytBtn))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addBtn)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newAmountTf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(17, 17, 17)))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(priceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(amountTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(copytBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newAmountTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ModifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Add Buttom
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String itemName = nameTf.getText();
        String price = priceTf.getText();
        String amount = amountTf.getText();

        if (!Utilities.typeValidation(price)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number in the price field", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else if (!Utilities.typeValidation(amount)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number in the amount field", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else if (Utilities.containtInInventory(itemName, modelList.getProducts())) {

            int numberPrice = Integer.parseInt(price);
            int numberAmount = Integer.parseInt(amount);

            modelList.getProducts().add(new Product(itemName, numberPrice, numberAmount));
            modelList.updateModelList(modelList.getTableModel(), modelList.getProducts());
            mainTable.setModel(modelList.getTableModel());
            nameTf.setText("");
            priceTf.setText("");
            amountTf.setText("");
            modelList.saveProductsInv();
        } else {
            JOptionPane.showMessageDialog(null, "This product is already in inventory  ", "Información", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int rowSelected = mainTable.getSelectedRow();
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "Please select the product you want to delete", "Información", JOptionPane.INFORMATION_MESSAGE);

        } else {
            String nameSelected = Utilities.nameSelected(rowSelected, mainTable);
            Product auxProduct = Utilities.productWithName(nameSelected, modelList.getProducts());
            modelList.getProducts().remove(auxProduct);
            modelList.updateModelList(modelList.getTableModel(), modelList.getProducts());
            mainTable.setModel(modelList.getTableModel());
            modelList.saveProductsInv();
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void copytBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copytBtnActionPerformed
        int rowSelected = mainTable.getSelectedRow();
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "There are no products selected", "Información", JOptionPane.INFORMATION_MESSAGE);

        } else {
            String nameSelected = Utilities.nameSelected(rowSelected, mainTable);
            Product auxProduct = Utilities.productWithName(nameSelected, modelList.getProducts());

            newNameTf.setText(nameSelected);
            newPriceTf.setText(auxProduct.getPrice() + "");
            newAmountTf.setText(auxProduct.getAmount() + "");
            modelList.updateModelList(modelList.getTableModel(), modelList.getProducts());
            mainTable.setModel(modelList.getTableModel());
        }


    }//GEN-LAST:event_copytBtnActionPerformed

    private void ModifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyBtnActionPerformed

        int rowSelected = mainTable.getSelectedRow();
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "There are no products selected", "Información", JOptionPane.INFORMATION_MESSAGE);

        } else {
            String nameSelected = Utilities.nameSelected(rowSelected, mainTable);
            Product auxProduct = Utilities.productWithName(nameSelected, modelList.getProducts());
            String newName = newNameTf.getText();
            String newPrice = newPriceTf.getText();
            String newAmount = newAmountTf.getText();

            if (!Utilities.typeValidation(newPrice)) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number in the price field", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else if (!Utilities.typeValidation(newAmount)) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number in the amount field", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else if (Utilities.containtInInventory(newName, modelList.getProducts()) || (newName.equals(auxProduct.getItemName()))) {
                auxProduct.setName(newName);
                auxProduct.setPrice(Integer.parseInt(newPrice));
                auxProduct.setAmount(Integer.parseInt(newAmount));
                modelList.updateModelList(modelList.getTableModel(), modelList.getProducts());
                mainTable.setModel(modelList.getTableModel());
                newNameTf.setText("");
                newPriceTf.setText("");
                newAmountTf.setText("");
            } else if (!Utilities.containtInInventory(newName, modelList.getProducts())) {
                JOptionPane.showMessageDialog(null, "This product is already in inventory  ", "Información", JOptionPane.INFORMATION_MESSAGE);

            }

        }

        modelList.saveProductsInv();
    }//GEN-LAST:event_ModifyBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void priceTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTfActionPerformed

    private void searchTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTfKeyTyped
        // TODO add your handling code here:

        searchTf.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                trs.setRowFilter(RowFilter.regexFilter("(?i)" + searchTf.getText(), 0));

            }

        });
        mainTable.getModel();

        trs = new TableRowSorter(mainTable.getModel());
        mainTable.setRowSorter(trs);
    }//GEN-LAST:event_searchTfKeyTyped

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModifyBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amountTf;
    private javax.swing.JButton copytBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField newAmountTf;
    private javax.swing.JTextField newNameTf;
    private javax.swing.JTextField newPriceTf;
    private javax.swing.JTextField priceTf;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField searchTf;
    // End of variables declaration//GEN-END:variables
}
