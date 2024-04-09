import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.String;
import java.util.ArrayList;

public class MenuBar implements ActionListener {
    JFrame mainFrame;
    JFrame frameMathEasy = new JFrame();
    JFrame frameMathMedium = new JFrame();
    JFrame frameMathHard = new JFrame();
    JFrame frameScienceEasy = new JFrame();
    JFrame frameScienceMedium = new JFrame();
    JFrame frameScienceHard = new JFrame();
    JFrame frameEnglishEasy = new JFrame();
    JFrame frameEnglishMedium = new JFrame();
    JFrame frameEnglishHard = new JFrame();

    JRadioButton q1AMathEasy, q1BMathEasy, q1CMathEasy, q1DMathEasy;
    JRadioButton q2AMathEasy, q2BMathEasy, q2CMathEasy, q2DMathEasy;
    JRadioButton q3AMathEasy, q3BMathEasy, q3CMathEasy, q3DMathEasy;
    JRadioButton q4AMathEasy, q4BMathEasy, q4CMathEasy, q4DMathEasy;
    JRadioButton q5AMathEasy, q5BMathEasy, q5CMathEasy, q5DMathEasy;

    JLabel q1MathEasy, q2MathEasy, q3MathEasy, q4MathEasy, q5MathEasy;

    JRadioButton q1AMathMedium, q1BMathMedium, q1CMathMedium, q1DMathMedium;
    JRadioButton q2AMathMedium, q2BMathMedium, q2CMathMedium, q2DMathMedium;
    JRadioButton q3AMathMedium, q3BMathMedium, q3CMathMedium, q3DMathMedium;
    JRadioButton q4AMathMedium, q4BMathMedium, q4CMathMedium, q4DMathMedium;
    JRadioButton q5AMathMedium, q5BMathMedium, q5CMathMedium, q5DMathMedium;

    JLabel q1MathMedium, q2MathMedium, q3MathMedium, q4MathMedium, q5MathMedium, score;

    JRadioButton q1AMathHard, q1BMathHard, q1CMathHard, q1DMathHard;
    JRadioButton q2AMathHard, q2BMathHard, q2CMathHard, q2DMathHard;
    JRadioButton q3AMathHard, q3BMathHard, q3CMathHard, q3DMathHard;
    JRadioButton q4AMathHard, q4BMathHard, q4CMathHard, q4DMathHard;
    JRadioButton q5AMathHard, q5BMathHard, q5CMathHard, q5DMathHard;

    JLabel q1MathHard, q2MathHard, q3MathHard, q4MathHard, q5MathHard;

    JRadioButton q1AScienceEasy, q1BScienceEasy, q1CScienceEasy, q1DScienceEasy;
    JRadioButton q2AScienceEasy, q2BScienceEasy, q2CScienceEasy, q2DScienceEasy;
    JRadioButton q3AScienceEasy, q3BScienceEasy, q3CScienceEasy, q3DScienceEasy;
    JRadioButton q4AScienceEasy, q4BScienceEasy, q4CScienceEasy, q4DScienceEasy;
    JRadioButton q5AScienceEasy, q5BScienceEasy, q5CScienceEasy, q5DScienceEasy;

    JLabel q1ScienceEasy, q2ScienceEasy, q3ScienceEasy, q4ScienceEasy, q5ScienceEasy;

    JRadioButton q1AScienceMedium, q1BScienceMedium, q1CScienceMedium, q1DScienceMedium;
    JRadioButton q2AScienceMedium, q2BScienceMedium, q2CScienceMedium, q2DScienceMedium;
    JRadioButton q3AScienceMedium, q3BScienceMedium, q3CScienceMedium, q3DScienceMedium;
    JRadioButton q4AScienceMedium, q4BScienceMedium, q4CScienceMedium, q4DScienceMedium;
    JRadioButton q5AScienceMedium, q5BScienceMedium, q5CScienceMedium, q5DScienceMedium;

    JLabel q1ScienceMedium, q2ScienceMedium, q3ScienceMedium, q4ScienceMedium, q5ScienceMedium;

    JRadioButton q1AScienceHard, q1BScienceHard, q1CScienceHard, q1DScienceHard;
    JRadioButton q2AScienceHard, q2BScienceHard, q2CScienceHard, q2DScienceHard;
    JRadioButton q3AScienceHard, q3BScienceHard, q3CScienceHard, q3DScienceHard;
    JRadioButton q4AScienceHard, q4BScienceHard, q4CScienceHard, q4DScienceHard;
    JRadioButton q5AScienceHard, q5BScienceHard, q5CScienceHard, q5DScienceHard;

    JLabel q1ScienceHard, q2ScienceHard, q3ScienceHard, q4ScienceHard, q5ScienceHard;

    JRadioButton q1AEnglishEasy, q1BEnglishEasy, q1CEnglishEasy, q1DEnglishEasy;
    JRadioButton q2AEnglishEasy, q2BEnglishEasy, q2CEnglishEasy, q2DEnglishEasy;
    JRadioButton q3AEnglishEasy, q3BEnglishEasy, q3CEnglishEasy, q3DEnglishEasy;
    JRadioButton q4AEnglishEasy, q4BEnglishEasy, q4CEnglishEasy, q4DEnglishEasy;
    JRadioButton q5AEnglishEasy, q5BEnglishEasy, q5CEnglishEasy, q5DEnglishEasy;

    JLabel q1EnglishEasy, q2EnglishEasy, q3EnglishEasy, q4EnglishEasy, q5EnglishEasy;

    JRadioButton q1AEnglishMedium, q1BEnglishMedium, q1CEnglishMedium, q1DEnglishMedium;
    JRadioButton q2AEnglishMedium, q2BEnglishMedium, q2CEnglishMedium, q2DEnglishMedium;
    JRadioButton q3AEnglishMedium, q3BEnglishMedium, q3CEnglishMedium, q3DEnglishMedium;
    JRadioButton q4AEnglishMedium, q4BEnglishMedium, q4CEnglishMedium, q4DEnglishMedium;
    JRadioButton q5AEnglishMedium, q5BEnglishMedium, q5CEnglishMedium, q5DEnglishMedium;

    JLabel q1EnglishMedium, q2EnglishMedium, q3EnglishMedium, q4EnglishMedium, q5EnglishMedium;

    JRadioButton q1AEnglishHard, q1BEnglishHard, q1CEnglishHard, q1DEnglishHard;
    JRadioButton q2AEnglishHard, q2BEnglishHard, q2CEnglishHard, q2DEnglishHard;
    JRadioButton q3AEnglishHard, q3BEnglishHard, q3CEnglishHard, q3DEnglishHard;
    JRadioButton q4AEnglishHard, q4BEnglishHard, q4CEnglishHard, q4DEnglishHard;
    JRadioButton q5AEnglishHard, q5BEnglishHard, q5CEnglishHard, q5DEnglishHard;

    JLabel q1EnglishHard, q2EnglishHard, q3EnglishHard, q4EnglishHard, q5EnglishHard;

    JMenuBar menuBar;

    JMenu English, Science, Maths;

    JMenuItem englishEasy, englishMedium, englishHard, scienceEasy, scienceMedium, scienceHard, mathEasy, mathMedium,mathHard;

    MenuBar() {
        mainFrame = new JFrame();
        englishEasy = new JMenuItem("Easy");
        englishMedium = new JMenuItem("Medium");
        englishHard = new JMenuItem("Hard");
        scienceEasy = new JMenuItem("Easy");
        scienceMedium = new JMenuItem("Medium");
        scienceHard = new JMenuItem("Hard");
        mathEasy = new JMenuItem("Easy");
        mathMedium = new JMenuItem("Medium");
        mathHard = new JMenuItem("Hard");
        englishEasy.addActionListener(this);
        englishMedium.addActionListener(this);
        englishHard.addActionListener(this);
        scienceEasy.addActionListener(this);
        scienceMedium.addActionListener(this);
        scienceHard.addActionListener(this);
        mathEasy.addActionListener(this);
        mathMedium.addActionListener(this);
        mathHard.addActionListener(this);

        menuBar = new JMenuBar();
        Maths = new JMenu("Math");
        Science = new JMenu("Science");
        English = new JMenu("English");

        Maths.add(mathEasy);
        Maths.add(mathMedium);
        Maths.add(mathHard); // adds action listener to maths menu
        Science.add(scienceEasy);
        Science.add(scienceMedium);
        Science.add(scienceHard);
        English.add(englishEasy);
        English.add(englishMedium);
        English.add(englishHard); // adds action listener to english menu
        menuBar.add(Science);
        menuBar.add(Maths);
        menuBar.add(English); // adds menu to menu bar
        mainFrame.add(menuBar); // adds menu bar to frame
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setSize(1000, 1000);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        score = new JLabel("");
        score.setBounds(450,450,100,100);
        mainFrame.add(score);

        // Frame Math Easy

        frameMathEasy.setSize(1000, 1000);

        frameMathEasy.setLayout(null);

        q1MathEasy = new JLabel("Q1  There are 3 red apples and 2 green apples. How many apples are there in total?");

        q1MathEasy.setBounds(50, 50, 1000, 50);

        frameMathEasy.add(q1MathEasy);

        q1AMathEasy = new JRadioButton("A:    4");
        q1BMathEasy = new JRadioButton("B:    5");
        q1CMathEasy = new JRadioButton("C:    6");
        q1DMathEasy = new JRadioButton("D:    7");

        q1AMathEasy.setBounds(50, 100, 100, 50);
        q1BMathEasy.setBounds(150, 100, 100, 50);
        q1CMathEasy.setBounds(250, 100, 100, 50);
        q1DMathEasy.setBounds(350, 100, 100, 50);

        frameMathEasy.add(q1AMathEasy);
        frameMathEasy.add(q1BMathEasy);
        frameMathEasy.add(q1CMathEasy);
        frameMathEasy.add(q1DMathEasy);

        ButtonGroup bgQ1MathEasy = new ButtonGroup();

        bgQ1MathEasy.add(q1AMathEasy);
        bgQ1MathEasy.add(q1BMathEasy);
        bgQ1MathEasy.add(q1CMathEasy);
        bgQ1MathEasy.add(q1DMathEasy);

        q2MathEasy = new JLabel("Q2  There are 5 birds sitting on a branch. 2 fly away. How many birds are left?");

        q2MathEasy.setBounds(50, 150, 1000, 50);

        frameMathEasy.add(q2MathEasy);

        q2AMathEasy = new JRadioButton("A:    1");
        q2BMathEasy = new JRadioButton("B:    2");
        q2CMathEasy = new JRadioButton("C:    3");
        q2DMathEasy = new JRadioButton("D:    4");

        q2AMathEasy.setBounds(50, 200, 100, 50);
        q2BMathEasy.setBounds(150, 200, 100, 50);
        q2CMathEasy.setBounds(250, 200, 100, 50);
        q2DMathEasy.setBounds(350, 200, 100, 50);

        frameMathEasy.add(q2AMathEasy);
        frameMathEasy.add(q2BMathEasy);
        frameMathEasy.add(q2CMathEasy);
        frameMathEasy.add(q2DMathEasy);

        ButtonGroup bgQ2MathEasy = new ButtonGroup();

        bgQ2MathEasy.add(q2AMathEasy);
        bgQ2MathEasy.add(q2BMathEasy);
        bgQ2MathEasy.add(q2CMathEasy);
        bgQ2MathEasy.add(q2DMathEasy);

        q3MathEasy = new JLabel("Q3  Sarah buys 4 balloons and 3 toys. How many items does she have in total?");

        q3MathEasy.setBounds(50, 250, 1000, 50);

        frameMathEasy.add(q3MathEasy);

        q3AMathEasy = new JRadioButton("A:    5");
        q3BMathEasy = new JRadioButton("B:    6");
        q3CMathEasy = new JRadioButton("C:    7");
        q3DMathEasy = new JRadioButton("D:    8");

        q3AMathEasy.setBounds(50, 300, 100, 50);
        q3BMathEasy.setBounds(150, 300, 100, 50);
        q3CMathEasy.setBounds(250, 300, 100, 50);
        q3DMathEasy.setBounds(350, 300, 100, 50);

        frameMathEasy.add(q3AMathEasy);
        frameMathEasy.add(q3BMathEasy);
        frameMathEasy.add(q3CMathEasy);
        frameMathEasy.add(q3DMathEasy);

        ButtonGroup bgq3MathEasy = new ButtonGroup();

        bgq3MathEasy.add(q3AMathEasy);
        bgq3MathEasy.add(q3BMathEasy);
        bgq3MathEasy.add(q3CMathEasy);
        bgq3MathEasy.add(q3DMathEasy);

        q4MathEasy = new JLabel("Q4  12 cookies are shared equally among 3 friends. How many cookies does each friend get?");

        q4MathEasy.setBounds(50, 350, 1000, 50);

        frameMathEasy.add(q4MathEasy);

        q4AMathEasy = new JRadioButton("A:    2");
        q4BMathEasy = new JRadioButton("B:    3");
        q4CMathEasy = new JRadioButton("C:    4");
        q4DMathEasy = new JRadioButton("D:    5");

        q4AMathEasy.setBounds(50, 400, 100, 50);
        q4BMathEasy.setBounds(150, 400, 100, 50);
        q4CMathEasy.setBounds(250, 400, 100, 50);
        q4DMathEasy.setBounds(350, 400, 100, 50);

        frameMathEasy.add(q4AMathEasy);
        frameMathEasy.add(q4BMathEasy);
        frameMathEasy.add(q4CMathEasy);
        frameMathEasy.add(q4DMathEasy);

        ButtonGroup bgq4MathEasy = new ButtonGroup();

        bgq4MathEasy.add(q4AMathEasy);
        bgq4MathEasy.add(q4BMathEasy);
        bgq4MathEasy.add(q4CMathEasy);
        bgq4MathEasy.add(q4DMathEasy);

        q5MathEasy = new JLabel("Q5  A fruit salad has 3 orange slices, 2 strawberry halves, and 1 blueberry. How many pieces of fruit are in the salad?");

        q5MathEasy.setBounds(50, 450, 1000, 50);

        frameMathEasy.add(q5MathEasy);

        q5AMathEasy = new JRadioButton("A:    5");
        q5BMathEasy = new JRadioButton("B:    6");
        q5CMathEasy = new JRadioButton("C:    7");
        q5DMathEasy = new JRadioButton("D:    8");

        q5AMathEasy.setBounds(50, 500, 100, 50);
        q5BMathEasy.setBounds(150, 500, 100, 50);
        q5CMathEasy.setBounds(250, 500, 100, 50);
        q5DMathEasy.setBounds(350, 500, 100, 50);

        frameMathEasy.add(q5AMathEasy);
        frameMathEasy.add(q5BMathEasy);
        frameMathEasy.add(q5CMathEasy);
        frameMathEasy.add(q5DMathEasy);

        ButtonGroup bgQ5MathEasy = new ButtonGroup();

        bgQ5MathEasy.add(q5AMathEasy);
        bgQ5MathEasy.add(q5BMathEasy);
        bgQ5MathEasy.add(q5CMathEasy);
        bgQ5MathEasy.add(q5DMathEasy);

        JButton submitMathEasy = new JButton("Submit");
        submitMathEasy.setBounds(50, 550, 100, 50);
        submitMathEasy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quizScore = 0;

                // Check each question's answer
                if (q1BMathEasy.isSelected()) quizScore++;
                if (q2CMathEasy.isSelected()) quizScore++;
                if (q3CMathEasy.isSelected()) quizScore++;
                if (q4CMathEasy.isSelected()) quizScore++;
                if (q5BMathEasy.isSelected()) quizScore++;

                // Display the score
                String scoreString = Integer.toString(quizScore);
                score.setText("Score: " + scoreString);

                frameMathEasy.setVisible(false);
                mainFrame.setVisible(true);
            }
        });

        frameMathEasy.add(submitMathEasy);

        // frame math medium

        frameMathMedium.setSize(1000, 1000);

        frameMathMedium.setLayout(null);

        q1MathMedium = new JLabel("Q1  5*6");

        q1MathMedium.setBounds(50, 50, 50, 50);

        frameMathMedium.add(q1MathMedium);

        q1AMathMedium = new JRadioButton("A:    30");
        q1BMathMedium = new JRadioButton("B:    39");
        q1CMathMedium = new JRadioButton("C:    32");
        q1DMathMedium = new JRadioButton("D:    45");

        q1AMathMedium.setBounds(50, 100, 100, 50);
        q1BMathMedium.setBounds(150, 100, 100, 50);
        q1CMathMedium.setBounds(250, 100, 100, 50);
        q1DMathMedium.setBounds(350, 100, 100, 50);

        frameMathMedium.add(q1AMathMedium);
        frameMathMedium.add(q1BMathMedium);
        frameMathMedium.add(q1CMathMedium);
        frameMathMedium.add(q1DMathMedium);

        ButtonGroup bgQ1MathMedium = new ButtonGroup();

        bgQ1MathMedium.add(q1AMathMedium);
        bgQ1MathMedium.add(q1BMathMedium);
        bgQ1MathMedium.add(q1CMathMedium);
        bgQ1MathMedium.add(q1DMathMedium);

        q2MathMedium = new JLabel("Q2  36/9");

        q2MathMedium.setBounds(50, 150, 50, 50);

        frameMathMedium.add(q2MathMedium);

        q2AMathMedium = new JRadioButton("A:    4");
        q2BMathMedium = new JRadioButton("B:    6");
        q2CMathMedium = new JRadioButton("C:    3");
        q2DMathMedium = new JRadioButton("D:    8");

        q2AMathMedium.setBounds(50, 200, 100, 50);
        q2BMathMedium.setBounds(150, 200, 100, 50);
        q2CMathMedium.setBounds(250, 200, 100, 50);
        q2DMathMedium.setBounds(350, 200, 100, 50);

        frameMathMedium.add(q2AMathMedium);
        frameMathMedium.add(q2BMathMedium);
        frameMathMedium.add(q2CMathMedium);
        frameMathMedium.add(q2DMathMedium);

        ButtonGroup bgQ2MathMedium = new ButtonGroup();

        bgQ2MathMedium.add(q2AMathMedium);
        bgQ2MathMedium.add(q2BMathMedium);
        bgQ2MathMedium.add(q2CMathMedium);
        bgQ2MathMedium.add(q2DMathMedium);

        q3MathMedium = new JLabel("Q3  7*11");

        q3MathMedium.setBounds(50, 250, 50, 50);

        frameMathMedium.add(q3MathMedium);

        q3AMathMedium = new JRadioButton("A:    77");
        q3BMathMedium = new JRadioButton("B:    70");
        q3CMathMedium = new JRadioButton("C:    87");
        q3DMathMedium = new JRadioButton("D:    72");

        q3AMathMedium.setBounds(50, 300, 100, 50);
        q3BMathMedium.setBounds(150, 300, 100, 50);
        q3CMathMedium.setBounds(250, 300, 100, 50);
        q3DMathMedium.setBounds(350, 300, 100, 50);

        frameMathMedium.add(q3AMathMedium);
        frameMathMedium.add(q3BMathMedium);
        frameMathMedium.add(q3CMathMedium);
        frameMathMedium.add(q3DMathMedium);

        ButtonGroup bgq3MathMedium = new ButtonGroup();

        bgq3MathMedium.add(q3AMathMedium);
        bgq3MathMedium.add(q3BMathMedium);
        bgq3MathMedium.add(q3CMathMedium);
        bgq3MathMedium.add(q3DMathMedium);

        q4MathMedium = new JLabel("Q4  5-8");

        q4MathMedium.setBounds(50, 350, 50, 50);

        frameMathMedium.add(q4MathMedium);

        q4AMathMedium = new JRadioButton("A:    2");
        q4BMathMedium = new JRadioButton("B:    5");
        q4CMathMedium = new JRadioButton("C:    9");
        q4DMathMedium = new JRadioButton("D:    -3");

        q4AMathMedium.setBounds(50, 400, 100, 50);
        q4BMathMedium.setBounds(150, 400, 100, 50);
        q4CMathMedium.setBounds(250, 400, 100, 50);
        q4DMathMedium.setBounds(350, 400, 100, 50);

        frameMathMedium.add(q4AMathMedium);
        frameMathMedium.add(q4BMathMedium);
        frameMathMedium.add(q4CMathMedium);
        frameMathMedium.add(q4DMathMedium);

        ButtonGroup bgq4MathMedium = new ButtonGroup();

        bgq4MathMedium.add(q4AMathMedium);
        bgq4MathMedium.add(q4BMathMedium);
        bgq4MathMedium.add(q4CMathMedium);
        bgq4MathMedium.add(q4DMathMedium);

        q5MathMedium = new JLabel("Q5  13-5");

        q5MathMedium.setBounds(50, 450, 50, 50);

        frameMathMedium.add(q5MathMedium);

        q5AMathMedium = new JRadioButton("A:    6");
        q5BMathMedium = new JRadioButton("B:    8");
        q5CMathMedium = new JRadioButton("C:    3");
        q5DMathMedium = new JRadioButton("D:    12");

        q5AMathMedium.setBounds(50, 500, 100, 50);
        q5BMathMedium.setBounds(150, 500, 100, 50);
        q5CMathMedium.setBounds(250, 500, 100, 50);
        q5DMathMedium.setBounds(350, 500, 100, 50);

        frameMathMedium.add(q5AMathMedium);
        frameMathMedium.add(q5BMathMedium);
        frameMathMedium.add(q5CMathMedium);
        frameMathMedium.add(q5DMathMedium);

        ButtonGroup bgQ5MathMedium = new ButtonGroup();

        bgQ5MathMedium.add(q5AMathMedium);
        bgQ5MathMedium.add(q5BMathMedium);
        bgQ5MathMedium.add(q5CMathMedium);
        bgQ5MathMedium.add(q5DMathMedium);

        JButton submitMathMedium = new JButton("Submit");
        submitMathMedium.setBounds(50, 550, 100, 50);
        submitMathMedium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quizScore = 0;

                // Check each question's answer
                if (q1AMathMedium.isSelected()) quizScore++;
                if (q2AMathMedium.isSelected()) quizScore++;
                if (q3AMathMedium.isSelected()) quizScore++;
                if (q4DMathMedium.isSelected()) quizScore++;
                if (q5BMathMedium.isSelected()) quizScore++;

                // Display the score
                String scoreString = Integer.toString(quizScore);
                score.setText("Score: " + scoreString);

                frameMathMedium.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameMathMedium.add(submitMathMedium);

        frameMathMedium.setVisible(false);

        // frame math hard

        frameMathHard.setSize(1000, 1000);

        frameMathHard.setLayout(null);

        q1MathHard = new JLabel("Q1  1+1");

        q1MathHard.setBounds(50, 50, 50, 50);

        frameMathHard.add(q1MathHard);

        q1AMathHard = new JRadioButton("A:    5");
        q1BMathHard = new JRadioButton("B:    3");
        q1CMathHard = new JRadioButton("C:    2");
        q1DMathHard = new JRadioButton("D:    8");

        q1AMathHard.setBounds(50, 100, 100, 50);
        q1BMathHard.setBounds(150, 100, 100, 50);
        q1CMathHard.setBounds(250, 100, 100, 50);
        q1DMathHard.setBounds(350, 100, 100, 50);

        frameMathHard.add(q1AMathHard);
        frameMathHard.add(q1BMathHard);
        frameMathHard.add(q1CMathHard);
        frameMathHard.add(q1DMathHard);

        ButtonGroup bgQ1MathHard = new ButtonGroup();

        bgQ1MathHard.add(q1AMathHard);
        bgQ1MathHard.add(q1BMathHard);
        bgQ1MathHard.add(q1CMathHard);
        bgQ1MathHard.add(q1DMathHard);

        q2MathHard = new JLabel("Q2  5+5");

        q2MathHard.setBounds(50, 150, 50, 50);

        frameMathHard.add(q2MathHard);

        q2AMathHard = new JRadioButton("A:    15");
        q2BMathHard = new JRadioButton("B:    12");
        q2CMathHard = new JRadioButton("C:    10");
        q2DMathHard = new JRadioButton("D:    8");

        q2AMathHard.setBounds(50, 200, 100, 50);
        q2BMathHard.setBounds(150, 200, 100, 50);
        q2CMathHard.setBounds(250, 200, 100, 50);
        q2DMathHard.setBounds(350, 200, 100, 50);

        frameMathHard.add(q2AMathHard);
        frameMathHard.add(q2BMathHard);
        frameMathHard.add(q2CMathHard);
        frameMathHard.add(q2DMathHard);

        ButtonGroup bgQ2MathHard = new ButtonGroup();

        bgQ2MathHard.add(q2AMathHard);
        bgQ2MathHard.add(q2BMathHard);
        bgQ2MathHard.add(q2CMathHard);
        bgQ2MathHard.add(q2DMathHard);

        q3MathHard = new JLabel("Q3  7+13");

        q3MathHard.setBounds(50, 250, 50, 50);

        frameMathHard.add(q3MathHard);

        q3AMathHard = new JRadioButton("A:    20");
        q3BMathHard = new JRadioButton("B:    0");
        q3CMathHard = new JRadioButton("C:    2");
        q3DMathHard = new JRadioButton("D:    18");

        q3AMathHard.setBounds(50, 300, 100, 50);
        q3BMathHard.setBounds(150, 300, 100, 50);
        q3CMathHard.setBounds(250, 300, 100, 50);
        q3DMathHard.setBounds(350, 300, 100, 50);

        frameMathHard.add(q3AMathHard);
        frameMathHard.add(q3BMathHard);
        frameMathHard.add(q3CMathHard);
        frameMathHard.add(q3DMathHard);

        ButtonGroup bgq3MathHard = new ButtonGroup();

        bgq3MathHard.add(q3AMathHard);
        bgq3MathHard.add(q3BMathHard);
        bgq3MathHard.add(q3CMathHard);
        bgq3MathHard.add(q3DMathHard);

        q4MathHard = new JLabel("Q4  5-8");

        q4MathHard.setBounds(50, 350, 50, 50);

        frameMathHard.add(q4MathHard);

        q4AMathHard = new JRadioButton("A:    2");
        q4BMathHard = new JRadioButton("B:    5");
        q4CMathHard = new JRadioButton("C:    9");
        q4DMathHard = new JRadioButton("D:    -3");

        q4AMathHard.setBounds(50, 400, 100, 50);
        q4BMathHard.setBounds(150, 400, 100, 50);
        q4CMathHard.setBounds(250, 400, 100, 50);
        q4DMathHard.setBounds(350, 400, 100, 50);

        frameMathHard.add(q4AMathHard);
        frameMathHard.add(q4BMathHard);
        frameMathHard.add(q4CMathHard);
        frameMathHard.add(q4DMathHard);

        ButtonGroup bgq4MathHard = new ButtonGroup();

        bgq4MathHard.add(q4AMathHard);
        bgq4MathHard.add(q4BMathHard);
        bgq4MathHard.add(q4CMathHard);
        bgq4MathHard.add(q4DMathHard);

        q5MathHard = new JLabel("Q5  13-5");

        q5MathHard.setBounds(50, 450, 50, 50);

        frameMathHard.add(q5MathHard);

        q5AMathHard = new JRadioButton("A:    6");
        q5BMathHard = new JRadioButton("B:    8");
        q5CMathHard = new JRadioButton("C:    3");
        q5DMathHard = new JRadioButton("D:    12");

        q5AMathHard.setBounds(50, 500, 100, 50);
        q5BMathHard.setBounds(150, 500, 100, 50);
        q5CMathHard.setBounds(250, 500, 100, 50);
        q5DMathHard.setBounds(350, 500, 100, 50);

        frameMathHard.add(q5AMathHard);
        frameMathHard.add(q5BMathHard);
        frameMathHard.add(q5CMathHard);
        frameMathHard.add(q5DMathHard);

        ButtonGroup bgQ5MathHard = new ButtonGroup();

        bgQ5MathHard.add(q5AMathHard);
        bgQ5MathHard.add(q5BMathHard);
        bgQ5MathHard.add(q5CMathHard);
        bgQ5MathHard.add(q5DMathHard);

        JButton submitMathHard = new JButton("Submit");
        submitMathHard.setBounds(50, 550, 100, 50);
        submitMathHard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quizScore = 0;

                // Check each question's answer
                if (q1AMathHard.isSelected()) quizScore++;
                if (q2AMathHard.isSelected()) quizScore++;
                if (q3AMathHard.isSelected()) quizScore++;
                if (q4DMathHard.isSelected()) quizScore++;
                if (q5BMathHard.isSelected()) quizScore++;

                // Display the score
                String scoreString = Integer.toString(quizScore);
                score.setText("Score: " + scoreString);

                frameMathHard.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameMathHard.add(submitMathHard);

        frameMathHard.setVisible(false);

        // frame science easy

        frameScienceEasy.setSize(1000, 1000);

        frameScienceEasy.setLayout(null);

        q1ScienceEasy = new JLabel("Q1  1+1");

        q1ScienceEasy.setBounds(50, 50, 50, 50);

        frameScienceEasy.add(q1ScienceEasy);

        q1AScienceEasy = new JRadioButton("A:    5");
        q1BScienceEasy = new JRadioButton("B:    3");
        q1CScienceEasy = new JRadioButton("C:    2");
        q1DScienceEasy = new JRadioButton("D:    8");

        q1AScienceEasy.setBounds(50, 100, 100, 50);
        q1BScienceEasy.setBounds(150, 100, 100, 50);
        q1CScienceEasy.setBounds(250, 100, 100, 50);
        q1DScienceEasy.setBounds(350, 100, 100, 50);

        frameScienceEasy.add(q1AScienceEasy);
        frameScienceEasy.add(q1BScienceEasy);
        frameScienceEasy.add(q1CScienceEasy);
        frameScienceEasy.add(q1DScienceEasy);

        ButtonGroup bgQ1ScienceEasy = new ButtonGroup();

        bgQ1ScienceEasy.add(q1AScienceEasy);
        bgQ1ScienceEasy.add(q1BScienceEasy);
        bgQ1ScienceEasy.add(q1CScienceEasy);
        bgQ1ScienceEasy.add(q1DScienceEasy);

        q2ScienceEasy = new JLabel("Q2  5+5");

        q2ScienceEasy.setBounds(50, 150, 50, 50);

        frameScienceEasy.add(q2ScienceEasy);

        q2AScienceEasy = new JRadioButton("A:    15");
        q2BScienceEasy = new JRadioButton("B:    12");
        q2CScienceEasy = new JRadioButton("C:    10");
        q2DScienceEasy = new JRadioButton("D:    8");

        q2AScienceEasy.setBounds(50, 200, 100, 50);
        q2BScienceEasy.setBounds(150, 200, 100, 50);
        q2CScienceEasy.setBounds(250, 200, 100, 50);
        q2DScienceEasy.setBounds(350, 200, 100, 50);

        frameScienceEasy.add(q2AScienceEasy);
        frameScienceEasy.add(q2BScienceEasy);
        frameScienceEasy.add(q2CScienceEasy);
        frameScienceEasy.add(q2DScienceEasy);

        ButtonGroup bgQ2ScienceEasy = new ButtonGroup();

        bgQ2ScienceEasy.add(q2AScienceEasy);
        bgQ2ScienceEasy.add(q2BScienceEasy);
        bgQ2ScienceEasy.add(q2CScienceEasy);
        bgQ2ScienceEasy.add(q2DScienceEasy);

        q3ScienceEasy = new JLabel("Q3  7+13");

        q3ScienceEasy.setBounds(50, 250, 50, 50);

        frameScienceEasy.add(q3ScienceEasy);

        q3AScienceEasy = new JRadioButton("A:    20");
        q3BScienceEasy = new JRadioButton("B:    0");
        q3CScienceEasy = new JRadioButton("C:    2");
        q3DScienceEasy = new JRadioButton("D:    18");

        q3AScienceEasy.setBounds(50, 300, 100, 50);
        q3BScienceEasy.setBounds(150, 300, 100, 50);
        q3CScienceEasy.setBounds(250, 300, 100, 50);
        q3DScienceEasy.setBounds(350, 300, 100, 50);

        frameScienceEasy.add(q3AScienceEasy);
        frameScienceEasy.add(q3BScienceEasy);
        frameScienceEasy.add(q3CScienceEasy);
        frameScienceEasy.add(q3DScienceEasy);

        ButtonGroup bgq3ScienceEasy = new ButtonGroup();

        bgq3ScienceEasy.add(q3AScienceEasy);
        bgq3ScienceEasy.add(q3BScienceEasy);
        bgq3ScienceEasy.add(q3CScienceEasy);
        bgq3ScienceEasy.add(q3DScienceEasy);

        q4ScienceEasy = new JLabel("Q4  5-8");

        q4ScienceEasy.setBounds(50, 350, 50, 50);

        frameScienceEasy.add(q4ScienceEasy);

        q4AScienceEasy = new JRadioButton("A:    2");
        q4BScienceEasy = new JRadioButton("B:    5");
        q4CScienceEasy = new JRadioButton("C:    9");
        q4DScienceEasy = new JRadioButton("D:    -3");

        q4AScienceEasy.setBounds(50, 400, 100, 50);
        q4BScienceEasy.setBounds(150, 400, 100, 50);
        q4CScienceEasy.setBounds(250, 400, 100, 50);
        q4DScienceEasy.setBounds(350, 400, 100, 50);

        frameScienceEasy.add(q4AScienceEasy);
        frameScienceEasy.add(q4BScienceEasy);
        frameScienceEasy.add(q4CScienceEasy);
        frameScienceEasy.add(q4DScienceEasy);

        ButtonGroup bgq4ScienceEasy = new ButtonGroup();

        bgq4ScienceEasy.add(q4AScienceEasy);
        bgq4ScienceEasy.add(q4BScienceEasy);
        bgq4ScienceEasy.add(q4CScienceEasy);
        bgq4ScienceEasy.add(q4DScienceEasy);

        q5ScienceEasy = new JLabel("Q5  13-5");

        q5ScienceEasy.setBounds(50, 450, 50, 50);

        frameScienceEasy.add(q5ScienceEasy);

        q5AScienceEasy = new JRadioButton("A:    6");
        q5BScienceEasy = new JRadioButton("B:    8");
        q5CScienceEasy = new JRadioButton("C:    3");
        q5DScienceEasy = new JRadioButton("D:    12");

        q5AScienceEasy.setBounds(50, 500, 100, 50);
        q5BScienceEasy.setBounds(150, 500, 100, 50);
        q5CScienceEasy.setBounds(250, 500, 100, 50);
        q5DScienceEasy.setBounds(350, 500, 100, 50);

        frameScienceEasy.add(q5AScienceEasy);
        frameScienceEasy.add(q5BScienceEasy);
        frameScienceEasy.add(q5CScienceEasy);
        frameScienceEasy.add(q5DScienceEasy);

        ButtonGroup bgQ5ScienceEasy = new ButtonGroup();

        bgQ5ScienceEasy.add(q5AScienceEasy);
        bgQ5ScienceEasy.add(q5BScienceEasy);
        bgQ5ScienceEasy.add(q5CScienceEasy);
        bgQ5ScienceEasy.add(q5DScienceEasy);

        JButton submitScienceEasy = new JButton("Submit");
        submitScienceEasy.setBounds(50, 550, 100, 50);
        submitScienceEasy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("Hello World");
                frameScienceEasy.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameScienceEasy.add(submitScienceEasy);

        frameScienceEasy.setVisible(false);

        // frame science medium

        frameScienceMedium.setSize(1000, 1000);

        frameScienceMedium.setLayout(null);

        q1ScienceMedium = new JLabel("Q1  1+1");

        q1ScienceMedium.setBounds(50, 50, 50, 50);

        frameScienceMedium.add(q1ScienceMedium);

        q1AScienceMedium = new JRadioButton("A:    5");
        q1BScienceMedium = new JRadioButton("B:    3");
        q1CScienceMedium = new JRadioButton("C:    2");
        q1DScienceMedium = new JRadioButton("D:    8");

        q1AScienceMedium.setBounds(50, 100, 100, 50);
        q1BScienceMedium.setBounds(150, 100, 100, 50);
        q1CScienceMedium.setBounds(250, 100, 100, 50);
        q1DScienceMedium.setBounds(350, 100, 100, 50);

        frameScienceMedium.add(q1AScienceMedium);
        frameScienceMedium.add(q1BScienceMedium);
        frameScienceMedium.add(q1CScienceMedium);
        frameScienceMedium.add(q1DScienceMedium);

        ButtonGroup bgQ1ScienceMedium = new ButtonGroup();

        bgQ1ScienceMedium.add(q1AScienceMedium);
        bgQ1ScienceMedium.add(q1BScienceMedium);
        bgQ1ScienceMedium.add(q1CScienceMedium);
        bgQ1ScienceMedium.add(q1DScienceMedium);

        q2ScienceMedium = new JLabel("Q2  5+5");

        q2ScienceMedium.setBounds(50, 150, 50, 50);

        frameScienceMedium.add(q2ScienceMedium);

        q2AScienceMedium = new JRadioButton("A:    15");
        q2BScienceMedium = new JRadioButton("B:    12");
        q2CScienceMedium = new JRadioButton("C:    10");
        q2DScienceMedium = new JRadioButton("D:    8");

        q2AScienceMedium.setBounds(50, 200, 100, 50);
        q2BScienceMedium.setBounds(150, 200, 100, 50);
        q2CScienceMedium.setBounds(250, 200, 100, 50);
        q2DScienceMedium.setBounds(350, 200, 100, 50);

        frameScienceMedium.add(q2AScienceMedium);
        frameScienceMedium.add(q2BScienceMedium);
        frameScienceMedium.add(q2CScienceMedium);
        frameScienceMedium.add(q2DScienceMedium);

        ButtonGroup bgQ2ScienceMedium = new ButtonGroup();

        bgQ2ScienceMedium.add(q2AScienceMedium);
        bgQ2ScienceMedium.add(q2BScienceMedium);
        bgQ2ScienceMedium.add(q2CScienceMedium);
        bgQ2ScienceMedium.add(q2DScienceMedium);

        q3ScienceMedium = new JLabel("Q3  7+13");

        q3ScienceMedium.setBounds(50, 250, 50, 50);

        frameScienceMedium.add(q3ScienceMedium);

        q3AScienceMedium = new JRadioButton("A:    20");
        q3BScienceMedium = new JRadioButton("B:    0");
        q3CScienceMedium = new JRadioButton("C:    2");
        q3DScienceMedium = new JRadioButton("D:    18");

        q3AScienceMedium.setBounds(50, 300, 100, 50);
        q3BScienceMedium.setBounds(150, 300, 100, 50);
        q3CScienceMedium.setBounds(250, 300, 100, 50);
        q3DScienceMedium.setBounds(350, 300, 100, 50);

        frameScienceMedium.add(q3AScienceMedium);
        frameScienceMedium.add(q3BScienceMedium);
        frameScienceMedium.add(q3CScienceMedium);
        frameScienceMedium.add(q3DScienceMedium);

        ButtonGroup bgq3ScienceMedium = new ButtonGroup();

        bgq3ScienceMedium.add(q3AScienceMedium);
        bgq3ScienceMedium.add(q3BScienceMedium);
        bgq3ScienceMedium.add(q3CScienceMedium);
        bgq3ScienceMedium.add(q3DScienceMedium);

        q4ScienceMedium = new JLabel("Q4  5-8");

        q4ScienceMedium.setBounds(50, 350, 50, 50);

        frameScienceMedium.add(q4ScienceMedium);

        q4AScienceMedium = new JRadioButton("A:    2");
        q4BScienceMedium = new JRadioButton("B:    5");
        q4CScienceMedium = new JRadioButton("C:    9");
        q4DScienceMedium = new JRadioButton("D:    -3");

        q4AScienceMedium.setBounds(50, 400, 100, 50);
        q4BScienceMedium.setBounds(150, 400, 100, 50);
        q4CScienceMedium.setBounds(250, 400, 100, 50);
        q4DScienceMedium.setBounds(350, 400, 100, 50);

        frameScienceMedium.add(q4AScienceMedium);
        frameScienceMedium.add(q4BScienceMedium);
        frameScienceMedium.add(q4CScienceMedium);
        frameScienceMedium.add(q4DScienceMedium);

        ButtonGroup bgq4ScienceMedium = new ButtonGroup();

        bgq4ScienceMedium.add(q4AScienceMedium);
        bgq4ScienceMedium.add(q4BScienceMedium);
        bgq4ScienceMedium.add(q4CScienceMedium);
        bgq4ScienceMedium.add(q4DScienceMedium);

        q5ScienceMedium = new JLabel("Q5  13-5");

        q5ScienceMedium.setBounds(50, 450, 50, 50);

        frameScienceMedium.add(q5ScienceMedium);

        q5AScienceMedium = new JRadioButton("A:    6");
        q5BScienceMedium = new JRadioButton("B:    8");
        q5CScienceMedium = new JRadioButton("C:    3");
        q5DScienceMedium = new JRadioButton("D:    12");

        q5AScienceMedium.setBounds(50, 500, 100, 50);
        q5BScienceMedium.setBounds(150, 500, 100, 50);
        q5CScienceMedium.setBounds(250, 500, 100, 50);
        q5DScienceMedium.setBounds(350, 500, 100, 50);

        frameScienceMedium.add(q5AScienceMedium);
        frameScienceMedium.add(q5BScienceMedium);
        frameScienceMedium.add(q5CScienceMedium);
        frameScienceMedium.add(q5DScienceMedium);

        ButtonGroup bgQ5ScienceMedium = new ButtonGroup();

        bgQ5ScienceMedium.add(q5AScienceMedium);
        bgQ5ScienceMedium.add(q5BScienceMedium);
        bgQ5ScienceMedium.add(q5CScienceMedium);
        bgQ5ScienceMedium.add(q5DScienceMedium);

        JButton submitScienceMedium = new JButton("Submit");
        submitScienceMedium.setBounds(50, 550, 100, 50);
        submitScienceMedium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("Hello World");
                frameScienceMedium.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameScienceMedium.add(submitScienceMedium);

        frameScienceMedium.setVisible(false);

        // frame science hard

        frameScienceHard.setSize(1000, 1000);

        frameScienceHard.setLayout(null);

        q1ScienceHard = new JLabel("Q1  1+1");

        q1ScienceHard.setBounds(50, 50, 50, 50);

        frameScienceHard.add(q1ScienceHard);

        q1AScienceHard = new JRadioButton("A:    5");
        q1BScienceHard = new JRadioButton("B:    3");
        q1CScienceHard = new JRadioButton("C:    2");
        q1DScienceHard = new JRadioButton("D:    8");

        q1AScienceHard.setBounds(50, 100, 100, 50);
        q1BScienceHard.setBounds(150, 100, 100, 50);
        q1CScienceHard.setBounds(250, 100, 100, 50);
        q1DScienceHard.setBounds(350, 100, 100, 50);

        frameScienceHard.add(q1AScienceHard);
        frameScienceHard.add(q1BScienceHard);
        frameScienceHard.add(q1CScienceHard);
        frameScienceHard.add(q1DScienceHard);

        ButtonGroup bgQ1ScienceHard = new ButtonGroup();

        bgQ1ScienceHard.add(q1AScienceHard);
        bgQ1ScienceHard.add(q1BScienceHard);
        bgQ1ScienceHard.add(q1CScienceHard);
        bgQ1ScienceHard.add(q1DScienceHard);

        q2ScienceHard = new JLabel("Q2  5+5");

        q2ScienceHard.setBounds(50, 150, 50, 50);

        frameScienceHard.add(q2ScienceHard);

        q2AScienceHard = new JRadioButton("A:    15");
        q2BScienceHard = new JRadioButton("B:    12");
        q2CScienceHard = new JRadioButton("C:    10");
        q2DScienceHard = new JRadioButton("D:    8");

        q2AScienceHard.setBounds(50, 200, 100, 50);
        q2BScienceHard.setBounds(150, 200, 100, 50);
        q2CScienceHard.setBounds(250, 200, 100, 50);
        q2DScienceHard.setBounds(350, 200, 100, 50);

        frameScienceHard.add(q2AScienceHard);
        frameScienceHard.add(q2BScienceHard);
        frameScienceHard.add(q2CScienceHard);
        frameScienceHard.add(q2DScienceHard);

        ButtonGroup bgQ2ScienceHard = new ButtonGroup();

        bgQ2ScienceHard.add(q2AScienceHard);
        bgQ2ScienceHard.add(q2BScienceHard);
        bgQ2ScienceHard.add(q2CScienceHard);
        bgQ2ScienceHard.add(q2DScienceHard);

        q3ScienceHard = new JLabel("Q3  7+13");

        q3ScienceHard.setBounds(50, 250, 50, 50);

        frameScienceHard.add(q3ScienceHard);

        q3AScienceHard = new JRadioButton("A:    20");
        q3BScienceHard = new JRadioButton("B:    0");
        q3CScienceHard = new JRadioButton("C:    2");
        q3DScienceHard = new JRadioButton("D:    18");

        q3AScienceHard.setBounds(50, 300, 100, 50);
        q3BScienceHard.setBounds(150, 300, 100, 50);
        q3CScienceHard.setBounds(250, 300, 100, 50);
        q3DScienceHard.setBounds(350, 300, 100, 50);

        frameScienceHard.add(q3AScienceHard);
        frameScienceHard.add(q3BScienceHard);
        frameScienceHard.add(q3CScienceHard);
        frameScienceHard.add(q3DScienceHard);

        ButtonGroup bgq3ScienceHard = new ButtonGroup();

        bgq3ScienceHard.add(q3AScienceHard);
        bgq3ScienceHard.add(q3BScienceHard);
        bgq3ScienceHard.add(q3CScienceHard);
        bgq3ScienceHard.add(q3DScienceHard);

        q4ScienceHard = new JLabel("Q4  5-8");

        q4ScienceHard.setBounds(50, 350, 50, 50);

        frameScienceHard.add(q4ScienceHard);

        q4AScienceHard = new JRadioButton("A:    2");
        q4BScienceHard = new JRadioButton("B:    5");
        q4CScienceHard = new JRadioButton("C:    9");
        q4DScienceHard = new JRadioButton("D:    -3");

        q4AScienceHard.setBounds(50, 400, 100, 50);
        q4BScienceHard.setBounds(150, 400, 100, 50);
        q4CScienceHard.setBounds(250, 400, 100, 50);
        q4DScienceHard.setBounds(350, 400, 100, 50);

        frameScienceHard.add(q4AScienceHard);
        frameScienceHard.add(q4BScienceHard);
        frameScienceHard.add(q4CScienceHard);
        frameScienceHard.add(q4DScienceHard);

        ButtonGroup bgq4ScienceHard = new ButtonGroup();

        bgq4ScienceHard.add(q4AScienceHard);
        bgq4ScienceHard.add(q4BScienceHard);
        bgq4ScienceHard.add(q4CScienceHard);
        bgq4ScienceHard.add(q4DScienceHard);

        q5ScienceHard = new JLabel("Q5  13-5");

        q5ScienceHard.setBounds(50, 450, 50, 50);

        frameScienceHard.add(q5ScienceHard);

        q5AScienceHard = new JRadioButton("A:    6");
        q5BScienceHard = new JRadioButton("B:    8");
        q5CScienceHard = new JRadioButton("C:    3");
        q5DScienceHard = new JRadioButton("D:    12");

        q5AScienceHard.setBounds(50, 500, 100, 50);
        q5BScienceHard.setBounds(150, 500, 100, 50);
        q5CScienceHard.setBounds(250, 500, 100, 50);
        q5DScienceHard.setBounds(350, 500, 100, 50);

        frameScienceHard.add(q5AScienceHard);
        frameScienceHard.add(q5BScienceHard);
        frameScienceHard.add(q5CScienceHard);
        frameScienceHard.add(q5DScienceHard);

        ButtonGroup bgQ5ScienceHard = new ButtonGroup();

        bgQ5ScienceHard.add(q5AScienceHard);
        bgQ5ScienceHard.add(q5BScienceHard);
        bgQ5ScienceHard.add(q5CScienceHard);
        bgQ5ScienceHard.add(q5DScienceHard);

        JButton submitScienceHard = new JButton("Submit");
        submitScienceHard.setBounds(50, 550, 100, 50);
        submitScienceHard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("Hello World");
                frameScienceHard.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameScienceHard.add(submitScienceHard);

        frameScienceHard.setVisible(false);

        // frame english easy

        frameEnglishEasy.setSize(1000, 1000);

        frameEnglishEasy.setLayout(null);

        q1EnglishEasy = new JLabel("Q1  1+1");

        q1EnglishEasy.setBounds(50, 50, 50, 50);

        frameEnglishEasy.add(q1EnglishEasy);

        q1AEnglishEasy = new JRadioButton("A:    5");
        q1BEnglishEasy = new JRadioButton("B:    3");
        q1CEnglishEasy = new JRadioButton("C:    2");
        q1DEnglishEasy = new JRadioButton("D:    8");

        q1AEnglishEasy.setBounds(50, 100, 100, 50);
        q1BEnglishEasy.setBounds(150, 100, 100, 50);
        q1CEnglishEasy.setBounds(250, 100, 100, 50);
        q1DEnglishEasy.setBounds(350, 100, 100, 50);

        frameEnglishEasy.add(q1AEnglishEasy);
        frameEnglishEasy.add(q1BEnglishEasy);
        frameEnglishEasy.add(q1CEnglishEasy);
        frameEnglishEasy.add(q1DEnglishEasy);

        ButtonGroup bgQ1EnglishEasy = new ButtonGroup();

        bgQ1EnglishEasy.add(q1AEnglishEasy);
        bgQ1EnglishEasy.add(q1BEnglishEasy);
        bgQ1EnglishEasy.add(q1CEnglishEasy);
        bgQ1EnglishEasy.add(q1DEnglishEasy);

        q2EnglishEasy = new JLabel("Q2  5+5");

        q2EnglishEasy.setBounds(50, 150, 50, 50);

        frameEnglishEasy.add(q2EnglishEasy);

        q2AEnglishEasy = new JRadioButton("A:    15");
        q2BEnglishEasy = new JRadioButton("B:    12");
        q2CEnglishEasy = new JRadioButton("C:    10");
        q2DEnglishEasy = new JRadioButton("D:    8");

        q2AEnglishEasy.setBounds(50, 200, 100, 50);
        q2BEnglishEasy.setBounds(150, 200, 100, 50);
        q2CEnglishEasy.setBounds(250, 200, 100, 50);
        q2DEnglishEasy.setBounds(350, 200, 100, 50);

        frameEnglishEasy.add(q2AEnglishEasy);
        frameEnglishEasy.add(q2BEnglishEasy);
        frameEnglishEasy.add(q2CEnglishEasy);
        frameEnglishEasy.add(q2DEnglishEasy);

        ButtonGroup bgQ2EnglishEasy = new ButtonGroup();

        bgQ2EnglishEasy.add(q2AEnglishEasy);
        bgQ2EnglishEasy.add(q2BEnglishEasy);
        bgQ2EnglishEasy.add(q2CEnglishEasy);
        bgQ2EnglishEasy.add(q2DEnglishEasy);

        q3EnglishEasy = new JLabel("Q3  7+13");

        q3EnglishEasy.setBounds(50, 250, 50, 50);

        frameEnglishEasy.add(q3EnglishEasy);

        q3AEnglishEasy = new JRadioButton("A:    20");
        q3BEnglishEasy = new JRadioButton("B:    0");
        q3CEnglishEasy = new JRadioButton("C:    2");
        q3DEnglishEasy = new JRadioButton("D:    18");

        q3AEnglishEasy.setBounds(50, 300, 100, 50);
        q3BEnglishEasy.setBounds(150, 300, 100, 50);
        q3CEnglishEasy.setBounds(250, 300, 100, 50);
        q3DEnglishEasy.setBounds(350, 300, 100, 50);

        frameEnglishEasy.add(q3AEnglishEasy);
        frameEnglishEasy.add(q3BEnglishEasy);
        frameEnglishEasy.add(q3CEnglishEasy);
        frameEnglishEasy.add(q3DEnglishEasy);

        ButtonGroup bgq3EnglishEasy = new ButtonGroup();

        bgq3EnglishEasy.add(q3AEnglishEasy);
        bgq3EnglishEasy.add(q3BEnglishEasy);
        bgq3EnglishEasy.add(q3CEnglishEasy);
        bgq3EnglishEasy.add(q3DEnglishEasy);

        q4EnglishEasy = new JLabel("Q4  5-8");

        q4EnglishEasy.setBounds(50, 350, 50, 50);

        frameEnglishEasy.add(q4EnglishEasy);

        q4AEnglishEasy = new JRadioButton("A:    2");
        q4BEnglishEasy = new JRadioButton("B:    5");
        q4CEnglishEasy = new JRadioButton("C:    9");
        q4DEnglishEasy = new JRadioButton("D:    -3");

        q4AEnglishEasy.setBounds(50, 400, 100, 50);
        q4BEnglishEasy.setBounds(150, 400, 100, 50);
        q4CEnglishEasy.setBounds(250, 400, 100, 50);
        q4DEnglishEasy.setBounds(350, 400, 100, 50);

        frameEnglishEasy.add(q4AEnglishEasy);
        frameEnglishEasy.add(q4BEnglishEasy);
        frameEnglishEasy.add(q4CEnglishEasy);
        frameEnglishEasy.add(q4DEnglishEasy);

        ButtonGroup bgq4EnglishEasy = new ButtonGroup();

        bgq4EnglishEasy.add(q4AEnglishEasy);
        bgq4EnglishEasy.add(q4BEnglishEasy);
        bgq4EnglishEasy.add(q4CEnglishEasy);
        bgq4EnglishEasy.add(q4DEnglishEasy);

        q5EnglishEasy = new JLabel("Q5  13-5");

        q5EnglishEasy.setBounds(50, 450, 50, 50);

        frameEnglishEasy.add(q5EnglishEasy);

        q5AEnglishEasy = new JRadioButton("A:    6");
        q5BEnglishEasy = new JRadioButton("B:    8");
        q5CEnglishEasy = new JRadioButton("C:    3");
        q5DEnglishEasy = new JRadioButton("D:    12");

        q5AEnglishEasy.setBounds(50, 500, 100, 50);
        q5BEnglishEasy.setBounds(150, 500, 100, 50);
        q5CEnglishEasy.setBounds(250, 500, 100, 50);
        q5DEnglishEasy.setBounds(350, 500, 100, 50);

        frameEnglishEasy.add(q5AEnglishEasy);
        frameEnglishEasy.add(q5BEnglishEasy);
        frameEnglishEasy.add(q5CEnglishEasy);
        frameEnglishEasy.add(q5DEnglishEasy);

        ButtonGroup bgQ5EnglishEasy = new ButtonGroup();

        bgQ5EnglishEasy.add(q5AEnglishEasy);
        bgQ5EnglishEasy.add(q5BEnglishEasy);
        bgQ5EnglishEasy.add(q5CEnglishEasy);
        bgQ5EnglishEasy.add(q5DEnglishEasy);

        JButton submitEnglishEasy = new JButton("Submit");
        submitEnglishEasy.setBounds(50, 550, 100, 50);
        submitEnglishEasy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("Hello World");
                frameEnglishEasy.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameEnglishEasy.add(submitEnglishEasy);

        frameEnglishEasy.setVisible(false);

        // frame english medium

        frameEnglishMedium.setSize(1000, 1000);

        frameEnglishMedium.setLayout(null);

        q1EnglishMedium = new JLabel("Q1  1+1");

        q1EnglishMedium.setBounds(50, 50, 50, 50);

        frameEnglishMedium.add(q1EnglishMedium);

        q1AEnglishMedium = new JRadioButton("A:    5");
        q1BEnglishMedium = new JRadioButton("B:    3");
        q1CEnglishMedium = new JRadioButton("C:    2");
        q1DEnglishMedium = new JRadioButton("D:    8");

        q1AEnglishMedium.setBounds(50, 100, 100, 50);
        q1BEnglishMedium.setBounds(150, 100, 100, 50);
        q1CEnglishMedium.setBounds(250, 100, 100, 50);
        q1DEnglishMedium.setBounds(350, 100, 100, 50);

        frameEnglishMedium.add(q1AEnglishMedium);
        frameEnglishMedium.add(q1BEnglishMedium);
        frameEnglishMedium.add(q1CEnglishMedium);
        frameEnglishMedium.add(q1DEnglishMedium);

        ButtonGroup bgQ1EnglishMedium = new ButtonGroup();

        bgQ1EnglishMedium.add(q1AEnglishMedium);
        bgQ1EnglishMedium.add(q1BEnglishMedium);
        bgQ1EnglishMedium.add(q1CEnglishMedium);
        bgQ1EnglishMedium.add(q1DEnglishMedium);

        q2EnglishMedium = new JLabel("Q2  5+5");

        q2EnglishMedium.setBounds(50, 150, 50, 50);

        frameEnglishMedium.add(q2EnglishMedium);

        q2AEnglishMedium = new JRadioButton("A:    15");
        q2BEnglishMedium = new JRadioButton("B:    12");
        q2CEnglishMedium = new JRadioButton("C:    10");
        q2DEnglishMedium = new JRadioButton("D:    8");

        q2AEnglishMedium.setBounds(50, 200, 100, 50);
        q2BEnglishMedium.setBounds(150, 200, 100, 50);
        q2CEnglishMedium.setBounds(250, 200, 100, 50);
        q2DEnglishMedium.setBounds(350, 200, 100, 50);

        frameEnglishMedium.add(q2AEnglishMedium);
        frameEnglishMedium.add(q2BEnglishMedium);
        frameEnglishMedium.add(q2CEnglishMedium);
        frameEnglishMedium.add(q2DEnglishMedium);

        ButtonGroup bgQ2EnglishMedium = new ButtonGroup();

        bgQ2EnglishMedium.add(q2AEnglishMedium);
        bgQ2EnglishMedium.add(q2BEnglishMedium);
        bgQ2EnglishMedium.add(q2CEnglishMedium);
        bgQ2EnglishMedium.add(q2DEnglishMedium);

        q3EnglishMedium = new JLabel("Q3  7+13");

        q3EnglishMedium.setBounds(50, 250, 50, 50);

        frameEnglishMedium.add(q3EnglishMedium);

        q3AEnglishMedium = new JRadioButton("A:    20");
        q3BEnglishMedium = new JRadioButton("B:    0");
        q3CEnglishMedium = new JRadioButton("C:    2");
        q3DEnglishMedium = new JRadioButton("D:    18");

        q3AEnglishMedium.setBounds(50, 300, 100, 50);
        q3BEnglishMedium.setBounds(150, 300, 100, 50);
        q3CEnglishMedium.setBounds(250, 300, 100, 50);
        q3DEnglishMedium.setBounds(350, 300, 100, 50);

        frameEnglishMedium.add(q3AEnglishMedium);
        frameEnglishMedium.add(q3BEnglishMedium);
        frameEnglishMedium.add(q3CEnglishMedium);
        frameEnglishMedium.add(q3DEnglishMedium);

        ButtonGroup bgq3EnglishMedium = new ButtonGroup();

        bgq3EnglishMedium.add(q3AEnglishMedium);
        bgq3EnglishMedium.add(q3BEnglishMedium);
        bgq3EnglishMedium.add(q3CEnglishMedium);
        bgq3EnglishMedium.add(q3DEnglishMedium);

        q4EnglishMedium = new JLabel("Q4  5-8");

        q4EnglishMedium.setBounds(50, 350, 50, 50);

        frameEnglishMedium.add(q4EnglishMedium);

        q4AEnglishMedium = new JRadioButton("A:    2");
        q4BEnglishMedium = new JRadioButton("B:    5");
        q4CEnglishMedium = new JRadioButton("C:    9");
        q4DEnglishMedium = new JRadioButton("D:    -3");

        q4AEnglishMedium.setBounds(50, 400, 100, 50);
        q4BEnglishMedium.setBounds(150, 400, 100, 50);
        q4CEnglishMedium.setBounds(250, 400, 100, 50);
        q4DEnglishMedium.setBounds(350, 400, 100, 50);

        frameEnglishMedium.add(q4AEnglishMedium);
        frameEnglishMedium.add(q4BEnglishMedium);
        frameEnglishMedium.add(q4CEnglishMedium);
        frameEnglishMedium.add(q4DEnglishMedium);

        ButtonGroup bgq4EnglishMedium = new ButtonGroup();

        bgq4EnglishMedium.add(q4AEnglishMedium);
        bgq4EnglishMedium.add(q4BEnglishMedium);
        bgq4EnglishMedium.add(q4CEnglishMedium);
        bgq4EnglishMedium.add(q4DEnglishMedium);

        q5EnglishMedium = new JLabel("Q5  13-5");

        q5EnglishMedium.setBounds(50, 450, 50, 50);

        frameEnglishMedium.add(q5EnglishMedium);

        q5AEnglishMedium = new JRadioButton("A:    6");
        q5BEnglishMedium = new JRadioButton("B:    8");
        q5CEnglishMedium = new JRadioButton("C:    3");
        q5DEnglishMedium = new JRadioButton("D:    12");

        q5AEnglishMedium.setBounds(50, 500, 100, 50);
        q5BEnglishMedium.setBounds(150, 500, 100, 50);
        q5CEnglishMedium.setBounds(250, 500, 100, 50);
        q5DEnglishMedium.setBounds(350, 500, 100, 50);

        frameEnglishMedium.add(q5AEnglishMedium);
        frameEnglishMedium.add(q5BEnglishMedium);
        frameEnglishMedium.add(q5CEnglishMedium);
        frameEnglishMedium.add(q5DEnglishMedium);

        ButtonGroup bgQ5EnglishMedium = new ButtonGroup();

        bgQ5EnglishMedium.add(q5AEnglishMedium);
        bgQ5EnglishMedium.add(q5BEnglishMedium);
        bgQ5EnglishMedium.add(q5CEnglishMedium);
        bgQ5EnglishMedium.add(q5DEnglishMedium);

        JButton submitEnglishMedium = new JButton("Submit");
        submitEnglishMedium.setBounds(50, 550, 100, 50);
        submitEnglishMedium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("Hello World");
                frameEnglishMedium.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameEnglishMedium.add(submitEnglishMedium);

        frameEnglishMedium.setVisible(false);

        // frame english hard

        frameEnglishHard.setSize(1000, 1000);

        frameEnglishHard.setLayout(null);

        q1EnglishHard = new JLabel("Q1  1+1");

        q1EnglishHard.setBounds(50, 50, 50, 50);

        frameEnglishHard.add(q1EnglishHard);

        q1AEnglishHard = new JRadioButton("A:    5");
        q1BEnglishHard = new JRadioButton("B:    3");
        q1CEnglishHard = new JRadioButton("C:    2");
        q1DEnglishHard = new JRadioButton("D:    8");

        q1AEnglishHard.setBounds(50, 100, 100, 50);
        q1BEnglishHard.setBounds(150, 100, 100, 50);
        q1CEnglishHard.setBounds(250, 100, 100, 50);
        q1DEnglishHard.setBounds(350, 100, 100, 50);

        frameEnglishHard.add(q1AEnglishHard);
        frameEnglishHard.add(q1BEnglishHard);
        frameEnglishHard.add(q1CEnglishHard);
        frameEnglishHard.add(q1DEnglishHard);

        ButtonGroup bgQ1EnglishHard = new ButtonGroup();

        bgQ1EnglishHard.add(q1AEnglishHard);
        bgQ1EnglishHard.add(q1BEnglishHard);
        bgQ1EnglishHard.add(q1CEnglishHard);
        bgQ1EnglishHard.add(q1DEnglishHard);

        q2EnglishHard = new JLabel("Q2  5+5");

        q2EnglishHard.setBounds(50, 150, 50, 50);

        frameEnglishHard.add(q2EnglishHard);

        q2AEnglishHard = new JRadioButton("A:    15");
        q2BEnglishHard = new JRadioButton("B:    12");
        q2CEnglishHard = new JRadioButton("C:    10");
        q2DEnglishHard = new JRadioButton("D:    8");

        q2AEnglishHard.setBounds(50, 200, 100, 50);
        q2BEnglishHard.setBounds(150, 200, 100, 50);
        q2CEnglishHard.setBounds(250, 200, 100, 50);
        q2DEnglishHard.setBounds(350, 200, 100, 50);

        frameEnglishHard.add(q2AEnglishHard);
        frameEnglishHard.add(q2BEnglishHard);
        frameEnglishHard.add(q2CEnglishHard);
        frameEnglishHard.add(q2DEnglishHard);

        ButtonGroup bgQ2EnglishHard = new ButtonGroup();

        bgQ2EnglishHard.add(q2AEnglishHard);
        bgQ2EnglishHard.add(q2BEnglishHard);
        bgQ2EnglishHard.add(q2CEnglishHard);
        bgQ2EnglishHard.add(q2DEnglishHard);

        q3EnglishHard = new JLabel("Q3  7+13");

        q3EnglishHard.setBounds(50, 250, 50, 50);

        frameEnglishHard.add(q3EnglishHard);

        q3AEnglishHard = new JRadioButton("A:    20");
        q3BEnglishHard = new JRadioButton("B:    0");
        q3CEnglishHard = new JRadioButton("C:    2");
        q3DEnglishHard = new JRadioButton("D:    18");

        q3AEnglishHard.setBounds(50, 300, 100, 50);
        q3BEnglishHard.setBounds(150, 300, 100, 50);
        q3CEnglishHard.setBounds(250, 300, 100, 50);
        q3DEnglishHard.setBounds(350, 300, 100, 50);

        frameEnglishHard.add(q3AEnglishHard);
        frameEnglishHard.add(q3BEnglishHard);
        frameEnglishHard.add(q3CEnglishHard);
        frameEnglishHard.add(q3DEnglishHard);

        ButtonGroup bgq3EnglishHard = new ButtonGroup();

        bgq3EnglishHard.add(q3AEnglishHard);
        bgq3EnglishHard.add(q3BEnglishHard);
        bgq3EnglishHard.add(q3CEnglishHard);
        bgq3EnglishHard.add(q3DEnglishHard);

        q4EnglishHard = new JLabel("Q4  5-8");

        q4EnglishHard.setBounds(50, 350, 50, 50);

        frameEnglishHard.add(q4EnglishHard);

        q4AEnglishHard = new JRadioButton("A:    2");
        q4BEnglishHard = new JRadioButton("B:    5");
        q4CEnglishHard = new JRadioButton("C:    9");
        q4DEnglishHard = new JRadioButton("D:    -3");

        q4AEnglishHard.setBounds(50, 400, 100, 50);
        q4BEnglishHard.setBounds(150, 400, 100, 50);
        q4CEnglishHard.setBounds(250, 400, 100, 50);
        q4DEnglishHard.setBounds(350, 400, 100, 50);

        frameEnglishHard.add(q4AEnglishHard);
        frameEnglishHard.add(q4BEnglishHard);
        frameEnglishHard.add(q4CEnglishHard);
        frameEnglishHard.add(q4DEnglishHard);

        ButtonGroup bgq4EnglishHard = new ButtonGroup();

        bgq4EnglishHard.add(q4AEnglishHard);
        bgq4EnglishHard.add(q4BEnglishHard);
        bgq4EnglishHard.add(q4CEnglishHard);
        bgq4EnglishHard.add(q4DEnglishHard);

        q5EnglishHard = new JLabel("Q5  13-5");

        q5EnglishHard.setBounds(50, 450, 50, 50);

        frameEnglishHard.add(q5EnglishHard);

        q5AEnglishHard = new JRadioButton("A:    6");
        q5BEnglishHard = new JRadioButton("B:    8");
        q5CEnglishHard = new JRadioButton("C:    3");
        q5DEnglishHard = new JRadioButton("D:    12");

        q5AEnglishHard.setBounds(50, 500, 100, 50);
        q5BEnglishHard.setBounds(150, 500, 100, 50);
        q5CEnglishHard.setBounds(250, 500, 100, 50);
        q5DEnglishHard.setBounds(350, 500, 100, 50);

        frameEnglishHard.add(q5AEnglishHard);
        frameEnglishHard.add(q5BEnglishHard);
        frameEnglishHard.add(q5CEnglishHard);
        frameEnglishHard.add(q5DEnglishHard);

        ButtonGroup bgQ5EnglishHard = new ButtonGroup();

        bgQ5EnglishHard.add(q5AEnglishHard);
        bgQ5EnglishHard.add(q5BEnglishHard);
        bgQ5EnglishHard.add(q5CEnglishHard);
        bgQ5EnglishHard.add(q5DEnglishHard);

        JButton submitEnglishHard = new JButton("Submit");
        submitEnglishHard.setBounds(50, 550, 100, 50);
        submitEnglishHard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setText("Hello World");
                frameEnglishHard.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        frameEnglishHard.add(submitEnglishHard);

        frameEnglishHard.setVisible(false);
    }

        //calling action listener
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mathEasy) {
	        mainFrame.setVisible(false);
	        frameMathEasy.setVisible(true);
        }
        if(e.getSource()==mathMedium){ 
            mainFrame.setVisible(false);
	        frameMathMedium.setVisible(true);
        }
        if(e.getSource()==mathHard){
            mainFrame.setVisible(false);
	        frameMathHard.setVisible(true);
        }
        if(e.getSource()==scienceEasy){
            mainFrame.setVisible(false);
	        frameScienceEasy.setVisible(true);
        }
        if(e.getSource()==scienceMedium){
            mainFrame.setVisible(false);
	        frameScienceMedium.setVisible(true);
        }
        if(e.getSource()==scienceHard){
            mainFrame.setVisible(false);
	        frameScienceHard.setVisible(true);
        }
        if(e.getSource()==englishEasy){
            mainFrame.setVisible(false);
	        frameEnglishEasy.setVisible(true);
        }
        if(e.getSource()==englishMedium){
            mainFrame.setVisible(false);
	        frameEnglishMedium.setVisible(true);
        }
        if(e.getSource()==englishHard){
            mainFrame.setVisible(false);
	        frameEnglishHard.setVisible(true);
        }

    }

    public static void main(String[] args) {
        MenuBar q = new MenuBar();
    }
}