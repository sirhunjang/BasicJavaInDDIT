package study;

import java.util.ArrayList;
import java.util.List;

public class Cklim {
	public static void main(String[] args) {
    String name = "shim jae rin";
    int i = 29;
    String job = "developer";

        List<String> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(j + "test");
        }

        list.forEach(item -> {
            System.out.println(item);
        });

	}
}
