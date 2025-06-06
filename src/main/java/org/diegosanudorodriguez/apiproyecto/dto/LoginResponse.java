package org.diegosanudorodriguez.apiproyecto.dto;

public class LoginResponse {
    private boolean success;
    private String message;
    private Integer userId;
    private String nombre;

    // Constructor for successful login
    public static LoginResponse success(Integer userId, String nombre) {
        LoginResponse response = new LoginResponse();
        response.setSuccess(true);
        response.setUserId(userId);
        response.setNombre(nombre);
        response.setMessage("Login successful");
        return response;
    }

    // Constructor for failed login
    public static LoginResponse failure() {
        LoginResponse response = new LoginResponse();
        response.setSuccess(false);
        response.setMessage("Invalid email or password");
        return response;
    }

    // Getters and Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
