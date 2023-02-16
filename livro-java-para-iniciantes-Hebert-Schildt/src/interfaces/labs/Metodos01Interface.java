package interfaces.labs;

public class Metodos01Interface implements Teste01Interface {

	int x = 0;
	int y = 1;
	String msg = "Olá, que bom que você apareceu para treinar!";

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
