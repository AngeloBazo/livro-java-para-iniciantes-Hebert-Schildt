
public class TesteLacoForBreakContine {

	public static void main(String[] args) {

		for (int count = 0; count < 10; count++) {

			if (count == 5)
				continue;

			if (count == 8)
				break;

			System.out.println(count);

		}

	}

}
