package com.huawei.agconnect.apms;

import android.system.Os;
import android.text.TextUtils;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public class w1 {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    /* loaded from: classes3.dex */
    public static class abc implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return TextUtils.isDigitsOnly(str);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x00dd
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static int abc(int r4, java.lang.StringBuilder r5, java.lang.String r6, int r7, char r8, int r9) {
        /*
            java.lang.String r0 = "close logcat failed."
            java.lang.String r4 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r4)
            r1.append(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r3 = "/system/bin/logcat"
            r1.add(r3)
            java.lang.String r3 = "-b"
            r1.add(r3)
            r1.add(r6)
            java.lang.String r3 = "-d"
            r1.add(r3)
            java.lang.String r3 = "-v"
            r1.add(r3)
            java.lang.String r3 = "threadtime"
            r1.add(r3)
            java.lang.String r3 = "-t"
            r1.add(r3)
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r1.add(r7)
            java.lang.String r7 = "--pid"
            r1.add(r7)
            r1.add(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "*:"
            r4.append(r7)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            r4 = 0
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Object[] r7 = r1.toArray(r7)
            java.lang.String r8 = "--------- tail end of log "
            r5.append(r8)
            r5.append(r6)
            java.lang.String r6 = " ("
            r5.append(r6)
            java.lang.String r6 = android.text.TextUtils.join(r2, r7)
            r5.append(r6)
            java.lang.String r6 = ")\n"
            r5.append(r6)
            java.lang.ProcessBuilder r6 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> Lbf
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            java.lang.ProcessBuilder r4 = r6.command(r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.Process r4 = r4.start()     // Catch: java.lang.Throwable -> Lbf
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lbf
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lbf
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r8 = "UTF-8"
            r7.<init>(r4, r8)     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
        L9e:
            java.lang.String r4 = r6.readLine()     // Catch: java.lang.Throwable -> Lbd
            if (r4 == 0) goto Lb9
            int r7 = r4.length()     // Catch: java.lang.Throwable -> Lbd
            if (r9 >= r7) goto Lab
            goto Lb9
        Lab:
            int r7 = r4.length()     // Catch: java.lang.Throwable -> Lbd
            int r9 = r9 - r7
            r5.append(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = "\n"
            r5.append(r4)     // Catch: java.lang.Throwable -> Lbd
            goto L9e
        Lb9:
            r6.close()     // Catch: java.io.IOException -> Ldd
            goto Le2
        Lbd:
            r4 = move-exception
            goto Lc1
        Lbf:
            r4 = move-exception
            r6 = 0
        Lc1:
            com.huawei.agconnect.apms.log.AgentLog r5 = com.huawei.agconnect.apms.w1.abc     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r7.<init>()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r8 = "run logcat command failed."
            r7.append(r8)     // Catch: java.lang.Throwable -> Le3
            r7.append(r4)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> Le3
            r5.warn(r4)     // Catch: java.lang.Throwable -> Le3
            if (r6 == 0) goto Le2
            r6.close()     // Catch: java.io.IOException -> Ldd
            goto Le2
        Ldd:
            com.huawei.agconnect.apms.log.AgentLog r4 = com.huawei.agconnect.apms.w1.abc
            r4.warn(r0)
        Le2:
            return r9
        Le3:
            r4 = move-exception
            if (r6 == 0) goto Lef
            r6.close()     // Catch: java.io.IOException -> Lea
            goto Lef
        Lea:
            com.huawei.agconnect.apms.log.AgentLog r5 = com.huawei.agconnect.apms.w1.abc
            r5.warn(r0)
        Lef:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.w1.abc(int, java.lang.StringBuilder, java.lang.String, int, char, int):int");
    }

    public static String abc() {
        String str;
        StringBuilder sb = new StringBuilder("open files:\n");
        try {
            File[] listFiles = new File("/proc/self/fd").listFiles(new abc());
            if (listFiles != null) {
                int i5 = 0;
                for (File file : listFiles) {
                    try {
                        str = Os.readlink(file.getCanonicalPath());
                    } catch (Exception unused) {
                        abc.debug("failed to obtain the path when collecting fd information.");
                        str = null;
                    }
                    if (str != null) {
                        sb.append("  fd ");
                        sb.append(file.getName());
                        sb.append(": ");
                        sb.append(TextUtils.isEmpty(str) ? "???" : str.trim());
                        sb.append('\n');
                    }
                    i5++;
                    if (i5 > 1024) {
                        break;
                    }
                }
                if (listFiles.length > 1024) {
                    sb.append("    ......\n");
                }
            }
        } catch (Exception unused2) {
            abc.warn("get fd description failed.");
        }
        sb.append("\n");
        return sb.toString();
    }

    public static String abc(String str) {
        return abc(str, 0);
    }

    public static String abc(String str, int i5) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(str));
                int i6 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String trim = readLine.trim();
                        if (trim.length() > 0) {
                            i6++;
                            if (i5 == 0 || i6 <= i5) {
                                sb.append("  ");
                                sb.append(trim);
                                sb.append("\n");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            abc.warn("get info failed. " + th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                    abc.warn("close file failed.");
                                }
                            }
                            throw th2;
                        }
                    }
                }
                bufferedReader.close();
            } catch (Exception unused2) {
                abc.warn("close file failed.");
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        return sb.toString();
    }
}
