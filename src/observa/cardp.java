/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observa;

import dao.UsuarioDAO;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.ModeloJframe1;
import observa.pgmt;
import modelo.Usuario;
/**
 *
 * @author positivo
 */
public class cardp extends javax.swing.JFrame {
    double total = 0;
    DefaultListModel lst = new DefaultListModel();
    public cardp() {
        initComponents();
    String totalstr = String.valueOf(total);
    tootal.setText(totalstr);
}
    public void add(String name){
    items.setModel(lst);       
//    lst.addElement(name);
    }
    
public void  exportarNome(ModeloJframe1 model) {
    lblnome1.setText(model.getNome());
}
    ModeloJframe1 model = new ModeloJframe1();

public void addAction(){
    if (produtosel.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Campo não pode permanecer vazio.");
    }
    
    else if (produtosel.getText().contains(" ")) {
        JOptionPane.showMessageDialog(null, "Campo não pode conter espaços.");
        produtosel.setText("");
    }
    else if (produtosel.getText().contains("a") || produtosel.getText().contains("b") || produtosel.getText().contains("c") || produtosel.getText().contains("d") || produtosel.getText().contains("e") || produtosel.getText().contains("f") || produtosel.getText().contains("g") || produtosel.getText().contains("h") || produtosel.getText().contains("i") || produtosel.getText().contains("j") || produtosel.getText().contains("k") || produtosel.getText().contains("l") || produtosel.getText().contains("m") || produtosel.getText().contains("n") || produtosel.getText().contains("o") || produtosel.getText().contains("p") || produtosel.getText().contains("q") || produtosel.getText().contains("r") || produtosel.getText().contains("s") || produtosel.getText().contains("t") || produtosel.getText().contains("u") || produtosel.getText().contains("v") || produtosel.getText().contains("w") || produtosel.getText().contains("x") || produtosel.getText().contains("y") || produtosel.getText().contains("z")) {
        JOptionPane.showMessageDialog(null, "Campo não pode conter letras.");         
        produtosel.setText("");
    }    else
    {
    produtosel.getText();
    
    String text = produtosel.getText();
      int product = Integer.parseInt(text);
//        int total=0;
        add(produtosel.getText());    
        switch(product) {
        case 1: 
         total += 20;
         
        lst.addElement("Pizza calabresa");
        produtosel.setText("");
        break;    
        case 2:
              total += 20;
        lst.addElement("Pizza frango"); 
        produtosel.setText("");
        break;
        case 3: 
              total += 20;
             lst.addElement("Pizza charque");
             produtosel.setText(""); 
             break;
        case 4:
              total += 20;
             lst.addElement("Pizza queijo");
             produtosel.setText("");     
             break;
        case 5:
              total += 20;
             lst.addElement("Pizza frango c/ queijo");
             produtosel.setText("");     
             break;
        case 6:
              total += 3;
             lst.addElement("Kibe");
             produtosel.setText("");      
             break;
        case 7:
              total += 3;
             lst.addElement("Batata frita");
             produtosel.setText("");      
             break;
        case 8: 
              total += 7;
             lst.addElement("Petiscos");
             produtosel.setText("");      
             break;
        case 9:
              total += 4;
             lst.addElement("Polenta frita");
             produtosel.setText("");      
             break;
        case 10:
              total += 35;
             lst.addElement("Bóbó de camarão");
             produtosel.setText("");      
             break;
        case 11:
              total += 3;
             lst.addElement("Dolly Guaraná 2L");
             produtosel.setText("");      
             break;
        case 12:
              total += 3.50;
             lst.addElement("Poupa de limão");
             produtosel.setText("");       
             break;
        case 13: 
              total += 4;
             lst.addElement("Capuccino");
             produtosel.setText("");       
             break;
        case 14:
              total += 7;
             lst.addElement("Coca-cola");
             produtosel.setText("");      
             break;
        case 15:
              total += 3;
             lst.addElement("Sukita");
             produtosel.setText("");      
             break;
        case 16:
              total += 12;
             lst.addElement("Batida de vinho");
             produtosel.setText("");     
             break;
        case 17:
              total += 30;
             lst.addElement("Whisky");
             produtosel.setText("");     
             break;
        case 18:
              total += 15;
             lst.addElement("Nevada"); 
             produtosel.setText("");      
             break;
        case 19:
              total += 29;
             lst.addElement("Campari");
             produtosel.setText("");     
             break;
        case 20:
              total += 40;
             lst.addElement("Vodka");
             produtosel.setText("");   
             break;
        default: 
            JOptionPane.showMessageDialog(null,"Pedido inválido.");
            produtosel.setText("");
            break;
    }
    }
    String totalstr = String.valueOf(total);
    tootal.setText(totalstr);
    items.setSelectedIndex(0);
}

public void delAction() {
        int index = items.getSelectedIndex();
        
    String selected = items.getSelectedValue(); //aqui ele pega o produto selecionado e transforma em string

    if(selected.equals("Pizza calabresa")) {
        total -=20;        
    }
    else if(selected.equals("Pizza frango ")) {
        total -=20;        
    } 
    else if(selected.equals("Pizza charque")) {
        total -=20;        
    } 
    else if(selected.equals("Pizza Queijo ")) {
        total -=20;        
    } 
    else if(selected.equals("Pizza de frango c/ queijo")) {
        total -=20;        
    } 
    else if(selected.equals("Kibe")) {
        total -=3;        
    } 
    else if(selected.equals("Batata frita")) {
        total -=3;        
    } 
    else if(selected.equals("Petiscos")) {
        total -=7;        
    } 
    else if(selected.equals("Polenta frita")) {
        total -=4;        
    } 
    else if(selected.equals("Bóbó de camarão")) {
        total -=35;        
    } 
    else if(selected.equals("Dolly Guaraná 2L")) {
        total -=3;        
    } 
    else if(selected.equals("Poupa de limão")) {
        total -=3.50;        
    } 
    else if(selected.equals("Cappucino")) {
        total -=4;        
    } 
    else if(selected.equals("Coca-cola")) {
        total -=7;        
    } 
    else if(selected.equals("Sukita")) {
        total -=3;        
    } 
    else if(selected.equals("Batida de limão")) {
        total -=12;        
    } 
    else if(selected.equals("Whisky")) {
        total -=30;        
    } 
    else if(selected.equals("Nevada")) {
        total -=15;        
    } 
    else if(selected.equals("Campari")) {
        total -=29;        
    } 
    else if(selected.equals("Vodka")) {
        total -=40;        
    } 
    
        lst.removeElementAt(index);
    
    String totalstr = String.valueOf(total);
    tootal.setText(totalstr);
//    if(lst.remove("Vodka")) {
//        total -= 40;
//        JOptionPane.showMessageDialog(null, "Você removeu 40 conto, ficando com " + total + " no gasto total");
//    }
//        produtosel.setText("");    
}

public void confirmAction() {
        if (lst.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Adicione pelo menos um item a lista!");            
        }
        else {
            JOptionPane.showMessageDialog(null, "Você terá de pagar no total: R$" + total);
            Object[] options = {"Confirmar", "Cancelar"};
int n = JOptionPane.showOptionDialog(null,
                "Deseja prosseguir?",
                "☺☺☺☺☺☺☺☺",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                options[0]);
        
    if(n==JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Redirecionando para pagamento...");
            this.dispose();
        Object[] poo = lst.toArray();
        String opaaaa = lst.toString();
//        ModeloJframe1 model = new ModeloJframe1();
//        model.setPreco(total);
        telafim1 fimm = new telafim1(model);
        model.setListin(poo);
//        fimm.setListaFinal(model);
        pgmt pgt = new pgmt();
        pgt.exportarPreco(total, poo);
        pgt.setVisible(true);
//        fim.setVisible(true);
    }
    String opaaaa = lst.toString();
//    telafim1 fim = new telafim1();
//    fim.exportarList(OPAAAAAAA MAMAI); 
       
       
        }

}
    
    public void settarLista(ModeloJframe1 model) {
        telafim1 fimm = new telafim1(model);
//        fimm.setListaFinal(model);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        produtosel = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lblnome1 = new javax.swing.JLabel();
        lista = new javax.swing.JScrollPane();
        items = new javax.swing.JList<>();
        del = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        limpa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tootal = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2/a.PNG"))); // NOI18N

        jLabel72.setText("jLabel72");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 0))); // NOI18N
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("MS PGothic", 3, 11)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 480, 60, 21);

        produtosel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoselActionPerformed(evt);
            }
        });
        produtosel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtoselKeyPressed(evt);
            }
        });
        jPanel1.add(produtosel);
        produtosel.setBounds(10, 440, 430, 28);

        add.setFont(new java.awt.Font("MS PGothic", 3, 11)); // NOI18N
        add.setText("Add +");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addKeyPressed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(40, 480, 70, 21);

        jButton3.setFont(new java.awt.Font("MS PGothic", 3, 11)); // NOI18N
        jButton3.setText("Confirmar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(210, 480, 90, 21);

        jLabel2.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Pizzas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 90, 59, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 130, 30, 14);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sabor");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(103, 129, 31, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preço");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 130, 39, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("001");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 156, 30, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("002");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 176, 21, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("003");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 196, 21, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("004");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 216, 21, 14);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("005");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 236, 21, 14);

        jLabel14.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Calabresa");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(103, 156, 80, 16);

        jLabel15.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Frango Catupiry");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(103, 176, 110, 16);

        jLabel16.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Charque");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(101, 196, 60, 16);

        jLabel17.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Queijo");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(101, 216, 60, 16);

        jLabel18.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Frango c/ Queijo");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(101, 236, 120, 16);

        jLabel21.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setText("Bebidas saudáveis");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 282, 150, 18);

        jLabel22.setFont(new java.awt.Font("NSimSun", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("011");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(10, 330, 30, 14);

        jLabel23.setFont(new java.awt.Font("NSimSun", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("012");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(10, 350, 30, 14);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("013");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(10, 370, 30, 14);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("014");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(10, 390, 30, 14);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("015");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(10, 408, 30, 14);

        jLabel27.setFont(new java.awt.Font("NSimSun", 2, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Dolly Guaraná 2L");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(101, 326, 100, 15);

        jLabel28.setFont(new java.awt.Font("NSimSun", 2, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Poupa de limão");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(101, 346, 100, 15);

        jLabel29.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Cappucino");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(100, 370, 70, 16);

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("R$ 3,00");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(201, 326, 50, 14);

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("R$ 3,50");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(201, 346, 50, 14);

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("R$ 4,00");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(201, 366, 50, 14);

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("R$ 7,00");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(201, 388, 50, 14);

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("R$ 3,00");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(201, 408, 50, 14);

        jLabel37.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Coca-Cola");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(101, 388, 80, 16);

        jLabel38.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Sukita");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(101, 408, 70, 16);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("016");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(259, 326, 30, 14);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("017");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(259, 346, 21, 14);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("018");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(259, 366, 21, 14);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("019");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(259, 388, 21, 14);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("020");
        jPanel1.add(jLabel43);
        jLabel43.setBounds(259, 408, 21, 14);

        jLabel44.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Whisky");
        jPanel1.add(jLabel44);
        jLabel44.setBounds(305, 346, 60, 16);

        jLabel45.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Nevada");
        jPanel1.add(jLabel45);
        jLabel45.setBounds(305, 366, 60, 16);

        jLabel46.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Campari");
        jPanel1.add(jLabel46);
        jLabel46.setBounds(305, 388, 60, 16);

        jLabel47.setFont(new java.awt.Font("NSimSun", 2, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Batida de Vinho");
        jPanel1.add(jLabel47);
        jLabel47.setBounds(305, 326, 100, 15);

        jLabel48.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Vodka");
        jPanel1.add(jLabel48);
        jLabel48.setBounds(305, 408, 50, 16);

        jLabel20.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setText("Acompanhamentos");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(260, 100, 143, 16);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("007");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 170, 21, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("006");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(260, 150, 30, 14);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("008");
        jPanel1.add(jLabel55);
        jLabel55.setBounds(260, 190, 21, 14);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("009");
        jPanel1.add(jLabel56);
        jLabel56.setBounds(260, 210, 21, 14);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("010");
        jPanel1.add(jLabel57);
        jLabel57.setBounds(260, 230, 21, 14);

        jLabel58.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Kibe");
        jPanel1.add(jLabel58);
        jLabel58.setBounds(300, 150, 60, 16);

        jLabel59.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Batata frita");
        jPanel1.add(jLabel59);
        jLabel59.setBounds(300, 170, 90, 16);

        jLabel60.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Petiscos");
        jPanel1.add(jLabel60);
        jLabel60.setBounds(300, 190, 70, 16);

        jLabel61.setFont(new java.awt.Font("NSimSun", 2, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Polenta Frita");
        jPanel1.add(jLabel61);
        jLabel61.setBounds(300, 210, 100, 16);

        jLabel62.setFont(new java.awt.Font("NSimSun", 2, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Bóbó de camarão");
        jPanel1.add(jLabel62);
        jLabel62.setBounds(300, 230, 100, 15);

        jLabel63.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 204, 255));
        jLabel63.setText("Ácool");
        jPanel1.add(jLabel63);
        jLabel63.setBounds(260, 280, 34, 18);

        jLabel77.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Bem vindo (a) ao Menu");
        jPanel1.add(jLabel77);
        jLabel77.setBounds(110, 20, 190, 30);

        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("R$ 3,00");
        jPanel1.add(jLabel78);
        jLabel78.setBounds(400, 150, 50, 14);

        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("R$ 3,00");
        jPanel1.add(jLabel79);
        jLabel79.setBounds(400, 170, 60, 14);

        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("R$ 7,00");
        jPanel1.add(jLabel80);
        jLabel80.setBounds(400, 190, 50, 14);

        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("R$ 4,00");
        jPanel1.add(jLabel81);
        jLabel81.setBounds(400, 210, 50, 14);

        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("R$ 35,00");
        jPanel1.add(jLabel82);
        jLabel82.setBounds(400, 230, 50, 14);

        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("R$ 12,00");
        jPanel1.add(jLabel83);
        jLabel83.setBounds(400, 330, 60, 14);

        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("R$ 30,00");
        jPanel1.add(jLabel84);
        jLabel84.setBounds(400, 350, 70, 20);

        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("R$ 15,00");
        jPanel1.add(jLabel85);
        jLabel85.setBounds(400, 370, 50, 14);

        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("R$ 29,00");
        jPanel1.add(jLabel86);
        jLabel86.setBounds(400, 390, 60, 14);

        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("R$ 40,00");
        jPanel1.add(jLabel87);
        jLabel87.setBounds(400, 410, 60, 14);

        lblnome1.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        lblnome1.setForeground(new java.awt.Color(255, 255, 255));
        lblnome1.setText("null");
        lblnome1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(153, 153, 153), null, new java.awt.Color(204, 0, 0)));
        jPanel1.add(lblnome1);
        lblnome1.setBounds(300, 20, 210, 30);

        items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsMouseClicked(evt);
            }
        });
        lista.setViewportView(items);

        jPanel1.add(lista);
        lista.setBounds(460, 380, 140, 80);

        del.setFont(new java.awt.Font("MS PGothic", 3, 10)); // NOI18N
        del.setText("Deletar");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        del.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                delKeyPressed(evt);
            }
        });
        jPanel1.add(del);
        del.setBounds(457, 470, 70, 20);

        jLabel50.setFont(new java.awt.Font("Ink Free", 2, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 0, 0));
        jLabel50.setText("Por favor,escolha o item de sua preferência!");
        jPanel1.add(jLabel50);
        jLabel50.setBounds(150, 60, 350, 30);

        limpa.setFont(new java.awt.Font("MS PGothic", 3, 10)); // NOI18N
        limpa.setText("Limpar");
        limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaActionPerformed(evt);
            }
        });
        limpa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                limpaKeyPressed(evt);
            }
        });
        jPanel1.add(limpa);
        limpa.setBounds(530, 470, 70, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barbabranca.PNG"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 10, 80, 70);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a trupe.PNG"))); // NOI18N
        jPanel1.add(jLabel49);
        jLabel49.setBounds(480, 300, 100, 90);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/luffy.PNG"))); // NOI18N
        jPanel1.add(jLabel51);
        jLabel51.setBounds(340, 380, 80, 60);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/karm.PNG"))); // NOI18N
        jPanel1.add(jLabel52);
        jLabel52.setBounds(130, 460, 50, 50);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/akihito.PNG"))); // NOI18N
        jPanel1.add(jLabel53);
        jLabel53.setBounds(160, 400, 46, 50);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chibi wei.PNG"))); // NOI18N
        jPanel1.add(jLabel54);
        jLabel54.setBounds(470, 120, 50, 60);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chibilan.PNG"))); // NOI18N
        jPanel1.add(jLabel64);
        jLabel64.setBounds(40, 160, 55, 70);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/karma3.PNG"))); // NOI18N
        jPanel1.add(jLabel65);
        jLabel65.setBounds(530, 180, 53, 60);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/karmaa.PNG"))); // NOI18N
        jPanel1.add(jLabel66);
        jLabel66.setBounds(30, 360, 69, 80);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/yatinho.PNG"))); // NOI18N
        jPanel1.add(jLabel68);
        jLabel68.setBounds(310, 460, 50, 60);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/asas.PNG"))); // NOI18N
        jPanel1.add(jLabel73);
        jLabel73.setBounds(510, 0, 83, 90);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cappucino_1.PNG"))); // NOI18N
        jPanel1.add(jLabel69);
        jLabel69.setBounds(160, 260, 50, 50);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/frango.PNG"))); // NOI18N
        jPanel1.add(jLabel74);
        jLabel74.setBounds(390, 90, 50, 40);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/vine.PNG"))); // NOI18N
        jPanel1.add(jLabel75);
        jLabel75.setBounds(330, 270, 60, 40);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pizzas.PNG"))); // NOI18N
        jPanel1.add(jLabel76);
        jLabel76.setBounds(70, 90, 47, 30);

        jLabel12.setFont(new java.awt.Font("Ink Free", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 255));
        jLabel12.setText("Valor a pagar: R$ ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(400, 258, 110, 30);

        tootal.setEditable(false);
        tootal.setBackground(new java.awt.Color(0, 0, 0));
        tootal.setBorder(null);
        tootal.setForeground(new java.awt.Color(255, 255, 255));
        tootal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tootal.setText("null");
        tootal.setFont(new java.awt.Font("Ink Free", 2, 15)); // NOI18N
        tootal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tootalActionPerformed(evt);
            }
        });
        jPanel1.add(tootal);
        tootal.setBounds(510, 260, 80, 19);

        jLabel13.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("20,00");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(130, 90, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void produtoselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoselActionPerformed

//    String text = produtosel.getText();
//    int product = Integer.parseInt(text);
    }//GEN-LAST:event_produtoselActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
//    DefaultListModel lst = new DefaultListModel();
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addAction();
    }//GEN-LAST:event_addActionPerformed

    private void limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaActionPerformed
        lst.clear();
        total=0;
        String totalstr = String.valueOf(total);
        tootal.setText(totalstr);
        items.setModel(lst);
    }//GEN-LAST:event_limpaActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        delAction();
    }//GEN-LAST:event_delActionPerformed

    private void itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsMouseClicked
//        String selected=items.getSelectedValue().toString();
//        produtosel.setText(selected);
    }//GEN-LAST:event_itemsMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        confirmAction();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tootalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tootalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tootalActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
  if (evt.getKeyCode() == KeyEvent.VK_ENTER){      
     confirmAction();
  }
    }//GEN-LAST:event_jButton3KeyPressed

    private void addKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyPressed
  if (evt.getKeyCode() == KeyEvent.VK_ENTER){      
     addAction();
  }
    }//GEN-LAST:event_addKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){      
        System.exit(0);
    }
    }//GEN-LAST:event_jButton1KeyPressed

    private void delKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_delKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        delAction();
    }
    }//GEN-LAST:event_delKeyPressed

    private void produtoselKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoselKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        addAction();
    }
    }//GEN-LAST:event_produtoselKeyPressed

    private void limpaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limpaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        lst.clear();
        total=0;
        String totalstr = String.valueOf(total);
        tootal.setText(totalstr);
        items.setModel(lst);
    }
    }//GEN-LAST:event_limpaKeyPressed
    

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
            java.util.logging.Logger.getLogger(cardp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cardp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cardp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cardp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton del;
    private javax.swing.JList<String> items;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblnome1;
    private javax.swing.JButton limpa;
    private javax.swing.JScrollPane lista;
    private javax.swing.JTextField produtosel;
    private javax.swing.JFormattedTextField tootal;
    // End of variables declaration//GEN-END:variables

}
