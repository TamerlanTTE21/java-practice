package Exceptions.classtask_2;

public class Main {
    public static void main(String[] args) {
        String[] passwords = {
                "qwerty",
                "qwerret123",
                "Qwerretsdsdfds",
                "Qwerretsds213"
        };


        for (String password : passwords) {
            try {
                validatePassword(password) ;
                System.out.println("Пароль вверный");
            } catch (PasswordNotValidException e) {
                System.out.println(e.getMessage());

            }
        }


    }

    // TODO: создать свое исключение PasswordNotValidException
    //   поменять тип возвращаемого значения с boolean на void
    //   везде где возвращается false, нужно выбрасывать исключение с подходящим сообщением

    /**
     * 1. Пароль должен иметь минимум 8 символов
     * 2. Пароль должен содержать минимум одну цифру
     * 3. Пароль должен содержать минимум одну заглавную букву
     */
    static void validatePassword(String password) {
        if (password.length() < 8) {
            throw new PasswordNotValidException("Пароль должен иметь минимум 8 символов");
        }

        boolean hasDigit = false;
        boolean hasUppercase = false;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                hasDigit = true;


            }
            if (Character.isUpperCase(symbol)) {
                hasUppercase = true;


            }
        }

        if (!hasDigit) {
            throw new PasswordNotValidException("Пароль должен содержать минимум одну цифру");

        }

        if (!hasUppercase) {
            throw new PasswordNotValidException("Пароль должен содержать минимум одну заглавную букву");

        }

    }

}