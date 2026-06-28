package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.g;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/MotionDurationScaleImpl;", "Landroidx/compose/ui/MotionDurationScale;", "()V", "<set-?>", "", "scaleFactor", "getScaleFactor", "()F", "setScaleFactor", "(F)V", "scaleFactor$delegate", "Landroidx/compose/runtime/MutableFloatState;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,442:1\n76#2:443\n109#2,2:444\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n440#1:443\n440#1:444,2\n*E\n"})
/* loaded from: classes.dex */
public final class MotionDurationScaleImpl implements MotionDurationScale {

    @p4.l
    private final MutableFloatState scaleFactor$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return this.scaleFactor$delegate.getFloatValue();
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
        return MotionDurationScale.DefaultImpls.plus(this, gVar);
    }

    public void setScaleFactor(float f5) {
        this.scaleFactor$delegate.setFloatValue(f5);
    }
}
