package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003BCDB\u0007¢\u0006\u0004\b@\u0010AJ\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\u000e\u001a\u00020\u000b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0082\bJ*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J&\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J0\u0010%\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016J \u0010,\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020&H\u0016R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010'\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "nonMeasureInputs", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "measureInputs", "getOrComputeLayout", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;", "Lkotlin/r2;", "Lkotlin/u;", "block", "updateCacheIfWritable", "", "visualText", "prevResult", "computeLayout", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "updateNonMeasureInputs", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs", "Landroidx/compose/runtime/snapshots/StateRecord;", t0.b.f22420d, "prependStateRecord", "previous", "current", "applied", "mergeRecords", "<set-?>", "nonMeasureInputs$delegate", "Landroidx/compose/runtime/MutableState;", "getNonMeasureInputs", "()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "setNonMeasureInputs", "(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;)V", "measureInputs$delegate", "getMeasureInputs", "()Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "setMeasureInputs", "(Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;)V", "record", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "<init>", "()V", "CacheRecord", "MeasureInputs", "NonMeasureInputs", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,412:1\n215#1,4:420\n220#1:430\n81#2:413\n107#2,2:414\n81#2:416\n107#2,2:417\n2283#3:419\n2165#3:424\n1714#3:425\n2166#3,2:427\n2165#3:431\n1714#3:432\n2166#3,2:434\n82#4:426\n82#4:433\n1#5:429\n1#5:436\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache\n*L\n197#1:420,4\n197#1:430\n63#1:413\n63#1:414,2\n67#1:416\n67#1:417,2\n155#1:419\n197#1:424\n197#1:425\n197#1:427,2\n218#1:431\n218#1:432\n218#1:434,2\n197#1:426\n218#1:433\n197#1:429\n218#1:436\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {
    public static final int $stable = 0;

    @l
    private final MutableState nonMeasureInputs$delegate = SnapshotStateKt.mutableStateOf(null, NonMeasureInputs.Companion.getMutationPolicy());

    @l
    private final MutableState measureInputs$delegate = SnapshotStateKt.mutableStateOf(null, MeasureInputs.Companion.getMutationPolicy());

    @l
    private CacheRecord record = new CacheRecord();

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0002\u001a\u00020\u0001H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$CacheRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "create", t0.b.f22420d, "Lkotlin/r2;", "assign", "", "toString", "", "visualText", "Ljava/lang/CharSequence;", "getVisualText", "()Ljava/lang/CharSequence;", "setVisualText", "(Ljava/lang/CharSequence;)V", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "setTextStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "", "singleLine", "Z", "getSingleLine", "()Z", "setSingleLine", "(Z)V", "softWrap", "getSoftWrap", "setSoftWrap", "", "densityValue", "F", "getDensityValue", "()F", "setDensityValue", "(F)V", "fontScale", "getFontScale", "setFontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "J", "getConstraints-msEJaDk", "()J", "setConstraints-BRTryo0", "(J)V", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class CacheRecord extends StateRecord {

        @m
        private FontFamily.Resolver fontFamilyResolver;

        @m
        private LayoutDirection layoutDirection;

        @m
        private TextLayoutResult layoutResult;
        private boolean singleLine;
        private boolean softWrap;

        @m
        private TextStyle textStyle;

        @m
        private CharSequence visualText;
        private float densityValue = Float.NaN;
        private float fontScale = Float.NaN;
        private long constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@l StateRecord stateRecord) {
            l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.visualText = cacheRecord.visualText;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord create() {
            return new CacheRecord();
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1124getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        @m
        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        @m
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @m
        public final TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        @m
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        @m
        public final CharSequence getVisualText() {
            return this.visualText;
        }

        /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m1125setConstraintsBRTryo0(long j5) {
            this.constraints = j5;
        }

        public final void setDensityValue(float f5) {
            this.densityValue = f5;
        }

        public final void setFontFamilyResolver(@m FontFamily.Resolver resolver) {
            this.fontFamilyResolver = resolver;
        }

        public final void setFontScale(float f5) {
            this.fontScale = f5;
        }

        public final void setLayoutDirection(@m LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setLayoutResult(@m TextLayoutResult textLayoutResult) {
            this.layoutResult = textLayoutResult;
        }

        public final void setSingleLine(boolean z4) {
            this.singleLine = z4;
        }

        public final void setSoftWrap(boolean z4) {
            this.softWrap = z4;
        }

        public final void setTextStyle(@m TextStyle textStyle) {
            this.textStyle = textStyle;
        }

        public final void setVisualText(@m CharSequence charSequence) {
            this.visualText = charSequence;
        }

        @l
        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.visualText) + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m6005toStringimpl(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "", "", "toString", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "J", "getConstraints-msEJaDk", "()J", "", "densityValue", "F", "getDensityValue", "()F", "fontScale", "getFontScale", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/w;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class MeasureInputs {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        private static final SnapshotMutationPolicy<MeasureInputs> mutationPolicy = new SnapshotMutationPolicy<MeasureInputs>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(@m TextFieldLayoutStateCache.MeasureInputs measureInputs, @m TextFieldLayoutStateCache.MeasureInputs measureInputs2) {
                if (measureInputs == null || measureInputs2 == null) {
                    if (!((measureInputs == null) ^ (measureInputs2 == null))) {
                        return true;
                    }
                } else {
                    if (measureInputs.getDensityValue() == measureInputs2.getDensityValue()) {
                        if ((measureInputs.getFontScale() == measureInputs2.getFontScale()) && measureInputs.getLayoutDirection() == measureInputs2.getLayoutDirection() && l0.g(measureInputs.getFontFamilyResolver(), measureInputs2.getFontFamilyResolver()) && Constraints.m5993equalsimpl0(measureInputs.m1126getConstraintsmsEJaDk(), measureInputs2.m1126getConstraintsmsEJaDk())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };
        private final long constraints;

        @l
        private final Density density;
        private final float densityValue;

        @l
        private final FontFamily.Resolver fontFamilyResolver;
        private final float fontScale;

        @l
        private final LayoutDirection layoutDirection;

        @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion;", "", "()V", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "getMutationPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @l
            public final SnapshotMutationPolicy<MeasureInputs> getMutationPolicy() {
                return MeasureInputs.mutationPolicy;
            }
        }

        private MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j5) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = resolver;
            this.constraints = j5;
            this.densityValue = density.getDensity();
            this.fontScale = density.getFontScale();
        }

        public /* synthetic */ MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j5, w wVar) {
            this(density, layoutDirection, resolver, j5);
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1126getConstraintsmsEJaDk() {
            return this.constraints;
        }

        @l
        public final Density getDensity() {
            return this.density;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        @l
        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        @l
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @l
        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m6005toStringimpl(this.constraints)) + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "", "softWrap", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V", "getSingleLine", "()Z", "getSoftWrap", "getTextFieldState", "()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class NonMeasureInputs {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        private static final SnapshotMutationPolicy<NonMeasureInputs> mutationPolicy = new SnapshotMutationPolicy<NonMeasureInputs>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(@m TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, @m TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2) {
                if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
                    if (!((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null))) {
                        return true;
                    }
                } else if (nonMeasureInputs.getTextFieldState() == nonMeasureInputs2.getTextFieldState() && l0.g(nonMeasureInputs.getTextStyle(), nonMeasureInputs2.getTextStyle()) && nonMeasureInputs.getSingleLine() == nonMeasureInputs2.getSingleLine() && nonMeasureInputs.getSoftWrap() == nonMeasureInputs2.getSoftWrap()) {
                    return true;
                }
                return false;
            }
        };
        private final boolean singleLine;
        private final boolean softWrap;

        @l
        private final TransformedTextFieldState textFieldState;

        @l
        private final TextStyle textStyle;

        @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;", "", "()V", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "getMutationPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @l
            public final SnapshotMutationPolicy<NonMeasureInputs> getMutationPolicy() {
                return NonMeasureInputs.mutationPolicy;
            }
        }

        public NonMeasureInputs(@l TransformedTextFieldState transformedTextFieldState, @l TextStyle textStyle, boolean z4, boolean z5) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z4;
            this.softWrap = z5;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        @l
        public final TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        @l
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        @l
        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ')';
        }
    }

    private final TextLayoutResult computeLayout(CharSequence charSequence, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs, TextLayoutResult textLayoutResult) {
        List E;
        AnnotatedString annotatedString = new AnnotatedString(charSequence.toString(), null, null, 6, null);
        TextStyle textStyle = nonMeasureInputs.getTextStyle();
        Density density = measureInputs.getDensity();
        FontFamily.Resolver fontFamilyResolver = measureInputs.getFontFamilyResolver();
        boolean softWrap = nonMeasureInputs.getSoftWrap();
        E = kotlin.collections.w.E();
        return new TextDelegate(annotatedString, textStyle, 0, 0, softWrap, 0, density, fontFamilyResolver, E, 44, null).m892layoutNN6EwU(measureInputs.m1126getConstraintsmsEJaDk(), measureInputs.getLayoutDirection(), textLayoutResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MeasureInputs getMeasureInputs() {
        return (MeasureInputs) this.measureInputs$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NonMeasureInputs getNonMeasureInputs() {
        return (NonMeasureInputs) this.nonMeasureInputs$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.text.TextLayoutResult getOrComputeLayout(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.NonMeasureInputs r20, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.MeasureInputs r21) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.getOrComputeLayout(androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$NonMeasureInputs, androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache$MeasureInputs):androidx.compose.ui.text.TextLayoutResult");
    }

    private final void setMeasureInputs(MeasureInputs measureInputs) {
        this.measureInputs$delegate.setValue(measureInputs);
    }

    private final void setNonMeasureInputs(NonMeasureInputs nonMeasureInputs) {
        this.nonMeasureInputs$delegate.setValue(nonMeasureInputs);
    }

    private final void updateCacheIfWritable(v3.l<? super CacheRecord, r2> lVar) {
        Snapshot current = Snapshot.Companion.getCurrent();
        if (!current.getReadOnly()) {
            CacheRecord cacheRecord = this.record;
            synchronized (SnapshotKt.getLock()) {
                try {
                    lVar.invoke(SnapshotKt.writableRecord(cacheRecord, this, current));
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord getFirstStateRecord() {
        return this.record;
    }

    @l
    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1123layoutWithNewMeasureInputshBUhpc(@l Density density, @l LayoutDirection layoutDirection, @l FontFamily.Resolver resolver, long j5) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, resolver, j5, null);
        setMeasureInputs(measureInputs);
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs != null) {
            return getOrComputeLayout(nonMeasureInputs, measureInputs);
        }
        throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs".toString());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord mergeRecords(@l StateRecord stateRecord, @l StateRecord stateRecord2, @l StateRecord stateRecord3) {
        return stateRecord3;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@l StateRecord stateRecord) {
        l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (CacheRecord) stateRecord;
    }

    public final void updateNonMeasureInputs(@l TransformedTextFieldState transformedTextFieldState, @l TextStyle textStyle, boolean z4, boolean z5) {
        setNonMeasureInputs(new NonMeasureInputs(transformedTextFieldState, textStyle, z4, z5));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @m
    public TextLayoutResult getValue() {
        MeasureInputs measureInputs;
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null || (measureInputs = getMeasureInputs()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }
}
