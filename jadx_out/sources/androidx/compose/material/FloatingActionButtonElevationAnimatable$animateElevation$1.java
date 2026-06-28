package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {395}, m = "animateElevation", n = {"this", TypedValues.TransitionType.S_TO}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FloatingActionButtonElevationAnimatable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, kotlin.coroutines.d<? super FloatingActionButtonElevationAnimatable$animateElevation$1> dVar) {
        super(dVar);
        this.this$0 = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateElevation(null, this);
    }
}
