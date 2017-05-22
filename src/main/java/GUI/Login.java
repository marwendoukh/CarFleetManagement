/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.LoginDAO;
import Entities.Role;
import Entities.User;
import javax.swing.JOptionPane;

/**
 *
 * @author marwen
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        // just testing the entities
        /*
Session session;
    Transaction transaction;

    
    try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            
             Car c = new Car();
             c.setCategory("aaaa");
             c.setImmatriculation("22222222");
             
                                      session.save(c);

                                     transaction.commit();

                                       session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            
             List<Fixing> fixings = new ArrayList<Fixing>();
             
           Article a =  new Article(111,   "design", fixings);
                         session.save(a);

                          transaction.commit();

                                       session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
             Fixing f = new Fixing("aaa", c, a, new Date(), "ss", "ss", "ss", new Date(), "zz");
             
              session.save(f);

                        transaction.commit();
                        
                   session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
                 
             fixings.add(f);
             c.setFixing(fixings);
             
             
            session.merge(c);

                        transaction.commit();
                         System.out.println("Successfully inserted");

            session = HibernateUtil.getSessionFactory().getCurrentSession();
               transaction = session.beginTransaction();

                        
       Car car = session.get(Car.class, "22222222");
        System.out.println("car cat " +car.getFixing().get(0).getCar().getCategory());

            transaction.commit();
            session.close();
            
            
            System.out.println("fixing for 2017 "+new FixingDAO().findFixingByYear(2017).get(0).getSupplier());
            
            
        } catch (Exception e) {
        System.out.println("exception "+e.toString());
        }
    
    //*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginTF = new javax.swing.JTextField();
        PasswordTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginBT = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LoginTF.setText("Taper votre login");

        PasswordTF.setText("taper votre mot de passe");

        jLabel1.setText("Login");

        jLabel2.setText("Mot de passe");

        loginBT.setText("Se connecter");
        loginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTActionPerformed(evt);
            }
        });

        signUp.setText("Inscription");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        cancel.setText("cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(signUp)
                        .addGap(62, 62, 62)
                        .addComponent(loginBT)
                        .addGap(63, 63, 63)
                        .addComponent(cancel)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBT)
                    .addComponent(signUp)
                    .addComponent(cancel))
                .addGap(45, 45, 45))
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
    }// </editor-fold>//GEN-END:initComponents

    private void loginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTActionPerformed

        // check credentials in DB
        LoginDAO loginDAO = new LoginDAO();

        User user =loginDAO.signIn(LoginTF.getText(), PasswordTF.getText());
        if (user !=null) {
            System.out.println("logged in  " + loginDAO.signIn(LoginTF.getText(), PasswordTF.getText()));
            
            /// redirect to the right GUI according to the role
            if(user.getRole() == Role.CHEF_DEPARTEMENT)
            {
                // chef departement
              new AdminDashboard().setVisible(true);
              this.setVisible(false);
            }
            else
            {
                // chef de park
              new AdminDashboard().setVisible(true);
              this.setVisible(false);
            }

        } else {
            new JOptionPane().showMessageDialog(this, "Please re-check your login and password");

        }
        System.out.println("logged in  " + loginDAO.signIn(LoginTF.getText(), PasswordTF.getText()));

    }//GEN-LAST:event_loginBTActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
        new SignUp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signUpActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LoginTF;
    private javax.swing.JTextField PasswordTF;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBT;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
