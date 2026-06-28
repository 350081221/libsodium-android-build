package androidx.compose.ui.graphics;

import com.tendcloud.tenddata.cq;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/PathMeasure;", "", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/Path;", "destination", "", "startWithMoveTo", "getSegment", ClientCookie.PATH_ATTR, "forceClosed", "Lkotlin/r2;", "setPath", "distance", "Landroidx/compose/ui/geometry/Offset;", "getPosition-tuRUvjQ", "(F)J", "getPosition", "getTangent-tuRUvjQ", "getTangent", "getLength", "()F", cq.a.LENGTH, "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface PathMeasure {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f5, float f6, Path path, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i5 & 8) != 0) {
            z4 = true;
        }
        return pathMeasure.getSegment(f5, f6, path, z4);
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ */
    long mo3632getPositiontuRUvjQ(float f5);

    boolean getSegment(float f5, float f6, @p4.l Path path, boolean z4);

    /* renamed from: getTangent-tuRUvjQ */
    long mo3633getTangenttuRUvjQ(float f5);

    void setPath(@p4.m Path path, boolean z4);
}
