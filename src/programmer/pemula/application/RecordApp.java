package programmer.pemula.application;

import programmer.pemula.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Kadekframa", "semangat");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Kadekframa"));
        System.out.println(new LoginRequest("Kadekframa", "semangat meraih impian"));


    }
}
