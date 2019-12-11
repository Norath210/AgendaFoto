/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import ContactoDAO.ContactoDAO;
import ContactoDAO.ContactoDAOram;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Contacto;
import modelo.Tipo;

/**
 *
 * @author Castelao
 */
public class Principal extends javax.swing.JFrame {

    private enum Estado {
        NAVEGAR, EDITAR, BORRAR, AÑADIR
    }

    int indice;
    Estado e;  //Estado actual. Sólo se utiliza para decirle a aceptar y cancelar qué hacer
    ContactoDAO contactos = ContactoDAOram.getInstanceOf();//Instancia de clase que implemente la interfaz ContactoDAO
    List<Contacto> contactosArr; //Array de navegación

    public Principal() {
        indice = 0;
        initComponents();
        cBoxTipo.setModel(new DefaultComboBoxModel(Tipo.values()));
        fc.setCurrentDirectory(new File(".//"));
        contactosArr = contactos.getAllContacto();
        if (contactosArr.isEmpty()) {
            añadir();
        } else {
            mostrarContacto(recogerContacto(indice));
            navegar();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        txtTipo = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblApellido2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNif = new javax.swing.JTextField();
        cBoxTipo = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        pnlConfirm = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        txtTipo.setEditable(false);
        txtTipo.setText("Tipo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtApellido1.setEditable(false);
        txtApellido1.setText("Apellido1");

        txtApellido2.setEditable(false);
        txtApellido2.setText("Apellido2");

        txtTelefono.setEditable(false);
        txtTelefono.setText("Teléfono");

        txtFechaNacimiento.setEditable(false);
        txtFechaNacimiento.setText("Fecha");

        lblNombre.setText("Nombre:");

        lblApellido1.setText("Apellido1:");

        lblApellido2.setText("Apellido2");

        jLabel2.setText("Nacimiento: ");

        jLabel3.setText("Tipo: ");

        txtNombre.setEditable(false);
        txtNombre.setText("Nombre");

        btnPrimero.setText("||<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setText(">||");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefono:");

        jLabel4.setText("NIF");

        txtNif.setEditable(false);
        txtNif.setText("nif");

        cBoxTipo.setModel(cBoxTipo.getModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaNacimiento)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtNif)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtApellido2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        pnlConfirm.setEnabled(false);
        pnlConfirm.setOpaque(false);

        btnAceptar.setText("Aceptar");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfirmLayout = new javax.swing.GroupLayout(pnlConfirm);
        pnlConfirm.setLayout(pnlConfirmLayout);
        pnlConfirmLayout.setHorizontalGroup(
            pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar))
                .addGap(18, 18, 18)
                .addGroup(pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConfirmLayout.setVerticalGroup(
            pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(267, 267, 267))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(pnlConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addGap(26, 26, 26)
                        .addComponent(pnlConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private enum LetraDNI {
        /*
        Éste enumerado contiene los posibles valores de las letras del DNI en el orden que se usan
        en la codificación
        */
        T("T"), R("R"), W("W"), A("A"), G("G"), M("M"), Y("Y"), F("F"), P("P"), D("D"), X("X"), B("B"),
        N("N"), J("J"), Z("Z"), S("S"), Q("Q"), V("V"), H("H"), L("L"), C("C"), K("K"), E("E");
        private final String s;

        private LetraDNI(String s) {
            this.s = s;
        }

        public String toString() {
            return s;
        }

    };

    private static boolean validarNif(String nif) {        
        int size = nif.length();
        int suma = 0;
        String letra;
        
        /*
        Comprobación de los parámetros formales del nif
        */
        if (size != 9) { //Tamaño
            return false;
        }
        if (!Character.isLetter(nif.charAt(8))) { //Ultimo caracter es una letra
            return false;
        }      
        for (int i = 0; i < 8; i++) {  //Cada uno de los caracteres es un número
            if (!Character.isDigit(nif.charAt(i))) {
                return false;
            }
        }
        letra = nif.substring(8).toUpperCase();
        suma = Integer.parseInt(nif.substring(0, 8));
        LetraDNI[] dni = LetraDNI.values();

        suma = suma % dni.length;

        if (!letra.equals(dni[suma].toString())) {
            return false;
        }
        return true;
    }

    private void mostrarContacto(Contacto c) {
    /*
        Coloca el contacto que se le pase en los textFields para verlo en pantalla.
        También sirve para borrar los textfields        
    */
        if (c == null) {
            txtNombre.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            txtNif.setText("");
            txtFechaNacimiento.setText("");
            txtTelefono.setText("");
            cBoxTipo.setSelectedIndex(0);
            txtTipo.setText("");
            return;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtNombre.setText(c.getNombre());
        txtApellido1.setText(c.getApellido1());
        txtApellido2.setText(c.getApellido2());
        txtNif.setText(c.getNif());
        txtFechaNacimiento.setText(sdf.format(c.getFechaNacimiento()));
        txtTelefono.setText(c.getTelefono());
        txtTipo.setText(c.getTipo().toString().toLowerCase());
        cBoxTipo.setSelectedItem(c.getTipo());
    }

    private Contacto recogerContacto(int i) {
        //Recoge el objeto contacto que se halle en el array de navegación
        if (i < 0 || i > contactosArr.size()) {
            return null;
        }
        return contactosArr.get(i);

    }

    private boolean addElemento() {
        if (!validarNif(txtNif.getText())) {
            JOptionPane.showMessageDialog(null, "DNI no Válido");
            return false;
        }

        for (Contacto c : contactosArr) {
            if (c.getNif().equals(txtNif.getText())) {
                JOptionPane.showMessageDialog(null, "DNI repetido");
                return false;
            }
        }
        /*
            Si el DNI ya existe en el array de navegación o no es válido se sale
            sin guardar
        */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Contacto c = new Contacto();
        sdf.setLenient(false);
        Date fecha;
        c.setNombre(txtNombre.getText());
        c.setApellido1(txtApellido1.getText());
        c.setApellido2(txtApellido2.getText());
        c.setTelefono(txtTelefono.getText());
        c.setNif(txtNif.getText());
        try {
            fecha = sdf.parse(txtFechaNacimiento.getText());
            c.setFechaNacimiento(fecha);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Fecha no Válida");
            System.err.println("Error en el formato de fecha ");
            return false;
        }
        /*
            Si la fecha tiene un formato no válido da un aviso y sale sin 
            guardar
        */

        c.setTipo((Tipo) cBoxTipo.getSelectedItem());
        contactos.addContacto(c);
        contactosArr = contactos.getAllContacto();
        return true;
    }

    private void editarContacto(Contacto c) {               
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date fecha;
        try {
            fecha = sdf.parse(txtFechaNacimiento.getText());
            c.setFechaNacimiento(fecha);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Fecha no Válida");
            System.err.println("Error en el formateo de fecha ");
            return;
        }
        //Sale sin editar si la fecha tiene un formato no válido
        
        c.setNombre(txtNombre.getText());
        c.setApellido1(txtApellido1.getText());
        c.setApellido2(txtApellido2.getText());
        c.setTelefono(txtTelefono.getText());
        try {
            fecha = sdf.parse(txtFechaNacimiento.getText());
            c.setFechaNacimiento(fecha);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Fecha no Válida");
            System.err.println("Error en el formateo de fecha ");
        }
        c.setTipo((Tipo) cBoxTipo.getSelectedItem());
        /*
            El contacto ya está editado en el array de navegación, se actualiza en el origen de datos
            con updateContacto();
        */
        contactos.updateContacto(c); 
    }

    private void activarNavegacion(boolean opt) {
        /*
            Función para activar/desactivar los botones de nav
        */
        btnAnterior.setEnabled(opt);
        btnSiguiente.setEnabled(opt);
        btnUltimo.setEnabled(opt);
        btnPrimero.setEnabled(opt);
    }

    private void activarConfirmacion(boolean opt) {
        /*
            Función para activar/desactivar los botones de confirmación
        */
        btnAceptar.setEnabled(opt);
        btnCancelar.setEnabled(opt);
    }

    private void activarBotones(boolean opt) {
        /*
            Función para activar/desactivar los botones cambio de estado
        */
        btnEditar.setEnabled(opt);
        btnBorrar.setEnabled(opt);
        btnAñadir.setEnabled(opt);
    }

    private void activarTexto(boolean opt) {
        /*
            Función para activar/desactivar campos de texto y el combobox
        */
        txtNombre.setEditable(opt);
        txtApellido1.setEditable(opt);
        txtApellido2.setEditable(opt);
        txtFechaNacimiento.setEditable(opt);
        txtNif.setEditable(opt);
        txtTelefono.setEditable(opt);
        txtTipo.setEditable(opt);
        cBoxTipo.setEnabled(opt);
    }

    private void navegar() {
        //Cambio a estado navegar
        activarConfirmacion(false);
        activarBotones(true);
        activarNavegacion(true);
        activarTexto(false);
        e = Estado.NAVEGAR;
        mostrarContacto(recogerContacto(indice));
    }

    private void borrar() {
        //Cambio a estado borrar
        activarConfirmacion(true);
        activarBotones(false);
        activarNavegacion(false);
        e = Estado.BORRAR;
    }

    private void editar() {
        //Cambio a estado edición
        activarTexto(true);
        txtNif.setEditable(false);
        activarConfirmacion(true);
        activarBotones(false);
        activarNavegacion(false);
        e = Estado.EDITAR;
    }

    private void añadir() {
        //Cambio a estado añadir
        mostrarContacto(null);
        activarTexto(true);
        activarConfirmacion(true);
        activarBotones(false);
        activarNavegacion(false);
        e = Estado.AÑADIR;
    }

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        indice = 0;
        mostrarContacto(recogerContacto(indice));
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        indice = contactosArr.size() - 1;
        mostrarContacto(recogerContacto(indice));
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (indice == 0) {
            return;
        }
        indice--;
        mostrarContacto(recogerContacto(indice));
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (indice == contactosArr.size() - 1) {
            return;
        }
        indice++;
        mostrarContacto(recogerContacto(indice));
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        añadir();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        borrar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        switch (e) {
            case EDITAR:

            case AÑADIR:
                if (contactos.getAllContacto().isEmpty()) {
                    añadir();
                } else {
                    navegar();
                }
                break;
            case BORRAR:
                break;
            case NAVEGAR:
                System.err.println("Si sale por aquí dejo el ciclo");
                break;
            default:
                System.err.println("Estado nulo. Tampoco debería");
                break;
        }
        if (contactos.getAllContacto().isEmpty()) {
            añadir();
        } else {
            navegar();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        switch (e) {
            case EDITAR:
                Contacto c = recogerContacto(indice);
                editarContacto(c);

                navegar();
                break;
            case AÑADIR:
                if (addElemento()) {
                    if (contactos.getAllContacto().isEmpty()) {
                        añadir();
                    } else {
                        navegar();
                    }
                }
                break;
            case BORRAR:
                contactos.getAllContacto().remove(indice);
                indice = 0;
                if (!contactos.getAllContacto().isEmpty()) {
                    mostrarContacto(recogerContacto(indice));
                    navegar();
                } else {
                    añadir();
                }
                break;
            case NAVEGAR:
                System.err.println("Si sale por aquí dejo el ciclo");
                break;
            default:
                System.err.println("Estado nulo. Tampoco debería");
                break;
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        File file;
        fc.showOpenDialog(null);
        file = fc.getSelectedFile();
        try (ObjectInputStream cargar = new ObjectInputStream(new FileInputStream(file))) {
            /*
                Al integrar con un DAO lo que hace la función cargar es comprobar lo que hay en el archivo
                contra lo que haya en el origen de datos y actualizar o añadir según sea pertinente
             */
            List<Contacto> datosEnArchivo = (ArrayList<Contacto>) cargar.readObject();
            List<Contacto> datosEnOrigen = contactos.getAllContacto();
            for (Contacto c : datosEnArchivo) {
                if (datosEnOrigen.contains(c)) {
                    contactos.updateContacto(c);
                } else {
                    contactos.addContacto(c);
                }
            }
            contactosArr = contactos.getAllContacto();
            navegar();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Atención", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "El archivo no es del tipo correcto", "Atención", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            System.err.println(ex.getMessage()); //Mensaje en consola sólo para control
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "El archivo no es del tipo correcto", "Atención", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        File file;
        fc.showSaveDialog(null);
        file = fc.getSelectedFile();
        try (ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream(file, false))) {
            guardar.writeObject(contactos.getAllContacto());            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "No ha seleccionado un archivo o nombre válido",  "Atención",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error de entrada/salida", "Atención", JOptionPane.ERROR_MESSAGE);
        }catch (NullPointerException ex) {
            System.err.println(ex.getMessage()); //Mensaje en consola sólo para control
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<Tipo> cBoxTipo;
    private javax.swing.JFileChooser fc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlConfirm;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNif;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

}
