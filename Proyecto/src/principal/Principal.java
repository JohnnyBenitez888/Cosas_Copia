package principal;

import bienvenida.Bienvenida;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Principal extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    private JMenuBar barra;
    private JMenu menu1, menu2, menu3, menu4;
    private JMenuItem item1, item2, item3, item4, item5, item6, item7;
    private JTextField jtext1, jtext2, jtext3;
    private JScrollPane scroll;
    private JTextArea textArea;
    private JComboBox box1, box2;

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Para cerrar la interfaz
        setTitle("Pantalla principal");
        setIconImage(new ImageIcon(getClass().getResource("..//images//icon.png")).getImage());
        getContentPane().setBackground(Color.red);
        barra = new JMenuBar();
        setJMenuBar(barra);
        barra.setBackground(Color.red);
        menu1 = new JMenu("Opciones");
        menu1.setFont(new Font("Andale Mono", 1, 14));
        menu1.setForeground(Color.white);
        barra.add(menu1);
        menu2 = new JMenu("Calcular");
        menu2.setFont(new Font("Andale Mono", 1, 14));
        menu2.setForeground(Color.white);
        barra.add(menu2);
        menu3 = new JMenu("Acerca de");
        menu3.setFont(new Font("Andale Mono", 1, 14));
        menu3.setForeground(Color.white);
        barra.add(menu3);
        menu4 = new JMenu("Color de fondo");
        menu4.setFont(new Font("Andale Mono", 1, 14));
        menu4.setForeground(Color.red);
        menu1.add(menu4);

        item1 = new JMenuItem("Nuevo");
        item1.setFont(new Font("Andale Mono", 1, 14));
        item1.setForeground(Color.red);
        item1.addActionListener(this);
        menu1.add(item1);
        item2 = new JMenuItem("Salir");
        item2.setFont(new Font("Andale Mono", 1, 14));
        item2.setForeground(Color.red);
        item2.addActionListener(this);
        menu1.add(item2);
        item3 = new JMenuItem("Rojo");
        item3.setFont(new Font("Andale Mono", 1, 14));
        item3.setForeground(Color.red);
        item3.addActionListener(this);
        menu4.add(item3);
        item4 = new JMenuItem("Negro");
        item4.setFont(new Font("Andale Mono", 1, 14));
        item4.setForeground(Color.red);
        item4.addActionListener(this);
        menu4.add(item4);
        item5 = new JMenuItem("Morado");
        item5.setFont(new Font("Andale Mono", 1, 14));
        item5.setForeground(Color.red);
        item5.addActionListener(this);
        menu4.add(item5);
        item6 = new JMenuItem("Vacaciones");
        item6.setFont(new Font("Andale Mono", 1, 14));
        item6.setForeground(Color.red);
        item6.addActionListener(this);
        menu2.add(item6);
        item7 = new JMenuItem("Creador");
        item7.setFont(new Font("Andale Mono", 1, 14));
        item7.setForeground(Color.red);
        item7.addActionListener(this);
        menu3.add(item7);

        ImageIcon imagen = new ImageIcon("src/images/logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(10, 10, 240, 80);
        add(label1);
        label2 = new JLabel("Bienvenido " + Bienvenida.nombreUser);
        label2.setBounds(280, 30, 500, 50);
        label2.setFont(new Font("Andale Mono", 1, 32));
        label2.setForeground(Color.white);
        add(label2);
        label3 = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        label3.setBounds(45, 120, 600, 50);
        label3.setFont(new Font("Andale Mono", 0, 24));
        label3.setForeground(Color.white);
        add(label3);
        label4 = new JLabel("Nombre Completo:");
        label4.setBounds(25, 180, 200, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(Color.white);
        add(label4);
        jtext1 = new JTextField();
        jtext1.setBounds(25, 210, 150, 25);
        jtext1.setFont(new Font("Andale Mono", 1, 14));
        jtext1.setForeground(Color.red);
        jtext1.setBackground(new Color(224, 224, 224));
        add(jtext1);
        label5 = new JLabel("Apellido Paterno:");
        label5.setBounds(25, 240, 200, 30);
        label5.setFont(new Font("Andale Mono", 1, 12));
        label5.setForeground(Color.white);
        add(label5);
        jtext2 = new JTextField();
        jtext2.setBounds(25, 270, 150, 25);
        jtext2.setFont(new Font("Andale Mono", 1, 14));
        jtext2.setForeground(Color.red);
        jtext2.setBackground(new Color(224, 224, 224));
        add(jtext2);
        label6 = new JLabel("Apellido Materno:");
        label6.setBounds(25, 300, 200, 30);
        label6.setFont(new Font("Andale Mono", 1, 12));
        label6.setForeground(Color.white);
        add(label6);
        jtext3 = new JTextField();
        jtext3.setBounds(25, 330, 150, 25);
        jtext3.setFont(new Font("Andale Mono", 1, 14));
        jtext3.setForeground(Color.red);
        jtext3.setBackground(new Color(224, 224, 224));
        add(jtext3);

        label7 = new JLabel("Selecciona el Departamento:");
        label7.setBounds(220, 180, 200, 30);
        label7.setFont(new Font("Andale Mono", 1, 12));
        label7.setForeground(Color.white);
        add(label7);
        box1 = new JComboBox();
        box1.setBounds(220, 210, 230, 25);
        box1.setFont(new Font("Andale Mono", 1, 14));
        box1.setBackground(new Color(224, 224, 224));
        box1.setForeground(Color.red);
        add(box1);
        box1.addItem("");
        box1.addItem("Atención al Cliente");
        box1.addItem("Departamento de Logística");
        box1.addItem("Departamento de Gerencia");
        label8 = new JLabel("Selecciona la Antiguedad:");
        label8.setBounds(220, 240, 200, 30);
        label8.setFont(new Font("Andale Mono", 1, 12));
        label8.setForeground(Color.white);
        add(label8);
        box2 = new JComboBox();
        box2.setBounds(220, 270, 230, 25);
        box2.setFont(new Font("Andale Mono", 1, 14));
        box2.setBackground(new Color(224, 224, 224));
        box2.setForeground(Color.red);
        add(box2);
        box2.addItem("");
        box2.addItem("1 año de servicio");
        box2.addItem("2 a 6 años de servicio");
        box2.addItem("7 años o más de servicio");

        label9 = new JLabel("Resultado del Cálculo");
        label9.setBounds(220, 300, 200, 30);
        label9.setFont(new Font("Andale Mono", 1, 12));
        label9.setForeground(Color.white);
        add(label9);
        textArea = new JTextArea("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        textArea.setForeground(Color.red);
        textArea.setFont(new Font("Andale Mono", 1, 12));
        textArea.setEditable(false);
        scroll = new JScrollPane(textArea);
        scroll.setBounds(220, 330, 380, 80);
        scroll.setBackground(new Color(224, 224, 224));
        scroll.setFont(new Font("Andale Mono", 1, 12));
        scroll.setForeground(Color.red);
        add(scroll);

        label10 = new JLabel("©2023 The Coca-Cola Company | Todos los derechos reservados");
        label10.setBounds(120, 440, 400, 40);
        label10.setFont(new Font("Andale Mono", 1, 12));
        label10.setForeground(Color.white);
        add(label10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {//item Nuevo / limpiar campos de los componentes
            jtext1.setText("");
            jtext2.setText("");
            jtext3.setText("");
            box1.setSelectedIndex(0);
            box2.setSelectedIndex(0);
            textArea.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        }
        if (e.getSource() == item2) {//item Salir
            Bienvenida bienvenida = new Bienvenida();
            bienvenida.setBounds(0, 0, 350, 450);
            bienvenida.setVisible(true);
            bienvenida.setResizable(false);
            bienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == item3) {//item Rojo
            getContentPane().setBackground(Color.red);
        }
        if (e.getSource() == item4) {//item Negro
            getContentPane().setBackground(Color.black);
        }
        if (e.getSource() == item5) {//item Morado
            getContentPane().setBackground(new Color(51, 0, 51));
        }
        if (e.getSource() == item6) {//item Vacaciones
            String e1, e2, e3, e4, e5;
            e1 = jtext1.getText();
            e2 = jtext2.getText();
            e3 = jtext3.getText();
            e4 = box1.getSelectedItem().toString();//Obtenemos el String del ComboBox
            e5 = box2.getSelectedItem().toString();
            if (e1.isEmpty() || e2.isEmpty() || e3.isEmpty()
                    || e4.isEmpty() || e5.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            } else {
                if (e4.equals("Atención al Cliente")) {
                    if (e5.equals("1 año de servicio")) {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 6 días de Vacaciones");
                    } else if (e5.equals("2 a 6 años de servicio")) {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 14 días de Vacaciones");
                    } else {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 20 días de Vacaciones");
                    }

                } else if (e4.equals("Departamento de Logística")) {
                    if (e5.equals("1 año de servicio")) {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 7 días de Vacaciones");
                    } else if (e5.equals("2 a 6 años de servicio")) {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 15 días de Vacaciones");
                    } else {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 22 días de Vacaciones");
                    }
                } else {
                    if (e5.equals("1 año de servicio")) {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 10 días de Vacaciones");
                    } else if (e5.equals("2 a 6 años de servicio")) {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3 
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 20 días de Vacaciones");
                    } else {
                        textArea.setText("\n  El Usuario "+e1+" "+e2+" "+e3
                                + "\n quien trabaja en "+e4+" con "+e5
                                + "\n resives 30 días de Vacaciones");
                    }
                }
            }
        }
        if (e.getSource() == item7) {//item Creador
            JOptionPane.showMessageDialog(null, "Desarrollado por Johnny Benitez");
        }

    }

    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 650, 540);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);

    }
}
