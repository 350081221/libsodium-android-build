package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082\bJ\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJB\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bJ\u0018\u0010\u0019\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0005R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "Lkotlin/Function0;", "Lkotlin/r2;", "block", "", "ensureOpenSession", "dispose", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "oldValue", "newValue", "updateState", "showSoftwareKeyboard", "hideSoftwareKeyboard", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "isOpen", "()Z", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,365:1\n171#1,5:366\n171#1,5:371\n171#1,5:376\n171#1,5:381\n171#1,5:386\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n190#1:366,5\n214#1:371,5\n243#1:376,5\n263#1:381,5\n280#1:386,5\n*E\n"})
/* loaded from: classes.dex */
public final class TextInputSession {
    public static final int $stable = 8;

    @l
    private final PlatformTextInputService platformTextInputService;

    @l
    private final TextInputService textInputService;

    public TextInputSession(@l TextInputService textInputService, @l PlatformTextInputService platformTextInputService) {
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    private final boolean ensureOpenSession(v3.a<r2> aVar) {
        boolean isOpen = isOpen();
        if (isOpen) {
            aVar.invoke();
        }
        return isOpen;
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean isOpen() {
        return l0.g(this.textInputService.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(@l Rect rect) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.notifyFocusedRect(rect);
        }
        return isOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean updateState(@m TextFieldValue textFieldValue, @l TextFieldValue textFieldValue2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateState(textFieldValue, textFieldValue2);
        }
        return isOpen;
    }

    public final boolean updateTextLayoutResult(@l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @l TextLayoutResult textLayoutResult, @l v3.l<? super Matrix, r2> lVar, @l Rect rect, @l Rect rect2) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, lVar, rect, rect2);
        }
        return isOpen;
    }
}
