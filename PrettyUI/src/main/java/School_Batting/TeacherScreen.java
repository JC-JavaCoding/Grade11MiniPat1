/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package School_Batting;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;

/**
 *
 * @author Jcj
 */
public class TeacherScreen extends javax.swing.JFrame
{

    /**
     * Creates new form TeacherScreen
     */
    public TeacherScreen()
    {
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
        int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
        
        initComponents();
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
        jLabel7 = new javax.swing.JLabel();
        outputCalendarTabbedPane = new javax.swing.JTabbedPane();
        tabJanuary = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCalendar = new javax.swing.JTable();
        tabFebruary = new javax.swing.JPanel();
        tabMarch = new javax.swing.JPanel();
        tabApril = new javax.swing.JPanel();
        tabMay = new javax.swing.JPanel();
        tabJune = new javax.swing.JPanel();
        tabJuly = new javax.swing.JPanel();
        tabAugust = new javax.swing.JPanel();
        tabSeptember = new javax.swing.JPanel();
        tabOctober = new javax.swing.JPanel();
        tabNovember = new javax.swing.JPanel();
        tabDecember = new javax.swing.JPanel();

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
        headerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        headerPanel.setMaximumSize(new java.awt.Dimension(1042, 129));
        headerPanel.setName(""); // NOI18N
        headerPanel.setPreferredSize(new java.awt.Dimension(1600, 130));

        jButton1.setBackground(headerPanel.getBackground());
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel7.setBackground(lessonInputPanel.getBackground());
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 115, 230));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Choose Lesson");

        javax.swing.GroupLayout lessonInputPanelLayout = new javax.swing.GroupLayout(lessonInputPanel);
        lessonInputPanel.setLayout(lessonInputPanelLayout);
        lessonInputPanelLayout.setHorizontalGroup(
            lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        lessonInputPanelLayout.setVerticalGroup(
            lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lessonInputPanelLayout.createSequentialGroup()
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputCalendarTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        outputCalendarTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        outputCalendarTabbedPane.setFocusable(false);

        tabJanuary.setBackground(new java.awt.Color(255, 255, 255));

        tblCalendar.setBackground(new java.awt.Color(255, 255, 255));
        tblCalendar.setForeground(new java.awt.Color(153, 153, 153));
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
        jScrollPane2.setViewportView(tblCalendar);

        javax.swing.GroupLayout tabJanuaryLayout = new javax.swing.GroupLayout(tabJanuary);
        tabJanuary.setLayout(tabJanuaryLayout);
        tabJanuaryLayout.setHorizontalGroup(
            tabJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        tabJanuaryLayout.setVerticalGroup(
            tabJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jan", tabJanuary);

        javax.swing.GroupLayout tabFebruaryLayout = new javax.swing.GroupLayout(tabFebruary);
        tabFebruary.setLayout(tabFebruaryLayout);
        tabFebruaryLayout.setHorizontalGroup(
            tabFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabFebruaryLayout.setVerticalGroup(
            tabFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Feb", tabFebruary);

        javax.swing.GroupLayout tabMarchLayout = new javax.swing.GroupLayout(tabMarch);
        tabMarch.setLayout(tabMarchLayout);
        tabMarchLayout.setHorizontalGroup(
            tabMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabMarchLayout.setVerticalGroup(
            tabMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Mar", tabMarch);

        javax.swing.GroupLayout tabAprilLayout = new javax.swing.GroupLayout(tabApril);
        tabApril.setLayout(tabAprilLayout);
        tabAprilLayout.setHorizontalGroup(
            tabAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabAprilLayout.setVerticalGroup(
            tabAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Apr", tabApril);

        javax.swing.GroupLayout tabMayLayout = new javax.swing.GroupLayout(tabMay);
        tabMay.setLayout(tabMayLayout);
        tabMayLayout.setHorizontalGroup(
            tabMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabMayLayout.setVerticalGroup(
            tabMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("May", tabMay);

        javax.swing.GroupLayout tabJuneLayout = new javax.swing.GroupLayout(tabJune);
        tabJune.setLayout(tabJuneLayout);
        tabJuneLayout.setHorizontalGroup(
            tabJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabJuneLayout.setVerticalGroup(
            tabJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jun", tabJune);

        javax.swing.GroupLayout tabJulyLayout = new javax.swing.GroupLayout(tabJuly);
        tabJuly.setLayout(tabJulyLayout);
        tabJulyLayout.setHorizontalGroup(
            tabJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabJulyLayout.setVerticalGroup(
            tabJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jul", tabJuly);

        javax.swing.GroupLayout tabAugustLayout = new javax.swing.GroupLayout(tabAugust);
        tabAugust.setLayout(tabAugustLayout);
        tabAugustLayout.setHorizontalGroup(
            tabAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabAugustLayout.setVerticalGroup(
            tabAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Aug", tabAugust);

        javax.swing.GroupLayout tabSeptemberLayout = new javax.swing.GroupLayout(tabSeptember);
        tabSeptember.setLayout(tabSeptemberLayout);
        tabSeptemberLayout.setHorizontalGroup(
            tabSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabSeptemberLayout.setVerticalGroup(
            tabSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Sep", tabSeptember);

        javax.swing.GroupLayout tabOctoberLayout = new javax.swing.GroupLayout(tabOctober);
        tabOctober.setLayout(tabOctoberLayout);
        tabOctoberLayout.setHorizontalGroup(
            tabOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabOctoberLayout.setVerticalGroup(
            tabOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Oct", tabOctober);

        javax.swing.GroupLayout tabNovemberLayout = new javax.swing.GroupLayout(tabNovember);
        tabNovember.setLayout(tabNovemberLayout);
        tabNovemberLayout.setHorizontalGroup(
            tabNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabNovemberLayout.setVerticalGroup(
            tabNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Nov", tabNovember);

        javax.swing.GroupLayout tabDecemberLayout = new javax.swing.GroupLayout(tabDecember);
        tabDecember.setLayout(tabDecemberLayout);
        tabDecemberLayout.setHorizontalGroup(
            tabDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tabDecemberLayout.setVerticalGroup(
            tabDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Dec", tabDecember);

        javax.swing.GroupLayout findBatter_PanelLayout = new javax.swing.GroupLayout(findBatter_Panel);
        findBatter_Panel.setLayout(findBatter_PanelLayout);
        findBatter_PanelLayout.setHorizontalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findBatter_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lessonInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputCalendarTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        findBatter_PanelLayout.setVerticalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findBatter_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lessonInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(findBatter_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(outputCalendarTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TeacherScreen().setVisible(true);
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
    private javax.swing.JRadioButton editableButton;
    private javax.swing.JTextField extraMuralsNr_Text;
    private javax.swing.JPanel findBatter_HeaderPanel;
    private javax.swing.JPanel findBatter_Panel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JSeparator leftAddSplitter;
    private javax.swing.JPanel lessonInputPanel;
    private javax.swing.JPanel manageT_HeaderPanel;
    private javax.swing.JTabbedPane outputCalendarTabbedPane;
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
    private javax.swing.JTable tblCalendar;
    private javax.swing.JComboBox<String> teacherComboBox;
    private javax.swing.JTable timetableTable;
    // End of variables declaration//GEN-END:variables
}
