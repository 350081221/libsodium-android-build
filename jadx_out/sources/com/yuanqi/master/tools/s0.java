package com.yuanqi.master.tools;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import java.util.Comparator;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/tools/FileComparator;", "Ljava/util/Comparator;", "Ljava/io/File;", "Lkotlin/Comparator;", "()V", "compare", "", "file1", "file2", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s0 implements Comparator<File> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15247a = 0;

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@p4.l File file1, @p4.l File file2) {
        kotlin.jvm.internal.l0.p(file1, "file1");
        kotlin.jvm.internal.l0.p(file2, "file2");
        if (file1.lastModified() > file2.lastModified()) {
            return -1;
        }
        return 1;
    }
}
