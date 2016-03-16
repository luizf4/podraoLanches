/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Lanche;

/**
 *
 * @author Luiz
 */
public class SecondLanches extends javax.swing.JFrame {

    NumberFormat nf = NumberFormat.getCurrencyInstance();
    BigDecimal zeraVar = new BigDecimal("0.00");
    BigDecimal vlrtotal = new BigDecimal("0.00");
    BigDecimal vlrtotalIngredientes = new BigDecimal("0.00");
    BigDecimal vlrBatata = new BigDecimal("0.00");
    BigDecimal vlrLanche = new BigDecimal("0.00");

    Lanche item = new Lanche();
    String nomeLanche = "";
    String batata = "";
    String ingredientes = "";

    public void iterar(Container container) {

        Component components[] = container.getComponents();

        vlrtotalIngredientes = zeraVar;
        ingredientes = "";

        for (Component component : components) {

            if (component instanceof JComboBox) {

                JComboBox combo = (JComboBox) component;

                nomeLanche = combo.getSelectedItem().toString();

            } else if (component instanceof JCheckBox) {

                JCheckBox box = (JCheckBox) component;

                if (box.isSelected()) {

                    vlrtotalIngredientes = vlrtotalIngredientes.add(new BigDecimal("0.50"));
                    ingredientes = ingredientes + box.getText() + " | ";

                }

            } else if (component instanceof JRadioButton) {

                JRadioButton radio = (JRadioButton) component;

                if (radio.isSelected()) {

                    batata = radio.getText().toString();

                }

                if (radio.getText().toString().equals("Pequeno") && radio.isSelected()) {

                    vlrBatata = vlrBatata.add(new BigDecimal(item.getBatataPequena().toString()));

                }

                if (radio.getText().toString().equals("Médio") && radio.isSelected()) {

                    vlrBatata = vlrBatata.add(new BigDecimal(item.getBatataMedia().toString()));

                }
                if (radio.getText().toString().equals("Grande") && radio.isSelected()) {

                    vlrBatata = vlrBatata.add(new BigDecimal(item.getBatataGrande().toString()));

                }
            }
        }
    }

    public void somaItens() {

        vlrtotal = zeraVar;
        vlrLanche = zeraVar;
        vlrBatata = zeraVar;

        switch (jcmbLanche.getSelectedIndex()) {

            case 0:

                iterar(jPnlPedido);
                iterar(jPnlIngredientes);

                vlrtotal = new BigDecimal(item.getHamburguer().toString())
                        .add(new BigDecimal(vlrtotalIngredientes.toString()));

                //jTxtValorTotal.setText(vlrtotal.toString());
                vlrLanche = vlrLanche.add(new BigDecimal(item.getHamburguer().toString()));
                vlrtotal = vlrtotal.add(vlrBatata);
                jTxtValorTotal.setText(printaPedido());

                break;
            case 1:

                iterar(jPnlPedido);
                iterar(jPnlIngredientes);

                vlrtotal = new BigDecimal(item.getCheeseBurguer().toString())
                        .add(new BigDecimal(vlrtotalIngredientes.toString()));

                vlrLanche = vlrLanche.add(new BigDecimal(item.getCheeseBurguer().toString()));
                vlrtotal = vlrtotal.add(vlrBatata);
                jTxtValorTotal.setText(printaPedido());

                break;
            case 2:

                iterar(jPnlPedido);
                iterar(jPnlIngredientes);

                vlrtotal = new BigDecimal(item.getxCalabresa().toString())
                        .add(new BigDecimal(vlrtotalIngredientes.toString()));

                vlrLanche = vlrLanche.add(new BigDecimal(item.getxCalabresa().toString()));
                vlrtotal = vlrtotal.add(vlrBatata);
                jTxtValorTotal.setText(printaPedido());

                break;
            case 3:

                iterar(jPnlPedido);
                iterar(jPnlIngredientes);

                vlrtotal = new BigDecimal(item.getPodraoEspecial().toString())
                        .add(new BigDecimal(vlrtotalIngredientes.toString()));

                vlrLanche = vlrLanche.add(new BigDecimal(item.getPodraoEspecial().toString()));
                vlrtotal = vlrtotal.add(vlrBatata);
                jTxtValorTotal.setText(printaPedido());

                break;
            default:

                JOptionPane.showMessageDialog(this, "Selecionar o LANCHE!!!", "Second Lanches",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }

    }

    public String printaPedido() {

        return "***PEDIDO***\n"
                + "--------------------------------\n"
                + nomeLanche.toString() + ": " + nf.format(vlrLanche) + "\n"
                + "Batata: " + batata + ": " + nf.format(vlrBatata) + "\n"
                + "Ingredientes:\n"
                + ingredientes + " : " + nf.format(vlrtotalIngredientes)
                + "\n--------------------------------\n"
                + "Total: " + nf.format(vlrtotal);
    }

    /**
     * Creates new form SecondLanches
     */
    public SecondLanches() {
        initComponents();
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeLanche.png")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupBatatafrita = new javax.swing.ButtonGroup();
        jPnlPedido = new javax.swing.JPanel();
        jLblLanche = new javax.swing.JLabel();
        jcmbLanche = new javax.swing.JComboBox<>();
        jRdbBatataPequena = new javax.swing.JRadioButton();
        jRrbBatataMédia = new javax.swing.JRadioButton();
        jRdbBatataGrande = new javax.swing.JRadioButton();
        jLblBatataFrita = new javax.swing.JLabel();
        jPnlValorTotal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtValorTotal = new javax.swing.JTextArea();
        jPnlIngredientes = new javax.swing.JPanel();
        jChkTomate = new javax.swing.JCheckBox();
        jChkKetchup = new javax.swing.JCheckBox();
        jChkCebola = new javax.swing.JCheckBox();
        jChkMostarda = new javax.swing.JCheckBox();
        jChkAlface = new javax.swing.JCheckBox();
        jChkPepino = new javax.swing.JCheckBox();
        jChkBarbq = new javax.swing.JCheckBox();
        jChkPicles = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Second Lanches");
        setMinimumSize(new java.awt.Dimension(450, 560));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPnlPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPnlPedido.setLayout(null);

        jLblLanche.setText("Lanche:");
        jPnlPedido.add(jLblLanche);
        jLblLanche.setBounds(20, 30, 80, 20);

        jcmbLanche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hamburguer", "CheeseBurguer", "X-Calabresa", "Podrão Especial" }));
        jcmbLanche.setSelectedIndex(-1);
        jcmbLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbLancheActionPerformed(evt);
            }
        });
        jPnlPedido.add(jcmbLanche);
        jcmbLanche.setBounds(110, 30, 234, 25);

        bGroupBatatafrita.add(jRdbBatataPequena);
        jRdbBatataPequena.setText("Pequeno");
        jRdbBatataPequena.setToolTipText("");
        jRdbBatataPequena.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRdbBatataPequenaItemStateChanged(evt);
            }
        });
        jPnlPedido.add(jRdbBatataPequena);
        jRdbBatataPequena.setBounds(110, 60, 75, 24);

        bGroupBatatafrita.add(jRrbBatataMédia);
        jRrbBatataMédia.setText("Médio");
        jRrbBatataMédia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRrbBatataMédiaItemStateChanged(evt);
            }
        });
        jPnlPedido.add(jRrbBatataMédia);
        jRrbBatataMédia.setBounds(200, 60, 59, 24);

        bGroupBatatafrita.add(jRdbBatataGrande);
        jRdbBatataGrande.setText("Grande");
        jRdbBatataGrande.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRdbBatataGrandeItemStateChanged(evt);
            }
        });
        jPnlPedido.add(jRdbBatataGrande);
        jRdbBatataGrande.setBounds(280, 60, 66, 24);

        jLblBatataFrita.setText("Batata Frita:");
        jPnlPedido.add(jLblBatataFrita);
        jLblBatataFrita.setBounds(20, 60, 80, 20);

        getContentPane().add(jPnlPedido);
        jPnlPedido.setBounds(20, 0, 390, 100);

        jPnlValorTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valor Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPnlValorTotal.setLayout(null);

        jTxtValorTotal.setEditable(false);
        jTxtValorTotal.setColumns(20);
        jTxtValorTotal.setRows(5);
        jScrollPane1.setViewportView(jTxtValorTotal);

        jPnlValorTotal.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 370, 210);

        getContentPane().add(jPnlValorTotal);
        jPnlValorTotal.setBounds(20, 240, 390, 260);

        jPnlIngredientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ingredientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPnlIngredientes.setLayout(null);

        jChkTomate.setText("Tomate");
        jChkTomate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkTomateItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkTomate);
        jChkTomate.setBounds(16, 23, 68, 24);

        jChkKetchup.setText("Ketchup");
        jChkKetchup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkKetchupItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkKetchup);
        jChkKetchup.setBounds(16, 60, 72, 24);

        jChkCebola.setText("Cebola");
        jChkCebola.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkCebolaItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkCebola);
        jChkCebola.setBounds(111, 23, 64, 24);

        jChkMostarda.setText("Mostarda");
        jChkMostarda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkMostardaItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkMostarda);
        jChkMostarda.setBounds(110, 60, 79, 24);

        jChkAlface.setText("Alface");
        jChkAlface.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkAlfaceItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkAlface);
        jChkAlface.setBounds(202, 23, 61, 24);

        jChkPepino.setText("Pepino");
        jChkPepino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkPepinoItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkPepino);
        jChkPepino.setBounds(202, 60, 64, 24);

        jChkBarbq.setText("Bar-B-Q");
        jChkBarbq.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkBarbqItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkBarbq);
        jChkBarbq.setBounds(290, 60, 70, 24);

        jChkPicles.setText("Pícles");
        jChkPicles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jChkPiclesItemStateChanged(evt);
            }
        });
        jPnlIngredientes.add(jChkPicles);
        jChkPicles.setBounds(290, 20, 60, 24);

        getContentPane().add(jPnlIngredientes);
        jPnlIngredientes.setBounds(20, 120, 390, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jChkTomateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkTomateItemStateChanged

        somaItens();
    }//GEN-LAST:event_jChkTomateItemStateChanged

    private void jcmbLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbLancheActionPerformed

        somaItens();

    }//GEN-LAST:event_jcmbLancheActionPerformed

    private void jChkCebolaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkCebolaItemStateChanged

        somaItens();

    }//GEN-LAST:event_jChkCebolaItemStateChanged

    private void jChkAlfaceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkAlfaceItemStateChanged

        somaItens();

    }//GEN-LAST:event_jChkAlfaceItemStateChanged

    private void jChkPiclesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkPiclesItemStateChanged

        somaItens();

    }//GEN-LAST:event_jChkPiclesItemStateChanged

    private void jChkKetchupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkKetchupItemStateChanged

        somaItens();

    }//GEN-LAST:event_jChkKetchupItemStateChanged

    private void jChkMostardaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkMostardaItemStateChanged

        somaItens();

    }//GEN-LAST:event_jChkMostardaItemStateChanged

    private void jChkPepinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkPepinoItemStateChanged

        somaItens();

    }//GEN-LAST:event_jChkPepinoItemStateChanged

    private void jChkBarbqItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jChkBarbqItemStateChanged

        somaItens();

    }//GEN-LAST:event_jChkBarbqItemStateChanged

    private void jRdbBatataPequenaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRdbBatataPequenaItemStateChanged

        somaItens();

    }//GEN-LAST:event_jRdbBatataPequenaItemStateChanged

    private void jRrbBatataMédiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRrbBatataMédiaItemStateChanged

        somaItens();

    }//GEN-LAST:event_jRrbBatataMédiaItemStateChanged

    private void jRdbBatataGrandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRdbBatataGrandeItemStateChanged

        somaItens();

    }//GEN-LAST:event_jRdbBatataGrandeItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        if (JOptionPane.showConfirmDialog(this, "Deseja Sair?", "Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {

            dispose();

        }

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(SecondLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondLanches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondLanches().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroupBatatafrita;
    private javax.swing.JCheckBox jChkAlface;
    private javax.swing.JCheckBox jChkBarbq;
    private javax.swing.JCheckBox jChkCebola;
    private javax.swing.JCheckBox jChkKetchup;
    private javax.swing.JCheckBox jChkMostarda;
    private javax.swing.JCheckBox jChkPepino;
    private javax.swing.JCheckBox jChkPicles;
    private javax.swing.JCheckBox jChkTomate;
    private javax.swing.JLabel jLblBatataFrita;
    private javax.swing.JLabel jLblLanche;
    private javax.swing.JPanel jPnlIngredientes;
    private javax.swing.JPanel jPnlPedido;
    private javax.swing.JPanel jPnlValorTotal;
    private javax.swing.JRadioButton jRdbBatataGrande;
    private javax.swing.JRadioButton jRdbBatataPequena;
    private javax.swing.JRadioButton jRrbBatataMédia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtValorTotal;
    private javax.swing.JComboBox<String> jcmbLanche;
    // End of variables declaration//GEN-END:variables
}
