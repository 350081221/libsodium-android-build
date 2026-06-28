package com.lody.virtual.helper;

import android.os.Build;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.utils.FileUtils;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class DexOptimizer {

    /* loaded from: classes3.dex */
    private static class StreamConsumer {
        static final Executor STREAM_CONSUMER = Executors.newSingleThreadExecutor();

        private StreamConsumer() {
        }

        static void consumeInputStream(final InputStream inputStream) {
            STREAM_CONSUMER.execute(new Runnable() { // from class: com.lody.virtual.helper.DexOptimizer.StreamConsumer.1
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

    public static void dex2oat(String str, String str2) throws IOException {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            FileUtils.ensureDirCreate(new File(str2).getParentFile());
            ArrayList arrayList = new ArrayList();
            arrayList.add("dex2oat");
            arrayList.add("--dex-file=" + str);
            arrayList.add("--oat-file=" + str2);
            arrayList.add("--instruction-set=" + VirtualRuntime.getCurrentInstructionSet());
            if (i5 > 25) {
                arrayList.add("--compiler-filter=quicken");
            } else {
                arrayList.add("--compiler-filter=interpret-only");
            }
            ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
            processBuilder.redirectErrorStream(true);
            Process start = processBuilder.start();
            StreamConsumer.consumeInputStream(start.getInputStream());
            StreamConsumer.consumeInputStream(start.getErrorStream());
            try {
                int waitFor = start.waitFor();
                if (waitFor != 0) {
                    throw new IOException("dex2oat works unsuccessfully, exit code: " + waitFor);
                }
                return;
            } catch (InterruptedException e5) {
                throw new IOException("dex2oat is interrupted, msg: " + e5.getMessage(), e5);
            }
        }
        DexFile.loadDex(str, str2, 0).close();
    }
}
