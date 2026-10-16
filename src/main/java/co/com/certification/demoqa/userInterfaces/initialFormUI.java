package co.com.certification.demoqa.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class initialFormUI {
    public static final Target INPUT_NAME = Target.the("input fullname")
            .located(By.xpath("//input[@id='userName' and @placeholder='Full Name']"));
    public static final Target INPUT_EMAIL = Target.the("email field")
            .located(By.xpath("//input[@id='userEmail' and @placeholder='name@example.com']"));
    public static final Target INPUT_CURRENT_ADDRESS = Target.the("current address field")
            .located(By.xpath("//textarea[@id='currentAddress' and @placeholder='Current Address']"));
    public static final Target INPUT_PERMANENT_ADDRESS = Target.the("permanent address field")
            .located(By.xpath("//textarea[@id='permanentAddress' and @class='form-control']"));
    public static final Target BTN_SUBMIT = Target.the("button submit")
            .located(By.xpath("//button[@id='submit' and @class='btn btn-primary']"));
    public static final Target MESSAGE_VALIDATE = Target.the("message with the confirmation info")
            .located(By.xpath("//p[@id='name' and @class='mb-1']"));
}
