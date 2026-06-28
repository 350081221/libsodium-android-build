package com.huawei.agconnect.apms.hilog.task;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.hilog.task.HiLogConfig;
import com.huawei.agconnect.apms.ijk;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.onm;
import com.huawei.agconnect.apms.wvu;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class HiLogConfig {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();

    @SuppressLint({"StaticFieldLeak"})
    public static HiLogConfig ghi = new HiLogConfig();
    public String abc;
    public String bcd;
    public String cde;
    public TaskInfo def;
    public ijk efg;

    public static void createNewLogFileAsync() {
        ghi();
        String format = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.getDefault()).format(new Date());
        String str = ghi.bcd + File.separator + format + ".log";
        fgh.info("HiLogConfig createNewLogFile: " + format);
        onm onmVar = wvu.bcd;
        if (onmVar != null) {
            onmVar.abc(str);
        }
    }

    public static void ghi() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.getDefault());
        final long currentTimeMillis = System.currentTimeMillis();
        File[] listFiles = new File(ghi.cde()).listFiles(new FilenameFilter() { // from class: u1.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return HiLogConfig.abc(simpleDateFormat, currentTimeMillis, file, str);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                boolean delete = file.delete();
                AgentLog agentLog = fgh;
                StringBuilder abc = abc.abc("HiLogConfig log file ");
                abc.append(file.getName());
                abc.append(" is expired, delete, ret ");
                abc.append(delete);
                agentLog.info(abc.toString());
            }
        }
        File[] listFiles2 = new File(ghi.cde()).listFiles(new FilenameFilter() { // from class: u1.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                boolean endsWith;
                endsWith = str.endsWith(".log");
                return endsWith;
            }
        });
        long j5 = 0;
        if (listFiles2 != null) {
            for (File file2 : listFiles2) {
                j5 += file2.length();
            }
        }
        if (j5 >= 3145728) {
            Arrays.sort(listFiles2, new Comparator() { // from class: u1.h
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return HiLogConfig.bcd(simpleDateFormat, (File) obj, (File) obj2);
                }
            });
            for (File file3 : listFiles2) {
                j5 -= file3.length();
                boolean delete2 = file3.delete();
                AgentLog agentLog2 = fgh;
                StringBuilder abc2 = abc.abc("HiLogConfig log exceeds limit size, delete file ");
                abc2.append(file3.getName());
                abc2.append(", ret ");
                abc2.append(delete2);
                agentLog2.info(abc2.toString());
                if (j5 < 3145728) {
                    return;
                }
            }
        }
    }

    public void abc(Context context, ijk ijkVar) {
        if (context != null) {
            File file = new File(context.getFilesDir(), "hilog");
            if (!file.exists()) {
                boolean mkdir = file.mkdir();
                fgh.debug("HiLogConfig init mkdir " + mkdir);
            }
            try {
                this.bcd = file.getCanonicalPath();
                this.abc = file.getCanonicalPath() + File.separator + ".logCache";
                abc();
            } catch (IOException unused) {
                fgh.error("HiLogConfigIOException: init fail!");
            }
            this.efg = ijkVar;
            return;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public String bcd() {
        return this.abc;
    }

    public String cde() {
        return this.bcd;
    }

    public String def() {
        return this.cde;
    }

    public ijk efg() {
        return this.efg;
    }

    public TaskInfo fgh() {
        return this.def;
    }

    public static /* synthetic */ int bcd(SimpleDateFormat simpleDateFormat, File file, File file2) {
        long abc = abc(file.getName(), simpleDateFormat);
        long abc2 = abc(file2.getName(), simpleDateFormat);
        if (abc == abc2) {
            return 0;
        }
        return abc - abc2 > 0 ? 1 : -1;
    }

    public final void abc() throws IOException {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.getDefault());
        File[] listFiles = new File(this.bcd).listFiles(new FilenameFilter() { // from class: u1.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean endsWith;
                endsWith = str.endsWith(".log");
                return endsWith;
            }
        });
        if (listFiles != null && listFiles.length > 0) {
            Arrays.sort(listFiles, new Comparator() { // from class: u1.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return HiLogConfig.abc(simpleDateFormat, (File) obj, (File) obj2);
                }
            });
            if (!(listFiles[0].getName().split("-").length > 0 ? !TextUtils.equals(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()), r3[0]) : true)) {
                this.cde = listFiles[0].getCanonicalPath();
                abc(listFiles, true);
                return;
            }
            abc(listFiles, false);
        }
        this.cde = this.bcd + File.separator + new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.getDefault()).format(new Date()) + ".log";
    }

    public static /* synthetic */ int abc(SimpleDateFormat simpleDateFormat, File file, File file2) {
        long abc = abc(file.getName(), simpleDateFormat);
        long abc2 = abc(file2.getName(), simpleDateFormat);
        if (abc == abc2) {
            return 0;
        }
        return abc2 - abc > 0 ? 1 : -1;
    }

    public final void abc(File[] fileArr, boolean z4) {
        for (int i5 = 0; i5 < fileArr.length; i5++) {
            if ((!z4 || i5 != fileArr.length - 1) && fileArr[i5].length() == 0) {
                boolean delete = fileArr[i5].delete();
                fgh.debug("HiLogConfig delete empty file, ret " + delete);
            }
        }
    }

    public void abc(TaskInfo taskInfo) {
        this.def = taskInfo;
    }

    public static /* synthetic */ boolean abc(SimpleDateFormat simpleDateFormat, long j5, File file, String str) {
        if (!str.endsWith(".log")) {
            return false;
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                return j5 - parse.getTime() >= 604800000;
            }
        } catch (ParseException unused) {
            fgh.warn("HiLogConfig removeExpiredLogFiles ParseException");
        }
        return false;
    }

    public static long abc(String str, SimpleDateFormat simpleDateFormat) {
        Date parse;
        try {
            String[] split = str.split("\\.");
            if (split.length <= 1 || TextUtils.isEmpty(split[0]) || (parse = simpleDateFormat.parse(split[0])) == null) {
                return 0L;
            }
            return parse.getTime();
        } catch (ParseException unused) {
            fgh.error("HiLogConfig ParseException!");
            return 0L;
        }
    }
}
