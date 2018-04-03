package com.kayako.sdk.base.parser;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class DataNodeParserPojoTest {

    @Test
    public void validateDataNodeParserConstructors() {
        Validator validator = TestChain.startWith(Testers.constructorTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(DataNodeParser.class));
    }
}
