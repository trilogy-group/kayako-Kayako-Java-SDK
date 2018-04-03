package com.kayako.sdk.error.response;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class LogPojoTest {

    @Test
    public void validateLogToString() {
        Validator validator = TestChain.startWith(Testers.toStringTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Log.class));
    }

    @Test
    public void validateLogConstructors() {
        Validator validator = TestChain.startWith(Testers.constructorTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Log.class));
    }
}
