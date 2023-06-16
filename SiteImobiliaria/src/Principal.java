import java.util.Scanner;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Casa casa = new Casa();
		Lote lote = new Lote();
		Apartamento apt = new Apartamento();
		Propietário propietario = new Propietário();
		
		//setando valores as variaveis da casa
		casa.setBanheiro(1);
		casa.setCozinha(1);
		casa.setCódigo(225533);
		casa.setGaragem(1);
		casa.setLocalidade("Rua Imaginaria 123");
		casa.setPropietario("Governo");
		casa.setQuarto(3);
		casa.setSala(1);
		casa.setSituação("A venda");
		casa.setTamanho(300);//metros quadrados
		casa.setValor(222.555);
		
		//setando valores as variaveis do propietario
		propietario.setCpf("12345678910");
		propietario.setNome("José");
		propietario.setTelefone("64 9911223344");
		
		
		String choiceStr = JOptionPane.showInputDialog(null, "Digite o numero referente a sua escolha: \n1- Reservar\n2- Comprar\n3- Cancelar Reserva");
		int choice = Integer.parseInt(choiceStr);

		switch(choice) {
		case 1:
			JOptionPane.showMessageDialog(null, "Casa Reservada");
		break;
		
		case 2:
			JOptionPane.showMessageDialog(null, "Casa Comprada");
		break;
		
		case 3:
			JOptionPane.showMessageDialog(null, "Reserva cancelada");
		break;
		}
		
	}

}
