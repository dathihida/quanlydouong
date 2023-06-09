/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLCH.UI;

import QLCH.Dao.HoaDonDao;
import QLCH.Dao.ThongKeDao;
import QLCH.Utils.Masterfrom;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author AD
 */
public class ThongKeJPanel extends Masterfrom {

    /**
     * Creates new form ThongKeJPanel
     */
    public ThongKeJPanel() {
        initComponents();
        init();

        tblDTSPTT.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
        tblDTSPTT.getTableHeader().setBackground(new Color(24, 71, 133));
        tblDTSPTT.getTableHeader().setForeground(new Color(255, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jpanelLineChart = new javax.swing.JPanel();
        cboNamLine = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDTSPTT = new javax.swing.JTable();
        cboNam = new javax.swing.JComboBox<>();
        pnlBieudoCot = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        pnlBieudoTron = new javax.swing.JPanel();

        setBackground(new Color (0, 0, 0, 0));

        jTabbedPane1.setForeground(new java.awt.Color(102, 0, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jpanelLineChartLayout = new javax.swing.GroupLayout(jpanelLineChart);
        jpanelLineChart.setLayout(jpanelLineChartLayout);
        jpanelLineChartLayout.setHorizontalGroup(
            jpanelLineChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jpanelLineChartLayout.setVerticalGroup(
            jpanelLineChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        cboNamLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNamLine.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new Color (24, 71, 133)));
        cboNamLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamLineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jpanelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboNamLine, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(482, 482, 482))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cboNamLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpanelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LineChart", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new Color (16,54,103));
        jLabel1.setText("Tháng");

        cboThang.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new Color (24, 71, 133)));
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color (16,54,103));
        jLabel2.setText("Năm");

        tblDTSPTT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblDTSPTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Sản phẩm", "Tổng số lượng", "Tổng tiền", "Tháng", "Năm"
            }
        ));
        tblDTSPTT.setRowHeight(23);
        tblDTSPTT.setSelectionBackground(new Color (24, 116, 180));
        tblDTSPTT.setShowHorizontalLines(false);
        tblDTSPTT.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblDTSPTT);

        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNam.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new Color (24, 71, 133)));
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBieudoCotLayout = new javax.swing.GroupLayout(pnlBieudoCot);
        pnlBieudoCot.setLayout(pnlBieudoCotLayout);
        pnlBieudoCotLayout.setHorizontalGroup(
            pnlBieudoCotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        pnlBieudoCotLayout.setVerticalGroup(
            pnlBieudoCotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnReset.setBackground(new Color (24, 71, 133));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBieudoTronLayout = new javax.swing.GroupLayout(pnlBieudoTron);
        pnlBieudoTron.setLayout(pnlBieudoTronLayout);
        pnlBieudoTronLayout.setHorizontalGroup(
            pnlBieudoTronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        pnlBieudoTronLayout.setVerticalGroup(
            pnlBieudoTronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pnlBieudoCot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlBieudoTron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBieudoTron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBieudoCot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BarChart", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        fillDoanhThuSP();
        initBarChart();
        initPieChart();
    }//GEN-LAST:event_cboThangActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        //fillDoanhThuSP();
    }//GEN-LAST:event_cboNamActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        fillDoanhThuSPTN();
        initBarChartReset();
        initPieChartReset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void cboNamLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNamLineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboNamLine;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpanelLineChart;
    private javax.swing.JPanel pnlBieudoCot;
    private javax.swing.JPanel pnlBieudoTron;
    private javax.swing.JTable tblDTSPTT;
    // End of variables declaration//GEN-END:variables

    ThongKeDao tkDao = new ThongKeDao();
    HoaDonDao hdDao = new HoaDonDao();

    private void init() {
//        this.setLocationRelativeTo(null);
        fillYearComBox();
        fillMonthsComBox();
        fillDoanhThuSP();
        initBarChart();
        initPieChart();
        fillYearComBoxLineChart();
        initLineChart();
    }

    void initBarChart() {
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        
//        dataset.addValue(200, "Doanh thu", "january");
//        dataset.addValue(150, "Doanh thu", "february");
//        dataset.addValue(18, "Doanh thu", "march");
//        dataset.addValue(100, "Doanh thu", "april");
//        dataset.addValue(80, "Doanh thu", "may");
//        dataset.addValue(250, "Doanh thu", "june");
        int thang = (int) cboThang.getSelectedItem();
        int nam = (int) cboNam.getSelectedItem();
        JFreeChart chart = ChartFactory.createBarChart("contribution", "monthly", "Doanh thu",
                tkDao.getDataDoanhThuSPTT(thang, nam), PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204, 0, 51);
        renderer.setSeriesPaint(0, clr3);
        renderer.setSeriesPaint(1, Color.BLUE);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        //barpChartPanel.setBounds(150, 150, 150, 200);
        barpChartPanel.setSize(460, 300);
        JButton b = new JButton("Test");
        pnlBieudoCot.removeAll();
        pnlBieudoCot.add(barpChartPanel, BorderLayout.CENTER);
        pnlBieudoCot.validate();
        pnlBieudoCot.add(b);
        pnlBieudoCot.setBackground(Color.white);
    }

    void initBarChartReset() {
        int nam = (int) cboNam.getSelectedItem();
        JFreeChart chart = ChartFactory.createBarChart("contribution", "monthly", "Doanh thu",
                tkDao.getDataDoanhThuSPTN(nam), PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204, 0, 51);
        renderer.setSeriesPaint(0, clr3);
        renderer.setSeriesPaint(1, Color.BLUE);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        //barpChartPanel.setBounds(150, 150, 150, 200);
        barpChartPanel.setSize(729, 364);
        JButton b = new JButton("Test");
        pnlBieudoCot.removeAll();
        pnlBieudoCot.add(barpChartPanel, BorderLayout.CENTER);
        pnlBieudoCot.validate();
        pnlBieudoCot.add(b);
        pnlBieudoCot.setBackground(Color.white);
    }

    void fillYearComBox() {
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboNam.getModel();
        cboModel.removeAllElements();
        List<Integer> list = hdDao.selectYears();
        for (Integer years : list) {
            cboModel.addElement(years);
        }
    }

    void fillMonthsComBox() {
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboThang.getModel();
        cboModel.removeAllElements();
        List<Integer> list = hdDao.selectMonths();
        for (Integer years : list) {
            cboModel.addElement(years);
        }
    }
    
    void fillYearComBoxLineChart() {
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboNamLine.getModel();
        cboModel.removeAllElements();
        List<Integer> list = hdDao.selectYears();
        for (Integer years : list) {
            cboModel.addElement(years);
        }
    }

//    void fillMonthsComBoxLineChart() {
//        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboLineThang.getModel();
//        cboModel.removeAllElements();
//        List<Integer> list = hdDao.selectMonths();
//        for (Integer years : list) {
//            cboModel.addElement(years);
//        }
//    }

    void fillDoanhThuSP() {
        DefaultTableModel tblModel = (DefaultTableModel) tblDTSPTT.getModel();
        tblModel.setRowCount(0);
        int thang = (int) cboThang.getSelectedItem();
        int nam = (int) cboNam.getSelectedItem();
        System.out.println("Thang: " + thang + "Nam: " + nam);
        List<Object[]> list = tkDao.getDoanhThuSPTT(thang, nam);
        for (Object[] row : list) {
            tblModel.addRow(row);
        }
    }

    void fillDoanhThuSPTN() {
        DefaultTableModel tblModel = (DefaultTableModel) tblDTSPTT.getModel();
        tblModel.setRowCount(0);
        int nam = (int) cboNam.getSelectedItem();
        System.out.println("Nam: " + nam);
        List<Object[]> list = tkDao.getDoanhThuSPTN(nam);
        for (Object[] row : list) {
            tblModel.addRow(row);
        }
    }

    void initPieChart() {
        //create dataset
//      DefaultPieDataset barDataset = new DefaultPieDataset();
//      barDataset.setValue( "IPhone 5s" , new Double( 20 ) );  
//      barDataset.setValue( "SamSung Grand" , new Double( 20 ) );   
//      barDataset.setValue( "MotoG" , new Double( 40 ) );    
//      barDataset.setValue( "Nokia Lumia" , new Double( 10 ) );  
        int thang = (int) cboThang.getSelectedItem();
        int nam = (int) cboNam.getSelectedItem();
        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Phan tram doanh thu", tkDao.getDataDoanhThuPhanTram(thang, nam), true, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
//       piePlot.setSectionPaint("IPhone 5s", new Color(255,255,102));
//        piePlot.setSectionPaint("SamSung Grand", new Color(102,255,102));
//        piePlot.setSectionPaint("MotoG", new Color(255,102,153));
//        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
        piePlot.setBackgroundPaint(Color.white);

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        barChartPanel.setSize(412, 364);
        pnlBieudoTron.removeAll();
        pnlBieudoTron.add(barChartPanel);
        pnlBieudoTron.validate();
    }

    void initPieChartReset() {
        int nam = (int) cboNam.getSelectedItem();
        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Phan tram doanh thu", tkDao.getDataDoanhThuPhanTramTN(nam), true, true, false);//explain       
        PiePlot piePlot = (PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(Color.white);
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        barChartPanel.setSize(412, 364);
        pnlBieudoTron.removeAll();
        pnlBieudoTron.add(barChartPanel);
        pnlBieudoTron.validate();
    }
    
    void initLineChart(){
        //create dataset for the graph
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.setValue(200, "Amount", "january");
//        dataset.setValue(150, "Amount", "february");
//        dataset.setValue(18, "Amount", "march");
//        dataset.setValue(100, "Amount", "april");
//        dataset.setValue(80, "Amount", "may");
//        dataset.setValue(250, "Amount", "june");
        int nam = (int) cboNamLine.getSelectedItem();
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Doanh thu sản phẩm","Tháng","Doanh thu", 
                tkDao.getDataDoanhThuSPTN(nam), PlotOrientation.VERTICAL, true,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        lineChartPanel.setSize(1060, 532);
        jpanelLineChart.removeAll();
        jpanelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        jpanelLineChart.validate();
    }

    @Override
    public void formRefresh() {
    }

}
