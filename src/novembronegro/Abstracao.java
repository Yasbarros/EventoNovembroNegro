
package novembronegro;

//classe abstrata
public abstract class Abstracao {
    String dia1 = "23/11/2023";
    String dia2 = "24/11/2023";
    String dia3 = "25/11/2023";

    //Sobrecarga
    public Abstracao() {
    }

    public Abstracao(String dia1, String dia2, String dia3) {
        this.dia1 = dia1;
        this.dia2 = dia2;
        this.dia3 = dia3;
        
    }
    
    public String getDia1() {
        return dia1;
    }

    public void setDia1(String dia1) {
        this.dia1 = dia1;
    }

    public String getDia2() {
        return dia2;
    }

    public void setDia2(String dia2) {
        this.dia2 = dia2;
    }

    public String getDia3() {
        return dia3;
    }

    public void setDia3(String dia3) {
        this.dia3 = dia3;
    }
    
    //metodo abstrato 
    public abstract void impressao();
            
}
