package business;

import java.util.List;

import com.ContoCorrente;
import com.Movimento;

public interface ContoCorrenteDao {
	
	public ContoCorrente versamento(String iban, double versa);
	public ContoCorrente prelievo(String iban, double preleva);
	public List<Movimento> listaMovimenti(String iban);
	public ContoCorrente getByIban(String iban);
	public ContoCorrente inserisci(ContoCorrente cc);
	public void deleteCc(String iban);
	public ContoCorrente updateCc(ContoCorrente cc);
}
