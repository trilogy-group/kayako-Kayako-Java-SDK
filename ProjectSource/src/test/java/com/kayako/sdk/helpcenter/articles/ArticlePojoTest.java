package com.kayako.sdk.helpcenter.articles;

import com.aurea.unittest.commons.pojo.Testers;
import com.aurea.unittest.commons.pojo.chain.TestChain;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import org.junit.Test;

import javax.annotation.Generated;

@Generated("GeneralPatterns")
public class ArticlePojoTest {

    @Test
    public void validateArticleGetters() {
        Validator validator = TestChain.startWith(Testers.getterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Article.class));
    }

    @Test
    public void validateArticleSetters() {
        Validator validator = TestChain.startWith(Testers.setterTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Article.class));
    }

    @Test
    public void validateArticleToString() {
        Validator validator = TestChain.startWith(Testers.toStringTester()).buildValidator();
        validator.validate(PojoClassFactory.getPojoClass(Article.class));
    }
}
