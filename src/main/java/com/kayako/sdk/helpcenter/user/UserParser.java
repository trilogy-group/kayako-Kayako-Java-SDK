package com.kayako.sdk.helpcenter.user;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kayako.sdk.helpcenter.base.ItemParser;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class UserParser implements ItemParser<UserMinimal> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_FULL_NAME = "fullName";
    private static final String ITEM_AVATAR = "avatar";

    public UserMinimal parse(String json) {
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        return parseItem(jsonObject);
        // TODO: Untested. No API that just returns UserMinimal
    }

    public UserMinimal parseItem(JsonObject node) {
        long id = node.get(ITEM_ID).getAsLong();
        String fullName = node.get(ITEM_FULL_NAME).getAsString();
        String avatarUrl = node.get(ITEM_AVATAR).getAsString();
        return new UserMinimal(id, fullName, avatarUrl);
    }
}
