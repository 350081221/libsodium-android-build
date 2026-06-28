package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.CodepointTransformationKt;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 M2\u00020\u0001:\u0002MNB#\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\bK\u0010LJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J*\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J,\u0010%\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00192\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040!¢\u0006\u0002\b#H\u0086\bJ\u001b\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b-\u0010+J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0086@¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00105\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u000206H\u0016R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010C\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bI\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "", "", "transformedOffset", "Lkotlin/r2;", "placeCursorBeforeCharAt", "Landroidx/compose/ui/text/TextRange;", "transformedRange", "selectCharsIn-5zc-tL8", "(J)V", "selectCharsIn", "untransformedRange", "selectUntransformedCharsIn-5zc-tL8", "selectUntransformedCharsIn", "", "newText", "replaceAll", "selectAll", "deleteSelectedText", "range", "Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "replaceText-Sb-Bc2M", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V", "replaceText", "", "clearComposition", "replaceSelectedText", "collapseSelectionToMax", "collapseSelectionToEnd", "undo", "redo", "notifyImeOfChanges", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "Lkotlin/u;", "block", "editUntransformedTextAsUser", TypedValues.CycleType.S_WAVE_OFFSET, "mapToTransformed--jx7JFs", "(I)J", "mapToTransformed", "mapToTransformed-GEjPoXI", "(J)J", "mapFromTransformed", "mapFromTransformed-GEjPoXI", "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "", "collectImeNotifications", "(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/d;)Ljava/lang/Object;", "other", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/foundation/text2/input/TextFieldState;", "textFieldState", "Landroidx/compose/foundation/text2/input/TextFieldState;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "transformedText", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "text", "getUntransformedText", "untransformedText", "<init>", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/CodepointTransformation;)V", "Companion", "TransformedText", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,393:1\n186#2,20:394\n186#2,20:414\n186#2,20:434\n186#2,20:454\n186#2,20:474\n186#2,20:494\n186#2,20:514\n186#2,20:534\n186#2,20:554\n314#3,11:574\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n*L\n93#1:394,20\n99#1:414,20\n106#1:434,20\n112#1:454,20\n131#1:474,20\n148#1:494,20\n166#1:514,20\n173#1:534,20\n201#1:554,20\n277#1:574,11\n*E\n"})
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;

    @l
    private static final Companion Companion = new Companion(null);

    @m
    private final CodepointTransformation codepointTransformation;

    @m
    private final InputTransformation inputTransformation;

    @l
    private final TextFieldState textFieldState;

    @m
    private final State<TransformedText> transformedText;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;", "", "()V", "calculateTransformedText", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "untransformedText", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", "range", "mapping", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "mapFromTransformed-xdX6-G0", "(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J", "mapToTransformed", "mapToTransformed-xdX6-G0", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @u3.m
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            TextRange textRange = null;
            if (visualText == textFieldCharSequence) {
                return null;
            }
            long m1151mapToTransformedxdX6G0 = m1151mapToTransformedxdX6G0(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE(), offsetMappingCalculator);
            TextRange mo1075getCompositionInCharsMzsxiRA = textFieldCharSequence.mo1075getCompositionInCharsMzsxiRA();
            if (mo1075getCompositionInCharsMzsxiRA != null) {
                textRange = TextRange.m5533boximpl(TransformedTextFieldState.Companion.m1151mapToTransformedxdX6G0(mo1075getCompositionInCharsMzsxiRA.m5549unboximpl(), offsetMappingCalculator));
            }
            return new TransformedText(TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(visualText, m1151mapToTransformedxdX6G0, textRange), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @u3.m
        /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m1150mapFromTransformedxdX6G0(long j5, OffsetMappingCalculator offsetMappingCalculator) {
            long m1099mapFromDestjx7JFs;
            long m1099mapFromDestjx7JFs2 = offsetMappingCalculator.m1099mapFromDestjx7JFs(TextRange.m5545getStartimpl(j5));
            if (TextRange.m5539getCollapsedimpl(j5)) {
                m1099mapFromDestjx7JFs = m1099mapFromDestjx7JFs2;
            } else {
                m1099mapFromDestjx7JFs = offsetMappingCalculator.m1099mapFromDestjx7JFs(TextRange.m5540getEndimpl(j5));
            }
            int min = Math.min(TextRange.m5543getMinimpl(m1099mapFromDestjx7JFs2), TextRange.m5543getMinimpl(m1099mapFromDestjx7JFs));
            int max = Math.max(TextRange.m5542getMaximpl(m1099mapFromDestjx7JFs2), TextRange.m5542getMaximpl(m1099mapFromDestjx7JFs));
            if (TextRange.m5544getReversedimpl(j5)) {
                return TextRangeKt.TextRange(max, min);
            }
            return TextRangeKt.TextRange(min, max);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @u3.m
        /* renamed from: mapToTransformed-xdX6-G0, reason: not valid java name */
        public final long m1151mapToTransformedxdX6G0(long j5, OffsetMappingCalculator offsetMappingCalculator) {
            long m1100mapFromSourcejx7JFs;
            long m1100mapFromSourcejx7JFs2 = offsetMappingCalculator.m1100mapFromSourcejx7JFs(TextRange.m5545getStartimpl(j5));
            if (TextRange.m5539getCollapsedimpl(j5)) {
                m1100mapFromSourcejx7JFs = m1100mapFromSourcejx7JFs2;
            } else {
                m1100mapFromSourcejx7JFs = offsetMappingCalculator.m1100mapFromSourcejx7JFs(TextRange.m5540getEndimpl(j5));
            }
            int min = Math.min(TextRange.m5543getMinimpl(m1100mapFromSourcejx7JFs2), TextRange.m5543getMinimpl(m1100mapFromSourcejx7JFs));
            int max = Math.max(TextRange.m5542getMaximpl(m1100mapFromSourcejx7JFs2), TextRange.m5542getMaximpl(m1100mapFromSourcejx7JFs));
            if (TextRange.m5544getReversedimpl(j5)) {
                return TextRangeKt.TextRange(max, min);
            }
            return TextRangeKt.TextRange(min, max);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "", "text", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "offsetMapping", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)V", "getOffsetMapping", "()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransformedText {

        @l
        private final OffsetMappingCalculator offsetMapping;

        @l
        private final TextFieldCharSequence text;

        public TransformedText(@l TextFieldCharSequence textFieldCharSequence, @l OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i5 & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        @l
        public final TextFieldCharSequence component1() {
            return this.text;
        }

        @l
        public final OffsetMappingCalculator component2() {
            return this.offsetMapping;
        }

        @l
        public final TransformedText copy(@l TextFieldCharSequence textFieldCharSequence, @l OffsetMappingCalculator offsetMappingCalculator) {
            return new TransformedText(textFieldCharSequence, offsetMappingCalculator);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return l0.g(this.text, transformedText.text) && l0.g(this.offsetMapping, transformedText.offsetMapping);
        }

        @l
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        @l
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        @l
        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    public TransformedTextFieldState(@l TextFieldState textFieldState, @m InputTransformation inputTransformation, @m CodepointTransformation codepointTransformation) {
        State<TransformedText> state;
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        if (codepointTransformation != null) {
            state = SnapshotStateKt.derivedStateOf(new TransformedTextFieldState$transformedText$1$1(this, codepointTransformation));
        } else {
            state = null;
        }
        this.transformedText = state;
    }

    @u3.m
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation);
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        lVar.invoke(textFieldState.getMainBuffer$foundation_release());
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, z4, textFieldEditUndoBehavior);
        }
    }

    @u3.m
    /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1139mapFromTransformedxdX6G0(long j5, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1150mapFromTransformedxdX6G0(j5, offsetMappingCalculator);
    }

    @u3.m
    /* renamed from: mapToTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1140mapToTransformedxdX6G0(long j5, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1151mapToTransformedxdX6G0(j5, offsetMappingCalculator);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z4, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z4, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-Sb-Bc2M$default, reason: not valid java name */
    public static /* synthetic */ void m1141replaceTextSbBc2M$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j5, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.m1145replaceTextSbBc2M(charSequence, j5, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(TextRange.m5540getEndimpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()), TextRange.m5540getEndimpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(TextRange.m5542getMaximpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()), TextRange.m5542getMaximpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectImeNotifications(@p4.l androidx.compose.foundation.text2.input.TextFieldState.NotifyImeListener r5, @p4.l kotlin.coroutines.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.text2.input.TextFieldState$NotifyImeListener r5 = (androidx.compose.foundation.text2.input.TextFieldState.NotifyImeListener) r5
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState r5 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) r5
            kotlin.e1.n(r6)
            goto L6d
        L39:
            kotlin.e1.n(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlinx.coroutines.q r6 = new kotlinx.coroutines.q
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)
            r6.<init>(r2, r3)
            r6.B()
            androidx.compose.foundation.text2.input.TextFieldState r2 = access$getTextFieldState$p(r4)
            r2.addNotifyImeListener$foundation_release(r5)
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r2 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r2.<init>(r4, r5)
            r6.g(r2)
            java.lang.Object r5 = r6.E()
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
            if (r5 != r6) goto L6a
            kotlin.coroutines.jvm.internal.h.c(r0)
        L6a:
            if (r5 != r1) goto L6d
            return r1
        L6d:
            kotlin.y r5 = new kotlin.y
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.collectImeNotifications(androidx.compose.foundation.text2.input.TextFieldState$NotifyImeListener, kotlin.coroutines.d):java.lang.Object");
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.delete(TextRange.m5543getMinimpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()), TextRange.m5542getMaximpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()));
        mainBuffer$foundation_release.setSelection(TextRange.m5543getMinimpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()), TextRange.m5543getMinimpl(mainBuffer$foundation_release.m1095getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    public final void editUntransformedTextAsUser(boolean z4, @l v3.l<? super EditingBuffer, r2> lVar) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        lVar.invoke(textFieldState.getMainBuffer$foundation_release());
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, z4, textFieldEditUndoBehavior);
        }
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (!l0.g(this.textFieldState, transformedTextFieldState.textFieldState)) {
            return false;
        }
        return l0.g(this.codepointTransformation, transformedTextFieldState.codepointTransformation);
    }

    @l
    public final TextFieldCharSequence getText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? this.textFieldState.getText() : text;
    }

    @l
    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getText();
    }

    public int hashCode() {
        int i5;
        int hashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        if (codepointTransformation != null) {
            i5 = codepointTransformation.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    public final int mapFromTransformed(int i5) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        if (state != null && (value = state.getValue()) != null && (offsetMapping = value.getOffsetMapping()) != null) {
            return TextRange.m5543getMinimpl(offsetMapping.m1099mapFromDestjx7JFs(i5));
        }
        return i5;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m1142mapFromTransformedGEjPoXI(long j5) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        if (state != null && (value = state.getValue()) != null && (offsetMapping = value.getOffsetMapping()) != null) {
            return Companion.m1150mapFromTransformedxdX6G0(j5, offsetMapping);
        }
        return j5;
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m1143mapToTransformedjx7JFs(int i5) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        if (state != null && (value = state.getValue()) != null && (offsetMapping = value.getOffsetMapping()) != null) {
            return offsetMapping.m1100mapFromSourcejx7JFs(i5);
        }
        return TextRangeKt.TextRange(i5);
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m1144mapToTransformedGEjPoXI(long j5) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        if (state != null && (value = state.getValue()) != null && (offsetMapping = value.getOffsetMapping()) != null) {
            return Companion.m1151mapToTransformedxdX6G0(j5, offsetMapping);
        }
        return j5;
    }

    public final void placeCursorBeforeCharAt(int i5) {
        m1146selectCharsIn5zctL8(TextRangeKt.TextRange(i5));
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public final void replaceAll(@l CharSequence charSequence) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        EditCommandKt.deleteAll(mainBuffer$foundation_release);
        EditCommandKt.commitText(mainBuffer$foundation_release, charSequence.toString(), 1);
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    public final void replaceSelectedText(@l CharSequence charSequence, boolean z4, @l TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        if (z4) {
            mainBuffer$foundation_release.commitComposition();
        }
        long m1095getSelectiond9O1mEE = mainBuffer$foundation_release.m1095getSelectiond9O1mEE();
        mainBuffer$foundation_release.replace(TextRange.m5543getMinimpl(m1095getSelectiond9O1mEE), TextRange.m5542getMaximpl(m1095getSelectiond9O1mEE), charSequence);
        int m5543getMinimpl = TextRange.m5543getMinimpl(m1095getSelectiond9O1mEE) + charSequence.length();
        mainBuffer$foundation_release.setSelection(m5543getMinimpl, m5543getMinimpl);
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    /* renamed from: replaceText-Sb-Bc2M, reason: not valid java name */
    public final void m1145replaceTextSbBc2M(@l CharSequence charSequence, long j5, @l TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        long m1142mapFromTransformedGEjPoXI = m1142mapFromTransformedGEjPoXI(j5);
        mainBuffer$foundation_release.replace(TextRange.m5543getMinimpl(m1142mapFromTransformedGEjPoXI), TextRange.m5542getMaximpl(m1142mapFromTransformedGEjPoXI), charSequence);
        int m5543getMinimpl = TextRange.m5543getMinimpl(m1142mapFromTransformedGEjPoXI) + charSequence.length();
        mainBuffer$foundation_release.setSelection(m5543getMinimpl, m5543getMinimpl);
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.setSelection(0, mainBuffer$foundation_release.getLength());
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1146selectCharsIn5zctL8(long j5) {
        m1147selectUntransformedCharsIn5zctL8(m1142mapFromTransformedGEjPoXI(j5));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1147selectUntransformedCharsIn5zctL8(long j5) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer$foundation_release().setSelection(TextRange.m5545getStartimpl(j5), TextRange.m5540getEndimpl(j5));
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            TextFieldState.access$commitEditAsUser(textFieldState, text, inputTransformation, true, textFieldEditUndoBehavior);
        }
    }

    @l
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", codepointTransformation=" + this.codepointTransformation + ", transformedText=" + this.transformedText + ", text=\"" + ((Object) getText()) + "\")";
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }
}
