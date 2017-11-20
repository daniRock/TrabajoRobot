package clienteInterfaz;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

public class ventanaPrincipal 
{
	public static void main(String[] args) 
	{
		Display monitor = new Display();
		
		Shell shell = new Shell(monitor); //capa
		
		shell.setText("Motor movimientos");
		
		
		TabFolder tabF = new TabFolder(shell, SWT.TOP);//grupo de pestañas. Si queremos que esten arriba, SWT.TOP , y abajo SWT.BOTTOM
		
		TabItem tab1 = new TabItem(tabF, SWT.NONE);//pestania 1
		tab1.setText("RobotInterfaz");
		
		tab1.setControl( new botonesRobot(tabF, SWT.NONE) );
		tabF.pack();
		
		
		
		shell.pack();
		shell.open();
		
		
		while(!shell.isDisposed())
		{
			if(monitor.readAndDispatch())
			{
				monitor.sleep();
			}
		}
		//libera memoria
		monitor.dispose();
		//!!IMPORTANTE!!
	}
}
