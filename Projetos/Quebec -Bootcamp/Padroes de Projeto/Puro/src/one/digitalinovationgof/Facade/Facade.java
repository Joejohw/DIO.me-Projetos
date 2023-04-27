package one.digitalinovationgof.Facade;
import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migraCliente(String nome, String cep){
		
		String cidade =CepApi.getInstancia().RecuperarCidade(cep);
		String estado =CepApi.getInstancia().RecuperarEstado(cep);
		
		
		CrmService.gravarCliente(nome, cep, estado, cidade);
		
	}
}
