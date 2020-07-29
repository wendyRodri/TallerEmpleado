
package Empleado;

import javax.swing.JOptionPane;

/**
 *
 * @author Wendy Rodriguez
 */
public class Main {
    
    public static void main(String[] args) {
	Menu m = new Menu();
                
    int numero = -1;
    
    while(numero != 0) {
       numero = Integer.parseInt(JOptionPane.showInputDialog("MENU" + "\n" + "1: Agregar Empleado"
           + "\n" + "2: Eliminar Empleado" + "\n" + "3: Modificar Empleado" + "\n" + "4: Mostrar Empleados" + "\n" + "5: Empleado con Mayor Salario"
           + "\n" + "6: Empleado con Menor Salario" + "\n" + "7: Empleados Ordenados por Nombre" + "\n" + "8: Suma de Salarios Mayores a 700" + "\n" 
           + "9: Empleados con Apellido que inician en A " + "\n" + "10: Cinco Empleados con Mayor Salario" + "\n" + "0: SALIR" ));
            
    switch (numero) {
        case 1:
            try {
                
                int id = Integer.parseInt(JOptionPane.showInputDialog("INGRESE IDENTIFICACIÒN DEL EMPLEADO"));
                    String nombre = JOptionPane.showInputDialog("INGRESE NOMBRE DEL EMPLEADO");
                    String apellido = JOptionPane.showInputDialog("INGRESE APELLIDO DEL EMPLEADO");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("INGRESE SALARIO DEL EMPLEADO"));
					
                    if(m.agregar(id, nombre, apellido, salario)) {
                        JOptionPane.showMessageDialog(null, "Se Agrego Correctamente");
                    } break;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } break;
                        
        case 2:
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("INGRESE ID DEL EMPLEADO"));
		
                if (m.Eliminar(id)) {
                    JOptionPane.showMessageDialog(null, " Se Eliminó Correctamente");
		}break;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }break;
				
        case 3:
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("INGRESE ID DEL EMPLEADO"));
                    String nombre = JOptionPane.showInputDialog("INGRESE NOMBRE DEL EMPLEADO");
                    String apellido = JOptionPane.showInputDialog("INGRESE APELLIDO DEL EMPLEADO");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("INGRESE SALARIO DEL EMPLEADO"));
					
                    if(m.Modificar(id, nombre, apellido, salario)) {
                        JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");
                    }break;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }break;
			
	case 4:
            try {
                JOptionPane.showMessageDialog(null, m.Mostrar());
            break;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }break;
				
	case 5:
            try {
                JOptionPane.showMessageDialog(null, m.EmpleadoMayorSalario());
            } catch (Exception e) {
              } break;
              
        case 6:
            try {
                JOptionPane.showMessageDialog(null, m.EmpleadoMenorSalario());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }break;
            
        case 7:
            try {
                JOptionPane.showMessageDialog(null, m.EmpleadosPorNombre());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }break;
            
        case 8: 
            try {
                JOptionPane.showMessageDialog(null, m.SumaSalarioMayor());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }break;
            
        case 9:
            try {
                JOptionPane.showMessageDialog(null, m.TotalDeApellidosPorA());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRORl");
            }break;
            
        case 10:
            try {
                JOptionPane.showMessageDialog(null, m.cincoEmpleadosMayorSalario());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            
    }
        }
	}
}
