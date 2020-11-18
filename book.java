/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nivedha - G
 */
public class book extends javax.swing.JFrame {
    ArrayList<Integer> isb = new ArrayList<Integer>();
    ArrayList<Integer> pr = new ArrayList<Integer>();
    ArrayList<Icon> ic = new ArrayList<Icon>();
    ArrayList<Integer> pri = new ArrayList<Integer>();
    ArrayList<String> na = new ArrayList<String>();
    /**
     * Creates new form main
     */
    byte[] img = null;
    String name1 = null;
    int price1 = 0,isbn=0;
    int i = 0, j = 0;
    JLabel[] name;
    JLabel[] icon;
    JLabel[] price;
    JPanel[] p;
    JButton[] book;
    JButton[] cart;
    JButton[] wish;
    Connection con = DB.getConnection();
    public book() throws SQLException {
        initComponents();
        if(Library.name != null)
        {
            login.setText("LOGOUT");
        }
        else
        {
            login.setText("LOGIN");
        }
        set();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        books = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        articles = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 582));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(990, 582));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setInheritsPopupMenu(true);

        jPanel2.setBackground(new java.awt.Color(255, 191, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(32, 33, 35));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, -1, -1));

        home.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel4.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 58, 24));

        jLabel15.setIcon(new javax.swing.ImageIcon("G:\\NetBeans\\book uh\\icons8-home-24.png")); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 24));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 230, 44));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, -1, -1));

        books.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        books.setForeground(new java.awt.Color(255, 255, 255));
        books.setText("BOOKS");
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksMouseClicked(evt);
            }
        });
        jPanel5.add(books, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 58, 24));

        jLabel16.setIcon(new javax.swing.ImageIcon("G:\\NetBeans\\book uh\\icons8-book-stack-26.png")); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 183, 230, 44));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        articles.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        articles.setForeground(new java.awt.Color(255, 255, 255));
        articles.setText("JOURNALS");
        articles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articlesMouseClicked(evt);
            }
        });
        jPanel6.add(articles, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 70, 24));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("G:\\NetBeans\\book uh\\icons8-documents-24.png")); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 257, 230, 45));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, -1, -1));

        login.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel7.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 58, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\NetBeans\\book uh\\user-24.png")); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 24));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 328, 230, 46));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksMouseClicked
        try {
            // TODO add your handling code here:
            new book().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_booksMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        if(login.getText().equalsIgnoreCase("Login"))
        {
            new sign_in().setVisible(true);
            this.dispose();
        }
        else
        {
            Library.name = null;
            Library.age = 0;
            JOptionPane.showMessageDialog(null, "Logged out successfully");
            new Main().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_loginMouseClicked

    private void articlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articlesMouseClicked
        // TODO add your handling code here:
        new journals().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_articlesMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new book().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void set() throws SQLException
    {
        int count = 0;
        ImageIcon myimgicon = null;
        PreparedStatement st = con.prepareStatement("select isbn,name,price,image from book_detail");
        ResultSet rs =st.executeQuery();
        //Icon myimgicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
        
        int x=280, y=80, width=220, height=400, xp=420, yp=155;
        icon = new JLabel[100];
        price = new JLabel[100];
        p = new JPanel[100];
        cart = new JButton[100];
        wish = new JButton[100];
        name = new JLabel[100];
        book = new JButton[100];
        
        //for(int j=0;j<4;j++)
        while(rs.next())
        //for(i=0;i<=29;i++)
        {
            icon[i] = new JLabel();
            p[i] = new JPanel();
            price[i] = new JLabel();
            cart[i] = new JButton();
            wish[i] = new JButton();
            name[i] = new JLabel();
            book[i] = new JButton();

            isbn = rs.getInt(1);
            name1 = rs.getString(2);
            price1 = rs.getInt(3);
            img = rs.getBytes(4);
            
            myimgicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(200, 250, java.awt.Image.SCALE_SMOOTH));
            isb.add(isbn);
            pr.add(price1);
            
            if(i%3==0)
            {
                if(i!=0)
                {
                    x = 280;
                    y = y + 400;
                }
            }
            else
            {
                    x = x + 220;
            }
            
            p[i].setBounds(x, y, width, height);
            
            if(i%2==0)
                p[i].setBackground(Color.PINK);
            else
                p[i].setBackground(Color.WHITE);
            
            icon[i].setBounds(10, 20, 200, 250);
            jPanel1.setPreferredSize(new Dimension(646,1222+y));
            jPanel3.setPreferredSize(new Dimension(230,500+y));
            icon[i].setIcon(myimgicon);
            name[i].setBounds(130, 255, 200, 10);
            name[i].setText(name1);
            price[i].setBounds(130, 275, 200, 10);
            price[i].setText(String.valueOf(price1)+"/-");
            cart[i].setBounds(10, 300, 200, 20);
            cart[i].setText("Add to Cart");
            cart[i].setBackground(Color.red);
            wish[i].setBounds(10, 325, 200, 20);
            wish[i].setText("Add to Wishlist");
            wish[i].setBackground(Color.red);
            book[i].setBounds(10,335, 200, 20);
            book[i].setText("Buy Now");
            book[i].setBackground(Color.red);
            
            cart[i].addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                int x =0 ;
                try {
                    x = cart(e.getSource());
                } catch (SQLException ex) {
                    Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});
            
            wish[i].addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Added to Wishlist");
            }});
            
            book[i].addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                book(e.getSource());
            }});
            
            p[i].add(icon[i]);
            p[i].add(name[i]);
            p[i].add(price[i]);
            p[i].add(cart[i]);
            p[i].add(wish[i]);
            p[i].add(book[i]);
            jPanel1.add(p[i]);
            i++;
        }
    }
    
    public void set(int from,int to) throws SQLException
    {
        int count = 0;
        ImageIcon myimgicon = null;
        PreparedStatement st = con.prepareStatement("select isbn,name,price,image from book_detail");
        ResultSet rs =st.executeQuery();
        //Icon myimgicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
        
        while (rs.next()) {
           count++;
        }
        int x=280, y=120, width=220, height=400, xp=420, yp=155;
        icon = new JLabel[count];
        price = new JLabel[count];
        p = new JPanel[count];
        cart = new JButton[count];
        wish = new JButton[count];
        name = new JLabel[count];
        book = new JButton[count];
        
        //for(int j=0;j<4;j++)
        while(rs.next())
        //for(i=0;i<=29;i++)
        {
            icon[i] = new JLabel();
            p[i] = new JPanel();
            price[i] = new JLabel();
            cart[i] = new JButton();
            wish[i] = new JButton();
            name[i] = new JLabel();
            book[i] = new JButton();

            isbn = rs.getInt(1);
            name1 = rs.getString(2);
            price1 = rs.getInt(3);
            img = rs.getBytes(4);
            
            myimgicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(200, 250, java.awt.Image.SCALE_SMOOTH));
            isb.add(isbn);
            pr.add(price1);
            
            if(i%3==0)
            {
                if(i!=0)
                {
                    x = 280;
                    y = y + 400;
                }
            }
            else
            {
                    x = x + 220;
            }
            
            p[i].setBounds(x, y, width, height);
            
            if(i%2==0)
                p[i].setBackground(Color.PINK);
            else
                p[i].setBackground(Color.WHITE);
            
            icon[i].setBounds(10, 20, 200, 250);
            jPanel1.setPreferredSize(new Dimension(646,1222+y));
            jPanel3.setPreferredSize(new Dimension(230,500+y));
            icon[i].setIcon(myimgicon);
            name[i].setBounds(130, 255, 200, 10);
            name[i].setText(name1);
            price[i].setBounds(130, 275, 200, 10);
            price[i].setText(String.valueOf(price1)+"/-");
            cart[i].setBounds(10, 300, 200, 20);
            cart[i].setText("Add to Cart");
            cart[i].setBackground(Color.red);
            wish[i].setBounds(10, 325, 200, 20);
            wish[i].setText("Add to Wishlist");
            wish[i].setBackground(Color.red);
            book[i].setBounds(10,335, 200, 20);
            book[i].setText("Buy Now");
            book[i].setBackground(Color.red);
            
            cart[i].addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                int x =0 ;
                try {
                    x = cart(e.getSource());
                } catch (SQLException ex) {
                    Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});
            
            wish[i].addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Added to Wishlist");
            }});
            
            book[i].addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                book(e.getSource());
            }});
            
            p[i].add(icon[i]);
            p[i].add(name[i]);
            p[i].add(price[i]);
            p[i].add(cart[i]);
            p[i].add(wish[i]);
            p[i].add(book[i]);
            jPanel1.add(p[i]);
            i++;
        }
    }
    
    public void book(Object x)
    {
        int a = 0;
        for (a = 0; a < i;a++)
            if (x.equals(book[a])) 
                break;
        ic.add(icon[a].getIcon());
        pri.add(pr.get(a));
        na.add(name[a].getText());
        new buynow(ic,pri,na,pr.get(a)).setVisible(true);
    }
    
    public int cart(Object x) throws SQLException
    {
        int a = 0,z=0;
        for (a = 0; a < i;a++) 
        {
            if (x.equals(cart[a])) 
            {
                z = isb.get(a);
                break;
            }
        }
        if(sign_in.email==null)
        {
            JOptionPane.showMessageDialog(null, "Login to Continue");
            new sign_in().setVisible(true);
            this.dispose();
        }
        else
        {
            PreparedStatement s = con.prepareStatement("select isbn,name,price,image from cart where isbn ="+z+" and userid = '"+sign_in.email+"'");
            ResultSet r =s.executeQuery();
            if(r.next()==false)
            {
                PreparedStatement st = con.prepareStatement("select isbn,name,price,image from book_detail where isbn ="+z+"");
                ResultSet rs =st.executeQuery();
                if(rs.next())
                {
                    isbn = rs.getInt(1);
                    name1 = rs.getString(2);
                    price1 = rs.getInt(3);
                    img = rs.getBytes(4);
                }
                Cart_1 c1 = new Cart_1();
                c1.setIsbn(isbn);
                c1.setName(name1);
                c1.setPrice(price1);
                c1.setUserid(Library.email);
                c1.setImage(img);
                EntityManagerFactory emf;
                emf = Persistence.createEntityManagerFactory("project5PU");
                Cart_1JpaController gjc = new Cart_1JpaController(emf);
                try {
                    gjc.create(c1);
                } catch (Exception ex) {
                    Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Added to cart");
            }
            else
                JOptionPane.showMessageDialog(null, "Already Added");
        }
        
        return a;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel articles;
    private javax.swing.JLabel books;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel login;
    // End of variables declaration//GEN-END:variables
}