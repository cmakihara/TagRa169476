package br.univel.minhaarvore;

import javax.swing.text.AbstractDocument.LeafElement;

import br.univel.meustestes.Conta;

public class UniArvoreImpl<T> implements UniArvore<T> {

	class UniNode {
	
	}

	private T raiz;

	public UniArvoreImpl(T noRaiz) {
		this.raiz = noRaiz;
	}
	
	public UniArvoreImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarTodosConsole() {
		
		StringBuilder sb = new StringBuilder();
		
		if(raiz != null){	
			
			sb.append(((Conta) ((UniNodeImpl<T>) raiz).getConteudo())+"\n");
		
			for(int i =0; i<((UniNodeImpl<T>) raiz).getFilhos().size();i++){
				sb.append("\n\t"+1. + ((UniNodeImpl<T>) raiz).getFilhos().get(i).getConteudo()+"\n");
				
					for(int j=0;j<((UniNodeImpl<T>) raiz).getFilhos().get(i).getFilhos().size();j++){
							sb.append("\n\t\t"+1.+(i+1.) +((UniNodeImpl<T>) raiz).getFilhos().get(i).getFilhos().get(j).getConteudo());
					}
			}
			
			System.out.println(sb.toString());				
		}
		else{
			System.out.println("vazio");				
		}
		
		
	}
	
}
