package com.example.getmesocialservice.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = VaildNameValidator.class)
@Documented
public @interface ValidName {
    String message() default "Not a Vaild Name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
