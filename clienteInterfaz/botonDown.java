package clienteInterfaz;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class botonDown extends boton
{
	
	public botonDown(Composite parent, int motor) 
	{
		super(parent, motor);
		super.getBoton().setText("Down");
		super.getBoton().addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				HandlerBotonDown();
			}
		});
	}
	
	public void HandlerBotonDown()
	{
		
		System.out.println("Hago un DOWN al motor "+super.getMotor());
		
	}
}