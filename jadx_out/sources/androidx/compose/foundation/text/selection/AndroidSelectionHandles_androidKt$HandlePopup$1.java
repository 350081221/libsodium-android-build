package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$HandlePopup$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ HandleReferencePoint $handleReferencePoint;
    final /* synthetic */ OffsetProvider $positionProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidSelectionHandles_androidKt$HandlePopup$1(OffsetProvider offsetProvider, HandleReferencePoint handleReferencePoint, p<? super Composer, ? super Integer, r2> pVar, int i5) {
        super(2);
        this.$positionProvider = offsetProvider;
        this.$handleReferencePoint = handleReferencePoint;
        this.$content = pVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AndroidSelectionHandles_androidKt.HandlePopup(this.$positionProvider, this.$handleReferencePoint, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
