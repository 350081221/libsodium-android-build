package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 j2\u00020\u0001:\u0001jB\u001f\u0012\u0006\u0010e\u001a\u00020\u0002\u0012\u0006\u0010f\u001a\u00020\u0002\u0012\u0006\u0010g\u001a\u00020\u0018¢\u0006\u0004\bh\u0010iJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\b\u001a\u00020\u0002*\u00020\u0005H\u0002J\f\u0010\t\u001a\u00020\u0002*\u00020\u0005H\u0002J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\rJ'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b#\u0010!J0\u0010'\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R!\u00100\u001a\u00020+8@X\u0080\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R1\u00108\u001a\u0002012\u0006\u00102\u001a\u0002018@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010/\"\u0004\b6\u00107R1\u0010>\u001a\u0002092\u0006\u00102\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\rR+\u0010C\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00188@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00104\u001a\u0004\b@\u0010*\"\u0004\bA\u0010BR+\u0010G\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00188@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00104\u001a\u0004\bE\u0010*\"\u0004\bF\u0010BR+\u0010N\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR+\u0010R\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010W\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010-\u001a\u0004\bW\u0010*R&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Y0X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b^\u0010<R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b_\u0010<R\u0014\u0010\u0004\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010<R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "", "", "hour", "hourForDisplay", "", "angle", "offsetHour", "toHour", "toMinute", "minute", "Lkotlin/r2;", "setMinute$material3_release", "(I)V", "setMinute", "setHour$material3_release", "setHour", "x", "y", "maxDist", "moveSelector$material3_release", "(FFF)V", "moveSelector", t0.b.f22420d, "", "isSelected$material3_release", "(I)Z", "isSelected", "fromTap", "update$material3_release", "(FZLkotlin/coroutines/d;)Ljava/lang/Object;", "update", "animateToCurrent$material3_release", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "animateToCurrent", "settle", "autoSwitchToMinute", "onTap$material3_release", "(FFFZLkotlin/coroutines/d;)Ljava/lang/Object;", "onTap", "is24hour", "Z", "()Z", "Landroidx/compose/ui/unit/DpOffset;", "selectorPos$delegate", "Landroidx/compose/runtime/State;", "getSelectorPos-RKDOV3M$material3_release", "()J", "selectorPos", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", "center$delegate", "Landroidx/compose/runtime/MutableState;", "getCenter-nOcc-ac$material3_release", "setCenter--gyyYBs$material3_release", "(J)V", "center", "Landroidx/compose/material3/Selection;", "selection$delegate", "getSelection-JiIwxys$material3_release", "()I", "setSelection-iHAOin8$material3_release", "selection", "isAfternoonToggle$delegate", "isAfternoonToggle$material3_release", "setAfternoonToggle$material3_release", "(Z)V", "isAfternoonToggle", "isInnerCircle$delegate", "isInnerCircle$material3_release", "setInnerCircle$material3_release", "isInnerCircle", "hourAngle$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getHourAngle$material3_release", "()F", "setHourAngle$material3_release", "(F)V", "hourAngle", "minuteAngle$delegate", "getMinuteAngle$material3_release", "setMinuteAngle$material3_release", "minuteAngle", "Landroidx/compose/foundation/MutatorMutex;", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "isAfternoon$delegate", "isAfternoon", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "currentAngle", "Landroidx/compose/animation/core/Animatable;", "getCurrentAngle$material3_release", "()Landroidx/compose/animation/core/Animatable;", "getMinute", "getHour", "getHourForDisplay$material3_release", "", "getValues$material3_release", "()Ljava/util/List;", "values", "initialHour", "initialMinute", "is24Hour", "<init>", "(IIZ)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,1843:1\n1#2:1844\n81#3:1845\n81#3:1846\n107#3,2:1847\n81#3:1849\n107#3,2:1850\n81#3:1852\n107#3,2:1853\n81#3:1855\n107#3,2:1856\n81#3:1864\n76#4:1858\n109#4,2:1859\n76#4:1861\n109#4,2:1862\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n*L\n621#1:1845\n637#1:1846\n637#1:1847,2\n640#1:1849\n640#1:1850,2\n641#1:1852\n641#1:1853,2\n642#1:1855\n642#1:1856,2\n652#1:1864\n644#1:1858\n644#1:1859,2\n647#1:1861\n647#1:1862,2\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerState {
    public static final int $stable = 0;

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private final MutableState center$delegate;

    @p4.l
    private final Animatable<Float, AnimationVector1D> currentAngle;

    @p4.l
    private final MutableFloatState hourAngle$delegate;
    private final boolean is24hour;

    @p4.l
    private final State isAfternoon$delegate;

    @p4.l
    private final MutableState isAfternoonToggle$delegate;

    @p4.l
    private final MutableState isInnerCircle$delegate;

    @p4.l
    private final MutableFloatState minuteAngle$delegate;

    @p4.l
    private final MutatorMutex mutex;

    @p4.l
    private final MutableState selection$delegate;

    @p4.l
    private final State selectorPos$delegate;

    @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/TimePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final Saver<TimePickerState, ?> Saver() {
            return SaverKt.Saver(TimePickerState$Companion$Saver$1.INSTANCE, TimePickerState$Companion$Saver$2.INSTANCE);
        }
    }

    public TimePickerState(int i5, int i6, boolean z4) {
        boolean z5;
        boolean z6;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        boolean z7;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        if (i5 >= 0 && i5 < 24) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (i6 >= 0 && i6 < 60) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                this.is24hour = z4;
                this.selectorPos$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new TimePickerState$selectorPos$2(this, z4));
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m6163boximpl(IntOffset.Companion.m6182getZeronOccac()), null, 2, null);
                this.center$delegate = mutableStateOf$default;
                mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Selection.m2169boximpl(Selection.Companion.m2176getHourJiIwxys()), null, 2, null);
                this.selection$delegate = mutableStateOf$default2;
                if (i5 >= 12 && !z4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z7), null, 2, null);
                this.isAfternoonToggle$delegate = mutableStateOf$default3;
                mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i5 >= 12), null, 2, null);
                this.isInnerCircle$delegate = mutableStateOf$default4;
                this.hourAngle$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(((i5 % 12) * 0.5235988f) - 1.5707964f);
                this.minuteAngle$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf((i6 * 0.10471976f) - 1.5707964f);
                this.mutex = new MutatorMutex();
                this.isAfternoon$delegate = SnapshotStateKt.derivedStateOf(new TimePickerState$isAfternoon$2(this));
                this.currentAngle = AnimatableKt.Animatable$default(getHourAngle$material3_release(), 0.0f, 2, null);
                return;
            }
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
    }

    private final int hourForDisplay(int i5) {
        if (this.is24hour) {
            return i5 % 24;
        }
        if (i5 % 12 == 0) {
            return 12;
        }
        if (isAfternoon()) {
            return i5 - 12;
        }
        return i5;
    }

    private final boolean isAfternoon() {
        return ((Boolean) this.isAfternoon$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetHour(float f5) {
        float f6 = f5 + 1.5707964f;
        return f6 < 0.0f ? f6 + 6.2831855f : f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f5) {
        return ((int) ((f5 + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f5) {
        return ((int) ((f5 + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    public static /* synthetic */ Object update$material3_release$default(TimePickerState timePickerState, float f5, boolean z4, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return timePickerState.update$material3_release(f5, z4, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToCurrent$material3_release(@p4.l kotlin.coroutines.d<? super kotlin.r2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.TimePickerState$animateToCurrent$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = (androidx.compose.material3.TimePickerState$animateToCurrent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = new androidx.compose.material3.TimePickerState$animateToCurrent$1
            r0.<init>(r11, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.e1.n(r12)
            goto Lbb
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L36:
            float r1 = r6.F$0
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            kotlin.e1.n(r12)
            goto L95
        L40:
            kotlin.e1.n(r12)
            int r12 = r11.m2500getSelectionJiIwxys$material3_release()
            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.Companion
            int r1 = r1.m2176getHourJiIwxys()
            boolean r12 = androidx.compose.material3.Selection.m2172equalsimpl0(r12, r1)
            if (r12 == 0) goto L60
            float r12 = r11.getMinuteAngle$material3_release()
            float r1 = r11.getHourAngle$material3_release()
            kotlin.u0 r12 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r12, r1)
            goto L6c
        L60:
            float r12 = r11.getHourAngle$material3_release()
            float r1 = r11.getMinuteAngle$material3_release()
            kotlin.u0 r12 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r12, r1)
        L6c:
            java.lang.Object r1 = r12.component1()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r12 = r12.component2()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r11.currentAngle
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.e(r1)
            r6.L$0 = r11
            r6.F$0 = r12
            r6.label = r3
            java.lang.Object r1 = r4.snapTo(r1, r6)
            if (r1 != r0) goto L93
            return r0
        L93:
            r3 = r11
            r1 = r12
        L95:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r3.currentAngle
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.b.e(r1)
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r1, r7, r4, r7)
            r5 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            r6.L$0 = r7
            r6.label = r2
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r7 = r9
            r8 = r10
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto Lbb
            return r0
        Lbb:
            kotlin.r2 r12 = kotlin.r2.f19517a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.animateToCurrent$material3_release(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCenter-nOcc-ac$material3_release, reason: not valid java name */
    public final long m2499getCenternOccac$material3_release() {
        return ((IntOffset) this.center$delegate.getValue()).m6181unboximpl();
    }

    @p4.l
    public final Animatable<Float, AnimationVector1D> getCurrentAngle$material3_release() {
        return this.currentAngle;
    }

    public final int getHour() {
        return toHour(getHourAngle$material3_release()) + (isAfternoon() ? 12 : 0);
    }

    public final float getHourAngle$material3_release() {
        return this.hourAngle$delegate.getFloatValue();
    }

    public final int getHourForDisplay$material3_release() {
        return hourForDisplay(getHour());
    }

    public final int getMinute() {
        return toMinute(getMinuteAngle$material3_release());
    }

    public final float getMinuteAngle$material3_release() {
        return this.minuteAngle$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSelection-JiIwxys$material3_release, reason: not valid java name */
    public final int m2500getSelectionJiIwxys$material3_release() {
        return ((Selection) this.selection$delegate.getValue()).m2175unboximpl();
    }

    /* renamed from: getSelectorPos-RKDOV3M$material3_release, reason: not valid java name */
    public final long m2501getSelectorPosRKDOV3M$material3_release() {
        return ((DpOffset) this.selectorPos$delegate.getValue()).m6113unboximpl();
    }

    @p4.l
    public final List<Integer> getValues$material3_release() {
        return Selection.m2172equalsimpl0(m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2177getMinuteJiIwxys()) ? TimePickerKt.access$getMinutes$p() : TimePickerKt.access$getHours$p();
    }

    public final boolean is24hour() {
        return this.is24hour;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAfternoonToggle$material3_release() {
        return ((Boolean) this.isAfternoonToggle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInnerCircle$material3_release() {
        return ((Boolean) this.isInnerCircle$delegate.getValue()).booleanValue();
    }

    public final boolean isSelected$material3_release(int i5) {
        int i6;
        if (Selection.m2172equalsimpl0(m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2177getMinuteJiIwxys())) {
            if (i5 == getMinute()) {
                return true;
            }
        } else {
            int hour = getHour();
            if (isAfternoon()) {
                i6 = 12;
            } else {
                i6 = 0;
            }
            if (hour == i5 + i6) {
                return true;
            }
        }
        return false;
    }

    public final void moveSelector$material3_release(float f5, float f6, float f7) {
        boolean z4;
        if (Selection.m2172equalsimpl0(m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2176getHourJiIwxys()) && this.is24hour) {
            if (TimePickerKt.access$dist(f5, f6, IntOffset.m6172getXimpl(m2499getCenternOccac$material3_release()), IntOffset.m6173getYimpl(m2499getCenternOccac$material3_release())) < f7) {
                z4 = true;
            } else {
                z4 = false;
            }
            setInnerCircle$material3_release(z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onTap$material3_release(float r11, float r12, float r13, boolean r14, @p4.l kotlin.coroutines.d<? super kotlin.r2> r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.onTap$material3_release(float, float, float, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    public final void setAfternoonToggle$material3_release(boolean z4) {
        this.isAfternoonToggle$delegate.setValue(Boolean.valueOf(z4));
    }

    /* renamed from: setCenter--gyyYBs$material3_release, reason: not valid java name */
    public final void m2502setCentergyyYBs$material3_release(long j5) {
        this.center$delegate.setValue(IntOffset.m6163boximpl(j5));
    }

    public final void setHour$material3_release(int i5) {
        boolean z4;
        if (i5 >= 12) {
            z4 = true;
        } else {
            z4 = false;
        }
        setInnerCircle$material3_release(z4);
        setHourAngle$material3_release(((i5 % 12) * 0.5235988f) - 1.5707964f);
    }

    public final void setHourAngle$material3_release(float f5) {
        this.hourAngle$delegate.setFloatValue(f5);
    }

    public final void setInnerCircle$material3_release(boolean z4) {
        this.isInnerCircle$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setMinute$material3_release(int i5) {
        setMinuteAngle$material3_release((i5 * 0.10471976f) - 1.5707964f);
    }

    public final void setMinuteAngle$material3_release(float f5) {
        this.minuteAngle$delegate.setFloatValue(f5);
    }

    /* renamed from: setSelection-iHAOin8$material3_release, reason: not valid java name */
    public final void m2503setSelectioniHAOin8$material3_release(int i5) {
        this.selection$delegate.setValue(Selection.m2169boximpl(i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settle(@p4.l kotlin.coroutines.d<? super kotlin.r2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.TimePickerState$settle$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.TimePickerState$settle$1 r0 = (androidx.compose.material3.TimePickerState$settle$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.TimePickerState$settle$1 r0 = new androidx.compose.material3.TimePickerState$settle$1
            r0.<init>(r11, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            kotlin.e1.n(r12)
            goto L94
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            java.lang.Object r1 = r6.L$1
            kotlin.u0 r1 = (kotlin.u0) r1
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            kotlin.e1.n(r12)
            goto L6c
        L41:
            kotlin.e1.n(r12)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r11.currentAngle
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r1 = r11.getMinuteAngle$material3_release()
            kotlin.u0 r1 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r12, r1)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r11.currentAngle
            java.lang.Object r4 = r1.getFirst()
            r6.L$0 = r11
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r12 = r12.snapTo(r4, r6)
            if (r12 != r0) goto L6b
            return r0
        L6b:
            r3 = r11
        L6c:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r3.currentAngle
            java.lang.Object r3 = r1.getSecond()
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r1, r7, r4, r7)
            r5 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            r6.L$0 = r7
            r6.L$1 = r7
            r6.label = r2
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r7 = r9
            r8 = r10
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L94
            return r0
        L94:
            kotlin.r2 r12 = kotlin.r2.f19517a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.settle(kotlin.coroutines.d):java.lang.Object");
    }

    @p4.m
    public final Object update$material3_release(float f5, boolean z4, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object mutate = this.mutex.mutate(MutatePriority.UserInput, new TimePickerState$update$2(this, f5, z4, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return mutate == l5 ? mutate : r2.f19517a;
    }
}
