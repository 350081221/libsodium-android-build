package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B;\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b7\u0010\u0010JF\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0004ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0004J*\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\rH\u0016J\u001a\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001a\u0010+\u001a\u00020*8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0001\u00029:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "updateCommon-XHw0xAI", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)V", "updateCommon", "onDetach", "disposeInteractionSource", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Z", "Ljava/lang/String;", "Landroidx/compose/ui/semantics/Role;", "Lv3/a;", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "interactionData", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "getInteractionData", "()Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "getClickablePointerInputNode", "()Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "clickablePointerInputNode", "Landroidx/compose/foundation/ClickableSemanticsNode;", "getClickableSemanticsNode", "()Landroidx/compose/foundation/ClickableSemanticsNode;", "clickableSemanticsNode", "<init>", "InteractionData", "Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/CombinedClickableNodeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1070:1\n1855#2,2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n783#1:1071,2\n*E\n"})
/* loaded from: classes.dex */
abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode {
    private boolean enabled;

    @p4.l
    private final InteractionData interactionData;

    @p4.l
    private MutableInteractionSource interactionSource;

    @p4.l
    private v3.a<r2> onClick;

    @p4.m
    private String onClickLabel;

    @p4.m
    private Role role;

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "", "()V", "centreOffset", "Landroidx/compose/ui/geometry/Offset;", "getCentreOffset-F1C5BW0", "()J", "setCentreOffset-k-4lQ0M", "(J)V", "J", "currentKeyPressInteractions", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getCurrentKeyPressInteractions", "()Ljava/util/Map;", "pressInteraction", "getPressInteraction", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "setPressInteraction", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class InteractionData {
        public static final int $stable = 8;

        @p4.m
        private PressInteraction.Press pressInteraction;

        @p4.l
        private final Map<Key, PressInteraction.Press> currentKeyPressInteractions = new LinkedHashMap();
        private long centreOffset = Offset.Companion.m3509getZeroF1C5BW0();

        /* renamed from: getCentreOffset-F1C5BW0, reason: not valid java name */
        public final long m173getCentreOffsetF1C5BW0() {
            return this.centreOffset;
        }

        @p4.l
        public final Map<Key, PressInteraction.Press> getCurrentKeyPressInteractions() {
            return this.currentKeyPressInteractions;
        }

        @p4.m
        public final PressInteraction.Press getPressInteraction() {
            return this.pressInteraction;
        }

        /* renamed from: setCentreOffset-k-4lQ0M, reason: not valid java name */
        public final void m174setCentreOffsetk4lQ0M(long j5) {
            this.centreOffset = j5;
        }

        public final void setPressInteraction(@p4.m PressInteraction.Press press) {
            this.pressInteraction = press;
        }
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a<r2> aVar) {
        this.interactionSource = mutableInteractionSource;
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
        this.interactionData = new InteractionData();
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a aVar, w wVar) {
        this(mutableInteractionSource, z4, str, role, aVar);
    }

    /* renamed from: updateCommon-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ void m168updateCommonXHw0xAI$default(AbstractClickableNode abstractClickableNode, MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a aVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCommon-XHw0xAI");
        }
        if ((i5 & 8) != 0) {
            role = null;
        }
        abstractClickableNode.m172updateCommonXHw0xAI(mutableInteractionSource, z4, str, role, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void disposeInteractionSource() {
        PressInteraction.Press pressInteraction = this.interactionData.getPressInteraction();
        if (pressInteraction != null) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel(pressInteraction));
        }
        Iterator<T> it = this.interactionData.getCurrentKeyPressInteractions().values().iterator();
        while (it.hasNext()) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
        }
        this.interactionData.setPressInteraction(null);
        this.interactionData.getCurrentKeyPressInteractions().clear();
    }

    @p4.l
    public abstract AbstractClickablePointerInputNode getClickablePointerInputNode();

    @p4.l
    public abstract ClickableSemanticsNode getClickableSemanticsNode();

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final InteractionData getInteractionData() {
        return this.interactionData;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        getClickablePointerInputNode().onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean mo169onKeyEventZmokQxo(@p4.l KeyEvent keyEvent) {
        if (this.enabled && Clickable_androidKt.m250isPressZmokQxo(keyEvent)) {
            if (!this.interactionData.getCurrentKeyPressInteractions().containsKey(Key.m4425boximpl(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent)))) {
                PressInteraction.Press press = new PressInteraction.Press(this.interactionData.m173getCentreOffsetF1C5BW0(), null);
                this.interactionData.getCurrentKeyPressInteractions().put(Key.m4425boximpl(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent)), press);
                kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                return true;
            }
        } else if (this.enabled && Clickable_androidKt.m248isClickZmokQxo(keyEvent)) {
            PressInteraction.Press remove = this.interactionData.getCurrentKeyPressInteractions().remove(Key.m4425boximpl(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent)));
            if (remove != null) {
                kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, remove, null), 3, null);
            }
            this.onClick.invoke();
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo170onPointerEventH0pRuoY(@p4.l PointerEvent pointerEvent, @p4.l PointerEventPass pointerEventPass, long j5) {
        getClickablePointerInputNode().mo170onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j5);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean mo171onPreKeyEventZmokQxo(@p4.l KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: updateCommon-XHw0xAI, reason: not valid java name */
    public final void m172updateCommonXHw0xAI(@p4.l MutableInteractionSource mutableInteractionSource, boolean z4, @p4.m String str, @p4.m Role role, @p4.l v3.a<r2> aVar) {
        if (!l0.g(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        if (this.enabled != z4) {
            if (!z4) {
                disposeInteractionSource();
            }
            this.enabled = z4;
        }
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
    }
}
