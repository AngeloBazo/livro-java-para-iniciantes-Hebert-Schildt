package interfaces.labs;

public class Metodos01Interface implements Teste01Interface {

	int x = 0;
	int y = 1;
	String msg = "Ol�, que bom que voc� apareceu para treinar!";

	@Override
	public int zerar() {

		return x;
	}

	@Override
	public int comecar() {

		return y;
	}

	@Override
	public String msg() {

		return msg;
	}

}
