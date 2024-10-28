class Imovel { 
    private String endereco; 
    private double preco; 
    
    public Imovel(String endereco, double preco) { 
        this.endereco = endereco; 
        this.preco = preco; 
    } 
    
    public String getEndereco() { 
        return endereco; 
    } 
    
    public double getPreco() { 
        return preco; 
    } 
} 

class Novo extends Imovel { 
    private double adicionalPreco; 
    
    public Novo(String endereco, double preco, double adicionalPreco) { 
        super(endereco, preco); 
        this.adicionalPreco = adicionalPreco; 
    } 
    
    public double getPrecoComAdicional() { 
        return super.getPreco() + adicionalPreco; 
    } 
    
    public void imprimirPreco() { 
        System.out.println("Preço adicional: " + adicionalPreco); 
    } 
} 

class Velho extends Imovel { 
    private double descontoPreco; 
    
    public Velho(String endereco, double preco, double descontoPreco) { 
        super(endereco, preco); 
        this.descontoPreco = descontoPreco; 
    } 
    
    public double getPrecoComDesconto() { 
        return super.getPreco() - descontoPreco; 
    } 
    
    public void imprimirDesconto() { 
        System.out.println("Desconto no preço: " + descontoPreco); 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        Novo imovelNovo = new Novo("Rua A, 123", 300000, 50000); 
        Velho imovelVelho = new Velho("Rua B, 456", 200000, 30000); 
        System.out.println("Preço do imóvel novo: " + imovelNovo.getPrecoComAdicional()); 
        System.out.println("Preço do imóvel velho: " + imovelVelho.getPrecoComDesconto()); 
    } 
}
