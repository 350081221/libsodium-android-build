package a3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f179a = "ShortcutPermissionCheck";

    public static int a(@NonNull Context context) {
        Log.d(f179a, "checkOnEMUI");
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        try {
            Class<?> cls = Class.forName("com.huawei.hsm.permission.PermissionManager");
            Object invoke = cls.getDeclaredMethod("canSendBroadcast", Context.class, Intent.class).invoke(cls, context, intent);
            if (invoke == null) {
                return 2;
            }
            boolean booleanValue = ((Boolean) invoke).booleanValue();
            Log.d(f179a, "EMUI check permission canSendBroadcast invoke result = " + booleanValue);
            if (booleanValue) {
                return 0;
            }
            return -1;
        } catch (ClassNotFoundException e5) {
            Log.d(f179a, e5.getMessage() + " e: " + e5);
            return 2;
        } catch (IllegalAccessException e6) {
            Log.d(f179a, e6.getMessage() + " e: " + e6);
            return 2;
        } catch (NoSuchMethodException e7) {
            Log.d(f179a, e7.getMessage() + " e: " + e7);
            return 2;
        } catch (InvocationTargetException e8) {
            Log.d(f179a, e8.getMessage() + " e: " + e8);
            return 2;
        } catch (Exception e9) {
            Log.d(f179a, e9.getMessage() + " e: " + e9);
            return 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(@androidx.annotation.NonNull android.content.Context r11) {
        /*
            java.lang.String r0 = "checkOnMIUI"
            java.lang.String r1 = "ShortcutPermissionCheck"
            android.util.Log.d(r1, r0)
            r0 = 2
            java.lang.String r2 = "appops"
            java.lang.Object r2 = r11.getSystemService(r2)     // Catch: java.lang.Exception -> Lae
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch: java.lang.Exception -> Lae
            android.content.Context r3 = r11.getApplicationContext()     // Catch: java.lang.Exception -> Lae
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> Lae
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo()     // Catch: java.lang.Exception -> Lae
            int r11 = r11.uid     // Catch: java.lang.Exception -> Lae
            java.lang.Class<android.app.AppOpsManager> r4 = android.app.AppOpsManager.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> Lae
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> Lae
            java.lang.String r5 = "checkOpNoThrow"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> Lae
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lae
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Exception -> Lae
            r10 = 1
            r7[r10] = r8     // Catch: java.lang.Exception -> Lae
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r0] = r8     // Catch: java.lang.Exception -> Lae
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r7)     // Catch: java.lang.Exception -> Lae
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lae
            r6 = 10017(0x2721, float:1.4037E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Lae
            r5[r9] = r6     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> Lae
            r5[r10] = r11     // Catch: java.lang.Exception -> Lae
            r5[r0] = r3     // Catch: java.lang.Exception -> Lae
            java.lang.Object r11 = r4.invoke(r2, r5)     // Catch: java.lang.Exception -> Lae
            if (r11 != 0) goto L5b
            java.lang.String r11 = "MIUI check permission checkOpNoThrowMethod(AppOpsManager) invoke result is null"
            android.util.Log.d(r1, r11)     // Catch: java.lang.Exception -> Lae
            return r0
        L5b:
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r2.<init>()     // Catch: java.lang.Exception -> Lae
            java.lang.String r3 = "MIUI check permission checkOpNoThrowMethod(AppOpsManager) invoke result = "
            r2.append(r3)     // Catch: java.lang.Exception -> Lae
            r2.append(r11)     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lae
            android.util.Log.d(r1, r2)     // Catch: java.lang.Exception -> Lae
            int r2 = r11.hashCode()     // Catch: java.lang.Exception -> Lae
            r3 = 48
            r4 = -1
            if (r2 == r3) goto L99
            r3 = 49
            if (r2 == r3) goto L8f
            r3 = 53
            if (r2 == r3) goto L85
            goto La3
        L85:
            java.lang.String r2 = "5"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> Lae
            if (r11 == 0) goto La3
            r11 = r0
            goto La4
        L8f:
            java.lang.String r2 = "1"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> Lae
            if (r11 == 0) goto La3
            r11 = r10
            goto La4
        L99:
            java.lang.String r2 = "0"
            boolean r11 = r11.equals(r2)     // Catch: java.lang.Exception -> Lae
            if (r11 == 0) goto La3
            r11 = r9
            goto La4
        La3:
            r11 = r4
        La4:
            if (r11 == 0) goto Lad
            if (r11 == r10) goto Lac
            if (r11 == r0) goto Lab
            return r0
        Lab:
            return r10
        Lac:
            return r4
        Lad:
            return r9
        Lae:
            r11 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r11.getMessage()
            r2.append(r3)
            java.lang.String r3 = " e: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.d(r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b.b(android.content.Context):int");
    }

    public static int c(@NonNull Context context) {
        Log.d(f179a, "checkOnOPPO");
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            Log.d(f179a, "contentResolver is null");
            return 2;
        }
        Cursor query = contentResolver.query(Uri.parse("content://settings/secure/launcher_shortcut_permission_settings"), null, null, null, null);
        if (query == null) {
            Log.d(f179a, "cursor is null (Uri : content://settings/secure/launcher_shortcut_permission_settings)");
            return 2;
        }
        try {
            String packageName = context.getApplicationContext().getPackageName();
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex(t0.b.f22420d));
                Log.d(f179a, "permission value is " + string);
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains(packageName + ", 1")) {
                        query.close();
                        return 0;
                    }
                    if (string.contains(packageName + ", 0")) {
                        query.close();
                        return -1;
                    }
                }
            }
            return 2;
        } catch (Exception e5) {
            Log.d(f179a, e5.getMessage() + " e: " + e5);
            return 2;
        } finally {
            query.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        if (0 == 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(@androidx.annotation.NonNull android.content.Context r9) {
        /*
            java.lang.String r0 = "checkOnVIVO"
            java.lang.String r1 = "ShortcutPermissionCheck"
            android.util.Log.d(r1, r0)
            android.content.ContentResolver r2 = r9.getContentResolver()
            r0 = 2
            if (r2 != 0) goto L14
            java.lang.String r9 = "contentResolver is null"
            android.util.Log.d(r1, r9)
            return r0
        L14:
            r8 = 0
            java.lang.String r3 = "content://com.bbk.launcher2.settings/favorites"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r8 != 0) goto L30
            java.lang.String r9 = "cursor is null (Uri : content://com.bbk.launcher2.settings/favorites)"
            android.util.Log.d(r1, r9)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r8 == 0) goto L2f
            r8.close()
        L2f:
            return r0
        L30:
            boolean r2 = r8.moveToNext()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r2 == 0) goto La0
            java.lang.String r2 = "title"
            int r2 = r8.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.String r2 = r8.getString(r2)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r3.<init>()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.String r4 = "title by query is "
            r3.append(r4)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r3.append(r2)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            android.util.Log.d(r1, r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r3 != 0) goto L30
            java.lang.String r3 = e(r9)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r2 == 0) goto L30
            java.lang.String r2 = "shortcutPermission"
            int r2 = r8.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            int r2 = r8.getInt(r2)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r3.<init>()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.String r4 = "permission value is "
            r3.append(r4)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r3.append(r2)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            android.util.Log.d(r1, r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r3 = 1
            if (r2 == r3) goto L9b
            r4 = 17
            if (r2 != r4) goto L8a
            goto L9b
        L8a:
            r4 = 16
            if (r2 != r4) goto L93
            r8.close()
            r9 = 0
            return r9
        L93:
            r4 = 18
            if (r2 != r4) goto L30
            r8.close()
            return r3
        L9b:
            r8.close()
            r9 = -1
            return r9
        La0:
            r8.close()
            goto Lc5
        La4:
            r9 = move-exception
            goto Lc6
        La6:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            r2.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = r9.getMessage()     // Catch: java.lang.Throwable -> La4
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = " e: "
            r2.append(r3)     // Catch: java.lang.Throwable -> La4
            r2.append(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> La4
            android.util.Log.d(r1, r9)     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto Lc5
            goto La0
        Lc5:
            return r0
        Lc6:
            if (r8 == 0) goto Lcb
            r8.close()
        Lcb:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b.d(android.content.Context):int");
    }

    private static String e(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
