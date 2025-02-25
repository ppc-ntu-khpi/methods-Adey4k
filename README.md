# Завдання 15: "Обчислити контрольну суму (хеш) [MD5](https://uk.wikipedia.org/wiki/MD5) для заданого слова (пароля)"
**Хешування — це процес перетворення вхідних даних** (наприклад, рядка, файлу або пароля) у фіксовану послідовність символів, що називається хешем. Хешування використовується для перевірки цілісності даних, безпечного зберігання паролів і в багатьох інших криптографічних завданнях.
Основні властивості - **детермінованість і незворотність**

``` java
package domain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Exercise {
    public static String getMd5Hash(String source) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(source.getBytes());
        byte[] digest = md.digest();
        return bytesToHex(digest);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }
}
```
Ця програма обчислює MD5-хеш для заданого рядка, використовуючи клас MessageDigest. Метод getMd5Hash приймає рядок, перетворює його в байти, обчислює хеш та перетворює його в шістнадцятковий формат через метод bytesToHex. 
<br> <br>

А також тестування:
``` java
package test;
import domain.Exercise;
import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        System.out.println("Enter your password: ");
        Scanner scanner = new Scanner(System.in, "UTF-8");
        String password = scanner.nextLine();
        System.out.println("MD5: " + Exercise.getMd5Hash(password));
    }
}
```

# Результати роботи:
![](https://github.com/ppc-ntu-khpi/methods-Adey4k/blob/master/images/result.jpg "Скрішот результатів")

Порівняння результату з онлайн MD5 генератором:
![](https://github.com/ppc-ntu-khpi/methods-Adey4k/blob/master/images/comparison.jpg "Онлайн генератор")

Як можемо побачити, все працює чудово!😊
