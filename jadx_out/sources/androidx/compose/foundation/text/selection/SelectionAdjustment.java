package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SelectionAdjustment {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "()V", "Character", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getCharacter", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate", "None", "getNone", "Paragraph", "getParagraph", "Word", "getWord", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection None$lambda$0;
                None$lambda$0 = SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
                return None$lambda$0;
            }
        };

        @l
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.b
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection Character$lambda$1;
                Character$lambda$1 = SelectionAdjustment.Companion.Character$lambda$1(selectionLayout);
                return Character$lambda$1;
            }
        };

        @l
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.c
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection Word$lambda$2;
                Word$lambda$2 = SelectionAdjustment.Companion.Word$lambda$2(selectionLayout);
                return Word$lambda$2;
            }
        };

        @l
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.d
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection Paragraph$lambda$3;
                Paragraph$lambda$3 = SelectionAdjustment.Companion.Paragraph$lambda$3(selectionLayout);
                return Paragraph$lambda$3;
            }
        };

        @l
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.e
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public final Selection adjust(SelectionLayout selectionLayout) {
                Selection CharacterWithWordAccelerate$lambda$4;
                CharacterWithWordAccelerate$lambda$4 = SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$4(selectionLayout);
                return CharacterWithWordAccelerate$lambda$4;
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Character$lambda$1(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.ensureAtLeastOneChar(None.adjust(selectionLayout), selectionLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection CharacterWithWordAccelerate$lambda$4(SelectionLayout selectionLayout) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo access$updateSelectionBoundary;
            Selection.AnchorInfo start;
            Selection.AnchorInfo anchorInfo;
            boolean z4;
            Selection previousSelection = selectionLayout.getPreviousSelection();
            if (previousSelection == null) {
                return Word.adjust(selectionLayout);
            }
            if (selectionLayout.isStartHandle()) {
                end = previousSelection.getStart();
                access$updateSelectionBoundary = SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getStartInfo(), end);
                anchorInfo = previousSelection.getEnd();
                start = access$updateSelectionBoundary;
            } else {
                end = previousSelection.getEnd();
                access$updateSelectionBoundary = SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getEndInfo(), end);
                start = previousSelection.getStart();
                anchorInfo = access$updateSelectionBoundary;
            }
            if (!l0.g(access$updateSelectionBoundary, end)) {
                if (selectionLayout.getCrossStatus() != CrossStatus.CROSSED && (selectionLayout.getCrossStatus() != CrossStatus.COLLAPSED || start.getOffset() <= anchorInfo.getOffset())) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                return SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(start, anchorInfo, z4), selectionLayout);
            }
            return previousSelection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection None$lambda$0(SelectionLayout selectionLayout) {
            boolean z4;
            Selection.AnchorInfo anchorForOffset = selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().getRawStartHandleOffset());
            Selection.AnchorInfo anchorForOffset2 = selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().getRawEndHandleOffset());
            if (selectionLayout.getCrossStatus() == CrossStatus.CROSSED) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new Selection(anchorForOffset, anchorForOffset2, z4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Paragraph$lambda$3(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo978getBoundaryfzxv0v0(@l SelectableInfo selectableInfo, int i5) {
                    return StringHelpersKt.getParagraphBoundary(selectableInfo.getInputText(), i5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Selection Word$lambda$2(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout, new BoundaryFunction() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1$1
                @Override // androidx.compose.foundation.text.selection.BoundaryFunction
                /* renamed from: getBoundary-fzxv0v0 */
                public final long mo978getBoundaryfzxv0v0(@l SelectableInfo selectableInfo, int i5) {
                    return selectableInfo.getTextLayoutResult().m5519getWordBoundaryjx7JFs(i5);
                }
            });
        }

        @l
        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        @l
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        @l
        public final SelectionAdjustment getNone() {
            return None;
        }

        @l
        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        @l
        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    @l
    Selection adjust(@l SelectionLayout selectionLayout);
}
