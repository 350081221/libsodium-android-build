package com.tendcloud.tenddata;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TalkingDataSearch extends JSONObject {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11316a = "category";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11317b = "content";

    private TalkingDataSearch() {
    }

    public static TalkingDataSearch createSearch() {
        return new TalkingDataSearch();
    }

    public TalkingDataSearch setCategory(String str) {
        try {
            put(f11316a, str);
        } catch (Throwable th) {
            h.a("set category error ", th);
        }
        return this;
    }

    public TalkingDataSearch setContent(String str) {
        try {
            put("content", str);
        } catch (Throwable th) {
            h.a("set content error ", th);
        }
        return this;
    }
}
