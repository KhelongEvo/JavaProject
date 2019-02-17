import java.awt.EventQueue;

public class MainWindow {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new pos();
//					new LoginError();
					new FrontEndUI();
					new Performance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
