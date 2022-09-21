/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package School_Batting;

import com.formdev.flatlaf.ui.FlatComboBoxUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Jcj
 */
public class TeacherScreen1 extends javax.swing.JFrame
{

    /**
     * Creates new form TeacherScreen
     */
    public TeacherScreen1()
    {
         initComponents();
         setSize(Toolkit.getDefaultToolkit().getScreenSize());
        int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
        int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
        
       teacherComboBox.getUI();
       
       teacherComboBox.setUI(new FlatComboBoxUI(){
               @Override
            protected JButton createArrowButton() {
                //---style arrow button anyway you like
                JButton result = new JButton();
                result.setBackground(Color.orange);//---button's color
                return result;
            }
       });
        /*
        headerPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 10, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        headerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 462, 129));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout addTeacher_PanelLayout = new javax.swing.GroupLayout(addTeacher_Panel);
        addTeacher_Panel.setLayout(addTeacher_PanelLayout);
        addTeacher_PanelLayout.setHorizontalGroup(
            addTeacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        addTeacher_PanelLayout.setVerticalGroup(
            addTeacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add Teacher", addTeacher_Panel);

        javax.swing.GroupLayout findBatter_PanelLayout = new javax.swing.GroupLayout(findBatter_Panel);
        findBatter_Panel.setLayout(findBatter_PanelLayout);
        findBatter_PanelLayout.setHorizontalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        findBatter_PanelLayout.setVerticalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Find Batting Teacher", findBatter_Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        */
//        //header panel
//        int hHeight = (int) (screenH * 0.144);
//        headerPanel.setBounds(0, 0, getWidth(), hHeight);
//        
//        //~Exit button
//        if(screenW != Toolkit.getDefaultToolkit().getScreenSize().width)
//        {
//            headerPanel.remove(jButton1);
//            
//            int exitB_Side = screenW / 100;
//            int exitBX = (int) ( screenW - exitB_Side - screenW *(1.0/160) );
//            int exitBY = (int)(screenH - screenH*(1.0/90));
//            jButton1.setFont(new Font("Segoe UI", 1, (int)(exitB_Side*0.75)));
//            
//            headerPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(exitBX, exitBY, -1, -1));
//            
//            getContentPane().removeAll();
//            
//            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//            getContentPane().setLayout(layout);
//            
//            layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(layout.createSequentialGroup()
//                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(jTabbedPane1)
//                        .addComponent(headerPanel))
//                    .addGap(0, 0, 0)
//                )
//            );
//            
//            layout.setVerticalGroup(
//                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                    .addComponent(headerPanel)
//                                    .addGap(0, 0, 0)
//                                    .addComponent(jTabbedPane1)
//                                    .addGap(0, 0, 0)
//                            )
//                    )
//            );
//            
//            pack();
//        }
//        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        headerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        ManageTeachers_Panel = new javax.swing.JPanel();
        manageT_HeaderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        timetableTable = new javax.swing.JTable();
        editableButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        teacherComboBox = new javax.swing.JComboBox<>();
        batWeightField = new javax.swing.JTextField();
        registerClass_Field = new javax.swing.JTextField();
        extraMuralsNr_Text = new javax.swing.JTextField();
        rightAddSplitter = new javax.swing.JSeparator();
        leftAddSplitter = new javax.swing.JSeparator();
        addTeacherLabel = new javax.swing.JLabel();
        addTeacherSurnameField = new javax.swing.JTextField();
        addTeacherNameField = new javax.swing.JTextField();
        addTeacherEMuralsSpinner = new javax.swing.JSpinner();
        findBatter_Panel = new javax.swing.JPanel();
        findBatter_HeaderPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lessonInputPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        chooseLessonLAbel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lessonInputTable = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        chooseDayLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        findTeacherButton = new javax.swing.JButton();
        tblBatWeek = new javax.swing.JTabbedPane();
        weeksJanuary = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblCalendar5 = new javax.swing.JTable();
        weeksFebruary = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCalendar1 = new javax.swing.JTable();
        weeksMarch = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCalendar6 = new javax.swing.JTable();
        weeksApril = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCalendar7 = new javax.swing.JTable();
        weeksMay = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblCalendar16 = new javax.swing.JTable();
        weeksJune = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tblCalendar17 = new javax.swing.JTable();
        weeksJuly = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblCalendar18 = new javax.swing.JTable();
        weeksAugust = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        tblCalendar19 = new javax.swing.JTable();
        weeksSeptember = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblCalendar20 = new javax.swing.JTable();
        weeksOctober = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tblCalendar21 = new javax.swing.JTable();
        weeksNovember = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblCalendar22 = new javax.swing.JTable();
        weeksDecember = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblCalendar23 = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        chooseLessonLAbel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputTeacherArea = new javax.swing.JTextArea();
        chooseTeacherButton = new javax.swing.JButton();
        outputCalendarTabbedPane = new javax.swing.JTabbedPane();
        tabJanuary = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCalendar = new javax.swing.JTable();
        tabFebruary = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCalendar2 = new javax.swing.JTable();
        tabMarch = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblCalendar3 = new javax.swing.JTable();
        tabApril = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblCalendar4 = new javax.swing.JTable();
        tabMay = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblCalendar10 = new javax.swing.JTable();
        tabJune = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblCalendar9 = new javax.swing.JTable();
        tabJuly = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblCalendar8 = new javax.swing.JTable();
        tabAugust = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblCalendar11 = new javax.swing.JTable();
        tabSeptember = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblCalendar12 = new javax.swing.JTable();
        tabOctober = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblCalendar13 = new javax.swing.JTable();
        tabNovember = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblCalendar14 = new javax.swing.JTable();
        tabDecember = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblCalendar15 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1980, 1080));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
        });

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        headerPanel.setMaximumSize(new java.awt.Dimension(1042, 129));
        headerPanel.setName(""); // NOI18N
        headerPanel.setPreferredSize(new java.awt.Dimension(1600, 130));

        jButton1.setBackground(headerPanel.getBackground());
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMaximumSize(new java.awt.Dimension(20, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(1, 1));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane.setPreferredSize(new java.awt.Dimension(1849, 761));

        ManageTeachers_Panel.setBackground(new java.awt.Color(255, 255, 255));

        manageT_HeaderPanel.setBackground(jTabbedPane.getBackground());

        jLabel2.setBackground(ManageTeachers_Panel.getBackground());
        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE TEACHERS");

        javax.swing.GroupLayout manageT_HeaderPanelLayout = new javax.swing.GroupLayout(manageT_HeaderPanel);
        manageT_HeaderPanel.setLayout(manageT_HeaderPanelLayout);
        manageT_HeaderPanelLayout.setHorizontalGroup(
            manageT_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageT_HeaderPanelLayout.createSequentialGroup()
                .addGap(625, 625, 625)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(641, Short.MAX_VALUE))
        );
        manageT_HeaderPanelLayout.setVerticalGroup(
            manageT_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageT_HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        timetableTable.setBackground(new java.awt.Color(255, 255, 255));
        timetableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Days", "lesson 1", "lesson 2", "lesson 3", "lesson 4", "lesson 5", "lesson 6", "lesson 7", "lesson 8", "lesson 9", "lesson 10", "lesson 11", "lesson 12", "lesson 13", "lesson 14"
            }
        ));
        timetableTable.setOpaque(false);
        jScrollPane1.setViewportView(timetableTable);

        editableButton.setText("editable");
        editableButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editableButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Batting Wight:");

        jLabel5.setText("Register Class:(True/False)");

        jLabel6.setText("Extramurals:");

        teacherComboBox.setBackground(ManageTeachers_Panel.getBackground());
        teacherComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teacherComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true), "Select teacher"));
        teacherComboBox.setOpaque(true);

        batWeightField.setEditable(false);

        registerClass_Field.setEditable(false);
        registerClass_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                registerClass_FieldActionPerformed(evt);
            }
        });

        extraMuralsNr_Text.setEditable(false);

        rightAddSplitter.setForeground(new java.awt.Color(204, 0, 0));
        rightAddSplitter.setToolTipText("");
        rightAddSplitter.setName(""); // NOI18N

        addTeacherLabel.setBackground(new java.awt.Color(255, 255, 255));
        addTeacherLabel.setForeground(new java.awt.Color(204, 0, 0));
        addTeacherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addTeacherLabel.setText("Add Teacher");

        addTeacherSurnameField.setBackground(ManageTeachers_Panel.getBackground());
        addTeacherSurnameField.setText("e.g Jeanett");
        addTeacherSurnameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Teacher Surname", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        addTeacherSurnameField.setEnabled(false);

        addTeacherNameField.setBackground(ManageTeachers_Panel.getBackground());
        addTeacherNameField.setText("e.g Jeanett");
        addTeacherNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Teacher Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        addTeacherNameField.setEnabled(false);

        addTeacherEMuralsSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        addTeacherEMuralsSpinner.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra murals"));
        addTeacherEMuralsSpinner.setOpaque(true);

        javax.swing.GroupLayout ManageTeachers_PanelLayout = new javax.swing.GroupLayout(ManageTeachers_Panel);
        ManageTeachers_Panel.setLayout(ManageTeachers_PanelLayout);
        ManageTeachers_PanelLayout.setHorizontalGroup(
            ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leftAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(addTeacherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(addTeacherSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(addTeacherEMuralsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                .addComponent(addTeacherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rightAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 1358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(batWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(registerClass_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(extraMuralsNr_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageT_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(564, 564, 564)
                .addComponent(editableButton)
                .addGap(278, 278, 278))
        );
        ManageTeachers_PanelLayout.setVerticalGroup(
            ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                .addComponent(manageT_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                .addComponent(teacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(batWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(registerClass_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(extraMuralsNr_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))))
                            .addComponent(editableButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rightAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(leftAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTeacherLabel))
                .addGap(18, 18, 18)
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTeacherSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTeacherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTeacherEMuralsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Manage Teachers", ManageTeachers_Panel);

        findBatter_Panel.setBackground(new java.awt.Color(255, 255, 255));
        findBatter_Panel.setForeground(new java.awt.Color(255, 255, 255));
        findBatter_Panel.setPreferredSize(new java.awt.Dimension(1413, 761));

        findBatter_HeaderPanel.setBackground(jTabbedPane.getBackground());

        jLabel3.setBackground(findBatter_HeaderPanel.getBackground());
        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FIND BATTING TEACHER");

        javax.swing.GroupLayout findBatter_HeaderPanelLayout = new javax.swing.GroupLayout(findBatter_HeaderPanel);
        findBatter_HeaderPanel.setLayout(findBatter_HeaderPanelLayout);
        findBatter_HeaderPanelLayout.setHorizontalGroup(
            findBatter_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_HeaderPanelLayout.createSequentialGroup()
                .addGap(623, 623, 623)
                .addComponent(jLabel3)
                .addContainerGap(632, Short.MAX_VALUE))
        );
        findBatter_HeaderPanelLayout.setVerticalGroup(
            findBatter_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        lessonInputPanel.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator1.setForeground(new java.awt.Color(25, 115, 230));

        jSeparator2.setForeground(new java.awt.Color(25, 115, 230));

        chooseLessonLAbel.setBackground(lessonInputPanel.getBackground());
        chooseLessonLAbel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        chooseLessonLAbel.setForeground(new java.awt.Color(25, 115, 230));
        chooseLessonLAbel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseLessonLAbel.setText("Choose Lesson");

        lessonInputTable.setBackground(new java.awt.Color(255, 255, 255));
        lessonInputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Monday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Tuesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Wednesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Thursday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Friday", null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Day", "L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10", "L11", "L12", "L13", "L14"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        lessonInputTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        lessonInputTable.setColumnSelectionAllowed(true);
        lessonInputTable.setOpaque(false);
        lessonInputTable.setRowHeight(30);
        lessonInputTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lessonInputTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lessonInputTable.setShowGrid(true);
        jScrollPane4.setViewportView(lessonInputTable);
        lessonInputTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jSeparator3.setForeground(new java.awt.Color(25, 115, 230));

        chooseDayLabel.setBackground(lessonInputPanel.getBackground());
        chooseDayLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        chooseDayLabel.setForeground(new java.awt.Color(25, 115, 230));
        chooseDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseDayLabel.setText("Choose Week");

        jSeparator4.setForeground(new java.awt.Color(25, 115, 230));

        findTeacherButton.setBackground(chooseDayLabel.getForeground());
        findTeacherButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        findTeacherButton.setForeground(new java.awt.Color(204, 255, 255));
        findTeacherButton.setText("Find Your Cinderella");

        tblBatWeek.setBackground(lessonInputPanel.getBackground());
        tblBatWeek.setForeground(new java.awt.Color(204, 255, 255));
        tblBatWeek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblBatWeek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        weeksJanuary.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar5.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar5.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar5.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar5.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tblCalendar5);
        if (tblCalendar5.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar5.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar5.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar5.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksJanuaryLayout = new javax.swing.GroupLayout(weeksJanuary);
        weeksJanuary.setLayout(weeksJanuaryLayout);
        weeksJanuaryLayout.setHorizontalGroup(
            weeksJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksJanuaryLayout.setVerticalGroup(
            weeksJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksJanuaryLayout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Jan", weeksJanuary);

        weeksFebruary.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar1.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar1.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar1.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tblCalendar1);
        if (tblCalendar1.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar1.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar1.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar1.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksFebruaryLayout = new javax.swing.GroupLayout(weeksFebruary);
        weeksFebruary.setLayout(weeksFebruaryLayout);
        weeksFebruaryLayout.setHorizontalGroup(
            weeksFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksFebruaryLayout.setVerticalGroup(
            weeksFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksFebruaryLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Feb", weeksFebruary);

        weeksMarch.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar6.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar6.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar6.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar6.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tblCalendar6);
        if (tblCalendar6.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar6.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar6.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar6.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksMarchLayout = new javax.swing.GroupLayout(weeksMarch);
        weeksMarch.setLayout(weeksMarchLayout);
        weeksMarchLayout.setHorizontalGroup(
            weeksMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksMarchLayout.setVerticalGroup(
            weeksMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksMarchLayout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Mar", weeksMarch);

        weeksApril.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar7.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar7.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar7.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar7.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tblCalendar7);
        if (tblCalendar7.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar7.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar7.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar7.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksAprilLayout = new javax.swing.GroupLayout(weeksApril);
        weeksApril.setLayout(weeksAprilLayout);
        weeksAprilLayout.setHorizontalGroup(
            weeksAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksAprilLayout.setVerticalGroup(
            weeksAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksAprilLayout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("April", weeksApril);

        weeksMay.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar16.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar16.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar16.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar16.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar16.getTableHeader().setReorderingAllowed(false);
        jScrollPane20.setViewportView(tblCalendar16);
        if (tblCalendar16.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar16.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar16.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar16.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksMayLayout = new javax.swing.GroupLayout(weeksMay);
        weeksMay.setLayout(weeksMayLayout);
        weeksMayLayout.setHorizontalGroup(
            weeksMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksMayLayout.setVerticalGroup(
            weeksMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksMayLayout.createSequentialGroup()
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("May", weeksMay);

        weeksJune.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar17.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar17.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar17.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar17.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar17.getTableHeader().setReorderingAllowed(false);
        jScrollPane21.setViewportView(tblCalendar17);
        if (tblCalendar17.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar17.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar17.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar17.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksJuneLayout = new javax.swing.GroupLayout(weeksJune);
        weeksJune.setLayout(weeksJuneLayout);
        weeksJuneLayout.setHorizontalGroup(
            weeksJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksJuneLayout.setVerticalGroup(
            weeksJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksJuneLayout.createSequentialGroup()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("June", weeksJune);

        weeksJuly.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar18.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar18.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar18.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar18.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar18.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar18.getTableHeader().setReorderingAllowed(false);
        jScrollPane22.setViewportView(tblCalendar18);
        if (tblCalendar18.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar18.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar18.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar18.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksJulyLayout = new javax.swing.GroupLayout(weeksJuly);
        weeksJuly.setLayout(weeksJulyLayout);
        weeksJulyLayout.setHorizontalGroup(
            weeksJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksJulyLayout.setVerticalGroup(
            weeksJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksJulyLayout.createSequentialGroup()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("July", weeksJuly);

        weeksAugust.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar19.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar19.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar19.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar19.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar19.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar19.getTableHeader().setReorderingAllowed(false);
        jScrollPane23.setViewportView(tblCalendar19);
        if (tblCalendar19.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar19.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar19.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar19.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksAugustLayout = new javax.swing.GroupLayout(weeksAugust);
        weeksAugust.setLayout(weeksAugustLayout);
        weeksAugustLayout.setHorizontalGroup(
            weeksAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksAugustLayout.setVerticalGroup(
            weeksAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksAugustLayout.createSequentialGroup()
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Aug", weeksAugust);

        weeksSeptember.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar20.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar20.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar20.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar20.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar20.getTableHeader().setReorderingAllowed(false);
        jScrollPane24.setViewportView(tblCalendar20);
        if (tblCalendar20.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar20.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar20.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar20.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksSeptemberLayout = new javax.swing.GroupLayout(weeksSeptember);
        weeksSeptember.setLayout(weeksSeptemberLayout);
        weeksSeptemberLayout.setHorizontalGroup(
            weeksSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksSeptemberLayout.setVerticalGroup(
            weeksSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksSeptemberLayout.createSequentialGroup()
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Sept", weeksSeptember);

        weeksOctober.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar21.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar21.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar21.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar21.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar21.getTableHeader().setReorderingAllowed(false);
        jScrollPane25.setViewportView(tblCalendar21);
        if (tblCalendar21.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar21.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar21.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar21.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksOctoberLayout = new javax.swing.GroupLayout(weeksOctober);
        weeksOctober.setLayout(weeksOctoberLayout);
        weeksOctoberLayout.setHorizontalGroup(
            weeksOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksOctoberLayout.setVerticalGroup(
            weeksOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksOctoberLayout.createSequentialGroup()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Oct", weeksOctober);

        weeksNovember.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar22.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar22.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar22.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar22.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar22.getTableHeader().setReorderingAllowed(false);
        jScrollPane26.setViewportView(tblCalendar22);
        if (tblCalendar22.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar22.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar22.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar22.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksNovemberLayout = new javax.swing.GroupLayout(weeksNovember);
        weeksNovember.setLayout(weeksNovemberLayout);
        weeksNovemberLayout.setHorizontalGroup(
            weeksNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksNovemberLayout.setVerticalGroup(
            weeksNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksNovemberLayout.createSequentialGroup()
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Nov", weeksNovember);

        weeksDecember.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar23.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar23.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar23.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar23.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar23.getTableHeader().setReorderingAllowed(false);
        jScrollPane27.setViewportView(tblCalendar23);
        if (tblCalendar23.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar23.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar23.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar23.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksDecemberLayout = new javax.swing.GroupLayout(weeksDecember);
        weeksDecember.setLayout(weeksDecemberLayout);
        weeksDecemberLayout.setHorizontalGroup(
            weeksDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        weeksDecemberLayout.setVerticalGroup(
            weeksDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weeksDecemberLayout.createSequentialGroup()
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblBatWeek.addTab("Dec", weeksDecember);

        jSeparator5.setForeground(new java.awt.Color(25, 115, 230));

        chooseLessonLAbel1.setBackground(lessonInputPanel.getBackground());
        chooseLessonLAbel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        chooseLessonLAbel1.setForeground(new java.awt.Color(25, 115, 230));
        chooseLessonLAbel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseLessonLAbel1.setText("Output");

        jSeparator6.setForeground(new java.awt.Color(25, 115, 230));

        outputTeacherArea.setBackground(new java.awt.Color(255, 255, 255));
        outputTeacherArea.setColumns(20);
        outputTeacherArea.setRows(5);
        outputTeacherArea.setText("Choose a week and lesson...");
        jScrollPane3.setViewportView(outputTeacherArea);

        chooseTeacherButton.setBackground(chooseDayLabel.getForeground());
        chooseTeacherButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chooseTeacherButton.setForeground(new java.awt.Color(204, 255, 255));
        chooseTeacherButton.setText("Choose");

        javax.swing.GroupLayout lessonInputPanelLayout = new javax.swing.GroupLayout(lessonInputPanel);
        lessonInputPanel.setLayout(lessonInputPanelLayout);
        lessonInputPanelLayout.setHorizontalGroup(
            lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lessonInputPanelLayout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(chooseLessonLAbel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(lessonInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblBatWeek)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(chooseLessonLAbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(chooseDayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                                .addComponent(findTeacherButton)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                                .addComponent(chooseTeacherButton)
                                .addGap(285, 285, 285))))))
        );
        lessonInputPanelLayout.setVerticalGroup(
            lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lessonInputPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooseDayLabel)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblBatWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooseLessonLAbel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(findTeacherButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooseLessonLAbel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chooseTeacherButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        outputCalendarTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        outputCalendarTabbedPane.setForeground(new java.awt.Color(153, 153, 153));
        outputCalendarTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        outputCalendarTabbedPane.setFocusable(false);
        outputCalendarTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tabJanuary.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar.setForeground(new java.awt.Color(102, 102, 102));
        tblCalendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar.setRowHeight(110);
        tblCalendar.setRowSelectionAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblCalendar);
        if (tblCalendar.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabJanuaryLayout = new javax.swing.GroupLayout(tabJanuary);
        tabJanuary.setLayout(tabJanuaryLayout);
        tabJanuaryLayout.setHorizontalGroup(
            tabJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabJanuaryLayout.setVerticalGroup(
            tabJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jan", tabJanuary);

        tabFebruary.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar2.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar2.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar2.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar2.setRowHeight(110);
        tblCalendar2.setRowSelectionAllowed(false);
        tblCalendar2.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tblCalendar2);
        if (tblCalendar2.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar2.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar2.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar2.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabFebruaryLayout = new javax.swing.GroupLayout(tabFebruary);
        tabFebruary.setLayout(tabFebruaryLayout);
        tabFebruaryLayout.setHorizontalGroup(
            tabFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabFebruaryLayout.setVerticalGroup(
            tabFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Feb", tabFebruary);

        tabMarch.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar3.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar3.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar3.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar3.setRowHeight(110);
        tblCalendar3.setRowSelectionAllowed(false);
        tblCalendar3.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tblCalendar3);
        if (tblCalendar3.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar3.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar3.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar3.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabMarchLayout = new javax.swing.GroupLayout(tabMarch);
        tabMarch.setLayout(tabMarchLayout);
        tabMarchLayout.setHorizontalGroup(
            tabMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabMarchLayout.setVerticalGroup(
            tabMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Mar", tabMarch);

        tabApril.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar4.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar4.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar4.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar4.setRowHeight(110);
        tblCalendar4.setRowSelectionAllowed(false);
        tblCalendar4.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tblCalendar4);
        if (tblCalendar4.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar4.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar4.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar4.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabAprilLayout = new javax.swing.GroupLayout(tabApril);
        tabApril.setLayout(tabAprilLayout);
        tabAprilLayout.setHorizontalGroup(
            tabAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabAprilLayout.setVerticalGroup(
            tabAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Apr", tabApril);

        tabMay.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar10.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar10.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar10.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar10.setRowHeight(110);
        tblCalendar10.setRowSelectionAllowed(false);
        tblCalendar10.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(tblCalendar10);
        if (tblCalendar10.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar10.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar10.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar10.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabMayLayout = new javax.swing.GroupLayout(tabMay);
        tabMay.setLayout(tabMayLayout);
        tabMayLayout.setHorizontalGroup(
            tabMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabMayLayout.setVerticalGroup(
            tabMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("May", tabMay);

        tabJune.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar9.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar9.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar9.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar9.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar9.setRowHeight(110);
        tblCalendar9.setRowSelectionAllowed(false);
        tblCalendar9.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tblCalendar9);
        if (tblCalendar9.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar9.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar9.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar9.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabJuneLayout = new javax.swing.GroupLayout(tabJune);
        tabJune.setLayout(tabJuneLayout);
        tabJuneLayout.setHorizontalGroup(
            tabJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabJuneLayout.setVerticalGroup(
            tabJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jun", tabJune);

        tabJuly.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar8.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar8.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar8.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar8.setRowHeight(110);
        tblCalendar8.setRowSelectionAllowed(false);
        tblCalendar8.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tblCalendar8);
        if (tblCalendar8.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar8.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar8.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar8.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabJulyLayout = new javax.swing.GroupLayout(tabJuly);
        tabJuly.setLayout(tabJulyLayout);
        tabJulyLayout.setHorizontalGroup(
            tabJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabJulyLayout.setVerticalGroup(
            tabJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jul", tabJuly);

        tabAugust.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar11.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar11.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar11.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar11.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar11.setRowHeight(110);
        tblCalendar11.setRowSelectionAllowed(false);
        tblCalendar11.getTableHeader().setReorderingAllowed(false);
        jScrollPane15.setViewportView(tblCalendar11);
        if (tblCalendar11.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar11.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar11.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar11.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabAugustLayout = new javax.swing.GroupLayout(tabAugust);
        tabAugust.setLayout(tabAugustLayout);
        tabAugustLayout.setHorizontalGroup(
            tabAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabAugustLayout.setVerticalGroup(
            tabAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Aug", tabAugust);

        tabSeptember.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar12.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar12.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar12.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar12.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar12.setRowHeight(110);
        tblCalendar12.setRowSelectionAllowed(false);
        tblCalendar12.getTableHeader().setReorderingAllowed(false);
        jScrollPane16.setViewportView(tblCalendar12);
        if (tblCalendar12.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar12.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar12.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar12.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabSeptemberLayout = new javax.swing.GroupLayout(tabSeptember);
        tabSeptember.setLayout(tabSeptemberLayout);
        tabSeptemberLayout.setHorizontalGroup(
            tabSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabSeptemberLayout.setVerticalGroup(
            tabSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Sep", tabSeptember);

        tabOctober.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar13.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar13.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar13.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar13.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar13.setRowHeight(110);
        tblCalendar13.setRowSelectionAllowed(false);
        tblCalendar13.getTableHeader().setReorderingAllowed(false);
        jScrollPane17.setViewportView(tblCalendar13);
        if (tblCalendar13.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar13.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar13.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar13.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabOctoberLayout = new javax.swing.GroupLayout(tabOctober);
        tabOctober.setLayout(tabOctoberLayout);
        tabOctoberLayout.setHorizontalGroup(
            tabOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabOctoberLayout.setVerticalGroup(
            tabOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Oct", tabOctober);

        tabNovember.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar14.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar14.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar14.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar14.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar14.setRowHeight(110);
        tblCalendar14.setRowSelectionAllowed(false);
        tblCalendar14.getTableHeader().setReorderingAllowed(false);
        jScrollPane18.setViewportView(tblCalendar14);
        if (tblCalendar14.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar14.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar14.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar14.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabNovemberLayout = new javax.swing.GroupLayout(tabNovember);
        tabNovember.setLayout(tabNovemberLayout);
        tabNovemberLayout.setHorizontalGroup(
            tabNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabNovemberLayout.setVerticalGroup(
            tabNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Nov", tabNovember);

        tabDecember.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar15.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar15.setForeground(new java.awt.Color(153, 153, 153));
        tblCalendar15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblCalendar15.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCalendar15.setGridColor(new java.awt.Color(102, 102, 102));
        tblCalendar15.setRowHeight(110);
        tblCalendar15.setRowSelectionAllowed(false);
        tblCalendar15.getTableHeader().setReorderingAllowed(false);
        jScrollPane19.setViewportView(tblCalendar15);
        if (tblCalendar15.getColumnModel().getColumnCount() > 0)
        {
            tblCalendar15.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblCalendar15.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblCalendar15.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabDecemberLayout = new javax.swing.GroupLayout(tabDecember);
        tabDecember.setLayout(tabDecemberLayout);
        tabDecemberLayout.setHorizontalGroup(
            tabDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabDecemberLayout.setVerticalGroup(
            tabDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Dec", tabDecember);

        javax.swing.GroupLayout findBatter_PanelLayout = new javax.swing.GroupLayout(findBatter_Panel);
        findBatter_Panel.setLayout(findBatter_PanelLayout);
        findBatter_PanelLayout.setHorizontalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findBatter_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lessonInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outputCalendarTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        findBatter_PanelLayout.setVerticalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputCalendarTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lessonInputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTabbedPane.addTab("Find Batting Teacher", findBatter_Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseClicked
    {//GEN-HEADEREND:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseDragged
    {//GEN-HEADEREND:event_formMouseDragged
        // TODO add your handling code here:
        int mouseX = evt.getXOnScreen();
        int mouseY = evt.getYOnScreen();
        getContentPane().setLocation(
                evt.getXOnScreen() - evt.getX(), 
                evt.getYOnScreen() - evt.getY()
        );
    }//GEN-LAST:event_formMouseDragged

    private void registerClass_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_registerClass_FieldActionPerformed
    {//GEN-HEADEREND:event_registerClass_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerClass_FieldActionPerformed

    private void editableButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editableButtonActionPerformed
    {//GEN-HEADEREND:event_editableButtonActionPerformed
        // TODO add your handling code here:
        teacherComboBox.setEditable(!teacherComboBox.isEditable());
        registerClass_Field.setEditable(!registerClass_Field.isEditable());
        extraMuralsNr_Text.setEditable(!extraMuralsNr_Text.isEditable());
    }//GEN-LAST:event_editableButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        try
        {
             javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        */
        
        try
        {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TeacherScreen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageTeachers_Panel;
    private javax.swing.JSpinner addTeacherEMuralsSpinner;
    private javax.swing.JLabel addTeacherLabel;
    private javax.swing.JTextField addTeacherNameField;
    private javax.swing.JTextField addTeacherSurnameField;
    private javax.swing.JTextField batWeightField;
    private javax.swing.JLabel chooseDayLabel;
    private javax.swing.JLabel chooseLessonLAbel;
    private javax.swing.JLabel chooseLessonLAbel1;
    private javax.swing.JButton chooseTeacherButton;
    private javax.swing.JRadioButton editableButton;
    private javax.swing.JTextField extraMuralsNr_Text;
    private javax.swing.JPanel findBatter_HeaderPanel;
    private javax.swing.JPanel findBatter_Panel;
    private javax.swing.JButton findTeacherButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JSeparator leftAddSplitter;
    private javax.swing.JPanel lessonInputPanel;
    private javax.swing.JTable lessonInputTable;
    private javax.swing.JPanel manageT_HeaderPanel;
    private javax.swing.JTabbedPane outputCalendarTabbedPane;
    private javax.swing.JTextArea outputTeacherArea;
    private javax.swing.JTextField registerClass_Field;
    private javax.swing.JSeparator rightAddSplitter;
    private javax.swing.JPanel tabApril;
    private javax.swing.JPanel tabAugust;
    private javax.swing.JPanel tabDecember;
    private javax.swing.JPanel tabFebruary;
    private javax.swing.JPanel tabJanuary;
    private javax.swing.JPanel tabJuly;
    private javax.swing.JPanel tabJune;
    private javax.swing.JPanel tabMarch;
    private javax.swing.JPanel tabMay;
    private javax.swing.JPanel tabNovember;
    private javax.swing.JPanel tabOctober;
    private javax.swing.JPanel tabSeptember;
    private javax.swing.JTabbedPane tblBatWeek;
    private javax.swing.JTable tblCalendar;
    private javax.swing.JTable tblCalendar1;
    private javax.swing.JTable tblCalendar10;
    private javax.swing.JTable tblCalendar11;
    private javax.swing.JTable tblCalendar12;
    private javax.swing.JTable tblCalendar13;
    private javax.swing.JTable tblCalendar14;
    private javax.swing.JTable tblCalendar15;
    private javax.swing.JTable tblCalendar16;
    private javax.swing.JTable tblCalendar17;
    private javax.swing.JTable tblCalendar18;
    private javax.swing.JTable tblCalendar19;
    private javax.swing.JTable tblCalendar2;
    private javax.swing.JTable tblCalendar20;
    private javax.swing.JTable tblCalendar21;
    private javax.swing.JTable tblCalendar22;
    private javax.swing.JTable tblCalendar23;
    private javax.swing.JTable tblCalendar3;
    private javax.swing.JTable tblCalendar4;
    private javax.swing.JTable tblCalendar5;
    private javax.swing.JTable tblCalendar6;
    private javax.swing.JTable tblCalendar7;
    private javax.swing.JTable tblCalendar8;
    private javax.swing.JTable tblCalendar9;
    private javax.swing.JComboBox<String> teacherComboBox;
    private javax.swing.JTable timetableTable;
    private javax.swing.JPanel weeksApril;
    private javax.swing.JPanel weeksAugust;
    private javax.swing.JPanel weeksDecember;
    private javax.swing.JPanel weeksFebruary;
    private javax.swing.JPanel weeksJanuary;
    private javax.swing.JPanel weeksJuly;
    private javax.swing.JPanel weeksJune;
    private javax.swing.JPanel weeksMarch;
    private javax.swing.JPanel weeksMay;
    private javax.swing.JPanel weeksNovember;
    private javax.swing.JPanel weeksOctober;
    private javax.swing.JPanel weeksSeptember;
    // End of variables declaration//GEN-END:variables
}
