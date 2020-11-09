package Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Metodos {
    private int i;
    private Empleado emp;
    private List <Empleado>reg;
    private boolean band;
    private String cade;
    public void ingresoDatos() {
        String nombre;
        reg=new ArrayList<Empleado>();
        i=0;
        do {
            nombre=(JOptionPane.showInputDialog("PRESIONE (x) SI YA NO DESEA ESCRIBIR OTRO NOMBRE\n"
                    + (i + 1) + ". Digite un nombre: "));
            emp=new Empleado(nombre);
            reg.add(emp);
            i++;
        } while (!"x".equals(reg.get(i-1).getNombre()));
        reg.remove(i - 1).getNombre();
    }
    public void modificarNombre(String z,String y) {
        for (i = 0; i < reg.size(); i++) {
            if (reg.get(i).getNombre().equals(z)) {
                band = false;
                reg.get(i).setNombre(y);
            }
        }
        if (band) {
            JOptionPane.showMessageDialog(null, "El nombre no existe en el registro");
        }
    }
    public void eliminarNombre(String u) {
        band = true;
        for (i = 0; i < reg.size(); i++) {
            if (reg.get(i).getNombre().equals(u)) {
                band = false;
                reg.remove(i);
            }
        }
        if (band == true) {
            JOptionPane.showMessageDialog(null, "El nombre no existe en el registro");
        }
    }
    public void mostrarNombres() {
        String cadena="";
        for (i = 0; i <reg.size(); i++) {
            cadena +=reg.get(i).getNombre() + "\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    public void finalizar(){
        JOptionPane.showMessageDialog(null,"\tGRACIAS POR USAR EL MENÚ");
      
    }
    
}
