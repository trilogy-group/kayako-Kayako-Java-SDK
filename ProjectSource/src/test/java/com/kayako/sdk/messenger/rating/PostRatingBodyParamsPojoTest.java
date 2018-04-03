package com.kayako.sdk.messenger.rating;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class PostRatingBodyParamsPojoTest {

    @Test
    public void validatePostRatingBodyParamsGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(PostRatingBodyParams.class));
    }

    @Test
    public void validatePostRatingBodyParamsConstructors() {
        Validator validator = TestChain.startWith(Testers.constructorTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(PostRatingBodyParams.class));
    }
}
