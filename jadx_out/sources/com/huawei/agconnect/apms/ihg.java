package com.huawei.agconnect.apms;

import android.os.Bundle;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.hilog.task.HiLogConfig;
import com.huawei.agconnect.apms.hilog.task.TaskInfo;
import com.huawei.agconnect.apms.ihg;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.File;
import java.io.FilenameFilter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class ihg implements kji {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public final TaskInfo abc;

    public ihg(TaskInfo taskInfo) {
        this.abc = taskInfo;
    }

    public final List<File> abc() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.getDefault());
        File[] listFiles = new File(HiLogConfig.ghi.cde()).listFiles(new FilenameFilter() { // from class: s1.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean abc;
                abc = ihg.this.abc(simpleDateFormat, file, str);
                return abc;
            }
        });
        if (listFiles != null) {
            Arrays.sort(listFiles, new Comparator() { // from class: s1.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ihg.abc((File) obj, (File) obj2);
                }
            });
            return Arrays.asList(listFiles);
        }
        return new ArrayList(0);
    }

    public final void bcd() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException unused) {
            bcd.warn("UploadTask sleep InterruptedException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean abc(SimpleDateFormat simpleDateFormat, File file, String str) {
        if (!str.endsWith(".log")) {
            return false;
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                long time = parse.getTime();
                if (time >= this.abc.getStartTime()) {
                    return time <= this.abc.getEndTime();
                }
                return false;
            }
        } catch (ParseException unused) {
            bcd.warn("UploadTask getUploadFiles ParseException");
        }
        return false;
    }

    public static /* synthetic */ int abc(File file, File file2) {
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        return file.lastModified() - file2.lastModified() > 0 ? 1 : -1;
    }

    public final JSONArray abc(long j5, String str) {
        long parseLong;
        String[] split = str.split("\\|", 5);
        JSONArray jSONArray = null;
        if (split.length < 5) {
            return null;
        }
        try {
            parseLong = Long.parseLong(split[0]);
        } catch (NumberFormatException unused) {
        }
        if (this.abc.isValidateTime() && (parseLong < this.abc.getStartTime() || parseLong > this.abc.getEndTime())) {
            return null;
        }
        jSONArray = new JSONArray();
        jSONArray.put(j5);
        jSONArray.put(parseLong);
        for (int i5 = 1; i5 < split.length; i5++) {
            jSONArray.put(split[i5]);
        }
        return jSONArray;
    }

    public final void abc(String str, String str2) {
        HiAnalyticsManager.getInstance().onEvent("APMS_LOG", abc(this.abc, str, str2));
    }

    public static Bundle abc(TaskInfo taskInfo, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("task_id", taskInfo.getTaskId());
        bundle.putString(HeaderType.USER_IDENTIFIER, Agent.getUserIdentifier());
        bundle.putString(HeaderType.AGENT_VERSION, Agent.getVersion());
        bundle.putString(EventType.PLATFORM, Agent.getPlatformInformation().asJsonArray().toString());
        bundle.putString("file_name", str2);
        bundle.putString("log", str);
        AgentLog agentLog = bcd;
        StringBuilder abc = abc.abc("UploadTask upload content task_id ");
        abc.append(taskInfo.getTaskId());
        abc.append(", len ");
        abc.append(str.length());
        agentLog.debug(abc.toString());
        return bundle;
    }
}
