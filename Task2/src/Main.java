import java.util.Scanner;

public class Main {
    private static final String VALID_STR = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -";
    public static void main(String[] args) {
        boolean isValid = true;
        int spaceCount = 0;

        System.out.println("Введите ФИО!");
        String input = new Scanner(System.in).nextLine().trim();

        for(int i =0 ; i < input.length(); i++) {
            if (!VALID_STR.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
                if(isValid && spaceCount == 2){
                    System.out.println("Фамилия:" + input.substring(0, input.indexOf(" ")).trim());
                    System.out.println("Имя:" + input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim());
                    System.out.println("Очество:" + input.substring(input.lastIndexOf(" ")).trim());
                }
                else{
                    System.out.println("Введенная строка не волидна!");   
                }



        

    }
}