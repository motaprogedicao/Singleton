public class Filaprint {

    private char Documentos[];
    private boolean imprimir;

    private static Filaprint instancia;

    public char[] getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(char[] documentos) {
        Documentos = documentos;
    }

    public boolean isImprimir() {
        return imprimir;
    }

    public void setImprimir(boolean imprimir) {
        this.imprimir = imprimir;
    }

    private Filaprint(){

    }

    public static Filaprint getInstance(){
        if(instancia == null){
            instancia = new Filaprint();
        }
        return instancia;
    }
    public void ImprimeDocumento() {

    }
    public void RemoveDocumento(){

    }
    public void RemoveTodosDocs(){

    }
}
