package clienteInterfaz;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class botonUp extends boton
{
	
	public botonUp(Composite parent , int motor) 
	{
		super(parent , motor);
		super.getBoton().setText("Up    ");
		super.getBoton().addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				HandlerBotonUp();
			}
		});
	}
	
	
	public void HandlerBotonUp()
	{
		
		System.out.println("Hago un UP al motor "+super.getMotor());
		
	}
}
