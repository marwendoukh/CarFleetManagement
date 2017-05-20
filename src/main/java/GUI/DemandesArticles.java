/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ArticleDAO;
import DAO.BonCarburantDAO;
import DAO.DemandeArticlesDAO;
import DAO.FixingDAO;
import Entities.Article;
import Entities.BonDeCarburant;
import Entities.Car;
import Entities.DemandeArticle;
import Entities.Fixing;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marwen
 */
public class DemandesArticles extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceDemandeArticle
     */
    public DemandesArticles() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        designationET = new javax.swing.JTextField();
        numSoucheET = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantityET = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        responsablMissionET = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addBT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        marqueCB = new javax.swing.JCheckBox();
        responsableCB = new javax.swing.JCheckBox();
        searchMarqueET = new javax.swing.JTextField();
        dateCB = new javax.swing.JCheckBox();
        seachResponsableET = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dateET = new javax.swing.JTextField();
        seachDateET = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Deconnecter");

        jLabel1.setText("Bienvenue Mr");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Rechercher");

        jLabel3.setText("Désignation Article");

        jLabel4.setText("Numero de souche de reparation");

        jLabel5.setText("Quantité");

        jLabel6.setText("Responsable de mission");

        jLabel7.setText("Date");

        addBT.setText("Ajouter");
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });

        jButton3.setText("Annuler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Demander Article");

        marqueCB.setText("Marque");

        responsableCB.setText("Responsable");

        dateCB.setText("Date");

        jButton4.setText("Afficher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Marque", "Code", "Désingation", "Quantité", "Responsable", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Vehicule");

        jMenuItem2.setText("Ajouter vehicule");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Etat des vehicules dans une année");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Alertes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Réparation");

        jMenuItem5.setText("Ajouter une réparation");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Etat des réparations dans une année");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Alertes");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Carburant");

        jMenuItem8.setText("Ajouter une consommation");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Etat des consommations dans une année");
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Magasin");

        jMenuItem10.setText("Ajouter un article");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Etat des consommations dans une année");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Alertes");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Atelier");

        jMenuItem13.setText("Ajouter un bon de lavage");
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Demander un article");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Etat des consommations dans une année");
        jMenu5.add(jMenuItem15);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Parametrage");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(marqueCB)
                                        .addGap(18, 18, 18)
                                        .addComponent(searchMarqueET, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(designationET, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(numSoucheET, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(251, 251, 251)
                            .addComponent(jLabel11))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(responsableCB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(seachResponsableET, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(quantityET, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(318, 318, 318)))
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel6))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(responsablMissionET, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateET, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(39, 39, 39))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(102, 102, 102)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(dateCB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(seachDateET, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addBT)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton3))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(264, 264, 264))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(237, 237, 237)
                    .addComponent(jLabel12)
                    .addContainerGap(603, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(responsablMissionET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(dateET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBT)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(designationET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(quantityET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(numSoucheET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marqueCB)
                    .addComponent(responsableCB)
                    .addComponent(searchMarqueET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateCB)
                    .addComponent(seachResponsableET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(seachDateET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel12)
                    .addContainerGap(663, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed

        
        DemandeArticle demandeArticle = new DemandeArticle();

                
        FixingDAO fixingDao = new FixingDAO();
        
        Fixing fixing =fixingDao.findFixingBySoucheNumer(numSoucheET.getText());
        
        System.out.println("Fixing found "+fixing.getDesignationD());
        
        // get Article 
        ArticleDAO articleDao = new ArticleDAO();
        Article article = articleDao.findArticleByDesignation(designationET.getText()).get(0);
        
        
       
       
        
        
        fixing.setResponsableMission(responsablMissionET.getText());
        
         try {
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            Date date;
            date = format.parse(dateET.getText());
            demandeArticle.setDateDemande(date);

        } catch (ParseException ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          // restart session and update Fixing
        fixingDao = new FixingDAO();        
        fixingDao.addOrUpdateFixing(fixing);
        
        demandeArticle.setFixing(fixing);
        
        try{
        demandeArticle.getArticles().add(article);
        }
        catch(Exception e)
        {
            // DemandeArticle does not have any Articles
            List<Article> articles=new ArrayList<>();
            articles.add(article);
            demandeArticle.setArticles(articles);
        }
         
        demandeArticle.setQuanity(Integer.parseInt(quantityET.getText()));
        
        DemandeArticlesDAO demandeArticleDao= new DemandeArticlesDAO();
        demandeArticleDao.addDemandeArticles(demandeArticle);
         
         
       /* 
        // restart session and update Article
        articleDao = new ArticleDAO();        
        articleDao.addOrMergeArticle(article);
        
        
        
        /* try{
                        
        // add article*quantity to the Fixing
            article.getFixings().add(fixing);
        
        }
        catch(IndexOutOfBoundsException e)
        {
           List<Fixing> fixingss=new ArrayList<>();
            fixingss.add(fixing);
        
        article.setFixings(fixingss);
        }
        
        
       // remove article*quantity from the Quantity

       article.setQuantity(article.getQuantity()-Integer.parseInt(quantityET.getText()));
*/


    }//GEN-LAST:event_addBTActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

           

        List<DemandeArticle> demandeArticles = new ArrayList<>();
        DemandeArticlesDAO demandeArticleDao = new DemandeArticlesDAO();
        
             if(marqueCB.isSelected() && !responsableCB.isSelected() && !dateCB.isSelected() )
            {
               demandeArticles.addAll(demandeArticleDao.findDemandeArticlesByMarqueArticle(searchMarqueET.getText()));
            }
            else if(!marqueCB.isSelected() && responsableCB.isSelected() && !dateCB.isSelected() )

            {
               demandeArticles.addAll(demandeArticleDao.findDemandeArticlesByResponsable(seachResponsableET.getText()));
            }
           else if(!marqueCB.isSelected() && !responsableCB.isSelected() && dateCB.isSelected() )

            {
                try {
                         DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                         Date date;
                         date = format.parse(seachDateET.getText());
                         demandeArticles.addAll(demandeArticleDao.findDemandeArticlesByDate(date));

                  } catch (ParseException ex) {
                         Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
                     }        
            }
             
             
             
             
               /// add to the table
            
            Object[] tableColumnNames = new Object[6];
        tableColumnNames[0]="Marque";
        tableColumnNames[1]="Code";
        tableColumnNames[2]="Designation";
        tableColumnNames[3]="Quantity";
        tableColumnNames[4]="Responsable";
        tableColumnNames[5]="Date";

        
         DefaultTableModel tbd = new DefaultTableModel() ;
         tbd.setColumnIdentifiers(tableColumnNames);
        Object [] RowService=new Object[6];
        this.jTable1.setModel(tbd);
        for (int i=0;i<demandeArticles.size();i++){
            try{
            RowService[0]=demandeArticles.get(i).getArticles().get(0).getMarqueArticle();
            }
            catch(Exception e)
            {
                
            }
            RowService[1]=demandeArticles.get(i).getQuanity();
            RowService[2]=demandeArticles.get(i).getArticles().get(0).getDesignation();
            RowService[3]=demandeArticles.get(i).getQuanity();
            RowService[4]=demandeArticles.get(i).getFixing().getResponsableMission();
            RowService[5]=demandeArticles.get(i).getDateDemande().toString();

            
            tbd.addRow(RowService);

        }

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(DemandesArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemandesArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemandesArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemandesArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemandesArticles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JCheckBox dateCB;
    private javax.swing.JTextField dateET;
    private javax.swing.JTextField designationET;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox marqueCB;
    private javax.swing.JTextField numSoucheET;
    private javax.swing.JTextField quantityET;
    private javax.swing.JTextField responsablMissionET;
    private javax.swing.JCheckBox responsableCB;
    private javax.swing.JTextField seachDateET;
    private javax.swing.JTextField seachResponsableET;
    private javax.swing.JTextField searchMarqueET;
    // End of variables declaration//GEN-END:variables
}
