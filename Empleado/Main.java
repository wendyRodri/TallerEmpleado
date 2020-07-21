
package Empleado;

import javax.swing.JOptionPane;

/**
 *
 * @author Wendy Rodriguez
 */
public class Main {
    
    public static void main(String[] args) {
	Menu m = new Menu();
                
    int numero = 0;
        while(numero != 5) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("MENU" + "\n" + "1: Agregar Empleado"
                + "\n" + "2: Eliminar empleado" + "\n" + "3: Modificar Empleado" + "\n" + "4: Mostrar Empleados" + "\n" + "5: Salir"));
            
    switch (numero) {
        case 1:
            try {
                
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Id del Empleado"));
                    String nombre = JOptionPane.showInputDialog("Ingrese Nombre del Empleado");
                    String apellido = JOptionPane.showInputDialog("Ingrese Apellido del Empleado");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Salario del Empleado"));
					
                    if(m.agregar(id, nombre, apellido, salario)) {
                        JOptionPane.showMessageDialog(null, "Agregó");
                    } break;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } break;
                        
        case 2:
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Id del Empleado"));
		
                if (m.Eliminar(id)) {
                    JOptionPane.showMessageDialog(null, "Eliminó");
		}break;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }break;
				
        case 3:
            try {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Id del Empleado"));
                    String nombre = JOptionPane.showInputDialog("Ingrese Nombre del Empleado");
                    String apellido = JOptionPane.showInputDialog("Ingrese Apellido del Empleado");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite salario"));
					
                    if(m.Modificar(id, nombre, apellido, salario)) {
                        JOptionPane.showMessageDialog(null, "Modificó");
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
            break;
    }
	}

    }
}
