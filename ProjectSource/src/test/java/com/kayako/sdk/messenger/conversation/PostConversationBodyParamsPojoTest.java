package com.kayako.sdk.messenger.conversation;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class PostConversationBodyParamsPojoTest {

    @Test
    public void validatePostConversationBodyParamsGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(PostConversationBodyParams.class));
    }

    @Test
    public void validatePostConversationBodyParamsConstructors() {
        Validator validator = TestChain.startWith(Testers.constructorTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(PostConversationBodyParams.class));
    }
}