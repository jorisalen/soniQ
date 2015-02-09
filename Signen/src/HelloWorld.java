import javax.swing.JOptionPane;


public class HelloWorld {

	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, "LOLOLOLOLOLOLOLOLOLOLOL");
		try{
			System.getProperty("user.dir");
			JOptionPane.showMessageDialog(null, "gelukt!");
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.toString());
		}
		
	}

}
