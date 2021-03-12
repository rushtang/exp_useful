package apply.ioc.model;
import apply.ioc.annotation.Component;
import apply.ioc.annotation.Value;

/**
 * @author tangmaoheng
 * @createTime 2019年12月12日 16:45:00
 */


@Component
public class BatchSms {

    @Value(str = "apply")
    private String name;
    @Value(str = "13550234762")
    private String phone;
    @Value(str = "2233")
    private String templateCode;
    @Value(str = "1")
    private String type;
    @Value(str = "2015-12-10 12:20:00")
    private String sendTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "BatchSms{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", templateCode='" + templateCode + '\'' +
                ", type='" + type + '\'' +
                ", sendTime='" + sendTime + '\'' +
                '}';
    }
}
