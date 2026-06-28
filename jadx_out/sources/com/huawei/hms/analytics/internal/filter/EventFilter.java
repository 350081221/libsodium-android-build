package com.huawei.hms.analytics.internal.filter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.analytics.am;
import com.huawei.hms.analytics.bj;
import com.huawei.hms.analytics.bk;
import com.huawei.hms.analytics.bl;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.dc;
import com.huawei.hms.analytics.dj;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public class EventFilter implements bk {
    private Context ghi;
    private Method hij;
    private Object ijk;
    private Method ikl;
    private Method klm;
    private bl lmn;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean klm(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "IncidentFilter"
            r1 = 0
            java.lang.reflect.Method r2 = r5.klm     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            java.lang.Object r3 = r5.ijk     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            r4[r1] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            r6 = 1
            r4[r6] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            java.lang.Object r6 = r2.invoke(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            boolean r2 = r6 instanceof java.lang.Boolean     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            if (r2 == 0) goto L27
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            boolean r6 = r6.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L22
            r1 = r6
            goto L27
        L1f:
            java.lang.String r6 = "Invocation target warning"
            goto L24
        L22:
            java.lang.String r6 = "Illegal access warning"
        L24:
            com.huawei.hms.analytics.core.log.HiLog.w(r0, r6)
        L27:
            if (r1 != 0) goto L2c
            lmn(r7)
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.internal.filter.EventFilter.klm(java.lang.String, android.os.Bundle):boolean");
    }

    private static long lmn(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private static void lmn(Bundle bundle) {
        bundle.remove("$HA_FIXED_TAG");
        bundle.remove("$HA_FIXED_TYPE");
        bundle.remove("$HA_FIXED_SOURCE");
        bundle.remove("$HA_FIXED_TIMESTAMP");
    }

    private static boolean lmn(String str, String str2) {
        if (!TextUtils.isEmpty(str) && "oper".equals(str2)) {
            return true;
        }
        HiLog.e("IncidentFilter", "third callback params invalid");
        return false;
    }

    public String getUserProfile(String str) {
        HiLog.d("IncidentFilter", "get user property#".concat(String.valueOf(str)));
        bl blVar = this.lmn;
        if (blVar == null) {
            return null;
        }
        return blVar.lmn(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008b A[Catch: InvocationTargetException -> 0x0095, IllegalAccessException -> 0x009b, TRY_LEAVE, TryCatch #7 {IllegalAccessException -> 0x009b, InvocationTargetException -> 0x0095, blocks: (B:18:0x0080, B:8:0x008b), top: B:17:0x0080 }] */
    @Override // com.huawei.hms.analytics.bk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lmn(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "Illegal access warning"
            java.lang.String r3 = "IncidentFilter"
            r12.ghi = r13
            r4 = 0
            r5 = 1
            r6 = 0
            java.lang.String r7 = "com.huawei.hms.dtm.EventFilter"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.NoSuchMethodException -> L69 java.lang.InstantiationException -> L6d java.lang.IllegalAccessException -> L71 java.lang.ClassNotFoundException -> L76
            java.lang.Object r8 = r7.newInstance()     // Catch: java.lang.NoSuchMethodException -> L69 java.lang.InstantiationException -> L6d java.lang.IllegalAccessException -> L71 java.lang.ClassNotFoundException -> L76
            r12.ijk = r8     // Catch: java.lang.NoSuchMethodException -> L69 java.lang.InstantiationException -> L6d java.lang.IllegalAccessException -> L71 java.lang.ClassNotFoundException -> L76
            java.lang.String r8 = "setLogCallback"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L69 java.lang.InstantiationException -> L6d java.lang.IllegalAccessException -> L71 java.lang.ClassNotFoundException -> L76
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r9[r4] = r10     // Catch: java.lang.NoSuchMethodException -> L69 java.lang.InstantiationException -> L6d java.lang.IllegalAccessException -> L71 java.lang.ClassNotFoundException -> L76
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r8, r9)     // Catch: java.lang.NoSuchMethodException -> L69 java.lang.InstantiationException -> L6d java.lang.IllegalAccessException -> L71 java.lang.ClassNotFoundException -> L76
            java.lang.String r9 = "initialize"
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r4] = r11     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.reflect.Method r6 = r7.getDeclaredMethod(r9, r10)     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.String r9 = "logEvent"
            r10 = 2
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            r11[r4] = r1     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            r11[r5] = r0     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.reflect.Method r9 = r7.getDeclaredMethod(r9, r11)     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            r12.klm = r9     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.String r9 = "logAutoEvent"
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            r10[r4] = r1     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            r10[r5] = r0     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r9, r10)     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            r12.ikl = r0     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.String r0 = "setParameter"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            r1[r4] = r9     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            r12.hij = r0     // Catch: java.lang.NoSuchMethodException -> L5d java.lang.InstantiationException -> L60 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L66
            goto L7e
        L5d:
            r0 = r6
            r6 = r8
            goto L6a
        L60:
            r0 = r6
            r6 = r8
            goto L6e
        L63:
            r0 = r6
            r6 = r8
            goto L72
        L66:
            r0 = r6
            r6 = r8
            goto L77
        L69:
            r0 = r6
        L6a:
            java.lang.String r1 = "No such method warning"
            goto L79
        L6d:
            r0 = r6
        L6e:
            java.lang.String r1 = "Instantiation warning"
            goto L79
        L71:
            r0 = r6
        L72:
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r2)
            goto L7c
        L76:
            r0 = r6
        L77:
            java.lang.String r1 = "Class not found warning"
        L79:
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r1)
        L7c:
            r8 = r6
            r6 = r0
        L7e:
            if (r8 == 0) goto L89
            java.lang.Object r0 = r12.ijk     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
            r1[r4] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
            r8.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
        L89:
            if (r6 == 0) goto L9e
            java.lang.Object r0 = r12.ijk     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
            r1[r4] = r13     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
            r6.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L95 java.lang.IllegalAccessException -> L9b
            goto L9e
        L95:
            java.lang.String r13 = "Invocation target warning"
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r13)
            return
        L9b:
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r2)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.internal.filter.EventFilter.lmn(android.content.Context):void");
    }

    @Override // com.huawei.hms.analytics.bk
    public final void lmn(bl blVar) {
        this.lmn = blVar;
    }

    @Override // com.huawei.hms.analytics.bk
    public final void lmn(String str, Bundle bundle) {
        String str2;
        Method method = this.ikl;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this.ijk, str, bundle);
        } catch (IllegalAccessException unused) {
            str2 = "Illegal access warning";
            HiLog.w("IncidentFilter", str2);
        } catch (InvocationTargetException unused2) {
            str2 = "Invocation target warning";
            HiLog.w("IncidentFilter", str2);
        }
    }

    @Override // com.huawei.hms.analytics.bk
    public final void lmn(Map<Object, Object> map) {
        String str;
        if (this.hij == null) {
            str = "analytics callback init failed, pls check log.";
        } else if (map.size() <= 0) {
            str = "params is empty,Not need notify DTM";
        } else {
            try {
                this.hij.invoke(this.ijk, map);
                return;
            } catch (IllegalAccessException unused) {
                str = "Illegal access warning";
            } catch (InvocationTargetException unused2) {
                str = "Invocation target warning";
            }
        }
        HiLog.w("IncidentFilter", str);
    }

    @Override // com.huawei.hms.analytics.bk
    public final boolean lmn(String str, String str2, String str3, Bundle bundle) {
        if (this.klm == null) {
            return false;
        }
        bundle.putString("$HA_FIXED_TAG", str);
        bundle.putString("$HA_FIXED_TYPE", str2);
        bundle.putString("$HA_FIXED_SOURCE", "Event");
        return klm(str3, bundle);
    }

    @Override // com.huawei.hms.analytics.bk
    public final boolean lmn(String str, String str2, String str3, Bundle bundle, long j5) {
        if (this.klm == null) {
            return false;
        }
        bundle.putString("$HA_FIXED_TAG", str);
        bundle.putString("$HA_FIXED_TYPE", str2);
        bundle.putString("$HA_FIXED_SOURCE", "StreamEvent");
        bundle.putString("$HA_FIXED_TIMESTAMP", String.valueOf(j5));
        return klm(str3, bundle);
    }

    public void logFilteredEvent(String str, Bundle bundle) {
        HiLog.d("IncidentFilter", "log filtered evtID#".concat(String.valueOf(str)));
        if (this.lmn == null) {
            return;
        }
        if (bundle == null) {
            HiLog.e("IncidentFilter", "the params is null");
            return;
        }
        String string = bundle.getString("$HA_FIXED_SOURCE");
        String string2 = bundle.getString("$HA_FIXED_TAG");
        if (str == null || str.length() > 256 || !dc.lmn("eventId", str, am.klm)) {
            return;
        }
        String string3 = bundle.getString("$HA_FIXED_TYPE");
        lmn(bundle.getString("$HA_FIXED_TIMESTAMP"));
        lmn(bundle);
        dj djVar = new dj(str, true);
        if (!djVar.lmn(bundle)) {
            HiLog.w("IncidentFilter", "bundle params is invalid.");
            return;
        }
        if ("Event".equals(string)) {
            HiLog.i("IncidentFilter", "begin onEventFiltered");
            if (lmn(string2, string3)) {
                this.lmn.lmn(string2, str, djVar.ikl);
                bj.lmn(this.ghi);
                bj.klm().lmn(string2, "oper", str, djVar.lmn);
                return;
            }
            return;
        }
        if (!"StreamEvent".equals(string)) {
            HiLog.i("IncidentFilter", "begin onEventFiltered with default");
            this.lmn.lmn("_openness_config_tag", str, djVar.ikl);
            bj.lmn(this.ghi);
            bj.klm().lmn(string2, "oper", str, djVar.lmn);
            return;
        }
        HiLog.i("IncidentFilter", "begin onStreamEventFiltered");
        if (lmn(string2, string3)) {
            this.lmn.klm(string2, str, djVar.ikl);
            bj.lmn(this.ghi);
            bj.klm().lmn(string2, "oper", str, djVar.lmn, System.currentTimeMillis());
        }
    }
}
