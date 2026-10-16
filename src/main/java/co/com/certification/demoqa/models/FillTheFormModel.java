package co.com.certification.demoqa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FillTheFormModel {
    private @Getter String fullName;
    private @Getter String email;
    private @Getter String currentAddress;
    private @Getter String permanentAddress;

}
