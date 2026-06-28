package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001_B)\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u00104\u001a\u000203\u0012\b\b\u0002\u00107\u001a\u000206¢\u0006\u0004\b[\u0010\\B\u0019\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010]\u001a\u00020Y¢\u0006\u0004\b[\u0010^J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\bJF\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00040\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0017JD\u0010-\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020!H\u0016R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R(\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00040\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010;R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010;R$\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00108\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010AR\"\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006`"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "command", "Lkotlin/r2;", "sendInputCommand", "processInputCommands", "restartInputImmediately", "", "visible", "setKeyboardVisibleImmediately", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "isEditorFocused", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "oldValue", "newValue", "updateState", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "Ljava/util/concurrent/Executor;", "editorHasFocus", "Z", "Lv3/l;", "<set-?>", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/ImeOptions;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "ics", "Ljava/util/List;", "Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/d0;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "cursorAnchorInfoController", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "Landroidx/compose/runtime/collection/MutableVector;", "textInputCommandQueue", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/Runnable;", "frameCallback", "Ljava/lang/Runnable;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "rootPositionCalculator", "<init>", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PositionCalculator;)V", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,570:1\n1208#2:571\n1187#2,2:572\n728#3,2:574\n460#3,11:577\n1#4:576\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n113#1:571\n113#1:572,2\n257#1:574,2\n321#1:577,11\n*E\n"})
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;

    @l
    private final d0 baseInputConnection$delegate;

    @l
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;

    @m
    private Rect focusedRect;

    @m
    private Runnable frameCallback;

    @l
    private List<WeakReference<RecordingInputConnection>> ics;

    @l
    private ImeOptions imeOptions;

    @l
    private final Executor inputCommandProcessorExecutor;

    @l
    private final InputMethodManager inputMethodManager;

    @l
    private v3.l<? super List<? extends EditCommand>, r2> onEditCommand;

    @l
    private v3.l<? super ImeAction, r2> onImeActionPerformed;

    @l
    private TextFieldValue state;

    @l
    private final MutableVector<TextInputCommand> textInputCommandQueue;

    @l
    private final View view;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(@l View view, @l PositionCalculator positionCalculator, @l InputMethodManager inputMethodManager, @l Executor executor) {
        d0 b5;
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m5550getZerod9O1mEE(), (TextRange) null, 4, (w) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        b5 = f0.b(h0.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.baseInputConnection$delegate = b5;
        this.cursorAnchorInfoController = new CursorAnchorInfoController(positionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processInputCommands() {
        k1.h hVar = new k1.h();
        k1.h hVar2 = new k1.h();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        int size = mutableVector.getSize();
        if (size > 0) {
            TextInputCommand[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                processInputCommands$applyToState(content[i5], hVar, hVar2);
                i5++;
            } while (i5 < size);
        }
        this.textInputCommandQueue.clear();
        if (l0.g(hVar.element, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) hVar2.element;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (l0.g(hVar.element, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, k1.h<Boolean> hVar, k1.h<Boolean> hVar2) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        boolean z4 = true;
        if (i5 != 1) {
            if (i5 != 2) {
                if ((i5 == 3 || i5 == 4) && !l0.g(hVar.element, Boolean.FALSE)) {
                    if (textInputCommand != TextInputCommand.ShowKeyboard) {
                        z4 = false;
                    }
                    hVar2.element = Boolean.valueOf(z4);
                    return;
                }
                return;
            }
            ?? r32 = Boolean.FALSE;
            hVar.element = r32;
            hVar2.element = r32;
            return;
        }
        ?? r33 = Boolean.TRUE;
        hVar.element = r33;
        hVar2.element = r33;
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.b
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$1(TextInputServiceAndroid.this);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z4) {
        if (z4) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    @m
    public final InputConnection createInputConnection(@l EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(@l RecordingInputConnection recordingInputConnection2) {
                List list;
                List list2;
                List list3;
                list = TextInputServiceAndroid.this.ics;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    list2 = TextInputServiceAndroid.this.ics;
                    if (l0.g(((WeakReference) list2.get(i5)).get(), recordingInputConnection2)) {
                        list3 = TextInputServiceAndroid.this.ics;
                        list3.remove(i5);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(@l List<? extends EditCommand> list) {
                v3.l lVar;
                lVar = TextInputServiceAndroid.this.onEditCommand;
                lVar.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo5737onImeActionKlQnJC8(int i5) {
                v3.l lVar;
                lVar = TextInputServiceAndroid.this.onImeActionPerformed;
                lVar.invoke(ImeAction.m5706boximpl(i5));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(@l KeyEvent keyEvent) {
                BaseInputConnection baseInputConnection;
                baseInputConnection = TextInputServiceAndroid.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
                CursorAnchorInfoController cursorAnchorInfoController;
                cursorAnchorInfoController = TextInputServiceAndroid.this.cursorAnchorInfoController;
                cursorAnchorInfoController.requestUpdate(z4, z5, z6, z7, z8, z9);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    @l
    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    @l
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @k(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(@l androidx.compose.ui.geometry.Rect rect) {
        int L0;
        int L02;
        int L03;
        int L04;
        Rect rect2;
        L0 = kotlin.math.d.L0(rect.getLeft());
        L02 = kotlin.math.d.L0(rect.getTop());
        L03 = kotlin.math.d.L0(rect.getRight());
        L04 = kotlin.math.d.L0(rect.getBottom());
        this.focusedRect = new Rect(L0, L02, L03, L04);
        if (this.ics.isEmpty() && (rect2 = this.focusedRect) != null) {
            this.view.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@l TextFieldValue textFieldValue, @l ImeOptions imeOptions, @l v3.l<? super List<? extends EditCommand>, r2> lVar, @l v3.l<? super ImeAction, r2> lVar2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = lVar;
        this.onImeActionPerformed = lVar2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$stopInput$2.INSTANCE;
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@m TextFieldValue textFieldValue, @l TextFieldValue textFieldValue2) {
        boolean z4;
        int i5;
        boolean z5 = true;
        if (TextRange.m5538equalsimpl0(this.state.m5783getSelectiond9O1mEE(), textFieldValue2.m5783getSelectiond9O1mEE()) && l0.g(this.state.m5782getCompositionMzsxiRA(), textFieldValue2.m5782getCompositionMzsxiRA())) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i6 = 0; i6 < size; i6++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i6).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (l0.g(textFieldValue, textFieldValue2)) {
            if (z4) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int m5543getMinimpl = TextRange.m5543getMinimpl(textFieldValue2.m5783getSelectiond9O1mEE());
                int m5542getMaximpl = TextRange.m5542getMaximpl(textFieldValue2.m5783getSelectiond9O1mEE());
                TextRange m5782getCompositionMzsxiRA = this.state.m5782getCompositionMzsxiRA();
                int i7 = -1;
                if (m5782getCompositionMzsxiRA != null) {
                    i5 = TextRange.m5543getMinimpl(m5782getCompositionMzsxiRA.m5549unboximpl());
                } else {
                    i5 = -1;
                }
                TextRange m5782getCompositionMzsxiRA2 = this.state.m5782getCompositionMzsxiRA();
                if (m5782getCompositionMzsxiRA2 != null) {
                    i7 = TextRange.m5542getMaximpl(m5782getCompositionMzsxiRA2.m5549unboximpl());
                }
                inputMethodManager.updateSelection(m5543getMinimpl, m5542getMaximpl, i5, i7);
                return;
            }
            return;
        }
        if (textFieldValue == null || (l0.g(textFieldValue.getText(), textFieldValue2.getText()) && (!TextRange.m5538equalsimpl0(textFieldValue.m5783getSelectiond9O1mEE(), textFieldValue2.m5783getSelectiond9O1mEE()) || l0.g(textFieldValue.m5782getCompositionMzsxiRA(), textFieldValue2.m5782getCompositionMzsxiRA())))) {
            z5 = false;
        }
        if (z5) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i8 = 0; i8 < size2; i8++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i8).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(@l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @l TextLayoutResult textLayoutResult, @l v3.l<? super Matrix, r2> lVar, @l androidx.compose.ui.geometry.Rect rect, @l androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, lVar, rect, rect2);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, PositionCalculator positionCalculator, InputMethodManager inputMethodManager, Executor executor, int i5, w wVar) {
        this(view, positionCalculator, inputMethodManager, (i5 & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(@l View view, @l PositionCalculator positionCalculator) {
        this(view, positionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
