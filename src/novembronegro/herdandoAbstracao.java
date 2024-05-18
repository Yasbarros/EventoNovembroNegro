
package novembronegro;

//Herança: herdo a classe abstrata Abstracao
public class herdandoAbstracao extends Abstracao{

    
    public herdandoAbstracao() {
        
    }

    //Super: chamo os atributos da classe herdada
    public herdandoAbstracao(String dia1, String dia2, String dia3) {
        super(dia1, dia2, dia3);
    }
    
    //Override: Estou sobrescrevendo um metodo da classe herdada. 
    @Override
    public void impressao() {
        
    }
    
}
