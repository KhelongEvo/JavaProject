import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class Performance extends FrontEndUI{

	public Performance() {
		// TODO Auto-generated constructor stub
		performed();
	}

	public void performed() {
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PosCalculator cashierDialog = new PosCalculator();
				cashierDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				cashierDialog.setVisible(true);
			}
		});
	}
}
