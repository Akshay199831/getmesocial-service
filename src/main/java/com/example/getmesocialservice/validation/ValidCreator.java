package com.example.getmesocialservice.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidCreatorValidator.class)
@Documented
public @interface ValidCreator {
    String message() default "It Should in a-z Format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
