package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "", "", "index", "I", "getIndex", "()I", "", "preText", "Ljava/lang/String;", "getPreText", "()Ljava/lang/String;", "postText", "getPostText", "Landroidx/compose/ui/text/TextRange;", "preSelection", "J", "getPreSelection-d9O1mEE", "()J", "postSelection", "getPostSelection-d9O1mEE", "", "timeInMillis", "getTimeInMillis", "", "canMerge", "Z", "getCanMerge", "()Z", "Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;", "textEditType", "Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;", "getTextEditType", "()Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;", "Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;", "getDeletionType", "()Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;", "deletionType", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/w;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextUndoOperation {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Saver<TextUndoOperation, Object> Saver = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation$Companion$Saver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        @l
        public TextUndoOperation restore(@l Object obj) {
            l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            l0.n(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            l0.n(obj4, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj4;
            Object obj5 = list.get(3);
            l0.n(obj5, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            l0.n(obj6, "null cannot be cast to non-null type kotlin.Int");
            long TextRange = TextRangeKt.TextRange(intValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            l0.n(obj7, "null cannot be cast to non-null type kotlin.Int");
            int intValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            l0.n(obj8, "null cannot be cast to non-null type kotlin.Int");
            long TextRange2 = TextRangeKt.TextRange(intValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            l0.n(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new TextUndoOperation(intValue, str, str2, TextRange, TextRange2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        @l
        public Object save(@l SaverScope saverScope, @l TextUndoOperation textUndoOperation) {
            List L;
            L = w.L(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.m5545getStartimpl(textUndoOperation.m1190getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m5540getEndimpl(textUndoOperation.m1190getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m5545getStartimpl(textUndoOperation.m1189getPostSelectiond9O1mEE())), Integer.valueOf(TextRange.m5540getEndimpl(textUndoOperation.m1189getPostSelectiond9O1mEE())), Long.valueOf(textUndoOperation.getTimeInMillis()));
            return L;
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;

    @l
    private final String postText;
    private final long preSelection;

    @l
    private final String preText;

    @l
    private final TextEditType textEditType;
    private final long timeInMillis;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @l
        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.Saver;
        }
    }

    private TextUndoOperation(int i5, String str, String str2, long j5, long j6, long j7, boolean z4) {
        TextEditType textEditType;
        this.index = i5;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j5;
        this.postSelection = j6;
        this.timeInMillis = j7;
        this.canMerge = z4;
        if (str.length() == 0) {
            if (str2.length() == 0) {
                throw new IllegalArgumentException("Either pre or post text must not be empty");
            }
        }
        if (str.length() == 0) {
            if (str2.length() > 0) {
                textEditType = TextEditType.Insert;
                this.textEditType = textEditType;
            }
        }
        if (str.length() > 0) {
            if (str2.length() == 0) {
                textEditType = TextEditType.Delete;
                this.textEditType = textEditType;
            }
        }
        textEditType = TextEditType.Replace;
        this.textEditType = textEditType;
    }

    public /* synthetic */ TextUndoOperation(int i5, String str, String str2, long j5, long j6, long j7, boolean z4, kotlin.jvm.internal.w wVar) {
        this(i5, str, str2, j5, j6, j7, z4);
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    @l
    public final TextDeleteType getDeletionType() {
        if (this.textEditType != TextEditType.Delete) {
            return TextDeleteType.NotByUser;
        }
        if (!TextRange.m5539getCollapsedimpl(this.postSelection)) {
            return TextDeleteType.NotByUser;
        }
        if (TextRange.m5539getCollapsedimpl(this.preSelection)) {
            if (TextRange.m5545getStartimpl(this.preSelection) > TextRange.m5545getStartimpl(this.postSelection)) {
                return TextDeleteType.Start;
            }
            return TextDeleteType.End;
        }
        if (TextRange.m5545getStartimpl(this.preSelection) == TextRange.m5545getStartimpl(this.postSelection) && TextRange.m5545getStartimpl(this.preSelection) == this.index) {
            return TextDeleteType.Inner;
        }
        return TextDeleteType.NotByUser;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m1189getPostSelectiond9O1mEE() {
        return this.postSelection;
    }

    @l
    public final String getPostText() {
        return this.postText;
    }

    /* renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m1190getPreSelectiond9O1mEE() {
        return this.preSelection;
    }

    @l
    public final String getPreText() {
        return this.preText;
    }

    @l
    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    public /* synthetic */ TextUndoOperation(int i5, String str, String str2, long j5, long j6, long j7, boolean z4, int i6, kotlin.jvm.internal.w wVar) {
        this(i5, str, str2, j5, j6, (i6 & 32) != 0 ? UndoManager_jvmKt.timeNowMillis() : j7, (i6 & 64) != 0 ? true : z4, null);
    }
}
