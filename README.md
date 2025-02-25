# Завдання 15: "Обчислити контрольну суму (хеш) [MD5](https://uk.wikipedia.org/wiki/MD5) для заданого слова (пароля)"
Хешування — це процес перетворення вхідних даних (наприклад, рядка, файлу або пароля) у фіксовану послідовність символів, що називається хешем. Хешування використовується для перевірки цілісності даних, безпечного зберігання паролів і в багатьох інших криптографічних завданнях.
Основні властивості - детермінованість і незворотність

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
