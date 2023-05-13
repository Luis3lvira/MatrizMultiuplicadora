import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 *
 * @author luise
 */
public class GUI extends javax.swing.JFrame {

    private void setWindowDimensions() {
        this.setSize(800, 600);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                gui.setWindowDimensions();
                gui.setVisible(true);
            }
        });

    }


    private void operacionMatricesSecuencialMulti(CreateMatrix matrix) {
        long inicio;
        //Secuencial
        inicio = System.currentTimeMillis();
        MatrixMultiSecuencial matrixMulti = new MatrixMultiSecuencial(matrix.getMatrixA(), matrix.getMatrixB());
        this.Label_secu_ans.setText(Integer.toString((int) (System.currentTimeMillis() - inicio)));

        for (int i = 0; i < matrixMulti.getResultados().length; i++) {
            txtarea_sec.append(Arrays.toString(matrixMulti.getResultados()[i]) + "\r\n");
        }
    }

    private void operacionMatrizConcurrenciaMulti(CreateMatrix matrix) {
        long inicio;
        //Concurrencia
        MatrixMultiConcurrency forkMulti = new MatrixMultiConcurrency();
        inicio = System.currentTimeMillis();
        forkMulti.matrixMulti(matrix.getMatrixA(), matrix.getMatrixB(), 0, 0);
        this.Label_concu_ans.setText(Integer.toString((int) (System.currentTimeMillis() - inicio)));
        for (int i = 0; i < forkMulti.getResultados().length; i++) {
            txtarea_con.append(Arrays.toString(forkMulti.getResultados()[i]) + "\r\n");
        }
    }
    private void clearTxt() {
        this.txtarea_matrizb.setText("");
        this.txtarea_matriza.setText("");
        this.txtarea_con.setText("");
        this.txtarea_sec.setText("");
        this.Label_concu_ans.setText("0");
        this.Label_secu_ans.setText("0");

    }



    public GUI() {
        initComponents();
    }

    private void initComponents() {
        PaneldatosGral = new javax.swing.JPanel();
        Multi_uno = new javax.swing.JLabel();
        CheckBox = new javax.swing.JCheckBox();
        Label_mat = new javax.swing.JLabel();
        SpinerMat = new javax.swing.JSpinner();
        Label_op = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        Mat_a = new javax.swing.JLabel();
        Label_sec = new javax.swing.JLabel();
        Label_time = new javax.swing.JLabel();
        Label_secu_ans = new javax.swing.JLabel();
        Label_concu = new javax.swing.JLabel();
        Label_time_concu = new javax.swing.JLabel();
        Label_concu_ans = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_con = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtarea_sec = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtarea_matriza = new javax.swing.JTextArea();
        Mat_b = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtarea_matrizb = new javax.swing.JTextArea();
        btnInicio = new javax.swing.JButton();
        Cuadro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaneldatosGral.setBackground(new java.awt.Color(0, 204, 204));
        PaneldatosGral.setBorder(new javax.swing.border.MatteBorder(null));
        PaneldatosGral.setForeground(new java.awt.Color(0, 153, 153));

        Multi_uno.setBackground(new java.awt.Color(153, 255, 255));
        Multi_uno.setText("MULTIPLICACION");

        CheckBox.setText("jCheckBox1");

        Label_mat.setText("TAMAÑO DE LAS MATRICES");

        SpinerMat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Label_op.setBackground(new java.awt.Color(153, 204, 255));
        Label_op.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Label_op.setText("SECUENCIAL O CONCURRENTE???");

        jComboBox.setBackground(new java.awt.Color(0, 153, 255));
        jComboBox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Secuencial", "Concurrente"}));

        javax.swing.GroupLayout PaneldatosGralLayout = new javax.swing.GroupLayout(PaneldatosGral);
        PaneldatosGral.setLayout(PaneldatosGralLayout);
        PaneldatosGralLayout.setHorizontalGroup(
                PaneldatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PaneldatosGralLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(Multi_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Label_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SpinerMat, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Label_op, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaneldatosGralLayout.setVerticalGroup(
                PaneldatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PaneldatosGralLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(PaneldatosGralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Multi_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CheckBox)
                                        .addComponent(Label_mat)
                                        .addComponent(SpinerMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(PaneldatosGralLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Label_op, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(jComboBox)
        );

        Mat_a.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Mat_a.setText("MATRIZ (A)");

        Label_sec.setBackground(new java.awt.Color(0, 204, 204));
        Label_sec.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Label_sec.setText("SECUENCIAL");

        Label_time.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Label_time.setText("Ejecucion en ms");

        Label_secu_ans.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Label_secu_ans.setForeground(new java.awt.Color(255, 102, 102));
        Label_secu_ans.setText("0");

        Label_concu.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Label_concu.setText("CONCURRENCIA");

        Label_time_concu.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Label_time_concu.setText("Ejecucion en ms");

        Label_concu_ans.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Label_concu_ans.setForeground(new java.awt.Color(255, 0, 0));
        Label_concu_ans.setText("0");

        txtarea_con.setBackground(new java.awt.Color(102, 102, 102));
        txtarea_con.setColumns(20);
        txtarea_con.setForeground(new java.awt.Color(255, 255, 255));
        txtarea_con.setRows(5);
        jScrollPane2.setViewportView(txtarea_con);

        txtarea_sec.setBackground(new java.awt.Color(102, 102, 102));
        txtarea_sec.setColumns(20);
        txtarea_sec.setForeground(new java.awt.Color(255, 255, 255));
        txtarea_sec.setRows(5);
        jScrollPane8.setViewportView(txtarea_sec);

        txtarea_matriza.setBackground(new java.awt.Color(102, 102, 102));
        txtarea_matriza.setColumns(20);
        txtarea_matriza.setForeground(new java.awt.Color(255, 255, 255));
        txtarea_matriza.setRows(5);
        jScrollPane9.setViewportView(txtarea_matriza);

        Mat_b.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Mat_b.setText("MATRIZ (B)");

        txtarea_matrizb.setBackground(new java.awt.Color(102, 102, 102));
        txtarea_matrizb.setColumns(20);
        txtarea_matrizb.setForeground(new java.awt.Color(255, 255, 255));
        txtarea_matrizb.setRows(5);
        jScrollPane10.setViewportView(txtarea_matrizb);

        btnInicio.setBackground(new java.awt.Color(51, 153, 255));
        btnInicio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setActionCommand("Calcular");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        Cuadro.setBackground(new java.awt.Color(204, 204, 204));
        Cuadro.setText("MULTIPLICADORA DE MATRICES CONCURRENTE Y SECUENCIAL POR LUIS ELVIRA 20110330 IDS 5M");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(42, 42, 42))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Mat_b)
                                                                .addGap(126, 126, 126)))
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Label_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Label_time, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Mat_a)
                                                                .addGap(406, 406, 406)))
                                                .addComponent(Label_secu_ans, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Label_concu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Label_time_concu)
                                                .addGap(28, 28, 28)
                                                .addComponent(Label_concu_ans, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(PaneldatosGral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(Cuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Cuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PaneldatosGral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Label_concu_ans, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Label_time_concu)
                                                        .addComponent(Label_concu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Label_secu_ans, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Label_time)
                                                        .addComponent(Label_sec))
                                                .addGap(151, 151, 151)
                                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(108, 108, 108)
                                                .addComponent(Mat_a)
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Mat_b)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)))))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        // </editor-fold>

    }

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {
        this.btnInicio.setEnabled(false);
        clearTxt();
        CreateMatrix matrix = new CreateMatrix((int) SpinerMat.getValue());

        for (double[] matrixA : matrix.getMatrixA()) {
            txtarea_matriza.append(Arrays.toString(matrixA) + "\r\n");
        }
        for (double[] matrixB : matrix.getMatrixB()) {
            txtarea_matrizb.append(Arrays.toString(matrixB) + "\r\n");
        }
        switch (jComboBox.getSelectedIndex()) {
            case 0:
                if (this.CheckBox.isSelected()) {
                    operacionMatricesSecuencialMulti(matrix);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una opción");
                }
                break;
            case 1:
                if (this.CheckBox.isSelected()) {
                    operacionMatrizConcurrenciaMulti(matrix);
                }
                break;
            default:
                javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una opción");
                break;
        }


        this.btnInicio.setEnabled(true);

    }



    // Variables declaration - do not modify
    private javax.swing.JPanel PaneldatosGral;
    private javax.swing.JButton btnInicio;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel Label_time;
    private javax.swing.JLabel Label_sec;
    private javax.swing.JLabel Label_time_concu;
    private javax.swing.JLabel Mat_a;
    private javax.swing.JLabel Mat_b;
    private javax.swing.JLabel Label_op;
    private javax.swing.JLabel Label_mat;
    private javax.swing.JLabel Multi_uno;
    private javax.swing.JLabel Label_concu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JLabel Label_concu_ans;
    private javax.swing.JLabel Cuadro;
    private javax.swing.JLabel Label_secu_ans;
    private javax.swing.JSpinner SpinerMat;
    public javax.swing.JTextArea txtarea_matriza;
    public javax.swing.JTextArea txtarea_matrizb;
    private javax.swing.JTextArea txtarea_con;
    private javax.swing.JTextArea txtarea_sec;
}
