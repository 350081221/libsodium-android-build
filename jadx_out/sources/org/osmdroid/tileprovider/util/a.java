package org.osmdroid.tileprovider.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.Settings;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21822a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f21823b = "CLOUDMADE_KEY";

    /* renamed from: c, reason: collision with root package name */
    private static final String f21824c = "CLOUDMADE_ID";

    /* renamed from: d, reason: collision with root package name */
    private static final String f21825d = "CLOUDMADE_TOKEN";

    /* renamed from: e, reason: collision with root package name */
    private static String f21826e = "android_id";

    /* renamed from: f, reason: collision with root package name */
    private static String f21827f = "";

    /* renamed from: g, reason: collision with root package name */
    private static String f21828g = "";

    /* renamed from: h, reason: collision with root package name */
    private static SharedPreferences.Editor f21829h;

    public static String a() {
        return f21827f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x012a, code lost:
    
        if (r3 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0161, code lost:
    
        if (r3 != 0) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[Catch: all -> 0x0177, SYNTHETIC, TRY_ENTER, TryCatch #12 {, blocks: (B:6:0x000b, B:8:0x0013, B:37:0x0122, B:45:0x0127, B:41:0x012c, B:84:0x0167, B:80:0x016c, B:72:0x0171, B:73:0x0174, B:63:0x0159, B:59:0x015e, B:106:0x0175), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.util.a.b():java.lang.String");
    }

    public static void c(Context context) {
        f21826e = Settings.Secure.getString(context.getContentResolver(), "android_id");
        f21827f = ManifestUtil.retrieveKey(context, f21823b);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f21829h = defaultSharedPreferences.edit();
        if (defaultSharedPreferences.getString(f21824c, "").equals(f21826e)) {
            String string = defaultSharedPreferences.getString(f21825d, "");
            f21828g = string;
            if (string.length() > 0) {
                f21829h = null;
                return;
            }
            return;
        }
        f21829h.putString(f21824c, f21826e);
        f21829h.commit();
    }

    public static void d(String str) {
        f21827f = str;
    }
}
