package app;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.List;

@EnableConfigurationProperties
@ConfigurationProperties(prefix="myapp.mail")
//@Validated
public class MailProperties {
    private String to;

    //@NotBlank
    private String host;
    private int port;
    private String[] cc;
    private List<String> bcc;
    private Credential credential = new Credential();
    //Setter and Getter methods
    public class Credential {
        private String userName;
        private String password;

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
//Setter and Getter methods
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setCc(String[] cc) {
        this.cc = cc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String[] getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public Credential getCredential() {
        return credential;
    }
}


/*
@ConfigurationProperties(prefix="myapp.mail")
public class MailProperties {
    private String to;
    private String host;
    private int port;
    private String[] cc;
    private List<String> bcc;
    private Credential credential = new Credential();
    //Setter and Getter methods
    public class Credential {
    private String userName;
    private String password;
    //Setter and Getter methods
    }
}
* */