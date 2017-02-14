package steam;
import java.util.ArrayList;
import java.util.List;
public class Jogo {
	
	protected  String nome;
	protected int preco;
	protected int score = 0; 
	protected int vezesZeradas = 0;
	protected int vezesJogadas = 0;
	protected static List <Jogabilidade> tipo;
	protected ArrayList<Jogo> jogos;
	
	public Jogo(String nome,int preco,List<Jogabilidade> tipo){
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.jogos = new ArrayList<Jogo>();
		
	}
	
	public void registraJogada(int score, boolean zerou){
		vezesJogadas ++;
		if(score > this.score){
			this.score = score;
		}
		if(zerou = true){
			vezesZeradas ++;
			}
		
	}
		
		
	public int getPreco(){
			return this.preco;
		}
	
	public String getNome(){
		return this.nome;
	
	public static getTipo(){
		return this.tipo;
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
