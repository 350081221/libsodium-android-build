package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.lody.virtual.server.content.SyncStorageEngine;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {307, 309, TypedValues.AttributesType.TYPE_PATH_ROTATE, TypedValues.AttributesType.TYPE_EASING, 326}, m = "invokeSuspend", n = {"delayJob", SyncStorageEngine.MESG_SUCCESS, "release"}, s = {"L$0", "Z$0", "L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClickableKt$handlePressInteraction$2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ v3.a<Boolean> $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(PressGestureScope pressGestureScope, long j5, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, v3.a<Boolean> aVar, kotlin.coroutines.d<? super ClickableKt$handlePressInteraction$2> dVar) {
        super(2, dVar);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j5;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
        this.$delayPressInteraction = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, this.$delayPressInteraction, dVar);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((ClickableKt$handlePressInteraction$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
