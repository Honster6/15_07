package kataTDD;

public class CalcTDD {

    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } else {
//            numbers.replace("\n", ",");
            String[] parts = numbers.split(",|\n");
//            String[] parts = numbers.split(String.valueOf(numbers.charAt(2)));
            int sum = 0;
            for (int i = 0; i < parts.length; i++) {
                int x = Integer.parseInt(parts[i]);
                sum = sum + x;
            }
            return sum;
        }
    }
}

