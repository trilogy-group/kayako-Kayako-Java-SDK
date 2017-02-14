package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetLocales extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/locales.json?_case=camel&include=locale";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"locale\": \"en-us\",\n" +
                "            \"name\": \"English\",\n" +
                "            \"nativeName\": \"English (United States)\",\n" +
                "            \"region\": \"US\",\n" +
                "            \"nativeRegion\": \"United States\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": true,\n" +
                "            \"isLocalised\": true,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/1\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"locale\": \"en-gb\",\n" +
                "            \"name\": \"English\",\n" +
                "            \"nativeName\": \"English (United Kingdom)\",\n" +
                "            \"region\": \"GB\",\n" +
                "            \"nativeRegion\": \"United Kingdom\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:31:29+00:00\",\n" +
                "            \"updatedAt\": \"2016-05-26T13:13:31+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/2\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3,\n" +
                "            \"locale\": \"es\",\n" +
                "            \"name\": \"español\",\n" +
                "            \"nativeName\": \"Español\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/3\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 5,\n" +
                "            \"locale\": \"de\",\n" +
                "            \"name\": \"Deutsch\",\n" +
                "            \"nativeName\": \"Deutsch\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/5\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 6,\n" +
                "            \"locale\": \"zh-tw\",\n" +
                "            \"name\": \"中文\",\n" +
                "            \"nativeName\": \"中文（台灣）\",\n" +
                "            \"region\": \"TW\",\n" +
                "            \"nativeRegion\": \"台灣\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/6\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7,\n" +
                "            \"locale\": \"zh-cn\",\n" +
                "            \"name\": \"中文\",\n" +
                "            \"nativeName\": \"中文（中国）\",\n" +
                "            \"region\": \"CN\",\n" +
                "            \"nativeRegion\": \"中国\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/7\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 8,\n" +
                "            \"locale\": \"pl\",\n" +
                "            \"name\": \"polski\",\n" +
                "            \"nativeName\": \"Polski\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/8\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 9,\n" +
                "            \"locale\": \"fr\",\n" +
                "            \"name\": \"français\",\n" +
                "            \"nativeName\": \"Français\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/9\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 10,\n" +
                "            \"locale\": \"pt-br\",\n" +
                "            \"name\": \"português\",\n" +
                "            \"nativeName\": \"Português (Brasil)\",\n" +
                "            \"region\": \"BR\",\n" +
                "            \"nativeRegion\": \"Brasil\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-05-13T11:01:17+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/10\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 11,\n" +
                "            \"locale\": \"it\",\n" +
                "            \"name\": \"italiano\",\n" +
                "            \"nativeName\": \"Italiano\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-14T14:20:11+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/11\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 12,\n" +
                "            \"locale\": \"ro\",\n" +
                "            \"name\": \"română\",\n" +
                "            \"nativeName\": \"Română\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/12\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 13,\n" +
                "            \"locale\": \"is\",\n" +
                "            \"name\": \"íslenska\",\n" +
                "            \"nativeName\": \"íslenska\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/13\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 14,\n" +
                "            \"locale\": \"vi\",\n" +
                "            \"name\": \"Tiếng Việt\",\n" +
                "            \"nativeName\": \"Tiếng Việt\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/14\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 15,\n" +
                "            \"locale\": \"ru\",\n" +
                "            \"name\": \"русский\",\n" +
                "            \"nativeName\": \"русский\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/15\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 16,\n" +
                "            \"locale\": \"he\",\n" +
                "            \"name\": \"עברית\",\n" +
                "            \"nativeName\": \"עברית\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"rtl\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/16\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 17,\n" +
                "            \"locale\": \"no\",\n" +
                "            \"name\": \"norsk\",\n" +
                "            \"nativeName\": \"Norsk\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/17\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 18,\n" +
                "            \"locale\": \"fil\",\n" +
                "            \"name\": \"Filipino\",\n" +
                "            \"nativeName\": \"Filipino\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/18\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 19,\n" +
                "            \"locale\": \"ar\",\n" +
                "            \"name\": \"العربية\",\n" +
                "            \"nativeName\": \"العربية\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"rtl\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/19\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 20,\n" +
                "            \"locale\": \"ja\",\n" +
                "            \"name\": \"日本語\",\n" +
                "            \"nativeName\": \"日本語\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/20\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 21,\n" +
                "            \"locale\": \"ko\",\n" +
                "            \"name\": \"한국어\",\n" +
                "            \"nativeName\": \"한국어\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/21\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 22,\n" +
                "            \"locale\": \"sl\",\n" +
                "            \"name\": \"slovenščina\",\n" +
                "            \"nativeName\": \"Slovenščina\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/22\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 23,\n" +
                "            \"locale\": \"hr\",\n" +
                "            \"name\": \"hrvatski\",\n" +
                "            \"nativeName\": \"Hrvatski\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/23\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 24,\n" +
                "            \"locale\": \"id\",\n" +
                "            \"name\": \"Bahasa Indonesia\",\n" +
                "            \"nativeName\": \"Bahasa Indonesia\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-11T12:42:41+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/24\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 25,\n" +
                "            \"locale\": \"cs\",\n" +
                "            \"name\": \"čeština\",\n" +
                "            \"nativeName\": \"čeština\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/25\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 26,\n" +
                "            \"locale\": \"th\",\n" +
                "            \"name\": \"ไทย\",\n" +
                "            \"nativeName\": \"ไทย\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/26\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 27,\n" +
                "            \"locale\": \"fi\",\n" +
                "            \"name\": \"suomi\",\n" +
                "            \"nativeName\": \"Suomi\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/27\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 28,\n" +
                "            \"locale\": \"tr\",\n" +
                "            \"name\": \"Türkçe\",\n" +
                "            \"nativeName\": \"Türkçe\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/28\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 29,\n" +
                "            \"locale\": \"sv\",\n" +
                "            \"name\": \"svenska\",\n" +
                "            \"nativeName\": \"Svenska\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/29\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 30,\n" +
                "            \"locale\": \"el\",\n" +
                "            \"name\": \"Ελληνικά\",\n" +
                "            \"nativeName\": \"Ελληνικά\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/30\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 31,\n" +
                "            \"locale\": \"bg\",\n" +
                "            \"name\": \"български\",\n" +
                "            \"nativeName\": \"български\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/31\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 32,\n" +
                "            \"locale\": \"et\",\n" +
                "            \"name\": \"eesti\",\n" +
                "            \"nativeName\": \"Eesti\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/32\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 33,\n" +
                "            \"locale\": \"da\",\n" +
                "            \"name\": \"dansk\",\n" +
                "            \"nativeName\": \"Dansk\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/33\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 34,\n" +
                "            \"locale\": \"sk\",\n" +
                "            \"name\": \"slovenčina\",\n" +
                "            \"nativeName\": \"Slovenčina\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/34\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 35,\n" +
                "            \"locale\": \"nl\",\n" +
                "            \"name\": \"Nederlands\",\n" +
                "            \"nativeName\": \"Nederlands\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/35\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 36,\n" +
                "            \"locale\": \"bs\",\n" +
                "            \"name\": \"bosanski\",\n" +
                "            \"nativeName\": \"Bosanski\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/36\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 37,\n" +
                "            \"locale\": \"hu\",\n" +
                "            \"name\": \"magyar\",\n" +
                "            \"nativeName\": \"Magyar\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/37\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 38,\n" +
                "            \"locale\": \"pt\",\n" +
                "            \"name\": \"português\",\n" +
                "            \"nativeName\": \"Português\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/38\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 39,\n" +
                "            \"locale\": \"ca\",\n" +
                "            \"name\": \"català\",\n" +
                "            \"nativeName\": \"Català\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-06-22T13:50:35+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/39\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 40,\n" +
                "            \"locale\": \"lt\",\n" +
                "            \"name\": \"lietuvių\",\n" +
                "            \"nativeName\": \"Lietuvių\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/40\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 41,\n" +
                "            \"locale\": \"lv\",\n" +
                "            \"name\": \"latviešu\",\n" +
                "            \"nativeName\": \"Latviešu\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/41\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 42,\n" +
                "            \"locale\": \"sr\",\n" +
                "            \"name\": \"српски\",\n" +
                "            \"nativeName\": \"српски\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/42\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 43,\n" +
                "            \"locale\": \"uk\",\n" +
                "            \"name\": \"українська\",\n" +
                "            \"nativeName\": \"українська\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
                "            \"updatedAt\": \"2016-05-26T13:04:17+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/43\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 44,\n" +
                "            \"locale\": \"ms\",\n" +
                "            \"name\": \"Bahasa Melayu\",\n" +
                "            \"nativeName\": \"Bahasa Melayu\",\n" +
                "            \"region\": \"\",\n" +
                "            \"nativeRegion\": \"\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2016-12-21T12:48:14+00:00\",\n" +
                "            \"updatedAt\": \"2016-12-21T12:48:14+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/44\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 46,\n" +
                "            \"locale\": \"es_419\",\n" +
                "            \"name\": \"español\",\n" +
                "            \"nativeName\": \"Español (Latinoamérica)\",\n" +
                "            \"region\": \"419\",\n" +
                "            \"nativeRegion\": \"Latinoamérica\",\n" +
                "            \"script\": \"\",\n" +
                "            \"variant\": \"\",\n" +
                "            \"direction\": \"ltr\",\n" +
                "            \"isPublic\": false,\n" +
                "            \"isLocalised\": false,\n" +
                "            \"createdAt\": \"2017-01-15T08:05:05+00:00\",\n" +
                "            \"updatedAt\": \"2017-01-15T08:05:05+00:00\",\n" +
                "            \"resourceType\": \"locale\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/46\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"locale\",\n" +
                "    \"totalCount\": 44\n" +
                "}";
    }
}
