package com.kayako.sdk.messenger.message;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class MessagePojoTest {

    @Test
    public void validateMessageGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Message.class));
    }

    @Test
    public void validateMessageConstructors() {
        Validator validator = TestChain.startWith(Testers.constructorTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Message.class));
    }
}
