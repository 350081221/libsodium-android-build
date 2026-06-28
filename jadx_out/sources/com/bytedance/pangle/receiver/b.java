package com.bytedance.pangle.receiver;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.pangle.util.FieldUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final c f4526a;

    /* loaded from: classes2.dex */
    static class a implements c {
        private a() {
        }

        private static Object b(Context context) {
            Field field;
            Object readField;
            try {
                Field field2 = FieldUtils.getField(Class.forName("android.app.LoadedApk"), "mReceiverResource");
                if (field2 != null && (field = FieldUtils.getField(Class.forName("android.app.ContextImpl"), "mPackageInfo")) != null && (readField = FieldUtils.readField(field, context)) != null) {
                    return FieldUtils.readField(field2, readField);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.bytedance.pangle.receiver.b.c
        public boolean a(Context context) {
            Object b5 = b(context);
            Object a5 = a(b5, "mWhiteList");
            if (!(a5 instanceof String[])) {
                if (b5 == null) {
                    return false;
                }
                FieldUtils.writeField(b5, "mResourceConfig", (Object) null);
                return false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(context.getPackageName());
            Collections.addAll(arrayList, (String[]) a5);
            FieldUtils.writeField(b5, "mWhiteList", arrayList.toArray(new String[arrayList.size()]));
            return true;
        }

        /* synthetic */ a(byte b5) {
            this();
        }

        static Object a(Context context, String str) {
            return a(b(context), str);
        }

        private static Object a(Object obj, String str) {
            if (obj == null) {
                return null;
            }
            try {
                return FieldUtils.readField(obj, str);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.pangle.receiver.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0122b extends e {
        private C0122b() {
            super((byte) 0);
        }

        @Override // com.bytedance.pangle.receiver.b.e, com.bytedance.pangle.receiver.b.a, com.bytedance.pangle.receiver.b.c
        public final boolean a(Context context) {
            return false;
        }

        /* synthetic */ C0122b(byte b5) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    interface c {
        boolean a(Context context);
    }

    /* loaded from: classes2.dex */
    static class d extends a {
        private d() {
            super((byte) 0);
        }

        @Override // com.bytedance.pangle.receiver.b.a, com.bytedance.pangle.receiver.b.c
        public final boolean a(Context context) {
            Object a5 = a.a(context, "mWhiteList");
            if (a5 instanceof List) {
                ((List) a5).add(context.getPackageName());
                return true;
            }
            return false;
        }

        /* synthetic */ d(byte b5) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    static class e extends a {
        private e() {
            super((byte) 0);
        }

        @Override // com.bytedance.pangle.receiver.b.a, com.bytedance.pangle.receiver.b.c
        public boolean a(Context context) {
            Object a5 = a.a(context, "mWhiteListMap");
            if (!(a5 instanceof Map)) {
                return false;
            }
            Map map = (Map) a5;
            List list = (List) map.get(0);
            if (list == null) {
                list = new ArrayList();
                map.put(0, list);
            }
            list.add(context.getPackageName());
            return true;
        }

        /* synthetic */ e(byte b5) {
            this();
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        byte b5 = 0;
        if (i5 < 26) {
            f4526a = new d(b5);
        } else if (i5 < 28) {
            f4526a = new e(b5);
        } else {
            f4526a = new C0122b(b5);
        }
    }

    public static void a(Application application) {
        if (application != null) {
            try {
                if (TextUtils.equals(Build.BRAND.toLowerCase(), "huawei")) {
                    f4526a.a(application.getBaseContext());
                }
            } catch (Throwable unused) {
            }
        }
    }
}
