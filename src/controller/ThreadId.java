package controller;

//extends Thread
//Parametros por construtor
//m�todo run()

public class ThreadId extends Thread {
	
	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
		
	}

	@Override
	public void run() {
		//S� se executa o que est� aqui dentro
		System.out.println(idThread);
		
		}
	
}
