package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004JB\u0010\u0018\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0002R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "Lkotlin/r2;", "updateCursorAnchorInfo", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "requestUpdate", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "invalidate", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "rootPositionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "lock", "Ljava/lang/Object;", "monitorEnabled", "Z", "hasPendingImmediateRequest", "Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "Lv3/l;", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "matrix", "[F", "Landroid/graphics/Matrix;", "androidMatrix", "Landroid/graphics/Matrix;", "<init>", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;

    @m
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;

    @m
    private Rect innerTextFieldBounds;

    @l
    private final InputMethodManager inputMethodManager;
    private boolean monitorEnabled;

    @m
    private OffsetMapping offsetMapping;

    @l
    private final PositionCalculator rootPositionCalculator;

    @m
    private TextFieldValue textFieldValue;

    @m
    private TextLayoutResult textLayoutResult;

    @l
    private final Object lock = new Object();

    @l
    private v3.l<? super Matrix, r2> textFieldToRootTransform = CursorAnchorInfoController$textFieldToRootTransform$1.INSTANCE;

    @l
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    @l
    private final float[] matrix = Matrix.m3964constructorimpl$default(null, 1, null);

    @l
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(@l PositionCalculator positionCalculator, @l InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = positionCalculator;
        this.inputMethodManager = inputMethodManager;
    }

    private final void updateCursorAnchorInfo() {
        if (!this.inputMethodManager.isActive()) {
            return;
        }
        this.textFieldToRootTransform.invoke(Matrix.m3962boximpl(this.matrix));
        this.rootPositionCalculator.mo4953localToScreen58bKbWc(this.matrix);
        AndroidMatrixConversions_androidKt.m3604setFromEL8BTi8(this.androidMatrix, this.matrix);
        InputMethodManager inputMethodManager = this.inputMethodManager;
        CursorAnchorInfo.Builder builder = this.builder;
        TextFieldValue textFieldValue = this.textFieldValue;
        l0.m(textFieldValue);
        OffsetMapping offsetMapping = this.offsetMapping;
        l0.m(offsetMapping);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        l0.m(textLayoutResult);
        android.graphics.Matrix matrix = this.androidMatrix;
        Rect rect = this.innerTextFieldBounds;
        l0.m(rect);
        Rect rect2 = this.decorationBoxBounds;
        l0.m(rect2);
        inputMethodManager.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = CursorAnchorInfoController$invalidate$1$1.INSTANCE;
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            r2 r2Var = r2.f19517a;
        }
    }

    public final void requestUpdate(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        synchronized (this.lock) {
            this.includeInsertionMarker = z6;
            this.includeCharacterBounds = z7;
            this.includeEditorBounds = z8;
            this.includeLineBounds = z9;
            if (z4) {
                this.hasPendingImmediateRequest = true;
                if (this.textFieldValue != null) {
                    updateCursorAnchorInfo();
                }
            }
            this.monitorEnabled = z5;
            r2 r2Var = r2.f19517a;
        }
    }

    public final void updateTextLayoutResult(@l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @l TextLayoutResult textLayoutResult, @l v3.l<? super Matrix, r2> lVar, @l Rect rect, @l Rect rect2) {
        synchronized (this.lock) {
            this.textFieldValue = textFieldValue;
            this.offsetMapping = offsetMapping;
            this.textLayoutResult = textLayoutResult;
            this.textFieldToRootTransform = lVar;
            this.innerTextFieldBounds = rect;
            this.decorationBoxBounds = rect2;
            if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                updateCursorAnchorInfo();
            }
            r2 r2Var = r2.f19517a;
        }
    }
}
