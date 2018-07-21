package kataTDD;

public class CalcTDD {

    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } else {
            String[] parts = numbers.split(",");
            int sum = 0;
            for (int i = 0; i < parts.length; i++) {
                int x = Integer.parseInt(parts[i]);
                sum = sum + x;
            }
            return sum;
        }
    }
}

