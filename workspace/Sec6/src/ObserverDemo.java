import java.util.Observable;
import java.util.Observer;

class Server extends Observable {
	private String data;
	
	public String getData() {
		return data;
	}
	
	public void setData(String newData) {
		data = newData;
		setChanged();
	}
}

class Phone implements Observer {
	Server subjectServer;
	
	public Phone(Server server) {
		subjectServer = server;
	}
	
	@Override
	public void update(Observable o, Object args) {
		System.out.println(this.subjectServer.getData());
	}
}

public class ObserverDemo {
	
	int addDigits (int a) {
		while()
	}
	
	public static void main(String[] args) {
		Server cloudServer = new Server();
		Phone iPhone = new Phone(cloudServer);
		Phone pixelPhone = new Phone(cloudServer);
		cloudServer.addObserver(iPhone);
		cloudServer.addObserver(pixelPhone);
		cloudServer.setData("It is really rainy today!");
		cloudServer.notifyObservers();
	}
}
