/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.de.newton;

/**
 *
 * @author Jônathas Leandro
 */
public class Entrada extends javax.swing.JFrame {
    String expressaoInit = "---";
    
    /**
     * Creates new form Entrada
     */
    public Entrada() {
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

        jLTitulo = new javax.swing.JLabel();
        jLEntrada = new javax.swing.JLabel();
        jLExpressao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jBx = new javax.swing.JButton();
        jBPotencia = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jBAdicao = new javax.swing.JButton();
        jBSubtracao = new javax.swing.JButton();
        jBAbreParenteses = new javax.swing.JButton();
        jBMultiplicacao = new javax.swing.JButton();
        jBDivisao = new javax.swing.JButton();
        jBOk = new javax.swing.JButton();
        jBFechaParenteses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodo de Newton");
        setResizable(false);

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Metodo de Newton");

        jLEntrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEntrada.setText("Entrada:");

        jLExpressao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLExpressao.setText(expressaoInit);

        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB0.setText("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jBx.setText("x");
        jBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBxActionPerformed(evt);
            }
        });

        jBPotencia.setText("x^(");
        jBPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPotenciaActionPerformed(evt);
            }
        });

        jBClear.setText("C");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });

        jBAdicao.setText("+");
        jBAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicaoActionPerformed(evt);
            }
        });

        jBSubtracao.setText("-");
        jBSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubtracaoActionPerformed(evt);
            }
        });

        jBAbreParenteses.setText("(");
        jBAbreParenteses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbreParentesesActionPerformed(evt);
            }
        });

        jBMultiplicacao.setText("*");
        jBMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicacaoActionPerformed(evt);
            }
        });

        jBDivisao.setText("/");
        jBDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDivisaoActionPerformed(evt);
            }
        });

        jBOk.setText("Ok");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        jBFechaParenteses.setText(")");
        jBFechaParenteses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechaParentesesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLExpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jB4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jB1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB0)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jB8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jB9)))))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAbreParenteses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBFechaParenteses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(jLEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLExpressao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1)
                    .addComponent(jB2)
                    .addComponent(jB3)
                    .addComponent(jBx)
                    .addComponent(jBPotencia)
                    .addComponent(jBClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB4)
                    .addComponent(jB5)
                    .addComponent(jB6)
                    .addComponent(jBAdicao)
                    .addComponent(jBSubtracao)
                    .addComponent(jBAbreParenteses))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB7)
                    .addComponent(jB8)
                    .addComponent(jB9)
                    .addComponent(jBMultiplicacao)
                    .addComponent(jBDivisao)
                    .addComponent(jBFechaParenteses))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB0)
                    .addComponent(jBOk))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("3");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"3");
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("6");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"6");
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("9");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"9");
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("4");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"4");
    }//GEN-LAST:event_jB4ActionPerformed

    private void jBMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicacaoActionPerformed
        // TODO add your handling code here:
        if(!jLExpressao.getText().equals(expressaoInit)&&
                !(jLExpressao.getText().endsWith("+")||jLExpressao.getText().endsWith("-")||jLExpressao.getText().endsWith("*")||jLExpressao.getText().endsWith("/")||jLExpressao.getText().endsWith("("))){
            jLExpressao.setText(jLExpressao.getText()+"*");
        }else{
            //TODO add alert
        }
    }//GEN-LAST:event_jBMultiplicacaoActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("1");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"1");
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("2");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"2");
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("5");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"5");
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("7");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"7");
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("8");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"8");
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("0");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"0");
    }//GEN-LAST:event_jB0ActionPerformed

    private void jBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBxActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("x");
        }else 
            jLExpressao.setText(jLExpressao.getText()+"x");
    }//GEN-LAST:event_jBxActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        jLExpressao.setText(expressaoInit);
        //TODO limpar dados da memória
    }//GEN-LAST:event_jBClearActionPerformed

    private void jBPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPotenciaActionPerformed
        // TODO add your handling code here:
        if(!jLExpressao.getText().equals(expressaoInit)&&
                !(jLExpressao.getText().endsWith("+")||jLExpressao.getText().endsWith("-")||jLExpressao.getText().endsWith("*")||jLExpressao.getText().endsWith("/")||jLExpressao.getText().endsWith("("))){
            jLExpressao.setText(jLExpressao.getText()+"^(");
        }else{
            //TODO add alert
        }
    }//GEN-LAST:event_jBPotenciaActionPerformed

    private void jBAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicaoActionPerformed
        // TODO add your handling code here:
        if(!jLExpressao.getText().equals(expressaoInit)&&
                !(jLExpressao.getText().endsWith("+")||jLExpressao.getText().endsWith("-")||jLExpressao.getText().endsWith("*")||jLExpressao.getText().endsWith("/")||jLExpressao.getText().endsWith("("))){
            jLExpressao.setText(jLExpressao.getText()+"+");
        }else{
            //TODO add alert
        }
    }//GEN-LAST:event_jBAdicaoActionPerformed

    private void jBSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubtracaoActionPerformed
        // TODO add your handling code here:
        if(!jLExpressao.getText().equals(expressaoInit)&&
                !(jLExpressao.getText().endsWith("+")||jLExpressao.getText().endsWith("-")||jLExpressao.getText().endsWith("*")||jLExpressao.getText().endsWith("/")||jLExpressao.getText().endsWith("("))){
            jLExpressao.setText(jLExpressao.getText()+"-");
        }else{
            //TODO add alert
        }
    }//GEN-LAST:event_jBSubtracaoActionPerformed

    private void jBDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDivisaoActionPerformed
        // TODO add your handling code here:
        if(!jLExpressao.getText().equals(expressaoInit)&&
                !(jLExpressao.getText().endsWith("+")||jLExpressao.getText().endsWith("-")||jLExpressao.getText().endsWith("*")||jLExpressao.getText().endsWith("/")||jLExpressao.getText().endsWith("("))){
            jLExpressao.setText(jLExpressao.getText()+"/");
        }else{
            //TODO add alert
        }
    }//GEN-LAST:event_jBDivisaoActionPerformed

    private void jBAbreParentesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbreParentesesActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText("(");
        }else{
            if(jLExpressao.getText().endsWith("(")||jLExpressao.getText().endsWith("+")||jLExpressao.getText().endsWith("-")||jLExpressao.getText().endsWith("*")||jLExpressao.getText().endsWith("/")){
                //TODO add alert
            }else
                jLExpressao.setText(jLExpressao.getText()+"(");
        }
    }//GEN-LAST:event_jBAbreParentesesActionPerformed

    private void jBFechaParentesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechaParentesesActionPerformed
        // TODO add your handling code here:
        if(jLExpressao.getText().equals(expressaoInit)){
            jLExpressao.setText(")");
        }else{
            if(jLExpressao.getText().endsWith("(")||jLExpressao.getText().endsWith("+")||jLExpressao.getText().endsWith("-")||jLExpressao.getText().endsWith("*")||jLExpressao.getText().endsWith("/")){
                //TODO add alert
            }else
                jLExpressao.setText(jLExpressao.getText()+")");
        }
    }//GEN-LAST:event_jBFechaParentesesActionPerformed

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        // TODO add your handling code here:
        TelaResultado tr = new TelaResultado();
        tr.setVisible(true);
    }//GEN-LAST:event_jBOkActionPerformed

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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBAbreParenteses;
    private javax.swing.JButton jBAdicao;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBDivisao;
    private javax.swing.JButton jBFechaParenteses;
    private javax.swing.JButton jBMultiplicacao;
    private javax.swing.JButton jBOk;
    private javax.swing.JButton jBPotencia;
    private javax.swing.JButton jBSubtracao;
    private javax.swing.JButton jBx;
    private javax.swing.JLabel jLEntrada;
    private javax.swing.JLabel jLExpressao;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
