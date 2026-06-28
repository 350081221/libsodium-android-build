package com.huawei.agconnect.apms;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class pqr implements opq {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public static Comparator<File> cde = new abc();
    public String abc;

    /* loaded from: classes3.dex */
    public static class abc implements Comparator<File> {
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified == 0) {
                return 0;
            }
            if (lastModified > 0) {
                return 1;
            }
            return -1;
        }
    }

    public pqr(String str) {
        this.abc = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:17:0x008e). Please report as a decompilation issue!!! */
    public void abc(Context context, qrs qrsVar) {
        String str = "close file failed: ";
        if (TextUtils.isEmpty(this.abc)) {
            bcd.error("please set dir name.");
            return;
        }
        if (qrsVar == null) {
            bcd.error("file content is null.");
            return;
        }
        AgentLog agentLog = bcd;
        agentLog.debug("start save file.");
        File abc2 = abc(context);
        if (abc2 == null) {
            agentLog.error("not found dir.");
            return;
        }
        File file = new File(abc2, UUID.randomUUID().toString());
        okio.m mVar = null;
        try {
            try {
                mVar = okio.y0.d(okio.y0.n(file));
                mVar.n0(qrsVar.abc(), Charset.defaultCharset());
                mVar.close();
                mVar.close();
                str = str;
            } catch (Throwable th) {
                try {
                    bcd.error("write file error: " + th.toString());
                    if (mVar == null) {
                        return;
                    }
                    mVar.close();
                    str = str;
                } catch (Throwable th2) {
                    if (mVar != null) {
                        try {
                            mVar.close();
                        } catch (Throwable th3) {
                            AgentLog agentLog2 = bcd;
                            StringBuilder abc3 = com.huawei.agconnect.apms.abc.abc("close file failed: ");
                            abc3.append(th3.toString());
                            agentLog2.error(abc3.toString());
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            AgentLog agentLog3 = bcd;
            StringBuilder abc4 = com.huawei.agconnect.apms.abc.abc(str);
            abc4.append(th4.toString());
            agentLog3.error(abc4.toString());
            str = abc4;
        }
    }

    public List abc(Context context, boolean z4) {
        if (TextUtils.isEmpty(this.abc)) {
            bcd.debug("please set dir name.");
            return new ArrayList(0);
        }
        File abc2 = abc(context);
        if (abc2 == null) {
            return new ArrayList(0);
        }
        File[] listFiles = abc2.listFiles();
        if (z4 && listFiles != null) {
            Arrays.sort(listFiles, cde);
        }
        return listFiles == null ? Collections.EMPTY_LIST : Arrays.asList(listFiles);
    }

    public File abc(Context context) {
        File file = new File(context.getFilesDir(), this.abc);
        if ((file.exists() && file.isDirectory()) || file.mkdir()) {
            return file;
        }
        bcd.error("create dir failed.");
        return null;
    }
}
