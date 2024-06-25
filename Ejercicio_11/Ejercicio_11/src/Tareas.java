public class Tareas {
    private static String nombreT1 = "-";
    private static String nombreT2 = "-";
    private static String nombreT3 = "-";
    private static String nombreT4 = "-";
    private static String nombreT5 = "-";
    private static String descripcionT1 = "-";
    private static String descripcionT2 = "-";
    private static String descripcionT3 = "-";
    private static String descripcionT4 = "-";
    private static String descripcionT5 = "-";

    public static void modificarTarea(int tareaNum,String nombre, String descripcion) throws OutOfCaracteresException{
        if (nombre.length() > 30){
            throw new OutOfCaracteresException("Caracteres mayor que 30");
        } else if (descripcion.length() > 150){
            throw new OutOfCaracteresException("Caracteres mayor que 150");
        }
        switch (tareaNum){
            case 1:
                nombreT1 = nombre;
                descripcionT1 = descripcion;
                break;
            case 2:
                nombreT2 = nombre;
                descripcionT2 = descripcion;
                break;
            case 3:
                nombreT3 = nombre;
                descripcionT3 = descripcion;
                break;
            case 4:
                nombreT4 = nombre;
                descripcionT4 = descripcion;
                break;
            case 5:
                nombreT5 = nombre;
                descripcionT5 = descripcion;
                break;
        }
    }

    public static void agregarTarea(String nombre, String descripcion) throws OutOfCaracteresException, ListaLlenaException {
        if (nombre.length() > 30){
            throw new OutOfCaracteresException("Caracteres mayor que 30");
        } else if (descripcion.length() > 150){
            throw new OutOfCaracteresException("Caracteres mayor que 150");
        }

        if (nombreT1.equals("-")){
            nombreT1 = nombre;
            descripcionT1 = descripcion;
        } else if (nombreT2.equals("-")){
            nombreT2 = nombre;
            descripcionT2 = descripcion;
        } else if (nombreT3.equals("-")){
            nombreT3 = nombre;
            descripcionT3 = descripcion;
        } else if (nombreT4.equals("-")){
            nombreT4 = nombre;
            descripcionT4 = descripcion;
        } else if (nombreT5.equals("-")){
            nombreT5 = nombre;
            descripcionT5 = descripcion;
        } else {
            throw new ListaLlenaException("La lista esta full, no se pueden agregar más tareas");
        }
    }

    public static void borrarTarea(int tarea){
        switch (tarea){
            case 1:
                nombreT1 = "-";
                descripcionT1 = "-";
                break;
            case 2:
                nombreT2 = "-";
                descripcionT2 = "-";
                break;
            case 3:
                nombreT3 = "-";
                descripcionT3 = "-";
                break;
            case 4:
                nombreT4 = "-";
                descripcionT4 = "-";
                break;
            case 5:
                nombreT5 = "-";
                descripcionT5 = "-";
                break;
        }
    }

    public static String getNombreT1() {
        return nombreT1;
    }
    public static String getNombreT2() {
        return nombreT2;
    }

    public static String getNombreT3() {
        return nombreT3;
    }

    public static String getNombreT4() {
        return nombreT4;
    }

    public static String getNombreT5() {
        return nombreT5;
    }

    public static String getDescripcionT1() {
        return descripcionT1;
    }

    public static String getDescripcionT2() {
        return descripcionT2;
    }

    public static String getDescripcionT3() {
        return descripcionT3;
    }

    public static String getDescripcionT4() {
        return descripcionT4;
    }

    public static String getDescripcionT5() {
        return descripcionT5;
    }
}
