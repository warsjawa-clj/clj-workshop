(import 'javax.swing.JFrame)
(def frame (JFrame. "Hello Frame"))
(.setSize frame 200 200)
(.setVisible frame true)

(import 'javax.swing.JPanel)
(def panel (JPanel.))
(.setContentPane frame panel)

(import 'javax.swing.JButton)
(def button (JButton. "Click Me!"))
(.add panel button)

(.revalidate button) ;required by the repl

(import 'javax.swing.JOptionPane)
(defn say-hello []
  (JOptionPane/showMessageDialog
    nil "Hello, World!" "Greeting"
    JOptionPane/INFORMATION_MESSAGE))

(import 'java.awt.event.ActionListener)
(def act (proxy [ActionListener] []
           (actionPerformed [event] (say-hello))))

(.addActionListener button act)
