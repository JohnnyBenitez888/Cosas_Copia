package bienvenida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import terminos_y_condiciones.Licencia;

public class Bienvenida extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4;
    private JTextField text;
    private JButton boton1;
    public static String nombreUser = "";

    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Para cerrar la interfaz 
        setTitle("Bienvenido");//Agregarle titulo a la interface
        getContentPane().setBackground(new Color(255, 0, 0));//Damos color a la interface
        setIconImage(new ImageIcon(getClass().getResource("..//images//icon.png")).getImage());//Cambiamos el logo de java

        ImageIcon imagen = new ImageIcon("src/images/logo-coca.png");//Colocar la ruta en un objeto imagen
        label1 = new JLabel(imagen);//colocar el objeto imageIcon en el Label (Insertar imagen en el Label)
        label1.setBounds(25, 15, 300, 150);
        add(label1);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));//Cambiar la fuente (letra)
        label2.setForeground(Color.WHITE);//cambiar el color de la fuente (letra)
        add(label2);

        label3 = new JLabel("Ingrese su nombre:");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(Color.WHITE);
        add(label3);

        text = new JTextField();//TextField
        text.setBounds(45, 240, 255, 25);
        text.setBackground(new Color(224, 224, 224));//Color del Text
        text.setFont(new Font("Andale Mono", 1, 14));
        text.setForeground(Color.RED);//Color de la letra del text
        add(text);

        boton1 = new JButton("Ingresar");//Button
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(Color.WHITE);//Color del boton
        boton1.setFont(new Font("AAndale Mono", 1, 14));//Tamaño y fuente del texto del boton
        boton1.setForeground(Color.red);//Color del texto del boton
        add(boton1);
        boton1.addActionListener(this);

        label4 = new JLabel("©2023 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(Color.WHITE);
        add(label4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            nombreUser = text.getText().trim();//el método trim quita espacios que el usuario haya agregado
            if (nombreUser.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else {
                Licencia licencia = new Licencia();
                licencia.setBounds(0, 0, 610, 370);
                licencia.setVisible(true);
                licencia.setResizable(false);
                licencia.setLocationRelativeTo(null);
                this.setVisible(false);//Ocultar la interface BIENVENIDA
            }

        }
    }

    public static void main(String[] args) {
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setBounds(0, 0, 350, 450);
        bienvenida.setVisible(true);
        bienvenida.setResizable(false);
        bienvenida.setLocationRelativeTo(null);

    }

}
