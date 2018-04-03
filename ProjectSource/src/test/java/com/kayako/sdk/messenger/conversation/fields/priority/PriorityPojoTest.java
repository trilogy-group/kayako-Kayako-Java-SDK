package com.kayako.sdk.messenger.conversation.fields.priority;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class PriorityPojoTest {

    @Test
    public void validatePriorityGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Priority.class));
    }

    @Test
    public void validatePrioritySetters() {
        Validator validator = TestChain.startWith(Testers.setterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Priority.class));
    }

    @Test
    public void validatePriorityConstructors() {
        Validator validator = TestChain.startWith(Testers.constructorTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Priority.class));
    }
}
