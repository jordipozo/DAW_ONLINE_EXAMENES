public class Estudiante {
    private String nombre;
    private String apellidos;
    private String nif;
    private String grupo;
    private String telefono;
    private int[] notas;

    // Constructor con todos los datos
    public Estudiante(String nombre,String apellidos, String nif, String grupo, String telefono, int[] notas){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.grupo = grupo;
        this.telefono = telefono;
        this.notas = notas;
    }

    // Constructor con nombre, apellidos, nif y teléfono

    public Estudiante(String nombre, String apellidos, String nif, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.telefono = telefono;
    }

    // getters y setters

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setNif(String nif){
        this.nif=nif;
    }
    public String getNif(){
        return nif;
    }
    public void setGrupo(String grupo){
        this.grupo=grupo;
    }
    public String getGrupo(){

        return grupo;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setNotas(int[] notas){
        this.notas=notas;
    }
    public int[] getNotas(){
        return notas;
    }

    // método que calcula la nota promedio
    public double calcularNotaPromedio(){
        int suma = 0;
        for (int i=0; i < notas.length;i++){
            suma += notas[i];
        }
        return suma/notas.length;
    }

    // método que establece el nombre y los apellidos del estudiante
    public void setNombreApellidos(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    // método para mostrar información del estudiante por pantalla
    public void mostrarInformación(){
        System.out.println("Información del alumno");
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("NIF: " + nif);
        System.out.println("Grupo: " + grupo);
        System.out.println("Teléfono: " +  telefono);
        System.out.println("Nota media: " + calcularNotaPromedio());
    }
}
