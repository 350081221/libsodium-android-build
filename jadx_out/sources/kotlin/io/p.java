package kotlin.io;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import kotlin.i0;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"walk", "Lkotlin/io/FileTreeWalk;", "Ljava/io/File;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/io/FileWalkDirection;", "walkBottomUp", "walkTopDown", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes2.dex */
public class p extends o {
    @p4.l
    public static final k J(@p4.l File file, @p4.l l direction) {
        l0.p(file, "<this>");
        l0.p(direction, "direction");
        return new k(file, direction);
    }

    public static /* synthetic */ k K(File file, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = l.TOP_DOWN;
        }
        return J(file, lVar);
    }

    @p4.l
    public static final k L(@p4.l File file) {
        l0.p(file, "<this>");
        return J(file, l.BOTTOM_UP);
    }

    @p4.l
    public static final k M(@p4.l File file) {
        l0.p(file, "<this>");
        return J(file, l.TOP_DOWN);
    }
}
