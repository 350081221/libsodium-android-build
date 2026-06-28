package com.huawei.agconnect.apms;

import android.os.Environment;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes3.dex */
public class k1 {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public static k1 cde;
    public final Properties abc;

    public k1() throws IOException {
        Properties properties = new Properties();
        this.abc = properties;
        FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        try {
            properties.load(fileInputStream);
            try {
                fileInputStream.close();
            } catch (Exception e5) {
                AgentLog agentLog = bcd;
                StringBuilder abc = abc.abc("failed to close build prop file: ");
                abc.append(e5.getMessage());
                agentLog.warn(abc.toString());
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Exception e6) {
                AgentLog agentLog2 = bcd;
                StringBuilder abc2 = abc.abc("failed to close build prop file: ");
                abc2.append(e6.getMessage());
                agentLog2.warn(abc2.toString());
            }
            throw th;
        }
    }

    public static synchronized k1 abc() throws IOException {
        k1 k1Var;
        synchronized (k1.class) {
            if (cde == null) {
                cde = new k1();
            }
            k1Var = cde;
        }
        return k1Var;
    }
}
