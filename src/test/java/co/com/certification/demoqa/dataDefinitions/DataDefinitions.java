package co.com.certification.demoqa.dataDefinitions;

import co.com.certification.demoqa.models.FillTheFormModel;
import co.com.certification.demoqa.models.MessageModel;
import io.cucumber.java.DataTableType;

import java.util.Map;


import static co.com.certification.demoqa.userInterfaces.initialFormUI.*;
import static co.com.certification.demoqa.utils.Constants.*;
import static co.com.certification.demoqa.utils.Constants.MESSAGE;

public class DataDefinitions {
    @DataTableType(replaceWithEmptyString = "[Blank]")
    public FillTheFormModel fillTheFormModel(Map<String, String> entry){
        return new FillTheFormModel(
                entry.get(FULL_NAME.getConstants()),
                entry.get(EMAIL.getConstants()),
                entry.get(CURRENT_ADDRESS.getConstants()),
                entry.get(PERMANENT_ADDRESS.getConstants())

        );

    }
        @DataTableType(replaceWithEmptyString = "[Blank]")
                public MessageModel messageModel(Map<String, String> entry){
            return new MessageModel(
                    entry.get(MESSAGE.getConstants())
            );
        }
    }

