
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AboutDialogs  extends JDialog implements ActionListener{

	private JButton OKButton;
	
	public AboutDialogs(JFrame parent, String title, boolean modal) {
		super();
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		StringBuffer text = new StringBuffer();
		
		text.append("Calculator About:\n\n");
		text.append("Java Swing Calculator\n");
		text.append("Developer:	@naomijub\n");
		text.append("Version:	1.3");
		
		JTextArea textArea = new JTextArea(5, 21);
		textArea.setText(text.toString());
		textArea.setFont(new Font("Times New Roman", 1, 12));
		textArea.setEditable(false);
		
		p1.add(textArea);
		p1.setBackground(Color.WHITE);
		getContentPane().add(p1, BorderLayout.CENTER);
		
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		OKButton = new JButton(" OK ");
		OKButton.addActionListener(this);
		p2.add(OKButton);
		
		getContentPane().add(p2, BorderLayout.SOUTH);
		
		setSize(300, 200);
		setLocation(50,50);
		pack();
		
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				Window aboutDialog = e.getWindow();
				aboutDialog.dispose();
			}
		});
		parent.pack();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == OKButton) {
			this.dispose();
		}
	}
}
