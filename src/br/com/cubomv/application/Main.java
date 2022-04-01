package br.com.cubomv.application;

import br.com.cubomv.dao.PratoDAO;
import br.com.cubomv.model.Prato;

public class Main {

	public static void main(String[] args) {

		PratoDAO pratoDAO = new PratoDAO();
		
		// ===============================================
		// CREATE -> INSERT -> OK
		//Prato prato = new Prato();
		//prato.setCpf("00011122200");
		//prato.setNome("Franciely Jamily");
		//prato.setAlimento("Pão");
		
		//pratoDAO.save(prato);
		// ===============================================
		
		// ===============================================
		 //READ -> SELECT => OK
		//visualização de todos os registros do BD
		int cont = 1;
		for(Prato p : pratoDAO.getPratos()) {
			System.out.println("Prato "+ cont + " -> " + p.getCpf() + " " + p.getNome() + " " + p.getAlimento());
			cont++;
		}
		// ===============================================
		
		// ===============================================
		// UPDATE -> UPDATE -> OK
		//Prato pratoDeAnita = new Prato();
		//pratoDeAnita.setCpf("01333344459");
		//pratoDeAnita.setNome("Anita Abusada");
		//pratoDeAnita.setAlimento("Refri Punk");
		
		//pratoDAO.update(pratoDeAnita);
		// ===============================================
		
		// ===============================================
		// DELETE -> DELETE
		//remove prato pelo CPF
		//pratoDAO.deleteByCPF("12345678914");
		
		// ===============================================
	}

}
