import javax.swing.JOptionPane;

public class PRÆm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a =JOptionPane.showInputDialog(null);
		int b= Integer.parseInt(a);
	boolean isPrime=true;
		for (int i=2; i<b;i++) {
			if (b%i==0) {
				isPrime=false;
				
			}
			}
		
	if (isPrime) {JOptionPane.showMessageDialog(null, "Prime!!!");
	}else {JOptionPane.showMessageDialog(null,"Composite!");}
	

}
}
