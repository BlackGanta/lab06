package steam;
import java.util.ArrayList;
import java.util.List;
public class Jogo {
	
	private String nome;
	private double preco;
	private int score = 0; 
	private int vezesZeradas = 0;
	private int vezesJogadas = 0;
	private static List <Jogabilidade> tipo;
	
	public Jogo(String nome,double preco,List<Jogabilidade> tipo){
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		
	}
	
	public int registraJogada(int score, boolean zerou){
		vezesJogadas ++;
		if(score > this.score){
			this.score = score;
		}
		if(zerou = true){
			vezesZeradas ++;
			}
		return score;
	}
		
		
	public double getPreco(){
			return preco;
		}
	
	public String getNome(){
		return nome;
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
