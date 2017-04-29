package br.univel.meustestes;

import java.math.BigDecimal;

import br.univel.minhaarvore.UniArvore;
import br.univel.minhaarvore.UniArvoreImpl;
import br.univel.minhaarvore.UniNode;
import br.univel.minhaarvore.UniNodeImpl;

public class Principal {

	public Principal() {
		
		//despesas administrativas Pai 01
		Conta contaAgua = new Conta(1, "Água", new BigDecimal("50,00"));
		UniNode<Conta> noAgua = new UniNodeImpl<>(contaAgua);
		
		Conta contaAluguel = new Conta(2, "Aluguel", new BigDecimal("615,00"));
		UniNode<Conta> noAlu = new UniNodeImpl<>(contaAluguel);
		
		Conta contaIntTel = new Conta(3, "Internet e Telefone", new BigDecimal("80,00"));
		UniNode<Conta> noIntTel = new UniNodeImpl<>(contaIntTel);
		
		Conta contaEnElet = new Conta(4, "Energia Elétrica", new BigDecimal("60,50"));
		UniNode<Conta> noEnElet = new UniNodeImpl<>(contaEnElet);		
		
		Conta despesasAdm = new Conta(1, "Despesas Administrativas", new BigDecimal(0));
		UniNode<Conta> noDeAdm = new UniNodeImpl<>(despesasAdm);
		noDeAdm.addFilho(noAgua);
		noDeAdm.addFilho(noAlu);
		noDeAdm.addFilho(noIntTel);
		noDeAdm.addFilho(noEnElet);
		// Fim despesas administrativas Pai 01
		
		
		// Gastos pessoais Pai 02
		Conta beneficios = new Conta(1, "Benefícios", new BigDecimal("150,00"));
		UniNode<Conta> noBenef = new UniNodeImpl<>(beneficios);
		
		Conta encargos = new Conta(2, "Encargos", new BigDecimal("130,00"));
		UniNode<Conta> noEncarg = new UniNodeImpl<>(encargos);
		
		Conta salario = new Conta(3, "Salário", new BigDecimal("1500,00"));
		UniNode<Conta> noSalar = new UniNodeImpl<>(salario);
		
		Conta gastosPessoal = new Conta(2, "Gastos com Pessoal", new BigDecimal(0));
		UniNode<Conta> noGastoPes = new UniNodeImpl<>(gastosPessoal);
		noGastoPes.addFilho(noBenef);
		noGastoPes.addFilho(noEncarg);
		noGastoPes.addFilho(noSalar);
		// FIM Gastos pessoais Pai 02
		
		
		// Manutencao e Limpeza Pai 03
		Conta servicoLimpeza = new Conta(1, "Serviços de Limpeza", new BigDecimal("100,00"));
		UniNode<Conta> noServLimp = new UniNodeImpl<>(servicoLimpeza);
		
		Conta servicoManutencao = new Conta(2, "Serviços de Manutenção", new BigDecimal("100,00"));
		UniNode<Conta> noServManut = new UniNodeImpl<>(servicoManutencao);
				
		Conta manutencaoLimpeza = new Conta(3, "Manutenção e Limpeza", new BigDecimal(0));
		UniNode<Conta> noManutLimpe = new UniNodeImpl<>(manutencaoLimpeza);
		noManutLimpe.addFilho(noServLimp);
		noManutLimpe.addFilho(noServManut);
		// FIM manutencao e limpeza Pai03
		
		
		
		//Materiais Pai 04
		Conta materialEscritorio = new Conta(1, "Materiais de Escritório", new BigDecimal("330,00"));
		UniNode<Conta> noMaterialEscr = new UniNodeImpl<>(materialEscritorio);
		
		Conta materialLimpeza = new Conta(2, "Materiais de Limpeza", new BigDecimal("100,00"));
		UniNode<Conta> noMaterialLimpez = new UniNodeImpl<>(manutencaoLimpeza);
		
		Conta materiais = new Conta(4, "Materiais", new BigDecimal(0));
		UniNode<Conta> noMateriais = new UniNodeImpl<>(materiais);
		
		noMateriais.addFilho(noMateriais);
		noMateriais.addFilho(noMaterialLimpez);
		//FIM Materiais Pai 04
		
		
		// AVO 01
		Conta despesasOper = new Conta(1, "Despesas Operacionais", new BigDecimal(0));
		UniNode<Conta> noDeOpr = new UniNodeImpl<>(despesasOper);
		noDeOpr.addFilho(noDeAdm);
		noDeOpr.addFilho(noGastoPes);
		noDeOpr.addFilho(noManutLimpe);
		noDeOpr.addFilho(noMateriais);
		// Avo
		
		
		
		
		
		UniArvore<Conta> planoContas = new UniArvoreImpl(noDeOpr);
		
		/**
		 * ADICIONE AQUI O RESTANTE DAS CONTAS.					OK acho
		 */
		
		somarFilhos(planoContas);
		
		/**
		 * Mostra todo o plano de contas, inclusive com
		 * tabulações (\t) a cada nível.
		 */
		planoContas.mostrarTodosConsole();
		
		
		// O exercício consiste em identificar a necessidade de
		// novos métodos para finalizar a tarefa, sempre lembrando
		// de coesão, acoplamento e encapsulamento.
		// Entrega link do repositório para fernandod@univel.br com assunto:
		// TrabalhoComplementar 3o Sem

		
		
	}
	
	/**
	 * Percorre toda a arvore, recursivamente, encontra
	 * todas as contas analíticas (isLeaf() == true), soma
	 * seus valores e atribui o total na conta pai.
	 * 
	 * Depois pega todos os pais e somam no avô.
	 * 
	 * @param planoContas
	 */
	private void somarFilhos(UniArvore<Conta> planoContas) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		new Principal();
		
	}
	
}
