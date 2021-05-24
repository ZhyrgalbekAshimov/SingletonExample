import kg.company.LazySingleton;

public class Main {

    public static void main(String[] args) {

	LazySingleton lazy = LazySingleton.getInstance();
	LazySingleton lazy2 = LazySingleton.getInstance();

    System.out.println(lazy.equals(lazy2)); // Сравнение. Должно быть true

    }
}
