package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.utils.ParserUtils;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class ArticleParser implements Parser<Article> {

    private static final String NODE_TITLES = "titles";
    private static final String NODE_CONTENTS = "contents";
    private static final String ITEM_ID = "id";
    private static final String ITEM_UUID = "uuid";
    private static final String ITEM_PUBLISHED_AT = "publishedAt";
    private static final String ITEM_UPDATED_AT = "updatedAt";
    private static final String NODE_AUTHOR = "author";
    private static final String NODE_SECTION = "section";

    private Locale mLocale;

    private ArticleParser() {
    }

    public ArticleParser(Locale locale) {
        mLocale = locale;
    }

    @Override
    public Article parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap map = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);
        Parser<Section> sectionParser = ParserFactory.getSectionParser(mLocale);
        Parser<UserMinimal> userMinimalParser = ParserFactory.getUserMinimalParser();

        Article article = new Article();
        article.setId(map.getAsLong(ITEM_ID));
        article.setUuid(map.getAsString(ITEM_UUID));
        article.setContents(map.getAsLocalizedString(NODE_CONTENTS, mLocale));
        article.setTitle(map.getAsLocalizedString(NODE_TITLES, mLocale));
        article.setSection(sectionParser.parse(map.getAsJsonString(NODE_SECTION)));
        article.setAuthor(userMinimalParser.parse(map.getAsJsonString(NODE_AUTHOR)));
        article.setLastPosted(map.getAsTimeInMilliseconds(ITEM_PUBLISHED_AT));
        article.setLastUpdated(map.getAsTimeInMilliseconds(ITEM_UPDATED_AT));

        return article;
    }
}
