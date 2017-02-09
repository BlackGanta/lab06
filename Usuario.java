package steam;

import java.util.ArrayList;

public class Usuario {

	private String nome;
	private ArrayList <Jogo> jogos;
	private double cash;
	private String elo;
	
	public Usuario(String nome){
		jogos = new ArrayList<Jogo>();
		this.nome = nome;
	}
	
	
	public void addCash(double cash){
		this.cash += cash;
	}
	
	public void compraJogo(Jogo jogo){
		for(Jogo g:jogos){
			if(g.getNome().equals(jogo.getNome())){
				jogos.add(jogo);
			}
		}
		
		}
		
		
	}
	
	
	
	
	
