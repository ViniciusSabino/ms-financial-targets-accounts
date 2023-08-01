package ms.financial.targets.accounts.models;

public class BasicConfig {
    private String name;
    private String environment;
    private Integer port;

    public BasicConfig(String name, String environment, Integer port) {
        this.name = name;
        this.environment = environment;
        this.port = port;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
