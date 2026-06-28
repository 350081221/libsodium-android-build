package com.bytedance.tools.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.os.Build;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class c {
    public static int a(String str, int i5) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException, XmlPullParserException {
        AssetManager assetManager = (AssetManager) Class.forName("android.content.res.AssetManager").newInstance();
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser openXmlResourceParser = assetManager.openXmlResourceParser(((Integer) assetManager.getClass().getMethod("addAssetPath", String.class).invoke(assetManager, str)).intValue(), "AndroidManifest.xml");
            if (openXmlResourceParser == null) {
                if (openXmlResourceParser != null) {
                    openXmlResourceParser.close();
                }
                return -1;
            }
            while (openXmlResourceParser.next() != 1) {
                if (openXmlResourceParser.getEventType() == 2 && openXmlResourceParser.getName().equals("uses-sdk")) {
                    for (int i6 = 0; i6 < openXmlResourceParser.getAttributeCount(); i6++) {
                        if (openXmlResourceParser.getAttributeNameResource(i6) == i5) {
                            int attributeIntValue = openXmlResourceParser.getAttributeIntValue(i6, -1);
                            openXmlResourceParser.close();
                            return attributeIntValue;
                        }
                    }
                }
            }
            openXmlResourceParser.close();
            return -1;
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public static String b(Context context, int i5) {
        Cursor cursor = null;
        try {
            try {
                cursor = d.b(context, "setting_base_info", new String[]{bm.f12336d, t0.b.f22420d}, "_id=?", new String[]{String.valueOf(i5)}, null, null, null);
                while (cursor.moveToNext()) {
                    try {
                        String g5 = b.g(cursor.getString(cursor.getColumnIndex(t0.b.f22420d)));
                        cursor.close();
                        return g5;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                if (cursor == null) {
                    return "";
                }
            }
            return "";
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static List<com.bytedance.tools.c.a> c(Context context) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < 10; i5++) {
            arrayList.add(new com.bytedance.tools.c.a());
        }
        ((com.bytedance.tools.c.a) arrayList.get(0)).c("SDK版本号");
        ((com.bytedance.tools.c.a) arrayList.get(1)).c("测试应用");
        ((com.bytedance.tools.c.a) arrayList.get(1)).h(context.getPackageName());
        ((com.bytedance.tools.c.a) arrayList.get(2)).c("AppID");
        ((com.bytedance.tools.c.a) arrayList.get(3)).c("设备id");
        ((com.bytedance.tools.c.a) arrayList.get(4)).c(bi.f12279y);
        ((com.bytedance.tools.c.a) arrayList.get(4)).h(Build.VERSION.RELEASE);
        ((com.bytedance.tools.c.a) arrayList.get(5)).c("manufacturer");
        ((com.bytedance.tools.c.a) arrayList.get(5)).h(Build.MANUFACTURER);
        ((com.bytedance.tools.c.a) arrayList.get(6)).c("imei");
        ((com.bytedance.tools.c.a) arrayList.get(7)).c("oaid");
        ((com.bytedance.tools.c.a) arrayList.get(8)).c("environment");
        ((com.bytedance.tools.c.a) arrayList.get(9)).c("androidId");
        try {
            ((com.bytedance.tools.c.a) arrayList.get(8)).h("minSdkVersion:" + context.getApplicationInfo().minSdkVersion + "targetSdkVersion:" + context.getApplicationInfo().targetSdkVersion);
        } catch (Exception unused) {
        }
        Cursor cursor = null;
        try {
            try {
                Cursor b5 = d.b(context, "setting_base_info", new String[]{bm.f12336d, t0.b.f22420d}, null, null, null, null, null);
                if (b5 == null) {
                    if (b5 != null) {
                        b5.close();
                    }
                    return arrayList;
                }
                while (b5.moveToNext()) {
                    try {
                        int i6 = b5.getInt(b5.getColumnIndex(bm.f12336d));
                        String string = b5.getString(b5.getColumnIndex(t0.b.f22420d));
                        if (i6 >= 0 && i6 < 10) {
                            ((com.bytedance.tools.c.a) arrayList.get(i6)).h(b.g(string));
                        }
                    } catch (Exception unused2) {
                    }
                }
                b5.close();
                return arrayList;
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Exception unused3) {
            return arrayList;
        }
    }
}
