package com.umeng.ccg;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CcgAgent {
    private static Map<String, ArrayList<String>> forbidSdkTable;
    private static Object lock = new Object();
    private static ArrayList<ConfigListener> callbacks = new ArrayList<>();
    private static Object actionInfoLock = new Object();
    private static Map<String, ActionInfo> actionInfoTable = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        forbidSdkTable = hashMap;
        hashMap.put(a.f12826e, new ArrayList());
        forbidSdkTable.put(a.f12825d, new ArrayList<>());
        forbidSdkTable.put(a.f12823b, new ArrayList<>());
        forbidSdkTable.put(a.f12824c, new ArrayList<>());
    }

    public static ActionInfo getActionInfo(String str) {
        ActionInfo actionInfo = null;
        if (!TextUtils.isEmpty(str)) {
            synchronized (actionInfoLock) {
                if (actionInfoTable.containsKey(str)) {
                    actionInfo = actionInfoTable.get(str);
                }
            }
        }
        return actionInfo;
    }

    public static String[] getCollectItemList() {
        return new String[]{a.f12826e, a.f12825d, a.f12823b, a.f12824c};
    }

    public static ArrayList<String> getForbidSdkArray(String str) {
        if (forbidSdkTable.containsKey(str)) {
            return forbidSdkTable.get(str);
        }
        return null;
    }

    public static ArrayList<String> getRegistedModuleList() {
        ArrayList<String> arrayList;
        synchronized (actionInfoLock) {
            arrayList = new ArrayList<>(actionInfoTable.keySet());
        }
        return arrayList;
    }

    public static boolean hasRegistedActionInfo() {
        boolean z4;
        synchronized (actionInfoLock) {
            if (actionInfoTable.size() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public static void init(Context context) {
        d.a().a(context);
    }

    public static void notifyConfigReady(JSONObject jSONObject) {
        synchronized (lock) {
            int size = callbacks.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    callbacks.get(i5).onConfigReady(jSONObject);
                }
            }
        }
    }

    public static void registerActionInfo(ActionInfo actionInfo) {
        Context appContext = UMGlobalContext.getAppContext();
        if (actionInfo != null) {
            synchronized (actionInfoLock) {
                try {
                    String module = actionInfo.getModule(UMGlobalContext.getAppContext());
                    if (!TextUtils.isEmpty(module) && !actionInfoTable.containsKey(module)) {
                        String[] supportAction = actionInfo.getSupportAction(appContext);
                        if (supportAction != null) {
                            for (String str : supportAction) {
                                boolean switchState = actionInfo.getSwitchState(appContext, str);
                                if (forbidSdkTable.containsKey(str)) {
                                    ArrayList<String> arrayList = forbidSdkTable.get(str);
                                    if (!switchState) {
                                        arrayList.add(module);
                                    }
                                }
                            }
                        }
                        actionInfoTable.put(module, actionInfo);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void registerConfigListener(ConfigListener configListener) {
        if (configListener != null) {
            synchronized (lock) {
                callbacks.add(configListener);
            }
        }
    }
}
