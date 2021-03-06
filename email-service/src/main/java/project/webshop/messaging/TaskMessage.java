package project.webshop.messaging;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskMessage{

    // Email: email id
    private String emailId;

    @JsonCreator
    public TaskMessage(@JsonProperty("emailId") String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
