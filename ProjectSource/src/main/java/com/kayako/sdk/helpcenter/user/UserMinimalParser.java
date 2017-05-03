package com.kayako.sdk.helpcenter.user;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * No API that just returns UserMinimal
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class UserMinimalParser implements Parser<UserMinimal> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_FULL_NAME = "fullName";
    private static final String ITEM_AVATAR = "avatar";
    private static final String ITEM_LAST_ACTIVE_AT = "lastActiveAt";
    private static final String ITEM_LAST_SEEN_AT = "lastSeenAt";
    private static final String ITEM_PRESENCE_CHANNEL = "presenceChannel";

    @Override
    public UserMinimal parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        long id = resourceMap.getAsLong(ITEM_ID);
        String fullName = resourceMap.getAsString(ITEM_FULL_NAME);
        String avatarUrl = resourceMap.getAsString(ITEM_AVATAR);

        Long lastActiveAt = resourceMap.getAsTimeInMilliseconds(ITEM_LAST_ACTIVE_AT);
        Long lastSeenAt = resourceMap.getAsTimeInMilliseconds(ITEM_LAST_SEEN_AT);
        String presenceChannel = resourceMap.getAsString(ITEM_PRESENCE_CHANNEL);
        
        return new UserMinimal(id, fullName, avatarUrl, lastActiveAt, lastSeenAt, presenceChannel);
    }
}
