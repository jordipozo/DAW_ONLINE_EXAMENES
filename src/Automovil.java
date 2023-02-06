public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private int anyoMatriculacion;
    private String tipoCombustible;
    private int[] kilometrajeRevision;

    public Automovil(String marca, String modelo, String color, int anyoMatriculacion, String tipoCombustible, int[] kilometrajeRevision){
        this.marca=marca;
        this.modelo=modelo;
        this.anyoMatriculacion=anyoMatriculacion;
        this.tipoCombustible=tipoCombustible;
        this.kilometrajeRevision=kilometrajeRevision;
    }
    public Automovil(String marca, String modelo, String color, int anyoMatriculacion){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.anyoMatriculacion=anyoMatriculacion;
    }

    public String getMarca(){
        return marca;
    }
    public void  setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void  setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getColor(){
        return color;
    }
    public void  setColor(String color){
        this.color=color;
    }

    public int getAnyoMatriculacion(){
        return anyoMatriculacion;
    }
    public void setAnyoMatriculacion(int anyoMatriculacion){
        this.anyoMatriculacion=anyoMatriculacion;
    }

    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }
    public int[] getKilometrajeRevision(){
        return kilometrajeRevision;
    }
    public void  setKilometrajeRevision(int[] kilometrajeRevision){
        this.kilometrajeRevision=kilometrajeRevision;
    }

    public void establecerMarcaModelo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    public int promedioKilometrajeRevision(){
        int suma=0;
        for (int i=0; i < kilometrajeRevision.length; i++){
            suma += kilometrajeRevision[i];
        }
        return suma/kilometrajeRevision.length;
    }

    public void mostrarInformacionAutomovil() {
        System.out.println("Información del automóvil");
        System.out.println("Marca y modelo: "+ marca + " "+modelo);
        System.out.println("Color: " + color);
        System.out.println("Año de matriculación: " + anyoMatriculacion);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Promedio kms. revisión: " + promedioKilometrajeRevision());
    }

}
