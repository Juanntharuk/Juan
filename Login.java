// // import javax.swing.*;
// // import java.awt.event.*;

// // public class Login extends JFrame implements ActionListener{
// //     JLabel lblUsername, lblPassword;
// //     JTextField txtUsername, txtPassword;
// //     JButton btnLogin, btnExit;

// //     public Login() {
// //         super("Frame Pertama saya");
// //         setSize(400,200);
// //         setLayout(null);
        

// //         lblUsername = new JLabel("Username");
// //         lblUsername.setBounds(20, 30, 80, 30);
// //         // x=

// //         txtUsername = new JTextField();
// //         txtUsername.setBounds(100, 30, 260, 30);

// //         lblPassword = new JLabel("Password");
// //         lblPassword.setBounds(20, 70, 80, 30);
// //         // x=

// //         txtPassword = new JTextField();
// //         txtPassword.setBounds(100, 70, 260, 30);

// //         btnExit = new JButton("Exit");
// //         btnExit.setBounds(280, 110, 80, 30);

// //         btnLogin = new JButton("Login");
// //         btnLogin.setBounds(190, 110, 80, 30);
// //         btnLogin.addActionListener(this);

// //         add(lblUsername);
// //         add(txtUsername);
// //         add(lblPassword);
// //         add(txtPassword);
// //         add(btnExit);
// //         add(btnLogin);

// //         setLocationRelativeTo(null);
// //         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //         setVisible(true);
// //     }

// //     @Override
// //     public void actionPerformed(ActionEvent e) {
// //         String correctUsername = "Juan";
// //         String correctPassword = "1701";

// //         Object password;
// //         Object Username;
// //         if (Username.equals(correctUsername) && password.equals(correctPassword)) {

// //         } else {
// //             // Login gagal, tampilkan pesan
// //             JOptionPane.showMessageDialog(Login.this, "Login Gagal", "Error", JOptionPane.ERROR_MESSAGE);
// //         }
    
// //         new Main();
// //         dispose();
// //     }

// //     public static void main(String[] args) {
// //         new Login();      
// //     }
// // }


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btncancel;

    public Login() {
        super("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Buat panel login
        createLoginPanel();

        // Tambahkan panel login ke frame utama
        add(createLoginPanel());
        setVisible(true);
    }

    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel(null);

        JLabel labelUsername = new JLabel("Username:");
        labelUsername.setBounds(20, 30, 100, 30);
        txtUsername = new JTextField();
        txtUsername.setBounds(100, 30, 160, 30);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(20, 70, 100, 30);
        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 70, 160, 30);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 110, 80, 30);

        btncancel = new JButton("Cancel");
        btncancel.setBounds(250, 110, 80, 30);

        loginPanel.add(labelUsername);
        loginPanel.add(txtUsername);
        loginPanel.add(labelPassword);
        loginPanel.add(txtPassword);
        loginPanel.add(btnLogin);
        loginPanel.add(btncancel);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                // Contoh username dan password yang benar
                String correctUsername = "Juan";
                String correctPassword = "Juan1701";

                if (username.isEmpty()) {
                    JOptionPane.showMessageDialog(Login.this, "Silahkan masukan username anda", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(Login.this, "Silahkan masukan password anda", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if(username.equals(correctUsername) && new String(password).equals(correctPassword)) {
                    // Login berhasil, alihkan ke tabbed pane
                    dispose(); // Menutup frame login
                    new Main(); // Membuka frame utama
                } else  {
                    // Login gagal, tampilkan pesan
                    JOptionPane.showMessageDialog(Login.this, "Login Gagal", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btncancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengosongkan field input
                txtUsername.setText("");
                txtPassword.setText("");    
            }
        });

        return loginPanel;
    }

    public static void main(String[] args) {
        new Login();
    }
}


// import javax.swing.*;
// import java.awt.event.*;

// public class Login extends JFrame implements ActionListener {
//     JLabel lblNama, lblPassword;
//     JTextField txtUsername, txtPassword;
//     JButton btnLogin, btnExit;

//     public Login() {
//         super("Frame Pertama saya");
//         setSize(400, 200);
//         setLayout(null);

//         lblNama = new JLabel("Username");
//         lblNama.setBounds(20, 30, 80, 30);

//         txtUsername = new JTextField();
//         txtUsername.setBounds(100, 30, 280, 30);

//         lblPassword = new JLabel("Password");
//         lblPassword.setBounds(20, 70, 80, 30);

//         txtPassword = new JPasswordField(); 
//         txtPassword.setBounds(100, 70, 280, 30);

//         btnExit = new JButton("Exit");
//         btnExit.setBounds(280, 110, 80, 30);
//         btnExit.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 dispose(); 
//             }
//         });

//         btnLogin = new JButton("Login");
//         btnLogin.setBounds(190, 110, 80, 30);
//         btnLogin.addActionListener(this);

//         add(lblNama);
//         add(txtUsername);
//         add(lblPassword);
//         add(txtPassword);
//         add(btnExit);
//         add(btnLogin);

//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         String username = txtUsername.getText();
//         String password = txtPassword.getText();

//         // Contoh logika autentikasi (ganti dengan yang sesuai)
//         if (username.equals("andri") && password.equals("andri123")) {
//             JOptionPane.showMessageDialog(null, "Login Berhasil!");
//             new Main(); 
//             dispose(); 
//         } else {
//             JOptionPane.showMessageDialog(null, "Login Gagal!");
//         }
//     }

//     public static void main(String[] args) {
//         new Login();
//     }
// }
