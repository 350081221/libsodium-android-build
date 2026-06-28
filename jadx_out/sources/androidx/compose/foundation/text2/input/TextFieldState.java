package androidx.compose.foundation.text2.input;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.foundation.text2.input.TextUndoManager;
import androidx.compose.foundation.text2.input.internal.EditingBuffer;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@Stable
@i0(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002RSB!\b\u0000\u0012\u0006\u0010K\u001a\u00020\u0018\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010N\u001a\u00020.¢\u0006\u0004\bO\u0010PB\u001d\b\u0016\u0012\b\b\u0002\u0010K\u001a\u00020\u0018\u0012\b\b\u0002\u0010M\u001a\u00020L¢\u0006\u0004\bO\u0010QJ*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\"\u0010\u0017\u001a\u00020\n2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\u0015H\u0086\bJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0002H\u0001J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0014H\u0001JG\u0010 \u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\u0015H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\n2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\u0015H\u0080\b¢\u0006\u0004\b!\u0010\"J\u0017\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b)\u0010'J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u00103\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010:\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u0010A\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010,R \u0010C\u001a\u00020B8GX\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010:\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020$0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006T"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldState;", "", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "previousValue", "Landroidx/compose/foundation/text2/input/InputTransformation;", "inputTransformation", "", "notifyImeOfChanges", "Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "Lkotlin/r2;", "commitEditAsUser", "postValue", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "changes", "recordEditForUndo", "oldValue", "newValue", "notifyIme", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "Lkotlin/u;", "block", "edit", "", "toString", b.f22420d, "startEdit", "commitEdit", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "editAsUser$foundation_release", "(Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;Lv3/l;)V", "editAsUser", "editWithNoSideEffects$foundation_release", "(Lv3/l;)V", "editWithNoSideEffects", "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "addNotifyImeListener$foundation_release", "(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;)V", "addNotifyImeListener", "removeNotifyImeListener$foundation_release", "removeNotifyImeListener", "resetStateAndNotifyIme$foundation_release", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V", "resetStateAndNotifyIme", "Landroidx/compose/foundation/text2/input/TextUndoManager;", "textUndoManager", "Landroidx/compose/foundation/text2/input/TextUndoManager;", "getTextUndoManager$foundation_release", "()Landroidx/compose/foundation/text2/input/TextUndoManager;", "mainBuffer", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "getMainBuffer$foundation_release", "()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "setMainBuffer$foundation_release", "(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;)V", "getMainBuffer$foundation_release$annotations", "()V", "<set-?>", "text$delegate", "Landroidx/compose/runtime/MutableState;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "setText", "text", "Landroidx/compose/foundation/text2/input/UndoState;", "undoState", "Landroidx/compose/foundation/text2/input/UndoState;", "getUndoState", "()Landroidx/compose/foundation/text2/input/UndoState;", "getUndoState$annotations", "Landroidx/compose/runtime/collection/MutableVector;", "notifyImeListeners", "Landroidx/compose/runtime/collection/MutableVector;", "initialText", "Landroidx/compose/ui/text/TextRange;", "initialSelectionInChars", "initialTextUndoManager", "<init>", "(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/TextUndoManager;Lkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "NotifyImeListener", "Saver", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,569:1\n1208#2:570\n1187#2,2:571\n81#3:573\n107#3,2:574\n460#4,11:576\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n406#1:570\n406#1:571,2\n107#1:573\n107#1:574,2\n412#1:576,11\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 0;

    @l
    private EditingBuffer mainBuffer;

    @l
    private final MutableVector<NotifyImeListener> notifyImeListeners;

    @l
    private final MutableState text$delegate;

    @l
    private final TextUndoManager textUndoManager;

    @l
    private final UndoState undoState;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;", "", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "oldValue", "newValue", "Lkotlin/r2;", "onChange", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface NotifyImeListener {
        void onChange(@l TextFieldCharSequence textFieldCharSequence, @l TextFieldCharSequence textFieldCharSequence2);
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldState$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text2/input/TextFieldState;", "", "()V", "restore", b.f22420d, "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;

        @l
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        @Override // androidx.compose.runtime.saveable.Saver
        @m
        public TextFieldState restore(@l Object obj) {
            l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            l0.n(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            l0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            l0.n(obj4, "null cannot be cast to non-null type kotlin.Int");
            long TextRange = TextRangeKt.TextRange(intValue, ((Integer) obj4).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            l0.m(obj5);
            TextUndoManager restore = saver.restore(obj5);
            l0.m(restore);
            return new TextFieldState(str, TextRange, restore, (w) null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        @m
        public Object save(@l SaverScope saverScope, @l TextFieldState textFieldState) {
            List L;
            L = kotlin.collections.w.L(textFieldState.getText().toString(), Integer.valueOf(TextRange.m5545getStartimpl(textFieldState.getText().mo1076getSelectionInCharsd9O1mEE())), Integer.valueOf(TextRange.m5540getEndimpl(textFieldState.getText().mo1076getSelectionInCharsd9O1mEE())), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager$foundation_release()));
            return L;
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldState(String str, long j5, TextUndoManager textUndoManager) {
        MutableState mutableStateOf$default;
        this.textUndoManager = textUndoManager;
        this.mainBuffer = new EditingBuffer(str, TextRangeKt.m5551coerceIn8ffj60Q(j5, 0, str.length()), (w) null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextFieldCharSequenceKt.m1079TextFieldCharSequenceFDrldGo(str, j5), null, 2, null);
        this.text$delegate = mutableStateOf$default;
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    public /* synthetic */ TextFieldState(String str, long j5, TextUndoManager textUndoManager, w wVar) {
        this(str, j5, textUndoManager);
    }

    public /* synthetic */ TextFieldState(String str, long j5, w wVar) {
        this(str, j5);
    }

    public static final /* synthetic */ void access$commitEditAsUser(TextFieldState textFieldState, TextFieldCharSequence textFieldCharSequence, InputTransformation inputTransformation, boolean z4, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        textFieldState.commitEditAsUser(textFieldCharSequence, inputTransformation, z4, textFieldEditUndoBehavior);
    }

    public final void commitEditAsUser(TextFieldCharSequence textFieldCharSequence, InputTransformation inputTransformation, boolean z4, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldCharSequence m1077TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(this.mainBuffer.toString(), this.mainBuffer.m1095getSelectiond9O1mEE(), this.mainBuffer.m1094getCompositionMzsxiRA());
        if (inputTransformation == null) {
            TextFieldCharSequence text = getText();
            setText(m1077TextFieldCharSequence3r_uNRQ);
            if (z4) {
                notifyIme(text, m1077TextFieldCharSequence3r_uNRQ);
            }
            recordEditForUndo(textFieldCharSequence, getText(), this.mainBuffer.getChangeTracker(), textFieldEditUndoBehavior);
            return;
        }
        TextFieldCharSequence text2 = getText();
        if (m1077TextFieldCharSequence3r_uNRQ.contentEquals(text2) && TextRange.m5538equalsimpl0(m1077TextFieldCharSequence3r_uNRQ.mo1076getSelectionInCharsd9O1mEE(), text2.mo1076getSelectionInCharsd9O1mEE())) {
            setText(m1077TextFieldCharSequence3r_uNRQ);
            if (z4) {
                notifyIme(text2, m1077TextFieldCharSequence3r_uNRQ);
                return;
            }
            return;
        }
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(m1077TextFieldCharSequence3r_uNRQ, this.mainBuffer.getChangeTracker(), text2);
        inputTransformation.transformInput(text2, textFieldBuffer);
        TextFieldCharSequence m1074toTextFieldCharSequenceOEnZFl4$foundation_release = textFieldBuffer.m1074toTextFieldCharSequenceOEnZFl4$foundation_release(m1077TextFieldCharSequence3r_uNRQ.mo1075getCompositionInCharsMzsxiRA());
        if (l0.g(m1074toTextFieldCharSequenceOEnZFl4$foundation_release, m1077TextFieldCharSequence3r_uNRQ)) {
            setText(m1074toTextFieldCharSequenceOEnZFl4$foundation_release);
            if (z4) {
                notifyIme(text2, m1077TextFieldCharSequence3r_uNRQ);
            }
        } else {
            resetStateAndNotifyIme$foundation_release(m1074toTextFieldCharSequenceOEnZFl4$foundation_release);
        }
        recordEditForUndo(textFieldCharSequence, getText(), textFieldBuffer.getChanges(), textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z4, TextFieldEditUndoBehavior textFieldEditUndoBehavior, v3.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        lVar.invoke(textFieldState.getMainBuffer$foundation_release());
        if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() == 0 && TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) && l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, z4, textFieldEditUndoBehavior);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getUndoState$annotations() {
    }

    public final void notifyIme(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2) {
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            NotifyImeListener[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                content[i5].onChange(textFieldCharSequence, textFieldCharSequence2);
                i5++;
            } while (i5 < size);
        }
    }

    private final void recordEditForUndo(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[textFieldEditUndoBehavior.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, false);
                    return;
                }
                return;
            }
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, true);
            return;
        }
        this.textUndoManager.clearHistory();
    }

    public final void setText(TextFieldCharSequence textFieldCharSequence) {
        this.text$delegate.setValue(textFieldCharSequence);
    }

    public final void addNotifyImeListener$foundation_release(@l NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    @a1
    public final void commitEdit(@l TextFieldBuffer textFieldBuffer) {
        boolean z4;
        if (textFieldBuffer.getChanges().getChangeCount() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = !TextRange.m5538equalsimpl0(textFieldBuffer.m1070getSelectionInCharsd9O1mEE(), this.mainBuffer.m1095getSelectiond9O1mEE());
        if (z4 || z5) {
            resetStateAndNotifyIme$foundation_release(TextFieldBuffer.m1069toTextFieldCharSequenceOEnZFl4$foundation_release$default(textFieldBuffer, null, 1, null));
        }
        this.textUndoManager.clearHistory();
    }

    public final void edit(@l v3.l<? super TextFieldBuffer, r2> lVar) {
        TextFieldBuffer startEdit = startEdit(getText());
        lVar.invoke(startEdit);
        commitEdit(startEdit);
    }

    public final void editAsUser$foundation_release(@m InputTransformation inputTransformation, boolean z4, @l TextFieldEditUndoBehavior textFieldEditUndoBehavior, @l v3.l<? super EditingBuffer, r2> lVar) {
        TextFieldCharSequence text = getText();
        getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        lVar.invoke(getMainBuffer$foundation_release());
        if (getMainBuffer$foundation_release().getChangeTracker().getChangeCount() == 0 && TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) && l0.g(text.mo1075getCompositionInCharsMzsxiRA(), getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
            return;
        }
        commitEditAsUser(text, inputTransformation, z4, textFieldEditUndoBehavior);
    }

    public final void editWithNoSideEffects$foundation_release(@l v3.l<? super EditingBuffer, r2> lVar) {
        TextFieldCharSequence text = getText();
        getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        lVar.invoke(getMainBuffer$foundation_release());
        TextFieldCharSequence m1077TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(getMainBuffer$foundation_release().toString(), getMainBuffer$foundation_release().m1095getSelectiond9O1mEE(), getMainBuffer$foundation_release().m1094getCompositionMzsxiRA());
        setText(m1077TextFieldCharSequence3r_uNRQ);
        notifyIme(text, m1077TextFieldCharSequence3r_uNRQ);
    }

    @l
    public final EditingBuffer getMainBuffer$foundation_release() {
        return this.mainBuffer;
    }

    @l
    public final TextFieldCharSequence getText() {
        return (TextFieldCharSequence) this.text$delegate.getValue();
    }

    @l
    public final TextUndoManager getTextUndoManager$foundation_release() {
        return this.textUndoManager;
    }

    @l
    @ExperimentalFoundationApi
    public final UndoState getUndoState() {
        return this.undoState;
    }

    public final void removeNotifyImeListener$foundation_release(@l NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    @VisibleForTesting
    public final void resetStateAndNotifyIme$foundation_release(@l TextFieldCharSequence textFieldCharSequence) {
        TextFieldCharSequence m1077TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(this.mainBuffer.toString(), this.mainBuffer.m1095getSelectiond9O1mEE(), this.mainBuffer.m1094getCompositionMzsxiRA());
        boolean z4 = true;
        boolean z5 = !l0.g(textFieldCharSequence.mo1075getCompositionInCharsMzsxiRA(), this.mainBuffer.m1094getCompositionMzsxiRA());
        boolean z6 = false;
        if (!m1077TextFieldCharSequence3r_uNRQ.contentEquals(textFieldCharSequence)) {
            this.mainBuffer = new EditingBuffer(textFieldCharSequence.toString(), textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE(), (w) null);
        } else if (!TextRange.m5538equalsimpl0(m1077TextFieldCharSequence3r_uNRQ.mo1076getSelectionInCharsd9O1mEE(), textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE())) {
            this.mainBuffer.setSelection(TextRange.m5545getStartimpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()), TextRange.m5540getEndimpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()));
            z6 = true;
            z4 = false;
        } else {
            z4 = false;
        }
        TextRange mo1075getCompositionInCharsMzsxiRA = textFieldCharSequence.mo1075getCompositionInCharsMzsxiRA();
        if (mo1075getCompositionInCharsMzsxiRA != null && !TextRange.m5539getCollapsedimpl(mo1075getCompositionInCharsMzsxiRA.m5549unboximpl())) {
            this.mainBuffer.setComposition(TextRange.m5543getMinimpl(mo1075getCompositionInCharsMzsxiRA.m5549unboximpl()), TextRange.m5542getMaximpl(mo1075getCompositionInCharsMzsxiRA.m5549unboximpl()));
        } else {
            this.mainBuffer.commitComposition();
        }
        if (z4 || (!z6 && z5)) {
            this.mainBuffer.commitComposition();
        }
        if (!z4) {
            textFieldCharSequence = m1077TextFieldCharSequence3r_uNRQ;
        }
        TextFieldCharSequence m1077TextFieldCharSequence3r_uNRQ2 = TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(textFieldCharSequence, this.mainBuffer.m1095getSelectiond9O1mEE(), this.mainBuffer.m1094getCompositionMzsxiRA());
        setText(m1077TextFieldCharSequence3r_uNRQ2);
        notifyIme(m1077TextFieldCharSequence3r_uNRQ, m1077TextFieldCharSequence3r_uNRQ2);
    }

    public final void setMainBuffer$foundation_release(@l EditingBuffer editingBuffer) {
        this.mainBuffer = editingBuffer;
    }

    @l
    @a1
    public final TextFieldBuffer startEdit(@l TextFieldCharSequence textFieldCharSequence) {
        return new TextFieldBuffer(textFieldCharSequence, null, null, 6, null);
    }

    @l
    public String toString() {
        return "TextFieldState(selectionInChars=" + ((Object) TextRange.m5548toStringimpl(getText().mo1076getSelectionInCharsd9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextFieldState(java.lang.String r1, long r2, int r4, kotlin.jvm.internal.w r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto L12
            int r2 = r1.length()
            long r2 = androidx.compose.ui.text.TextRangeKt.TextRange(r2)
        L12:
            r4 = 0
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.TextFieldState.<init>(java.lang.String, long, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j5) {
        this(str, j5, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (w) null);
    }
}
