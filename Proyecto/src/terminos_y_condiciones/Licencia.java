package terminos_y_condiciones;

import bienvenida.Bienvenida;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import principal.Principal;

public class Licencia extends JFrame implements ChangeListener, ActionListener {

    private JLabel label1, label2;
    private JTextArea text;
    private JScrollPane barra;
    private JCheckBox check1;
    private JButton boton1, boton2;

    public Licencia() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Para cerrar la interfaz
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("..//images//icon.png")).getImage());
        getContentPane().setBackground(new Color(224, 224, 224));

        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(Color.BLACK);
        add(label1);

        text = new JTextArea();//TEXTAREA SIEMPRE EM CONJUNTO CON UN SCROLLPANE
        text.setEditable(false);//El user no puede editar el texto del textArea
        text.setFont(new Font("Andale Mono", 0, 9));
        text.setText("\n\n          TÉRMINOS Y CONDICIONES"
                + "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO."
                + "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."
                + "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."
                + "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"
                + "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED"
                + "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"
                + "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."
                + "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"
                + "\n          http://www.youtube.com/johnnybenitez888");
        text.setForeground(Color.black);
        barra = new JScrollPane(text);
        barra.setBounds(10, 40, 575, 200);
        add(barra);

        check1 = new JCheckBox("Yo " + Bienvenida.nombreUser + " Acepto");
        check1.setBounds(10, 250, 200, 30);
        check1.setFont(new Font("Andale Mono", 1, 12));
        check1.setForeground(Color.black);
        check1.setBackground(new Color(224, 224, 224));
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.setFont(new Font("Andale Mono", 1, 12));
        boton1.setEnabled(false);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.setFont(new Font("Andale Mono", 1, 12));
        boton2.addActionListener(this);
        add(boton2);

        ImageIcon imagen = new ImageIcon("src/images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        label2.setForeground(Color.red);
        add(label2);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected() == true) {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {//Boton Continuar a la sig Interface
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0, 0, 650, 540);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == boton2) {//Boton no Acepto, volver a la ant interface
            Bienvenida bienvenida = new Bienvenida();
            bienvenida.setBounds(0, 0, 350, 450);
            bienvenida.setVisible(true);
            bienvenida.setResizable(false);
            bienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Licencia licencia = new Licencia();
        licencia.setBounds(0, 0, 610, 370);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
    }

}
