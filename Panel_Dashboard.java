import javax.swing.*;
import java.awt.*;

public class Panel_Dashboard extends JPanel {
    JLabel labelJudul, labelLogo,labelcontent;
    JButton backButton;

    public Panel_Dashboard() {
        // super("Dashboard");
        setSize(700, 540);
        setLayout(null);
        setBackground(new Color(230, 230, 250));


        // Judul atau label untuk frame Dashboard
        labelJudul = new JLabel("Selamat datang di situs resmi Universitas Nusa Nipa");
        labelJudul.setBounds(130, 80, 480, 30);
        labelJudul.setFont(new Font("Arial", Font.BOLD, 18));

        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/unipa1.png"));// Path relatif ke file logo
        labelLogo = new JLabel(logoIcon);
        labelLogo.setBounds(150, 80, 400, 300);

        labelcontent = new JLabel("Semoga Membantu");
        labelcontent.setBounds(270,350,480,30);
        labelcontent.setFont(new Font("Arial", Font.BOLD, 18));

        add(labelJudul);
        add(labelLogo);
        add(labelcontent);

        // Contoh informasi data (jumlah data)
        // labelLogo = new JLabel("Jumlah Data: 10");
        // labelLogo.setBounds(50, 80, 200, 30);
        // add(labelLogo);

        // setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Panel_Dashboard();
    }
}
