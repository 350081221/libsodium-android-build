package com.ss.android.download.api.model;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.downloadlib.addownload.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f9461a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9462b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9463c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9464d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9465e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9466f;

    /* renamed from: g, reason: collision with root package name */
    private final long f9467g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f9468h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONObject f9469i;

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f9470j;

    /* renamed from: k, reason: collision with root package name */
    private final int f9471k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f9472l;

    /* renamed from: m, reason: collision with root package name */
    private final String f9473m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f9474n;

    /* renamed from: o, reason: collision with root package name */
    private final String f9475o;

    /* renamed from: p, reason: collision with root package name */
    private final JSONObject f9476p;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f9477a;

        /* renamed from: b, reason: collision with root package name */
        private String f9478b;

        /* renamed from: c, reason: collision with root package name */
        private String f9479c;

        /* renamed from: e, reason: collision with root package name */
        private long f9481e;

        /* renamed from: f, reason: collision with root package name */
        private String f9482f;

        /* renamed from: g, reason: collision with root package name */
        private long f9483g;

        /* renamed from: h, reason: collision with root package name */
        private JSONObject f9484h;

        /* renamed from: i, reason: collision with root package name */
        private JSONObject f9485i;

        /* renamed from: j, reason: collision with root package name */
        private Map<String, Object> f9486j;

        /* renamed from: k, reason: collision with root package name */
        private List<String> f9487k;

        /* renamed from: l, reason: collision with root package name */
        private int f9488l;

        /* renamed from: m, reason: collision with root package name */
        private Object f9489m;

        /* renamed from: n, reason: collision with root package name */
        private String f9490n;

        /* renamed from: p, reason: collision with root package name */
        private String f9492p;

        /* renamed from: q, reason: collision with root package name */
        private JSONObject f9493q;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9480d = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f9491o = false;

        public a a(boolean z4) {
            this.f9491o = z4;
            return this;
        }

        public a b(String str) {
            this.f9479c = str;
            return this;
        }

        public a c(String str) {
            this.f9482f = str;
            return this;
        }

        public a d(String str) {
            this.f9490n = str;
            return this;
        }

        public a a(String str) {
            this.f9478b = str;
            return this;
        }

        public a b(long j5) {
            this.f9483g = j5;
            return this;
        }

        public a a(long j5) {
            this.f9481e = j5;
            return this;
        }

        public a b(boolean z4) {
            this.f9480d = z4;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.f9484h = jSONObject;
            return this;
        }

        public a b(JSONObject jSONObject) {
            this.f9485i = jSONObject;
            return this;
        }

        public a a(List<String> list) {
            this.f9487k = list;
            return this;
        }

        public a a(int i5) {
            this.f9488l = i5;
            return this;
        }

        public a a(Object obj) {
            this.f9489m = obj;
            return this;
        }

        public c a() {
            if (TextUtils.isEmpty(this.f9477a)) {
                this.f9477a = "umeng";
            }
            JSONObject jSONObject = new JSONObject();
            if (this.f9484h == null) {
                this.f9484h = new JSONObject();
            }
            try {
                Map<String, Object> map = this.f9486j;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f9486j.entrySet()) {
                        if (!this.f9484h.has(entry.getKey())) {
                            this.f9484h.putOpt(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (this.f9491o) {
                    this.f9492p = this.f9479c;
                    JSONObject jSONObject2 = new JSONObject();
                    this.f9493q = jSONObject2;
                    if (this.f9480d) {
                        jSONObject2.put("ad_extra_data", this.f9484h.toString());
                    } else {
                        Iterator<String> keys = this.f9484h.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            this.f9493q.put(next, this.f9484h.get(next));
                        }
                    }
                    this.f9493q.put("category", this.f9477a);
                    this.f9493q.put(TTDownloadField.TT_TAG, this.f9478b);
                    this.f9493q.put(t0.b.f22420d, this.f9481e);
                    this.f9493q.put("ext_value", this.f9483g);
                    if (!TextUtils.isEmpty(this.f9490n)) {
                        this.f9493q.put(TTDownloadField.TT_REFER, this.f9490n);
                    }
                    JSONObject jSONObject3 = this.f9485i;
                    if (jSONObject3 != null) {
                        this.f9493q = com.ss.android.download.api.c.b.a(jSONObject3, this.f9493q);
                    }
                    if (this.f9480d) {
                        if (!this.f9493q.has("log_extra") && !TextUtils.isEmpty(this.f9482f)) {
                            this.f9493q.put("log_extra", this.f9482f);
                        }
                        this.f9493q.put("is_ad_event", "1");
                    }
                }
                if (this.f9480d) {
                    jSONObject.put("ad_extra_data", this.f9484h.toString());
                    if (!jSONObject.has("log_extra") && !TextUtils.isEmpty(this.f9482f)) {
                        jSONObject.put("log_extra", this.f9482f);
                    }
                    jSONObject.put("is_ad_event", "1");
                } else {
                    jSONObject.put("extra", this.f9484h);
                }
                if (!TextUtils.isEmpty(this.f9490n)) {
                    jSONObject.putOpt(TTDownloadField.TT_REFER, this.f9490n);
                }
                JSONObject jSONObject4 = this.f9485i;
                if (jSONObject4 != null) {
                    jSONObject = com.ss.android.download.api.c.b.a(jSONObject4, jSONObject);
                }
                this.f9484h = jSONObject;
            } catch (Exception e5) {
                k.u().a(e5, "DownloadEventModel build");
            }
            return new c(this);
        }
    }

    c(a aVar) {
        this.f9461a = aVar.f9477a;
        this.f9462b = aVar.f9478b;
        this.f9463c = aVar.f9479c;
        this.f9464d = aVar.f9480d;
        this.f9465e = aVar.f9481e;
        this.f9466f = aVar.f9482f;
        this.f9467g = aVar.f9483g;
        this.f9468h = aVar.f9484h;
        this.f9469i = aVar.f9485i;
        this.f9470j = aVar.f9487k;
        this.f9471k = aVar.f9488l;
        this.f9472l = aVar.f9489m;
        this.f9474n = aVar.f9491o;
        this.f9475o = aVar.f9492p;
        this.f9476p = aVar.f9493q;
        this.f9473m = aVar.f9490n;
    }

    public String a() {
        return this.f9461a;
    }

    public String b() {
        return this.f9462b;
    }

    public String c() {
        return this.f9463c;
    }

    public boolean d() {
        return this.f9464d;
    }

    public long e() {
        return this.f9465e;
    }

    public String f() {
        return this.f9466f;
    }

    public long g() {
        return this.f9467g;
    }

    public JSONObject h() {
        return this.f9468h;
    }

    public JSONObject i() {
        return this.f9469i;
    }

    public List<String> j() {
        return this.f9470j;
    }

    public int k() {
        return this.f9471k;
    }

    public Object l() {
        return this.f9472l;
    }

    public boolean m() {
        return this.f9474n;
    }

    public String n() {
        return this.f9475o;
    }

    public JSONObject o() {
        return this.f9476p;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("category: ");
        sb.append(this.f9461a);
        sb.append("\ttag: ");
        sb.append(this.f9462b);
        sb.append("\tlabel: ");
        sb.append(this.f9463c);
        sb.append("\nisAd: ");
        sb.append(this.f9464d);
        sb.append("\tadId: ");
        sb.append(this.f9465e);
        sb.append("\tlogExtra: ");
        sb.append(this.f9466f);
        sb.append("\textValue: ");
        sb.append(this.f9467g);
        sb.append("\nextJson: ");
        sb.append(this.f9468h);
        sb.append("\nparamsJson: ");
        sb.append(this.f9469i);
        sb.append("\nclickTrackUrl: ");
        List<String> list = this.f9470j;
        String str3 = "";
        if (list == null) {
            str = "";
        } else {
            str = list.toString();
        }
        sb.append(str);
        sb.append("\teventSource: ");
        sb.append(this.f9471k);
        sb.append("\textraObject: ");
        Object obj = this.f9472l;
        if (obj == null) {
            str2 = "";
        } else {
            str2 = obj.toString();
        }
        sb.append(str2);
        sb.append("\nisV3: ");
        sb.append(this.f9474n);
        sb.append("\tV3EventName: ");
        sb.append(this.f9475o);
        sb.append("\tV3EventParams: ");
        JSONObject jSONObject = this.f9476p;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        sb.append(str3);
        return sb.toString();
    }
}
