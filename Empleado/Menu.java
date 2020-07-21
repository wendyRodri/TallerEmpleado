
package Empleado;

import java.util.ArrayList;

/**
 *
 * @author Wendy Rodriguez
 */
public class Menu {
    
    private ArrayList<Empleado> lista;

	public Menu() {
            lista = new ArrayList<Empleado>();
	}
        
        public ArrayList<Empleado> darLista(){
            return lista;
	}
        
        public Empleado BuscarEmpleado( int id ) {
            for (int i = 0; i < lista.size(); i++) {
		if (lista.get(i).getId() == id) {
                    return lista.get(i);
		}
            }
            return null;
	}
        
        public boolean agregar(int id, String nombre, String apellido, double salario) throws Exception {
            if (BuscarEmpleado(id) != null) {
                throw new Exception("ERROR, ya existe el Id");
            } else {
                Empleado Nuevo = new Empleado(id, nombre, apellido, salario); 
		lista.add(Nuevo);
                    return true;
            }           
	}
        
        public boolean Eliminar( int id) throws Exception{
            Empleado Eliminar = BuscarEmpleado(id);
                if (Eliminar != null) {
                    lista.remove(Eliminar);
			return true;
		} else {
                    throw new Exception("ERROR, No existe el empleado que intentas eliminar, Intentalo de nuevo");
		}
	}
        
        public boolean Modificar(int id, String nombre, String apellido, double salario)throws Exception {
            Empleado modificar = BuscarEmpleado(id);
                if (modificar != null) {
                    modificar.setNombre(nombre);
                    modificar.setApellido(apellido);
                    modificar.setSalario(salario);
                    return true;
		} else {
                    throw new Exception("ERROR, El empleado no existe");
		}
	}
        
        public String Mostrar() {
            String res  = "";
                for (int i = 0; i < lista.size(); i++) {
                    res += lista.get(i).toString() + "\n";
		} return res;
	}
}
