package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050%¢\u0006\u0002\b&¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R(\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R(\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R(\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050%¢\u0006\u0002\b&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingNode;", "create", "node", "Lkotlin/r2;", "update", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/unit/Dp;", "start", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "top", "getTop-D9Ej5fM", "setTop-0680j_4", "end", "getEnd-D9Ej5fM", "setEnd-0680j_4", "bottom", "getBottom-D9Ej5fM", "setBottom-0680j_4", "rtlAware", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "getInspectorInfo", "()Lv3/l;", "<init>", "(FFFFZLv3/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n327#1:468\n328#1:469\n329#1:470\n330#1:471\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private PaddingElement(float r1, float r2, float r3, float r4, boolean r5, v3.l<? super androidx.compose.ui.platform.InspectorInfo, kotlin.r2> r6) {
        /*
            r0 = this;
            r0.<init>()
            r0.start = r1
            r0.top = r2
            r0.end = r3
            r0.bottom = r4
            r0.rtlAware = r5
            r0.inspectorInfo = r6
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L20
            androidx.compose.ui.unit.Dp$Companion r3 = androidx.compose.ui.unit.Dp.Companion
            float r3 = r3.m6064getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r1, r3)
            if (r1 == 0) goto L57
        L20:
            float r1 = r0.top
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L32
            androidx.compose.ui.unit.Dp$Companion r3 = androidx.compose.ui.unit.Dp.Companion
            float r3 = r3.m6064getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r1, r3)
            if (r1 == 0) goto L57
        L32:
            float r1 = r0.end
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L44
            androidx.compose.ui.unit.Dp$Companion r3 = androidx.compose.ui.unit.Dp.Companion
            float r3 = r3.m6064getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r1, r3)
            if (r1 == 0) goto L57
        L44:
            float r1 = r0.bottom
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L59
            androidx.compose.ui.unit.Dp$Companion r2 = androidx.compose.ui.unit.Dp.Companion
            float r2 = r2.m6064getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r1, r2)
            if (r1 == 0) goto L57
            goto L59
        L57:
            r1 = 0
            goto L5a
        L59:
            r1 = 1
        L5a:
            if (r1 == 0) goto L5d
            return
        L5d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Padding must be non-negative"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.PaddingElement.<init>(float, float, float, float, boolean, v3.l):void");
    }

    public /* synthetic */ PaddingElement(float f5, float f6, float f7, float f8, boolean z4, v3.l lVar, w wVar) {
        this(f5, f6, f7, f8, z4, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !Dp.m6049equalsimpl0(this.start, paddingElement.start) || !Dp.m6049equalsimpl0(this.top, paddingElement.top) || !Dp.m6049equalsimpl0(this.end, paddingElement.end) || !Dp.m6049equalsimpl0(this.bottom, paddingElement.bottom) || this.rtlAware != paddingElement.rtlAware) {
            return false;
        }
        return true;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m538getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m539getEndD9Ej5fM() {
        return this.end;
    }

    @l
    public final v3.l<InspectorInfo, r2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m540getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m541getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m6050hashCodeimpl(this.start) * 31) + Dp.m6050hashCodeimpl(this.top)) * 31) + Dp.m6050hashCodeimpl(this.end)) * 31) + Dp.m6050hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m542setBottom0680j_4(float f5) {
        this.bottom = f5;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m543setEnd0680j_4(float f5) {
        this.end = f5;
    }

    public final void setRtlAware(boolean z4) {
        this.rtlAware = z4;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m544setStart0680j_4(float f5) {
        this.start = f5;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m545setTop0680j_4(float f5) {
        this.top = f5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l PaddingNode paddingNode) {
        paddingNode.m564setStart0680j_4(this.start);
        paddingNode.m565setTop0680j_4(this.top);
        paddingNode.m563setEnd0680j_4(this.end);
        paddingNode.m562setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f5, float f6, float f7, float f8, boolean z4, v3.l lVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? Dp.m6044constructorimpl(0) : f5, (i5 & 2) != 0 ? Dp.m6044constructorimpl(0) : f6, (i5 & 4) != 0 ? Dp.m6044constructorimpl(0) : f7, (i5 & 8) != 0 ? Dp.m6044constructorimpl(0) : f8, z4, lVar, null);
    }
}
