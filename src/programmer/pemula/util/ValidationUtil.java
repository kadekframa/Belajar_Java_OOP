package programmer.pemula.util;

import programmer.pemula.data.LoginRequest;
import programmer.pemula.error.BlankException;
import programmer.pemula.error.ValidationException;

public class ValidationUtil {
    // Membuat exception.
    // Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai dengan kata kunci throws diikuti dengan class exception nya.
    // Jika method tersebut bisa menimnbulkan lebih dari satu jenis exception, kita bisa menambah lebih dari dari satu class exception.
    // Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw, diikuti dengan object exception nya.


    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

}