/**
 * 
 * ชื่อโปรเจต : RandomRestaraunt JavaGUI Project
 * ผู้จัดทำ : นายวิริทธิ์พล ทับขัน 6530300503
 * หัวข้อที่ใช้กับ Project: GUI , switch-case ,if , else, forLoop, foreach, array, arraylist, hashmap, exception, gui, events ,polymorphism,Generic
 *
 **/
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class RandResProject extends ProjectFont {
    private JFrame frame = new JFrame("RandResProject");
    private Color color = new Color(176,224,230);
    private ReadFiles formExcel = new ReadFiles() ;
    private JPanel panelforMainPage,panelforCheckPage= new JPanel();
    private CheckOpenClose check = new CheckOpenClose();
    private Button button = new Button();
    private Border blackline = BorderFactory.createLineBorder(Color.black);
    RandResProject(){
        setPage();
        createJFrame();
    }
    private void createJFrame(){
        frame.setSize(1000,700);
        frame.getContentPane().setBackground(color);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void setPage(){
//        Section Main Page
        panelforMainPage = new JPanel();
        panelforCheckPage = new JPanel();
        ImageFiles image = new ImageFiles();
        JPanel panelForText = new JPanel();
        JPanel panelForImage = new JPanel();
        JPanel panelForButton = new JPanel();
        JPanel panelForCurrentTime = new JPanel();
        JLabel restarauntImage = new JLabel();
        JLabel projectText = new JLabel("Random Restaurant Near KUSRC");
        restarauntImage.setBorder(blackline);
        restarauntImage.setIcon(image.getImageCover());
        projectText.setFont(getFont().deriveFont(17f).deriveFont(Font.BOLD));
        JLabel currentTimeText = new JLabel("Current Time: " + formExcel.getCurrentTime(),JLabel.CENTER);
        currentTimeText.setFont(getFont().deriveFont(16f).deriveFont(Font.BOLD));
        panelforMainPage.setLayout(new BoxLayout(panelforMainPage,BoxLayout.Y_AXIS));
        currentTimeText.setBorder(blackline);
        Timer timer = new Timer(1000, e -> {
            LocalTime time = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = time.format(formatter);
            currentTimeText.setText("   Current Time: " + formattedTime + "   ");
        });
        timer.start();
        JPanel panelbtnRandom = new JPanel();
        JPanel panelbtnCheck = new JPanel();
        panelbtnRandom.setLayout(new GridBagLayout());
        panelbtnCheck.setLayout(new GridBagLayout());
        panelForText.add(projectText);
        panelForImage.add(restarauntImage);
        panelbtnRandom.add(button.getRandomButton(restarauntImage));
        panelbtnCheck.add(button.getCheckButton(panelforMainPage,panelforCheckPage));
        panelbtnRandom.setBorder(blackline);
        panelbtnCheck.setBorder(blackline);
        panelForButton.add(panelbtnRandom);
        panelForButton.add(Box.createRigidArea(new Dimension(10,0)));
        panelForButton.add( panelbtnCheck);
        panelForCurrentTime.add(currentTimeText);
        panelForText.setBackground(color);
        panelForImage.setBackground(color);
        panelForButton.setBackground(color);
        panelforMainPage.setBackground(color);
        panelForCurrentTime.setBackground(color);
        panelforMainPage.add(Box.createRigidArea(new Dimension(0,10)));
        panelforMainPage.add(panelForText);
        panelforMainPage.add(Box.createRigidArea(new Dimension(0,30)));
        panelforMainPage.add(panelForImage);
        panelforMainPage.add(Box.createRigidArea(new Dimension(0,30)));
        panelforMainPage.add(panelForCurrentTime);
        panelforMainPage.add(Box.createRigidArea(new Dimension(0,30)));
        panelforMainPage.add(panelForButton);
        frame.add(panelforMainPage);

//        Section Check Page
        JPanel panelForTextOpen = new JPanel();
        JPanel panelForTextClose = new JPanel();
        JPanel panelForHold = new JPanel();
        JPanel panelOpen = new JPanel();
        JPanel panelClose = new JPanel();
        JPanel panelTextPage = new JPanel();
        JPanel panelBackButton = new JPanel();
        JPanel panelbtnBack = new JPanel();
        JLabel checkStatus = new JLabel("Check Restaraunt",JLabel.CENTER);
        JLabel open = new JLabel("  Open  ",JLabel.CENTER);
        JLabel close = new JLabel("  Close  ",JLabel.CENTER);
        open.setIcon(image.getOpenIcon());
        close.setIcon(image.getCloseIcon());
        JScrollPane scrollFrameOpen = new JScrollPane(check.getRestarautOpenName());
        JScrollPane scrollFrameClose = new JScrollPane(check.getRestarautCloseName());
        scrollFrameOpen.setPreferredSize(new Dimension( 200,450));
        scrollFrameClose.setPreferredSize(new Dimension( 200,450));
        scrollFrameOpen.setAutoscrolls(true);
        panelForTextOpen.setLayout(new BoxLayout(panelForTextOpen,BoxLayout.Y_AXIS));
        panelForTextClose.setLayout(new BoxLayout( panelForTextClose,BoxLayout.Y_AXIS));
        panelForHold.setLayout(new BoxLayout(panelForHold,BoxLayout.X_AXIS));
        panelforCheckPage.setLayout(new BoxLayout(panelforCheckPage,BoxLayout.Y_AXIS));
        panelforCheckPage.setPreferredSize(new Dimension( 800,600));
        open.setFont(getFont().deriveFont(16f).deriveFont(Font.BOLD));
        close.setFont(getFont().deriveFont(16f).deriveFont(Font.BOLD));
        checkStatus.setFont(getFont().deriveFont(17f).deriveFont(Font.BOLD));
        panelbtnBack.setLayout(new GridBagLayout());
        panelbtnBack.add(button.getBackButton(panelforMainPage,panelforCheckPage));
        panelbtnBack.setBorder(blackline);
        panelBackButton.add(panelbtnBack);
        panelOpen.setBackground(color);
        panelClose.setBackground(color);
        panelForHold.setBackground(color);
        panelTextPage.setBackground(color);
        panelBackButton.setBackground(color);
        panelForTextOpen.setBackground(color);
        panelForTextClose.setBackground(color);
        panelforCheckPage.setBackground(color);
        panelOpen.add(open);
        panelClose.add(close);
        panelTextPage.add(checkStatus);
        panelForTextOpen.add(panelOpen);
        panelForTextOpen.add(Box.createRigidArea(new Dimension(0,10)));
        panelForTextOpen.add(scrollFrameOpen);
        panelForTextClose.add(panelClose);
        panelForTextClose.add(Box.createRigidArea(new Dimension(0,10)));
        panelForTextClose.add(scrollFrameClose);
        panelForHold.add(panelForTextOpen);
        panelForHold.add(Box.createRigidArea(new Dimension(30,0)));
        panelForHold.add(panelForTextClose);
        panelforCheckPage.add(Box.createRigidArea(new Dimension(0,20)));
        panelforCheckPage.add(panelTextPage);
        panelforCheckPage.add(Box.createRigidArea(new Dimension(0,30)));
        panelforCheckPage.add(panelForHold);
        panelforCheckPage.add(Box.createRigidArea(new Dimension(0,20)));
        panelforCheckPage.add(panelBackButton);
        frame.add(panelforCheckPage);
    }

    public static void main(String[] args) {
        new RandResProject();
    }
}
