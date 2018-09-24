package com.fengkun.design_pattern.builder;

/**
 * Created by fengkunangel on 2018/9/24.
 */
public class ComputerBuilder {

    private static final String DEFAULT_OS = "Windows10";
    private static final String DEFAULT_ADMIN = "admin";
    private static final String DEFAULT_PASSWORD = "admin";
    private static final String DEFAULT_OFFICE = "office2010";
    private static final String DEFAULT_CHAT = "QQ";
    private static final String DEFAULT_LANGUAGE = "EN";

    public Computer build() {
        Computer computer = new Computer();
        computer.setOs(os);
        computer.setAdmin(admin);
        computer.setPassword(password);
        computer.setChat(chat);
        computer.setOffice(office);
        computer.setLanguage(language);
        computer.setNetwork(network);
        return computer;
    }

    private String os;
    private String network;
    private String admin;
    private String password;
    private String office;
    private String chat;
    private String language;

    public ComputerBuilder() {
        os = DEFAULT_OS;
        admin = DEFAULT_ADMIN;
        password = DEFAULT_PASSWORD;
        office = DEFAULT_OFFICE;
        chat = DEFAULT_CHAT;
        language = DEFAULT_LANGUAGE;
    }

    public String getOs() {
        return os;
    }

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public String getNetwork() {
        return network;
    }

    public ComputerBuilder setNetwork(String network) {
        this.network = network;
        return this;
    }

    public String getAdmin() {
        return admin;
    }

    public ComputerBuilder setAdmin(String admin) {
        this.admin = admin;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ComputerBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getOffice() {
        return office;
    }

    public ComputerBuilder setOffice(String office) {
        this.office = office;
        return this;
    }

    public String getChat() {
        return chat;
    }

    public ComputerBuilder setChat(String chat) {
        this.chat = chat;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public ComputerBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }
}
