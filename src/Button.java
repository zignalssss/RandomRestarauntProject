import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Button extends ProjectFont{

    private CheckOpenClose check = new CheckOpenClose();
    private ImageFiles image = new ImageFiles();
    private Color color = new Color(70,130,180);
    private Border emptyBorder = BorderFactory.createEmptyBorder();

    private int checkClicked=0;

    public JButton getRandomButton(JLabel restarauntImage){
        JButton buttonRandom = new JButton("  Random  ");
        buttonRandom.setBackground(color);
        buttonRandom.setBorder(emptyBorder);
        buttonRandom.setFont(getFont().deriveFont(16f).deriveFont(Font.BOLD));
        buttonRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check.getSortOpenRestarauntArr().isEmpty()){
                    restarauntImage.setIcon(image.getCloseCover());
                }else{
                    check.getRestarauntIndex(check.RandomIndex());
                    restarauntImage.setIcon(image.getRandomImage(check.getRandomIndex()));
                }
            }
        });
        buttonRandom.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                checkClicked=1;
                buttonRandom.setContentAreaFilled(false);
                buttonRandom.setOpaque(true);
                buttonRandom.setBackground(color);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(checkClicked == 0)
                    buttonRandom.setBackground(new Color(30,144,255));
                checkClicked = 0;
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if(checkClicked == 0)
                    buttonRandom.setBackground(color);
                checkClicked = 0;
            }
        });
        return buttonRandom;
    }
    public JButton getCheckButton(JPanel MainFrame, JPanel CheckPage){
        JButton buttonCheck = new JButton("  Check  ");
        buttonCheck.setBackground(color);
        buttonCheck.setBorder(emptyBorder);
        buttonCheck.setFont(getFont().deriveFont(16f).deriveFont(Font.BOLD));
        buttonCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.setVisible(false);
                CheckPage.setVisible(true);
            }
        });
        buttonCheck.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                checkClicked=1;
                buttonCheck.setContentAreaFilled(false);
                buttonCheck.setOpaque(true);
                buttonCheck.setBackground(color);

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(checkClicked == 0)
                    buttonCheck.setBackground(new Color(30,144,255));
                checkClicked = 0;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if(checkClicked == 0)
                    buttonCheck.setBackground(color);
                checkClicked = 0;
            }
        });
        return buttonCheck;
    }
    public JButton getBackButton(JPanel MainFrame, JPanel CheckPage){
        JButton backButton = new JButton("   Back   ");
        backButton.setBackground(color);
        backButton.setBorder(emptyBorder);
        backButton.setFont(getFont().deriveFont(16f).deriveFont(Font.BOLD));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.setVisible(true);
                CheckPage.setVisible(false);
            }
        });
        backButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                checkClicked=1;
                backButton.setContentAreaFilled(false);
                backButton.setOpaque(true);
                backButton.setBackground(color);

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(checkClicked == 0)
                    backButton.setBackground(new Color(30,144,255));
                checkClicked = 0;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if(checkClicked == 0)
                    backButton.setBackground(color);
                checkClicked = 0;
            }
        });
        return backButton;
    }
}
