package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.android.dx.io.Opcodes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/MappedInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "mapPress", "Landroidx/compose/ui/geometry/Offset;", "delta", "J", "", "mappedPresses", "Ljava/util/Map;", "Lkotlinx/coroutines/flow/i;", "Landroidx/compose/foundation/interaction/Interaction;", "interactions", "Lkotlinx/coroutines/flow/i;", "getInteractions", "()Lkotlinx/coroutines/flow/i;", "underlyingInteractionSource", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMappedInteractionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,65:1\n53#2:66\n55#2:70\n50#3:67\n55#3:69\n106#4:68\n*S KotlinDebug\n*F\n+ 1 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n35#1:66\n35#1:70\n35#1:67\n35#1:69\n35#1:68\n*E\n"})
/* loaded from: classes.dex */
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final long delta;

    @p4.l
    private final kotlinx.coroutines.flow.i<Interaction> interactions;

    @p4.l
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    private MappedInteractionSource(InteractionSource interactionSource, long j5) {
        this.delta = j5;
        this.mappedPresses = new LinkedHashMap();
        final kotlinx.coroutines.flow.i<Interaction> interactions = interactionSource.getInteractions();
        this.interactions = new kotlinx.coroutines.flow.i<Interaction>() { // from class: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1

            @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n1#1,222:1\n54#2:223\n36#3,23:224\n*E\n"})
            /* renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
                @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
                @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.foundation.interaction.PressInteraction$Press, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.foundation.interaction.Interaction, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.foundation.interaction.PressInteraction$Release] */
                /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.foundation.interaction.PressInteraction$Release] */
                /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.foundation.interaction.PressInteraction$Cancel] */
                /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.foundation.interaction.PressInteraction$Cancel] */
                @Override // kotlinx.coroutines.flow.j
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @p4.l kotlin.coroutines.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.e1.n(r7)
                        goto L97
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.e1.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.$this_unsafeFlow
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        if (r2 == 0) goto L51
                        androidx.compose.material3.MappedInteractionSource r2 = r5.this$0
                        r4 = r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = androidx.compose.material3.MappedInteractionSource.access$mapPress(r2, r4)
                        androidx.compose.material3.MappedInteractionSource r4 = r5.this$0
                        java.util.Map r4 = androidx.compose.material3.MappedInteractionSource.access$getMappedPresses$p(r4)
                        r4.put(r6, r2)
                        r6 = r2
                        goto L8e
                    L51:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r2 == 0) goto L70
                        androidx.compose.material3.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L6a
                        goto L8e
                    L6a:
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r6.<init>(r2)
                        goto L8e
                    L70:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r2 == 0) goto L8e
                        androidx.compose.material3.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = (androidx.compose.foundation.interaction.PressInteraction.Release) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L89
                        goto L8e
                    L89:
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r6.<init>(r2)
                    L8e:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L97
                        return r1
                    L97:
                        kotlin.r2 r6 = kotlin.r2.f19517a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            @p4.m
            public Object collect(@p4.l kotlinx.coroutines.flow.j<? super Interaction> jVar, @p4.l kotlin.coroutines.d dVar) {
                Object l5;
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), dVar);
                l5 = kotlin.coroutines.intrinsics.d.l();
                if (collect == l5) {
                    return collect;
                }
                return r2.f19517a;
            }
        };
    }

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j5, kotlin.jvm.internal.w wVar) {
        this(interactionSource, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m3497minusMKHz9U(press.m429getPressPositionF1C5BW0(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    @p4.l
    public kotlinx.coroutines.flow.i<Interaction> getInteractions() {
        return this.interactions;
    }
}
