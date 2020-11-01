package miPackageHilos;

public class HiloRuna implements Runnable
{
	Thread hilo;
	
	public static void main(String[]args)
	{
		new HiloRuna("Hilo_1 ");
		new HiloRuna("Hilo_2 ");
		new HiloRuna("Hilo_3 ");

		System.out.println(Thread.currentThread().getName()+" Termino");
		
	}
	HiloRuna(String str)
	{
		hilo=new Thread(this,str);
		hilo.start();
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				System.out.println(Thread.currentThread().getName()+"x="+i+" Yieled ceder control...");
				Thread.yield();
			}
			else 
			{
				System.out.println(Thread.currentThread().getName()+"x="+i);
			}
		}
		System.out.println(Thread.currentThread().getName()+" Termino");
	}
}
