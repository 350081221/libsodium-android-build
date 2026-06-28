package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.hilog.task.HiLogConfig;
import com.huawei.agconnect.apms.hilog.task.TaskInfo;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class jih {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static int abc(TaskInfo taskInfo) {
        if (taskInfo == null) {
            return 0;
        }
        String bcd = HiLogConfig.ghi.efg().bcd("tasks");
        try {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(bcd)) {
                JSONArray jSONArray = new JSONArray(bcd);
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i5);
                    if (optJSONObject != null) {
                        arrayList.add(new lkj(optJSONObject));
                    }
                }
            }
            int indexOf = arrayList.indexOf(new lkj(taskInfo.getTaskId(), 0, 0L));
            if (indexOf >= 0) {
                return ((lkj) arrayList.get(indexOf)).bcd;
            }
            return 0;
        } catch (JSONException unused) {
            abc.error("TaskCache getTaskState JSONException");
            return 0;
        }
    }

    public static void abc(TaskInfo taskInfo, int i5) {
        if (taskInfo == null) {
            return;
        }
        ijk efg = HiLogConfig.ghi.efg();
        String bcd = efg.bcd("tasks");
        try {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(bcd)) {
                JSONArray jSONArray = new JSONArray(bcd);
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                    if (optJSONObject != null) {
                        arrayList.add(new lkj(optJSONObject));
                    }
                }
            }
            String taskId = taskInfo.getTaskId();
            long currentTimeMillis = System.currentTimeMillis();
            lkj lkjVar = new lkj(taskId, i5, currentTimeMillis);
            int indexOf = arrayList.indexOf(lkjVar);
            if (indexOf >= 0) {
                lkj lkjVar2 = (lkj) arrayList.get(indexOf);
                lkjVar2.bcd = i5;
                lkjVar2.cde = currentTimeMillis;
            } else {
                arrayList.add(lkjVar);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis2 - ((lkj) it.next()).cde >= 604800000) {
                    it.remove();
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                jSONArray2.put(((lkj) arrayList.get(i7)).abc());
            }
            efg.abc("tasks", jSONArray2.toString());
        } catch (JSONException unused) {
            abc.error("TaskCache saveTaskState JSONException");
        }
    }
}
