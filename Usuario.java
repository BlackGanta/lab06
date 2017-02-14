package steam;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	protected int x2p;
	
 	protected String nome;
	protected ArrayList <Jogo> jogos;
	protected double cash;
	
	
	public Usuario(String nome){
		jogos = new ArrayList<Jogo>();
		this.nome = nome;
		this.x2p = x2p;
	}
	
	
	public void addCash(double cash){
		this.cash += cash;
	}
	
	public double getCash(){
		return this.cash;
	}
	
	public void compraJogo(Jogo jogo){
		for(Jogo g:jogos){
			if(!g.getNome().equals(jogo.getNome())){
				jogos.add(jogo);
				}
			}
		
		}

	public Jogo buscaJogo(String nome){
		for(Jogo g: jogos){
			if(g.getNome() == nome){
				return g;
			}
		}
		return null;
	}
	
	public void registraJogada(String nome,int score,boolean zerou){
		 Jogo jogo = buscaJogo(nome);
		if(jogo.get)
		
		
		
	}
	
	
	
	
	
	}
	
	
	
	
	
