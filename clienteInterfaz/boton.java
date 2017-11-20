package clienteInterfaz;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public abstract class boton 
{

	private int motor;
	private Button boton;
	
	public boton(Composite parent, int motor) 
	{
		this.boton = new Button(parent, SWT.NONE);
		this.motor = motor;
	}
	public int getMotor() {return motor;}
	public Button getBoton() {return boton;}
}
