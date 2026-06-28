package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f¨\u0006\f"}, d2 = {"and", "Landroid/graphics/Path;", bi.aA, "flatten", "", "Landroidx/core/graphics/PathSegment;", com.umeng.analytics.pro.d.U, "", "minus", "or", "plus", "xor", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
@r1({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
/* loaded from: classes2.dex */
public final class PathKt {
    @p4.l
    public static final Path and(@p4.l Path path, @p4.l Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @p4.l
    @RequiresApi(26)
    public static final Iterable<PathSegment> flatten(@p4.l Path path, float f5) {
        return PathUtils.flatten(path, f5);
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.5f;
        }
        return flatten(path, f5);
    }

    @p4.l
    public static final Path minus(@p4.l Path path, @p4.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @p4.l
    public static final Path or(@p4.l Path path, @p4.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @p4.l
    public static final Path plus(@p4.l Path path, @p4.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @p4.l
    public static final Path xor(@p4.l Path path, @p4.l Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
