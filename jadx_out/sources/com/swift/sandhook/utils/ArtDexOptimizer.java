package com.swift.sandhook.utils;

import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class ArtDexOptimizer {

    /* loaded from: classes3.dex */
    private static class StreamConsumer {
        static final Executor STREAM_CONSUMER = Executors.newSingleThreadExecutor();

        private StreamConsumer() {
        }

        static void consumeInputStream(final InputStream inputStream) {
            STREAM_CONSUMER.execute(new Runnable() { // from class: com.swift.sandhook.utils.ArtDexOptimizer.StreamConsumer.1
                @Override // java.lang.Runnable
                public void run() {
                    if (inputStream == null) {
                        return;
                    }
                    do {
                        try {
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            try {
                                inputStream.close();
                            } catch (Exception unused2) {
                            }
                            throw th;
                        }
                    } while (inputStream.read(new byte[256]) > 0);
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
            });
        }
    }

    public static void dexoatAndDisableInline(String str, String str2) throws IOException {
        String str3;
        File file = new File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        if (SandHookConfig.SDK_INT >= 24) {
            arrayList.add("--runtime-arg");
            arrayList.add("-classpath");
            arrayList.add("--runtime-arg");
            arrayList.add("&");
        }
        arrayList.add("--dex-file=" + str);
        arrayList.add("--oat-file=" + str2);
        StringBuilder sb = new StringBuilder();
        sb.append("--instruction-set=");
        if (SandHook.is64Bit()) {
            str3 = "arm64";
        } else {
            str3 = "arm";
        }
        sb.append(str3);
        arrayList.add(sb.toString());
        arrayList.add("--compiler-filter=everything");
        if (SandHookConfig.SDK_INT >= 22 && SandHookConfig.SDK_INT < 29) {
            arrayList.add("--compile-pic");
        }
        if (SandHookConfig.SDK_INT > 25) {
            arrayList.add("--inline-max-code-units=0");
        } else {
            arrayList.add("--inline-depth-limit=0");
        }
        ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
        processBuilder.redirectErrorStream(true);
        Process start = processBuilder.start();
        StreamConsumer.consumeInputStream(start.getInputStream());
        StreamConsumer.consumeInputStream(start.getErrorStream());
        try {
            int waitFor = start.waitFor();
            if (waitFor == 0) {
                return;
            }
            throw new IOException("dex2oat works unsuccessfully, exit code: " + waitFor);
        } catch (InterruptedException e5) {
            throw new IOException("dex2oat is interrupted, msg: " + e5.getMessage(), e5);
        }
    }
}
