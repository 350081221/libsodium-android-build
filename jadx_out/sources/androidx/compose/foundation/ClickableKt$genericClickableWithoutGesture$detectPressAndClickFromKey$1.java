package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.Map;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1 extends n0 implements v3.l<KeyEvent, Boolean> {
    final /* synthetic */ Map<Key, PressInteraction.Press> $currentKeyPressInteractions;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ s0 $indicationScope;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<Offset> $keyClickOffset;
    final /* synthetic */ v3.a<r2> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", f = "Clickable.kt", i = {}, l = {384}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ PressInteraction.Press $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$interactionSource = mutableInteractionSource;
            this.$press = press;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$interactionSource, this.$press, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                PressInteraction.Press press = this.$press;
                this.label = 1;
                if (mutableInteractionSource.emit(press, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1(boolean z4, Map<Key, PressInteraction.Press> map, State<Offset> state, s0 s0Var, v3.a<r2> aVar, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$enabled = z4;
        this.$currentKeyPressInteractions = map;
        this.$keyClickOffset = state;
        this.$indicationScope = s0Var;
        this.$onClick = aVar;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m243invokeZmokQxo(keyEvent.m4725unboximpl());
    }

    @p4.l
    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m243invokeZmokQxo(@p4.l android.view.KeyEvent keyEvent) {
        boolean z4 = true;
        if (this.$enabled && Clickable_androidKt.m250isPressZmokQxo(keyEvent)) {
            if (!this.$currentKeyPressInteractions.containsKey(Key.m4425boximpl(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent)))) {
                PressInteraction.Press press = new PressInteraction.Press(this.$keyClickOffset.getValue().m3503unboximpl(), null);
                this.$currentKeyPressInteractions.put(Key.m4425boximpl(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent)), press);
                kotlinx.coroutines.k.f(this.$indicationScope, null, null, new AnonymousClass1(this.$interactionSource, press, null), 3, null);
            }
            z4 = false;
        } else {
            if (this.$enabled && Clickable_androidKt.m248isClickZmokQxo(keyEvent)) {
                PressInteraction.Press remove = this.$currentKeyPressInteractions.remove(Key.m4425boximpl(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent)));
                if (remove != null) {
                    kotlinx.coroutines.k.f(this.$indicationScope, null, null, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(this.$interactionSource, remove, null), 3, null);
                }
                this.$onClick.invoke();
            }
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
