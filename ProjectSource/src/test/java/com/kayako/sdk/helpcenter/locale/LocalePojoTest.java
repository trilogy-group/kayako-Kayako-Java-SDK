package com.kayako.sdk.helpcenter.locale;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class LocalePojoTest {

    @Test
    public void validateLocaleGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Locale.class));
    }

    @Test
    public void validateLocaleSetters() {
        Validator validator = TestChain.startWith(Testers.setterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Locale.class));
    }

    @Test
    public void validateLocaleToString() {
        Validator validator = TestChain.startWith(Testers.toStringTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Locale.class));
    }
}
