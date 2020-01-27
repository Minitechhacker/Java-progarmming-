package thread;

public class Priorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Priorities p=new Priorities();
		p.setName("thread1");
		Priorities p1=new Priorities();
		p1.setName("thread2");
        p.setPriority(9);
        p1.setPriority(10);
        p.start();
        p1.start();
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}

	private void setPriority(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

}
