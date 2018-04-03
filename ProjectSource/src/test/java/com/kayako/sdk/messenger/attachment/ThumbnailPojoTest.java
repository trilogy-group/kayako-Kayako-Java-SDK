package com.kayako.sdk.messenger.attachment;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class ThumbnailPojoTest {

    @Test
    public void validateThumbnailGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Thumbnail.class));
    }

    @Test
    public void validateThumbnailConstructors() {
        Validator validator = TestChain.startWith(Testers.constructorTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Thumbnail.class));
    }
}
