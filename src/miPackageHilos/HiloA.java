package miPackageHilos;

public class HiloA extends Thread
{
	private String Nombre;
	public HiloA(String Nombre)
	{
		this.Nombre=Nombre;
	}
	
	@Override
	public void run()
	{
		try
		{
			for(int x=1;x<=10;x++) 
			{
				int delay=(int)(Math.random()*1500);
				System.out.println(Nombre+" "+ x +" " + delay);
				Thread.sleep(delay);
			}
		}
		catch(Exception exc) 
		{
			System.out.println("Excepción");		
		}
	
	}
	public static void main(String[]args)
	{
		HiloA hilo1=new HiloA("Hilo 1");
		HiloA hilo2=new HiloA("Hilo 2");
		HiloA hilo3=new HiloA("Hilo 3");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		System.out.println("Termina metodo main");
		
	}
}
