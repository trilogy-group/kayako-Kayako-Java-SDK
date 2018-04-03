package com.kayako.sdk.helpcenter.category;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class CategoryPojoTest {

    @Test
    public void validateCategoryGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Category.class));
    }

    @Test
    public void validateCategorySetters() {
        Validator validator = TestChain.startWith(Testers.setterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Category.class));
    }

    @Test
    public void validateCategoryToString() {
        Validator validator = TestChain.startWith(Testers.toStringTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Category.class));
    }
}
