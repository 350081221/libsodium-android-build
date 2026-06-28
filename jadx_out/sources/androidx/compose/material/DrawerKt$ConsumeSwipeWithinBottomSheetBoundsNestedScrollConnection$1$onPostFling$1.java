package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {TypedValues.Custom.TYPE_INT}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
/* loaded from: classes.dex */
public final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 extends d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, kotlin.coroutines.d<? super DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1> dVar) {
        super(dVar);
        this.this$0 = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo390onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
