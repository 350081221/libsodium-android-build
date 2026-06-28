package com.ss.android.socialbase.downloader.f;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
public class o {
    public static long a(@NonNull List<i> list) {
        int size = list.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = list.get(i5);
            if (iVar.c() > j5) {
                break;
            }
            if (iVar.e() > j5) {
                j5 = iVar.e();
            }
        }
        return j5;
    }

    public static long b(@NonNull List<i> list) {
        long j5;
        long j6;
        long j7 = 0;
        loop0: while (true) {
            j5 = -1;
            j6 = -1;
            for (i iVar : list) {
                if (j5 == -1) {
                    if (iVar.a() > 0) {
                        j5 = iVar.c();
                        j6 = iVar.d();
                    }
                } else if (iVar.c() <= j6) {
                    if (iVar.d() > j6) {
                        j6 = iVar.d();
                    }
                } else {
                    j7 += j6 - j5;
                    if (iVar.a() > 0) {
                        j5 = iVar.c();
                        j6 = iVar.d();
                    }
                }
            }
        }
        if (j5 >= 0 && j6 > j5) {
            return j7 + (j6 - j5);
        }
        return j7;
    }
}
