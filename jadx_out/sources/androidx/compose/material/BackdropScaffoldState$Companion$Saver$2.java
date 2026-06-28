package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/BackdropScaffoldState;", "it", "Landroidx/compose/material/BackdropValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldState$Companion$Saver$2 extends n0 implements l<BackdropValue, BackdropScaffoldState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ l<BackdropValue, Boolean> $confirmStateChange;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldState$Companion$Saver$2(AnimationSpec<Float> animationSpec, l<? super BackdropValue, Boolean> lVar, SnackbarHostState snackbarHostState) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = lVar;
        this.$snackbarHostState = snackbarHostState;
    }

    @Override // v3.l
    @m
    public final BackdropScaffoldState invoke(@p4.l BackdropValue backdropValue) {
        return new BackdropScaffoldState(backdropValue, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
