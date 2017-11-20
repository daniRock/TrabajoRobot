package clienteInterfaz;



import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;


public class botonesRobot extends Composite
{
	

	private Button bTodaCarpeta, bSumar;
	

	//usado para anadir un lisener que obtenga la ruta por usuario.
	
	
	
	public botonesRobot(Composite parent, int style)
	{
		super(parent, style);
		
		
		Group gpadre = new Group(this, SWT.NONE);
		
		gpadre.setLayout( new GridLayout( 3, false ) );
		gpadre.setText("Motores:");
			
	
		Label lab;
		botonUp boton1UP;
		botonDown boton1DOWN;
		for(int i = 1 ; i <= 5 ; i++)
		{
			lab = new Label(gpadre, SWT.NONE);
			lab.setText("Motor"+i+": ");	
					
			boton1UP = new botonUp(gpadre, i);
			boton1DOWN = new botonDown(gpadre, i);
		}

		
		gpadre.pack();
	}
}
