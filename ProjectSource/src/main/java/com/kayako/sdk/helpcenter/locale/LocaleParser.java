package com.kayako.sdk.helpcenter.locale;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kayako.sdk.base.parser.ListParser;

import java.util.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class LocaleParser implements ListParser<Locale> {

    public static final String ITEM_ID = "id";
    public static final String ITEM_LOCALE = "locale";
    public static final String ITEM_NAME = "name";
    public static final String ITEM_NATIVE_NAME = "nativeName";
    public static final String ITEM_REGION = "region";
    public static final String ITEM_NATIVE_REGION = "nativeRegion";
    public static final String ITEM_DIRECTION = "direction";
    public static final String ITEM_IS_PUBLIC = "isPublic";
    public static final String ITEM_IS_LOCALISED = "isLocalised";
    private static final String NODE_DATA = "data";

    public List<Locale> parse(String json) {
        List<Locale> locales = new ArrayList<Locale>();
        JsonArray jsonArray = new JsonParser().parse(json).getAsJsonObject().get(NODE_DATA).getAsJsonArray();

        int count = 0;
        for (JsonElement element : jsonArray) {
            Locale locale = parseItem(element.getAsJsonObject());
            locales.add(locale);
        }
        return locales;
    }

    public Locale parseItem(JsonObject node) {
        Locale locale = new Locale();

        locale.setId(node.get(ITEM_ID).getAsLong());
        locale.setLocale(node.get(ITEM_LOCALE).getAsString());
        locale.setName(node.get(ITEM_NAME).getAsString());
        locale.setNativeName(node.get(ITEM_NATIVE_NAME).getAsString());
        locale.setLocalized(node.get(ITEM_IS_LOCALISED).getAsBoolean());
        locale.setPublic(node.get(ITEM_IS_PUBLIC).getAsBoolean());
        locale.setDirection(node.get(ITEM_DIRECTION).getAsString());

        if (!node.get(ITEM_REGION).isJsonNull()) {
            locale.setRegion(node.get(ITEM_REGION).getAsString());
        }

        if (!node.get(ITEM_NATIVE_REGION).isJsonNull()) {
            locale.setNativeRegion(node.get(ITEM_NATIVE_REGION).getAsString());
        }

        return locale;
    }
}
