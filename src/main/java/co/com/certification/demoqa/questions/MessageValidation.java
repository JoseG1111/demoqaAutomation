package co.com.certification.demoqa.questions;

import co.com.certification.demoqa.models.MessageModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;


public class MessageValidation implements Question<Boolean> {

    private final MessageModel messageModel;
    private final Target target;

    public MessageValidation(MessageModel messageModel, Target target) {
        this.messageModel = messageModel;
        this.target = target;
    }



    @Override
    public Boolean answeredBy(Actor actor){
        String obtainedText = BrowseTheWeb.as(actor).find(target).getText().trim();
        return  messageModel.getMessage().equals(obtainedText);
    }


    public static MessageValidation messageValidation(MessageModel messageModel, Target target){
        return new MessageValidation(messageModel, target);
    }

}
