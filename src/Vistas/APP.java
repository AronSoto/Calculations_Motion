/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
 
import Clases.Operacion;
import Clases.OperacionDistancia;
import Clases.OperacionTiempo;
import Clases.OperacionTiempoAlcance;
import Clases.OperacionTiempoEncuentro;
import Clases.OperacionVelocidad;
import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class APP extends javax.swing.JFrame {

    private DefaultTableModel tblModel;

    OperacionVelocidad operacionVelocidad = new OperacionVelocidad();
    OperacionTiempo operacionTiempo = new OperacionTiempo();
    OperacionDistancia operacionDistancia = new OperacionDistancia();

    int tp;
    DecimalFormat decimalFormato = new DecimalFormat("#.####");

    // Crear el historial
    private JTextArea txtSolucion;

    // Crear el modelo de la tabla
    public APP() {
        initComponents();
        panelPrincipal.setVisible(true);
        panelDistancia.setVisible(false);
        panelRespuestaV.setVisible(true);
        panelVelocidad.setVisible(false);
        panelTiempo.setVisible(false);
        panelRespuestaV.setVisible(false);
        panelRespuestaD.setVisible(false);
        panelRespuestaT.setVisible(false);

    }

    void muestra(String cad) {
        //primero detectar la ubicacion de la imagen
        ImageIcon img = new ImageIcon(getClass().getResource("/img/" + cad + ".png"));
        //definir la escala
        Image escala = img.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(),
                Image.SCALE_SMOOTH);
        //muestra la imagen en la etiqueta
        lbImg.setIcon(new ImageIcon(escala));
        this.setLocationRelativeTo(lbImg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cbFormula = new javax.swing.JComboBox<>();
        tbHistorial = new javax.swing.JScrollPane();
        tblRegister = new javax.swing.JTable();
        lbImg = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        panelVelocidad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtVelocidad = new javax.swing.JTextField();
        cbVelocidad = new javax.swing.JComboBox<>();
        panelDistancia = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        cbDistancia = new javax.swing.JComboBox<>();
        panelTiempo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        cbTiempo = new javax.swing.JComboBox<>();
        panelRespuestaV = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbResV = new javax.swing.JLabel();
        cbResV = new javax.swing.JComboBox<>();
        panelRespuestaT = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbResT = new javax.swing.JLabel();
        cbResT = new javax.swing.JComboBox<>();
        panelRespuestaD = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbResD = new javax.swing.JLabel();
        cbResD = new javax.swing.JComboBox<>();
        panelResConversion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbResConvertida = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnLimpiartxtArea = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        imgAlcance = new javax.swing.JLabel();
        btnSalirTa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtV1a = new javax.swing.JTextField();
        txtV2a = new javax.swing.JTextField();
        txtDisV1V2a = new javax.swing.JTextField();
        cbV1a = new javax.swing.JComboBox<>();
        cbV2a = new javax.swing.JComboBox<>();
        cbDisV1V2a = new javax.swing.JComboBox<>();
        btnCalcularAlcance = new javax.swing.JButton();
        btnLimpiarTA = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbResAlcance = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imgEncuentro = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtV1e = new javax.swing.JTextField();
        txtV2e = new javax.swing.JTextField();
        txtDisV1V2e = new javax.swing.JTextField();
        cbV1e = new javax.swing.JComboBox<>();
        cbV2e = new javax.swing.JComboBox<>();
        cbDisV1V2e = new javax.swing.JComboBox<>();
        btnCalcularEncuentro = new javax.swing.JButton();
        btnLimpiarTE = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lbResEncuentro = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnSalirTe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Calculadora Cinemática");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbFormula.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        cbFormula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Velocidad", "Tiempo", "Distancia" }));
        cbFormula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormulaActionPerformed(evt);
            }
        });

        tbHistorial.setBackground(new java.awt.Color(255, 255, 255));
        tbHistorial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbHistorial.setForeground(new java.awt.Color(0, 51, 51));
        tbHistorial.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N

        tblRegister.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operacion", "Velocidad", "Tiempo", "Distancia", "Resultado"
            }
        ));
        tbHistorial.setViewportView(tblRegister);

        lbImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Introducir valores"));
        panelPrincipal.setForeground(new java.awt.Color(0, 0, 0));

        panelVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        panelVelocidad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabel3.setText("Velocidad");

        txtVelocidad.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        txtVelocidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVelocidadKeyTyped(evt);
            }
        });

        cbVelocidad.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        cbVelocidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h" }));

        javax.swing.GroupLayout panelVelocidadLayout = new javax.swing.GroupLayout(panelVelocidad);
        panelVelocidad.setLayout(panelVelocidadLayout);
        panelVelocidadLayout.setHorizontalGroup(
            panelVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVelocidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVelocidadLayout.setVerticalGroup(
            panelVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVelocidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDistancia.setBackground(new java.awt.Color(255, 255, 255));
        panelDistancia.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabel4.setText("Distancia");

        txtDistancia.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        txtDistancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistanciaKeyTyped(evt);
            }
        });

        cbDistancia.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        cbDistancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));

        javax.swing.GroupLayout panelDistanciaLayout = new javax.swing.GroupLayout(panelDistancia);
        panelDistancia.setLayout(panelDistanciaLayout);
        panelDistanciaLayout.setHorizontalGroup(
            panelDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistanciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDistanciaLayout.setVerticalGroup(
            panelDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistanciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDistanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTiempo.setBackground(new java.awt.Color(255, 255, 255));
        panelTiempo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabel5.setText("Tiempo");

        txtTiempo.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        txtTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTiempoKeyTyped(evt);
            }
        });

        cbTiempo.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        cbTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "s", "h" }));

        javax.swing.GroupLayout panelTiempoLayout = new javax.swing.GroupLayout(panelTiempo);
        panelTiempo.setLayout(panelTiempoLayout);
        panelTiempoLayout.setHorizontalGroup(
            panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelTiempoLayout.setVerticalGroup(
            panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRespuestaV.setBackground(new java.awt.Color(255, 255, 255));
        panelRespuestaV.setForeground(new java.awt.Color(0, 0, 0));
        panelRespuestaV.setPreferredSize(new java.awt.Dimension(203, 43));

        jLabel2.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabel2.setText("Resp:");

        lbResV.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        lbResV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbResV.setPreferredSize(new java.awt.Dimension(15, 29));

        cbResV.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        cbResV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h" }));
        cbResV.setPreferredSize(new java.awt.Dimension(62, 26));
        cbResV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbResVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRespuestaVLayout = new javax.swing.GroupLayout(panelRespuestaV);
        panelRespuestaV.setLayout(panelRespuestaVLayout);
        panelRespuestaVLayout.setHorizontalGroup(
            panelRespuestaVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRespuestaVLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbResV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbResV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRespuestaVLayout.setVerticalGroup(
            panelRespuestaVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRespuestaVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRespuestaVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbResV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbResV, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRespuestaT.setBackground(new java.awt.Color(255, 255, 255));
        panelRespuestaT.setForeground(new java.awt.Color(0, 0, 0));
        panelRespuestaT.setPreferredSize(new java.awt.Dimension(203, 43));

        jLabel6.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabel6.setText("Resp");

        lbResT.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        lbResT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbResT.setPreferredSize(new java.awt.Dimension(15, 29));

        cbResT.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        cbResT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "s", "h" }));

        javax.swing.GroupLayout panelRespuestaTLayout = new javax.swing.GroupLayout(panelRespuestaT);
        panelRespuestaT.setLayout(panelRespuestaTLayout);
        panelRespuestaTLayout.setHorizontalGroup(
            panelRespuestaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRespuestaTLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbResT, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRespuestaTLayout.setVerticalGroup(
            panelRespuestaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRespuestaTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRespuestaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRespuestaTLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbResT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRespuestaTLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbResT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelRespuestaD.setBackground(new java.awt.Color(255, 255, 255));
        panelRespuestaD.setForeground(new java.awt.Color(0, 0, 0));
        panelRespuestaD.setPreferredSize(new java.awt.Dimension(203, 43));

        jLabel7.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabel7.setText("Resp");

        lbResD.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        lbResD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbResD.setPreferredSize(new java.awt.Dimension(15, 29));

        cbResD.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        cbResD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));

        javax.swing.GroupLayout panelRespuestaDLayout = new javax.swing.GroupLayout(panelRespuestaD);
        panelRespuestaD.setLayout(panelRespuestaDLayout);
        panelRespuestaDLayout.setHorizontalGroup(
            panelRespuestaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRespuestaDLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lbResD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbResD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRespuestaDLayout.setVerticalGroup(
            panelRespuestaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRespuestaDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRespuestaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbResD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbResD)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelResConversion.setBackground(new java.awt.Color(255, 255, 255));
        panelResConversion.setForeground(new java.awt.Color(0, 0, 0));
        panelResConversion.setPreferredSize(new java.awt.Dimension(203, 43));

        jLabel8.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Conversion");

        lbResConvertida.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        lbResConvertida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbResConvertida.setPreferredSize(new java.awt.Dimension(15, 29));

        javax.swing.GroupLayout panelResConversionLayout = new javax.swing.GroupLayout(panelResConversion);
        panelResConversion.setLayout(panelResConversionLayout);
        panelResConversionLayout.setHorizontalGroup(
            panelResConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResConversionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResConvertida, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelResConversionLayout.setVerticalGroup(
            panelResConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResConversionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbResConvertida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelResConversionLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelResConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRespuestaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRespuestaT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRespuestaV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelDistancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelRespuestaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRespuestaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Solución"));

        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        txtArea.setForeground(new java.awt.Color(0, 0, 204));
        txtArea.setRows(5);
        jScrollPane3.setViewportView(txtArea);

        btnLimpiartxtArea.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiartxtArea.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnLimpiartxtArea.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiartxtArea.setText("Limpiar");
        btnLimpiartxtArea.setPreferredSize(new java.awt.Dimension(47, 29));
        btnLimpiartxtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiartxtAreaActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrar.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.setPreferredSize(new java.awt.Dimension(47, 29));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 153, 51));
        btnReset.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Resetear");
        btnReset.setPreferredSize(new java.awt.Dimension(47, 29));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(47, 29));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiartxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 1, Short.MAX_VALUE)
                                        .addComponent(tbHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFormula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular))
                            .addComponent(tbHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiartxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tbHistorial.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("MRU", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        imgAlcance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tiempoAlcance.jpg"))); // NOI18N
        imgAlcance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgAlcance.setMaximumSize(new java.awt.Dimension(284, 724));
        imgAlcance.setMinimumSize(new java.awt.Dimension(724, 724));

        btnSalirTa.setBackground(new java.awt.Color(153, 0, 0));
        btnSalirTa.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        btnSalirTa.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirTa.setText("Salir");
        btnSalirTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirTaActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Ingrese datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Light", 0, 18))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel11.setText("Velocidad  del Móvil #1 (V1): ");

        jLabel12.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel12.setText("Velocidad del Móvil #2 (V2):");

        jLabel13.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel13.setText("Distancia en la que se encuentran:");

        txtV1a.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        txtV1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtV1aActionPerformed(evt);
            }
        });
        txtV1a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtV1aKeyTyped(evt);
            }
        });

        txtV2a.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        txtV2a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtV2aKeyTyped(evt);
            }
        });

        txtDisV1V2a.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        txtDisV1V2a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisV1V2aKeyTyped(evt);
            }
        });

        cbV1a.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        cbV1a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h" }));

        cbV2a.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        cbV2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h" }));

        cbDisV1V2a.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        cbDisV1V2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));

        btnCalcularAlcance.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcularAlcance.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        btnCalcularAlcance.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularAlcance.setText("Calcular");
        btnCalcularAlcance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAlcanceActionPerformed(evt);
            }
        });

        btnLimpiarTA.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiarTA.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        btnLimpiarTA.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarTA.setText("Limpiar");
        btnLimpiarTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtV1a, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbV1a, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtV2a, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbV2a, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtDisV1V2a, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDisV1V2a, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiarTA, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcularAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtV1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbV1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtV2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbV2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisV1V2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbDisV1V2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcularAlcance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Light", 0, 18))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel14.setText("El tiempo de alcance es de :");

        lbResAlcance.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        lbResAlcance.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirTa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(imgAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirTa))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tiempo de Alcance", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        imgEncuentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tiempoEncuentro.jpg"))); // NOI18N
        imgEncuentro.setText("jLabel11");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Introducir datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Light", 0, 18))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel15.setText("Velocidad del móvil #1 (V1):");

        jLabel16.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel16.setText("Velocidad del móvil #2 (V2):");

        jLabel17.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel17.setText("Distancia que los separa:");

        txtV1e.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        txtV1e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtV1eKeyTyped(evt);
            }
        });

        txtV2e.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        txtV2e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtV2eKeyTyped(evt);
            }
        });

        txtDisV1V2e.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        txtDisV1V2e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisV1V2eKeyTyped(evt);
            }
        });

        cbV1e.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        cbV1e.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h" }));

        cbV2e.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        cbV2e.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h" }));

        cbDisV1V2e.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        cbDisV1V2e.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));

        btnCalcularEncuentro.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcularEncuentro.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        btnCalcularEncuentro.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularEncuentro.setText("Calcular");
        btnCalcularEncuentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularEncuentroActionPerformed(evt);
            }
        });

        btnLimpiarTE.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiarTE.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        btnLimpiarTE.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarTE.setText("Limpiar");
        btnLimpiarTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnLimpiarTE, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcularEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtV1e, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbV1e, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtV2e, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbV2e, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtDisV1V2e, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbDisV1V2e, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtV1e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbV1e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtV2e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbV2e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtDisV1V2e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDisV1V2e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularEncuentro)
                    .addComponent(btnLimpiarTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Light", 0, 18))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        lbResEncuentro.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        lbResEncuentro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel18.setText("El tiempo de encuentro es de:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbResEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel18)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        btnSalirTe.setBackground(new java.awt.Color(153, 0, 0));
        btnSalirTe.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        btnSalirTe.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirTe.setText("Salir");
        btnSalirTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirTeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirTe, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(imgEncuentro)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalirTe)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tiempo de encuentro", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFormulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormulaActionPerformed
        String cad = cbFormula.getSelectedItem().toString();

        if (cbFormula.getSelectedIndex() == 1) {//VELOCIDAD
            muestra(cad);
            panelVelocidad.setVisible(false);
            panelTiempo.setVisible(true);
            panelDistancia.setVisible(true);
            panelRespuestaV.setVisible(true);
            panelRespuestaD.setVisible(false);
            panelRespuestaT.setVisible(false);

        } else if (cbFormula.getSelectedIndex() == 2) { //TIEMPO
            muestra(cad);
            panelVelocidad.setVisible(true);
            panelTiempo.setVisible(false);
            panelDistancia.setVisible(true);
            panelRespuestaD.setVisible(false);
            panelRespuestaV.setVisible(false);
            panelRespuestaT.setVisible(true);

        } else if (cbFormula.getSelectedIndex() == 3) { //DISTANCIA
            muestra(cad);
            panelVelocidad.setVisible(true);
            panelTiempo.setVisible(true);
            panelDistancia.setVisible(false);
            panelRespuestaD.setVisible(true);
            panelRespuestaV.setVisible(false);
            panelRespuestaT.setVisible(false);

        }

    }//GEN-LAST:event_cbFormulaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String cad = cbFormula.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) tblRegister.getModel(); // Obtener el modelo de tabla asociado a tu JTable
        String uniVel = cbVelocidad.getSelectedItem().toString();
        String uniDis = cbDistancia.getSelectedItem().toString();
        String uniTiem = cbTiempo.getSelectedItem().toString();
        String uniResV = cbResV.getSelectedItem().toString();
        String uniResD = cbResD.getSelectedItem().toString();
        String uniResT = cbResT.getSelectedItem().toString();

        double respuestaConvertida = 0.0;

        if (cad.equals("Velocidad")) {

            String distanciaTexto = txtDistancia.getText();
            String tiempoTexto = txtTiempo.getText();

            if (!distanciaTexto.isEmpty() && !tiempoTexto.isEmpty()) {
                double distancia = Double.parseDouble(distanciaTexto);
                double tiempo = Double.parseDouble(tiempoTexto);

                operacionVelocidad = new OperacionVelocidad(distancia, tiempo);
                operacionVelocidad.calcular();

                double respuesta = operacionVelocidad.getResultado();

                //PARA LA UNIDAD DE MEDIDA DEL LB DE RESPUESTA
                String unidadSeleccionada, medida;

                if (uniDis == "km" && uniTiem == "s" || uniDis == "m" && uniTiem == "h") {
                    JOptionPane.showMessageDialog(this, "Los unidades de medida no son correctas.", "Error", JOptionPane.ERROR_MESSAGE);

                } else {

                    if (uniDis == "km" && uniTiem == "h") {
                        medida = "km/h";
                    } else {
                        medida = "m/s";
                    }

                    lbResV.setText(decimalFormato.format(respuesta) + medida);

                    // Agregar los datos a la tabla
                    Object[] fila = {cad, "-", tiempo + uniTiem, distancia + uniDis, decimalFormato.format(respuesta) + medida};
                    // Agregar los datos convertidos a la tabla 
                    if (uniResV == medida) {
                        lbResConvertida.setText(decimalFormato.format(respuesta) + " " + uniResV);
                        model.addRow(fila);

                    } else if (uniResV.equals("km/h")) {
                        respuestaConvertida = operacionVelocidad.convertirAKilometrosPorHora();
                        lbResConvertida.setText(decimalFormato.format(respuestaConvertida) + " " + uniResV);
                        Object[] fila1 = {cad, "-", tiempo + uniTiem, distancia + uniDis, decimalFormato.format(respuestaConvertida) + uniResV};
                        model.addRow(fila1);
                    } else {
                        respuestaConvertida = operacionVelocidad.convertirAMetrosPorSegundo(); // Mantener la respuesta original si no se requiere conversión
                        lbResConvertida.setText(decimalFormato.format(respuestaConvertida) + " " + uniResV);
                        Object[] fila1 = {cad, "-", tiempo + uniTiem, distancia + uniDis, decimalFormato.format(respuestaConvertida) + uniResV};
                        model.addRow(fila1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese los datos completos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (cad.equals("Distancia")) {
            String velocidadTexto = txtVelocidad.getText();
            String tiempoTexto = txtTiempo.getText();

            if (!velocidadTexto.isEmpty() && !tiempoTexto.isEmpty()) {
                double velocidad = Double.parseDouble(velocidadTexto);
                double tiempo = Double.parseDouble(tiempoTexto);

                //Recoger valores para realizar el calculo
                OperacionDistancia operacionDistancia = new OperacionDistancia(tiempo, velocidad);
                operacionDistancia.calcular();

                // Realizar cálculos y obtener la respuesta de la operación de velocidad
                double respuesta = operacionDistancia.getResultado();

                //mostrar unidad de acuerdo a la seleccion de unidades 
                String unidadSeleccionada, medida;

                if (uniVel == "km/h" && uniTiem == "s" || uniVel == "m/s" && uniTiem == "h") {
                    JOptionPane.showMessageDialog(this, "Los unidades de medida no son correctas.", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    if (uniVel == "km/h" && uniTiem == "h") {
                        medida = "km";
                    } else {
                        medida = "m";
                    }

                    //Mostrar en label de respuesta 
                    lbResD.setText(decimalFormato.format(respuesta) + medida);

                    // Agregar los datos a la tabla
                    Object[] fila = {cad, velocidad + uniVel, tiempo + uniTiem, "-", operacionDistancia.getResultado() + medida};

                    // Agregar los datos a la tabla
                    if (uniResD == medida) {
                        lbResConvertida.setText(decimalFormato.format(respuesta) + " " + uniResD);
                        model.addRow(fila);
                    } else if (uniResD.equals("km")) {
                        respuestaConvertida = operacionDistancia.convertirMetrosAKilometros();
                        lbResConvertida.setText(decimalFormato.format(respuestaConvertida) + " " + uniResD);
                        Object[] fila1 = {cad, velocidad + uniVel, tiempo + uniTiem, "-", decimalFormato.format(respuestaConvertida) + uniResD};
                        model.addRow(fila1);

                    } else {
                        respuestaConvertida = operacionDistancia.convertirKilometrosAMetros(); // Mantener la respuesta original si no se requiere conversión
                        lbResConvertida.setText(decimalFormato.format(respuestaConvertida) + " " + uniResD);
                        Object[] fila1 = {cad, velocidad + uniVel, tiempo + uniTiem, "-", decimalFormato.format(respuestaConvertida) + uniResD};
                        model.addRow(fila1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese los datos completos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (cad.equals("Tiempo")) {
            String distanciaTexto = txtDistancia.getText();
            String velocidadTexto = txtVelocidad.getText();

            if (!distanciaTexto.isEmpty() && !velocidadTexto.isEmpty()) {
                double distancia = Double.parseDouble(distanciaTexto);
                double velocidad = Double.parseDouble(velocidadTexto);

                //Se necesita un constructor para recoger las variables
                OperacionTiempo operacionTiempo = new OperacionTiempo(distancia, velocidad);
                operacionTiempo.calcular();

                // Realizar cálculos y obtener la respuesta de la operación de velocidad
                double respuesta = operacionTiempo.getResultado();

                String unidadSeleccionada, medida;

                //mostrar unidad de acuerdo a la seleccion de unidades 
                if (uniVel == "m/s" && uniDis == "h" || uniVel == "km/h" && uniDis == "m") {
                    JOptionPane.showMessageDialog(this, "Los unidades de medida no son correctas.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    if (uniDis == "km" && uniVel == "km/h") {
                        medida = "h";
                    } else {
                        medida = "s";
                    }
                    lbResT.setText(decimalFormato.format(respuesta) + medida);

                    // Agregar los datos a la tabla
                    Object[] fila = {cad, velocidad + uniVel, "-1", distancia + uniDis, decimalFormato.format(respuesta) + medida};

                    // Agregar los datos convertidos a la tabla
                    if (uniResT == medida) {
                        lbResConvertida.setText(decimalFormato.format(respuesta) + " " + uniResT);
                        model.addRow(fila);

                    } else if (uniResT.equals("h")) {
                        respuestaConvertida = operacionTiempo.convertirSegundosAHoras();
                        lbResConvertida.setText(decimalFormato.format(respuestaConvertida) + " " + uniResT);
                        Object[] fila1 = {cad, velocidad + uniVel, "-", distancia + uniDis, decimalFormato.format(respuestaConvertida) + " " + uniResT};
                        model.addRow(fila1);
                    } else {
                        respuestaConvertida = operacionTiempo.convertirHorasaSegundos(); // Mantener la respuesta original si no se requiere conversión
                        lbResConvertida.setText(Double.toString(respuestaConvertida) + " " + uniResT);
                        Object[] fila1 = {cad, velocidad + uniVel, "-", distancia + uniDis, decimalFormato.format(respuestaConvertida) + " " + uniResT};
                        model.addRow(fila1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese los datos completos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        ;
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:

        lbImg.setText("");
        txtVelocidad.setText("");
        txtDistancia.setText("");
        txtTiempo.setText("");

        cbDistancia.setSelectedIndex(0);
        cbTiempo.setSelectedIndex(0);
        cbVelocidad.setSelectedIndex(0);

        cbResD.setSelectedIndex(0);
        cbResT.setSelectedIndex(0);
        cbResV.setSelectedIndex(0);

        lbResV.setText("");
        lbResD.setText("");
        lbResT.setText("");
        lbResConvertida.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbResVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbResVActionPerformed

    }//GEN-LAST:event_cbResVActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        if (cbFormula.getSelectedIndex() == 1) {
            String distanciaTexto = txtDistancia.getText();
            double distancia = Double.parseDouble(distanciaTexto);
            String tiempoTexto = txtTiempo.getText();
            double tiempo = Double.parseDouble(tiempoTexto);
            String solucionVelocidad = operacionVelocidad.solucionPasoAPaso(distancia, tiempo, lbResV.getText());
            txtArea.setText(solucionVelocidad);

        } else if (cbFormula.getSelectedIndex() == 2) {
            String distanciaTexto = txtDistancia.getText();
            double distancia = Double.parseDouble(distanciaTexto);
            String velocidadTexto = txtVelocidad.getText();
            double velocidad = Double.parseDouble(velocidadTexto);
            String solucionTiempo = operacionTiempo.solucionPasoAPaso(distancia, velocidad, lbResT.getText());

            txtArea.setText(solucionTiempo);
        } else {
            String velocidadTexto = txtVelocidad.getText();
            double velocidad = Double.parseDouble(velocidadTexto);
            String tiempoTexto = txtTiempo.getText();
            double tiempo = Double.parseDouble(tiempoTexto);
            String solucionDistancia = operacionDistancia.solucionPasoAPaso(tiempo, velocidad, lbResD.getText());

            txtArea.setText(solucionDistancia);
        }


    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiartxtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiartxtAreaActionPerformed
        txtArea.setText("");
    }//GEN-LAST:event_btnLimpiartxtAreaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblRegister.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_btnResetActionPerformed

    private void txtVelocidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVelocidadKeyTyped

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }


    }//GEN-LAST:event_txtVelocidadKeyTyped

    private void txtDistanciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistanciaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }

    }//GEN-LAST:event_txtDistanciaKeyTyped

    private void txtTiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_txtTiempoKeyTyped

    private void txtV1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtV1aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtV1aActionPerformed

    private void btnCalcularAlcanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAlcanceActionPerformed
        double velocidad1 = Double.parseDouble(txtV1a.getText());
        double velocidad2 = Double.parseDouble(txtV2a.getText());
        double distanciaE = Double.parseDouble(txtDisV1V2a.getText());

        String uniVel1 = cbV1a.getSelectedItem().toString();
        String uniVel2 = cbV2a.getSelectedItem().toString();
        String uniDisV1V2 = cbDisV1V2a.getSelectedItem().toString();

        OperacionTiempoAlcance operacion = new OperacionTiempoAlcance(velocidad1, velocidad2, distanciaE, "");
        operacion.calcular();

        double resultado = operacion.getResultado();

        DecimalFormat decimalFormato = new DecimalFormat("#.##");
        String resultadoFormateado = decimalFormato.format(resultado);

        if (velocidad2 < velocidad1) {
            JOptionPane.showMessageDialog(this, "La velocidad 2 debe ser mayor que la velocidad 1.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (uniVel1 == "m/s" && uniVel2 == "m/s" && uniDisV1V2 == "m") {
            lbResAlcance.setText(resultadoFormateado + " s");
        } else if (uniVel1 == "km/h" && uniVel2 == "km/h" && uniDisV1V2 == "km") {
            lbResAlcance.setText(resultadoFormateado + " h");
        } else {
            JOptionPane.showMessageDialog(this, "Las unidades de medida seleccionadas no son correctas.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCalcularAlcanceActionPerformed

    private void btnCalcularEncuentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularEncuentroActionPerformed
        // TODO add your handling code here:
        double velocidad1 = Double.parseDouble(txtV1e.getText());
        double velocidad2 = Double.parseDouble(txtV2e.getText());
        double distanciaE = Double.parseDouble(txtDisV1V2e.getText());

        String uniVel1 = cbV1e.getSelectedItem().toString();
        String uniVel2 = cbV2e.getSelectedItem().toString();
        String uniDisV1V2 = cbDisV1V2e.getSelectedItem().toString();

        OperacionTiempoEncuentro operacion = new OperacionTiempoEncuentro(velocidad1, velocidad2, distanciaE, "");
        operacion.calcular();
        double resultado = operacion.getResultado();

        String resultadoFormateado = decimalFormato.format(resultado);

        if (uniVel1 == "m/s" && uniVel2 == "m/s" && uniDisV1V2 == "m") {
            lbResEncuentro.setText(resultadoFormateado + " s");
        } else if (uniVel1 == "km/h" && uniVel2 == "km/h" && uniDisV1V2 == "km") {
            lbResEncuentro.setText(resultadoFormateado + " h");
        } else {
            JOptionPane.showMessageDialog(this, "Las unidades de medida seleccionadas no son correctas.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCalcularEncuentroActionPerformed

    private void btnLimpiarTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTAActionPerformed
        txtV1a.setText("");
        txtV2a.setText("");
        txtDisV1V2a.setText("");
        lbResAlcance.setText("");


    }//GEN-LAST:event_btnLimpiarTAActionPerformed

    private void btnLimpiarTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTEActionPerformed
        txtV1e.setText("");
        txtV2e.setText("");
        txtDisV1V2e.setText("");
        lbResEncuentro.setText("");
    }//GEN-LAST:event_btnLimpiarTEActionPerformed

    private void txtV1aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtV1aKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_txtV1aKeyTyped

    private void txtV2aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtV2aKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_txtV2aKeyTyped

    private void txtDisV1V2aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisV1V2aKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_txtDisV1V2aKeyTyped

    private void txtV1eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtV1eKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_txtV1eKeyTyped

    private void txtV2eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtV2eKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_txtV2eKeyTyped

    private void txtDisV1V2eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisV1V2eKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números");
        }
    }//GEN-LAST:event_txtDisV1V2eKeyTyped

    private void btnSalirTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTeActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirTeActionPerformed

    private void btnSalirTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTaActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirTaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularAlcance;
    private javax.swing.JButton btnCalcularEncuentro;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarTA;
    private javax.swing.JButton btnLimpiarTE;
    private javax.swing.JButton btnLimpiartxtArea;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirTa;
    private javax.swing.JButton btnSalirTe;
    private javax.swing.JComboBox<String> cbDisV1V2a;
    private javax.swing.JComboBox<String> cbDisV1V2e;
    private javax.swing.JComboBox<String> cbDistancia;
    private javax.swing.JComboBox<String> cbFormula;
    private javax.swing.JComboBox<String> cbResD;
    private javax.swing.JComboBox<String> cbResT;
    private javax.swing.JComboBox<String> cbResV;
    private javax.swing.JComboBox<String> cbTiempo;
    private javax.swing.JComboBox<String> cbV1a;
    private javax.swing.JComboBox<String> cbV1e;
    private javax.swing.JComboBox<String> cbV2a;
    private javax.swing.JComboBox<String> cbV2e;
    private javax.swing.JComboBox<String> cbVelocidad;
    private javax.swing.JLabel imgAlcance;
    private javax.swing.JLabel imgEncuentro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbResAlcance;
    private javax.swing.JLabel lbResConvertida;
    private javax.swing.JLabel lbResD;
    private javax.swing.JLabel lbResEncuentro;
    private javax.swing.JLabel lbResT;
    private javax.swing.JLabel lbResV;
    private javax.swing.JPanel panelDistancia;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelResConversion;
    private javax.swing.JPanel panelRespuestaD;
    private javax.swing.JPanel panelRespuestaT;
    private javax.swing.JPanel panelRespuestaV;
    private javax.swing.JPanel panelTiempo;
    private javax.swing.JPanel panelVelocidad;
    private javax.swing.JScrollPane tbHistorial;
    private javax.swing.JTable tblRegister;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDisV1V2a;
    private javax.swing.JTextField txtDisV1V2e;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtV1a;
    private javax.swing.JTextField txtV1e;
    private javax.swing.JTextField txtV2a;
    private javax.swing.JTextField txtV2e;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables

}
