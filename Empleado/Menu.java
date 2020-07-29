
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
            
            lista = new ArrayList<Empleado>();
            lista.add(new Empleado(1,"Wendy", "Rodriguez", 1000000));
            lista.add(new Empleado(2, "Lussiana", "Carrero", 1300000));
            lista.add(new Empleado(3,"Shaiel", "Avila",  600000));
            lista.add(new Empleado(4,"Alana", "Fosenca",  950000));
            lista.add(new Empleado(5,"Sebastian", "Alarcon",  1500000));
            lista.add(new Empleado(6,"Andres", "Suescun",  200000));
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
        
        public String EmpleadoMayorSalario() {
            return lista.stream()
                .max(Comparator.comparing(Empleado::getSalario))
                .map(Empleado::toString)
                .orElse("ERROR");
	}
        
        public String EmpleadoMenorSalario() {
            return lista.stream()
                .min(Comparator.comparing(Empleado::getSalario))
                .map(Empleado::toString)
                .orElse("ERROR");
	}
        
        public String EmpleadosPorNombre() {
            String res = "";
		res = lista.stream()
                        .sorted(Comparator.comparing(Empleado::getNombre))
                        .map(Empleado::toString)
                        .reduce(" ", (a,b) -> {
                            return a+"\n"+b; 
        });
                return res;
	}
        
        public double SumaSalarioMayor() {
            return lista.stream().filter((lista) -> {
                return lista.getSalario() > 700000;
            })
                    .map(Empleado::getSalario)
                    .reduce(0.0, (a,b) ->{
                        return a+b;
                    });
	}
        
        public long TotalDeApellidosPorA() {
            return lista.stream()
                    .filter(empleado -> empleado.getApellido().toUpperCase().startsWith("A"))
                    .count();
		
	}
        
        public String cincoEmpleadosMayorSalario() {
            return lista.stream()
                    .sorted(Comparator.comparing(Empleado::getSalario).reversed())
                    .map(Empleado::toString)
                    .limit(5)
                    .reduce(" ", (a,b) -> {
                        return a+"\n"+b; 
                    });
	}
        
        
        public String Mostrar() {
            String res  = "";
                for (int i = 0; i < lista.size(); i++) {
                    res += lista.get(i).toString() + "\n";
		} return res;
	}
}
