package com.umeng.cconfig;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.e;
import com.umeng.cconfig.b.c;
import com.umeng.cconfig.b.d;
import com.umeng.cconfig.b.e;
import com.umeng.cconfig.listener.OnConfigStatusChangedListener;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import org.xmlpull.v1.XmlPullParserException;
import socket.g;
import t0.b;

@Instrumented
/* loaded from: classes3.dex */
public class UMRemoteConfig {

    /* renamed from: g, reason: collision with root package name */
    private int f12889g;

    /* renamed from: h, reason: collision with root package name */
    private RemoteConfigSettings f12890h;

    /* renamed from: i, reason: collision with root package name */
    private OnConfigStatusChangedListener f12891i;

    /* renamed from: j, reason: collision with root package name */
    private final ReadWriteLock f12892j;

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f12883a = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]{1,255}");

    /* renamed from: c, reason: collision with root package name */
    private static Context f12885c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, c> f12886d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, c> f12887e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, String> f12888f = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12884b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final UMRemoteConfig f12894a = new UMRemoteConfig(0);
    }

    private UMRemoteConfig() {
        this.f12892j = new ReentrantReadWriteLock(true);
    }

    /* synthetic */ UMRemoteConfig(byte b5) {
        this();
    }

    private void a(Context context, int i5) {
        if (context == null || i5 <= 0) {
            return;
        }
        try {
            try {
                try {
                    try {
                        this.f12892j.writeLock().lock();
                        XmlResourceParser xml = context.getResources().getXml(i5);
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                            if (eventType == 2) {
                                str = xml.getName();
                            } else if (eventType == 3) {
                                if ("entry".equals(xml.getName()) && str2 != null && str3 != null) {
                                    if (f12883a.matcher(str2.trim()).matches()) {
                                        f12888f.put(str2, str3);
                                        c cVar = new c();
                                        cVar.f12943a = str2;
                                        cVar.f12944b = str3;
                                        f12887e.put(str2, cVar);
                                        str2 = null;
                                        str3 = null;
                                    }
                                    if (f12888f.size() > 1000) {
                                        break;
                                    }
                                }
                                str = null;
                            } else if (eventType == 4) {
                                if (DatabaseFileArchive.COLUMN_KEY.equals(str)) {
                                    str2 = xml.getText();
                                } else if (b.f22420d.equals(str)) {
                                    str3 = xml.getText();
                                }
                            }
                        }
                    } catch (XmlPullParserException unused) {
                        ULog.e("jessie", "[xmlLoad] xml load fail");
                    }
                } catch (IOException unused2) {
                    ULog.e("jessie", "[xmlLoad] xml load fail");
                }
            } catch (Exception unused3) {
                ULog.e("jessie", "[xmlLoad] xml load fail");
            }
        } finally {
            this.f12892j.writeLock().unlock();
        }
    }

    private void a(d dVar) {
        if (dVar != null) {
            String str = dVar.f12948b;
            try {
                try {
                    this.f12892j.writeLock().lock();
                    if (!TextUtils.isEmpty(str)) {
                        JSONArray jSONArray = new JSONArray(str);
                        int length = jSONArray.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            JSONObject jSONObject = new JSONObject(jSONArray.getString(i5));
                            try {
                                String str2 = "";
                                c cVar = new c();
                                if (jSONObject.has("k")) {
                                    str2 = jSONObject.getString("k");
                                    cVar.f12943a = str2;
                                }
                                if (jSONObject.has("v")) {
                                    cVar.f12944b = jSONObject.getString("v");
                                }
                                if (jSONObject.has("e")) {
                                    cVar.f12945c = jSONObject.getString("e");
                                }
                                if (jSONObject.has(g.f22386a)) {
                                    cVar.f12946d = jSONObject.getString(g.f22386a);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    f12887e.put(jSONObject.getString("k"), cVar);
                                }
                            } catch (Exception unused) {
                                ULog.e("jessie", "[active] new config active false");
                            }
                        }
                    }
                    f12886d.clear();
                    f12886d.putAll(f12887e);
                    f12887e.clear();
                    ULog.i("jessie", "[active] new config active success i");
                } catch (Exception unused2) {
                    ULog.e("jessie", "[active] new config active false");
                }
            } finally {
                this.f12892j.writeLock().unlock();
            }
        } else {
            try {
                this.f12892j.writeLock().lock();
                f12886d.clear();
                f12886d.putAll(f12887e);
                f12887e.clear();
                ULog.i("[active] new config active success ii");
            } catch (Exception unused3) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static UMRemoteConfig getInstance() {
        return a.f12894a;
    }

    public static String getVersion() {
        return "1.0.0";
    }

    public void activeFetchConfig() {
        if (!f12884b) {
            MLog.d(au.f12201i, "remote config disable");
            return;
        }
        Context context = f12885c;
        if (context == null) {
            MLog.d(au.f12201i, "UMRemoteConfig did not init");
        } else if (!UMUtils.isMainProgress(context)) {
            MLog.d(au.f12201i, "can not be called in child process");
        } else {
            try {
                new com.umeng.cconfig.d.a(f12885c).run();
            } catch (Exception unused) {
            }
        }
    }

    public String getConfigValue(String str) {
        String str2 = null;
        if (!f12884b) {
            MLog.d(au.f12201i, "remote config disable");
            return null;
        }
        Context context = f12885c;
        if (context == null) {
            MLog.d(au.f12201i, "UMRemoteConfig did not init");
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.d(au.f12201i, "can not be called in child process");
            return null;
        }
        try {
            this.f12892j.readLock().lock();
            c cVar = f12886d.get(str);
            if (cVar != null) {
                str2 = cVar.f12944b;
                if (!TextUtils.isEmpty(cVar.f12946d)) {
                    JSONArray a5 = e.a(cVar, f12885c);
                    ULog.d("jessie", "[ablog] ablog params : " + a5.toString());
                    com.umeng.cconfig.c.c.a(new com.umeng.cconfig.c.b("https://pslog.umeng.com/ablog", a5));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f12892j.readLock().unlock();
            throw th;
        }
        this.f12892j.readLock().unlock();
        return str2;
    }

    public void handlerMessage(int i5, Object obj, String str) {
        SharedPreferences a5;
        OnConfigStatusChangedListener onConfigStatusChangedListener;
        try {
            if (i5 == 1) {
                String str2 = (String) obj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    this.f12892j.writeLock().lock();
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.has(com.umeng.ccg.a.f12822a) ? jSONObject.getString(com.umeng.ccg.a.f12822a) : "";
                    String string2 = jSONObject.has("ts") ? jSONObject.getString("ts") : "";
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        com.umeng.cconfig.a.b a6 = com.umeng.cconfig.a.b.a(f12885c);
                        try {
                            try {
                                try {
                                    try {
                                        a6.a();
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("__ts", string2);
                                        contentValues.put(e.d.a.f12563d, string);
                                        contentValues.put("__a", "0");
                                        ULog.i("jessie", "[DbManager] insert timeStamp: " + string2 + " content: " + string + " active: 0");
                                        SQLiteDatabase sQLiteDatabase = a6.f12900a;
                                        if (sQLiteDatabase instanceof SQLiteDatabase) {
                                            SQLiteInstrumentation.insert(sQLiteDatabase, "__cc", null, contentValues);
                                        } else {
                                            sQLiteDatabase.insert("__cc", null, contentValues);
                                        }
                                        a6.f12900a.setTransactionSuccessful();
                                    } catch (Throwable unused) {
                                    }
                                } catch (Throwable unused2) {
                                    SQLiteDatabase sQLiteDatabase2 = a6.f12900a;
                                    if (sQLiteDatabase2 != null) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                }
                            } finally {
                                try {
                                    SQLiteDatabase sQLiteDatabase3 = a6.f12900a;
                                    if (sQLiteDatabase3 != null) {
                                        sQLiteDatabase3.endTransaction();
                                    }
                                } catch (Throwable unused3) {
                                }
                                a6.b();
                            }
                        } catch (SQLiteDatabaseCorruptException unused4) {
                            ULog.i("jessie", "[DbManager] insert failed");
                            SQLiteDatabase sQLiteDatabase4 = a6.f12900a;
                            if (sQLiteDatabase4 != null) {
                                sQLiteDatabase4.endTransaction();
                            }
                        }
                        com.umeng.cconfig.a.b.a(f12885c).d();
                        MLog.i(au.f12201i, "get new config success");
                        RemoteConfigSettings remoteConfigSettings = this.f12890h;
                        if (remoteConfigSettings != null) {
                            if (remoteConfigSettings.isAutoUpdateModeEnabled()) {
                                activeFetchConfig();
                            } else {
                                OnConfigStatusChangedListener onConfigStatusChangedListener2 = this.f12891i;
                                if (onConfigStatusChangedListener2 != null) {
                                    onConfigStatusChangedListener2.onFetchComplete();
                                }
                            }
                        }
                    }
                } finally {
                }
            } else if (i5 == 2) {
                try {
                    this.f12892j.writeLock().lock();
                    if (TextUtils.isEmpty((String) obj) && !TextUtils.isEmpty(str) && (a5 = com.umeng.cconfig.a.c.a(f12885c)) != null) {
                        SharedPreferences.Editor edit = a5.edit();
                        edit.putString("abtest_sp_last_request_data", str);
                        edit.commit();
                    }
                } finally {
                }
            } else {
                if (i5 != 3) {
                    return;
                }
                try {
                    this.f12892j.writeLock().lock();
                    if (((Boolean) obj).booleanValue()) {
                        a(f12885c, this.f12889g);
                        a(com.umeng.cconfig.a.b.a(f12885c).c());
                        MLog.i(au.f12201i, "active new config success");
                        if (this.f12890h != null && (onConfigStatusChangedListener = this.f12891i) != null) {
                            onConfigStatusChangedListener.onActiveComplete();
                        }
                    }
                } finally {
                }
            }
        } catch (Exception unused5) {
        }
    }

    public void init(Context context) {
        try {
            if (!f12884b) {
                MLog.d(au.f12201i, "remote config disable");
                return;
            }
            if (context == null) {
                return;
            }
            if (f12885c == null) {
                f12885c = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.d(au.f12201i, "can not be called in child process");
            } else {
                if (this.f12890h == null) {
                    MLog.d(au.f12201i, "please set RemoteConfigSettings using UMRemoteConfig.getInstance().setConfigSettings");
                    return;
                }
                a(f12885c, this.f12889g);
                a(com.umeng.cconfig.a.b.a(f12885c).c());
                ImprintHandler.getImprintService(f12885c).registImprintCallback(au.f12201i, new UMImprintChangeCallback() { // from class: com.umeng.cconfig.UMRemoteConfig.1
                    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                    public final void onImprintValueChanged(String str, String str2) {
                        SharedPreferences a5;
                        try {
                            if (au.f12201i.equals(str)) {
                                ULog.i("jessie", "[imprint] key: " + str + " value: " + str2);
                                String[] split = str2.split("@");
                                String str3 = split[3];
                                if (TextUtils.isEmpty(str3) || !"1".equals(str3)) {
                                    return;
                                }
                                String str4 = split[0];
                                if (TextUtils.isEmpty(str4) || (a5 = com.umeng.cconfig.a.c.a(UMRemoteConfig.f12885c)) == null) {
                                    return;
                                }
                                String string = a5.getString("cconfig_sp_last_request_time", "");
                                if (!TextUtils.isEmpty(string) && str4.equals(string)) {
                                    ULog.i("jessie", "[imprint] newTimeStamp.equals(oldTimeStamp)");
                                    return;
                                }
                                SharedPreferences.Editor edit = a5.edit();
                                edit.putString("cconfig_sp_last_request_time", str4);
                                edit.commit();
                                JSONObject a6 = com.umeng.cconfig.b.e.a(UMRemoteConfig.f12885c);
                                if (a6 != null) {
                                    try {
                                        ULog.i("jessie", "[imprint] send request. body: " + a6.toString());
                                        com.umeng.cconfig.c.c.a(new com.umeng.cconfig.c.b("https://ucc.umeng.com/v1/fetch", a6));
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                            ULog.e("jessie", "[imprint] fail");
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void setConfigSettings(RemoteConfigSettings remoteConfigSettings) {
        if (!f12884b) {
            MLog.d(au.f12201i, "remote config disable");
        } else {
            if (remoteConfigSettings != null) {
                this.f12890h = remoteConfigSettings;
            }
        }
    }

    public synchronized void setDefaults(int i5) {
        if (f12884b) {
            this.f12889g = i5;
        } else {
            MLog.d(au.f12201i, "remote config disable");
        }
    }

    public synchronized void setOnNewConfigfecthed(OnConfigStatusChangedListener onConfigStatusChangedListener) {
        if (!f12884b) {
            MLog.d(au.f12201i, "remote config disable");
        } else {
            if (onConfigStatusChangedListener != null) {
                this.f12891i = onConfigStatusChangedListener;
            }
        }
    }
}
