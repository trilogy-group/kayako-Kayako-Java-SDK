package com.kayako.sdk.helpcenter.user;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * No API that just returns UserMinimal
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class UserParser implements Parser<UserMinimal> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_FULL_NAME = "fullName";
    private static final String ITEM_AVATAR = "avatar";

    @Override
    public UserMinimal parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        long id = resourceMap.getAsLong(ITEM_ID);
        String fullName = resourceMap.getAsString(ITEM_FULL_NAME);
        String avatarUrl = resourceMap.getAsString(ITEM_AVATAR);
        return new UserMinimal(id, fullName, avatarUrl);
    }
}
