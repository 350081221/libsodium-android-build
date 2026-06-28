package com.tendcloud.tenddata;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TalkingDataProfile extends JSONObject {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11291a = "name";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11292b = "type";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11293c = "gender";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11294d = "age";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11295e = "property1";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11296f = "property2";

    /* renamed from: g, reason: collision with root package name */
    private static final String f11297g = "property3";

    /* renamed from: h, reason: collision with root package name */
    private static final String f11298h = "property4";

    /* renamed from: i, reason: collision with root package name */
    private static final String f11299i = "property5";

    /* renamed from: j, reason: collision with root package name */
    private static final String f11300j = "property6";

    /* renamed from: k, reason: collision with root package name */
    private static final String f11301k = "property7";

    /* renamed from: l, reason: collision with root package name */
    private static final String f11302l = "property8";

    /* renamed from: m, reason: collision with root package name */
    private static final String f11303m = "property9";

    /* renamed from: n, reason: collision with root package name */
    private static final String f11304n = "property10";

    private TalkingDataProfile() {
    }

    public static TalkingDataProfile createProfile() {
        return new TalkingDataProfile();
    }

    public TalkingDataProfile setAge(int i5) {
        try {
            put(f11294d, i5);
        } catch (Throwable th) {
            h.a("set age error ", th);
        }
        return this;
    }

    public TalkingDataProfile setGender(TalkingDataGender talkingDataGender) {
        try {
            put("gender", talkingDataGender.index());
        } catch (Throwable th) {
            h.a("set gender error ", th);
        }
        return this;
    }

    public TalkingDataProfile setName(String str) {
        try {
            put("name", str);
        } catch (Throwable th) {
            h.a("set name error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty1(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11295e, obj);
            }
        } catch (Throwable th) {
            h.a("set property1 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty10(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11304n, obj);
            }
        } catch (Throwable th) {
            h.a("set property10 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty2(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11296f, obj);
            }
        } catch (Throwable th) {
            h.a("set property2 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty3(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11297g, obj);
            }
        } catch (Throwable th) {
            h.a("set property3 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty4(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11298h, obj);
            }
        } catch (Throwable th) {
            h.a("set property4 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty5(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11299i, obj);
            }
        } catch (Throwable th) {
            h.a("set property5 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty6(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11300j, obj);
            }
        } catch (Throwable th) {
            h.a("set property6 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty7(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11301k, obj);
            }
        } catch (Throwable th) {
            h.a("set property7 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty8(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11302l, obj);
            }
        } catch (Throwable th) {
            h.a("set property8 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty9(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f11303m, obj);
            }
        } catch (Throwable th) {
            h.a("set property9 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setType(TalkingDataProfileType talkingDataProfileType) {
        try {
            put("type", talkingDataProfileType.index());
        } catch (Throwable th) {
            h.a("set type error ", th);
        }
        return this;
    }
}
