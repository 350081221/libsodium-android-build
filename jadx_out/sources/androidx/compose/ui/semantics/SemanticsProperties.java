package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bY\u0010(R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0006\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\bR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00030\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020:0\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020 0\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR)\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020S0R0\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR \u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\bW\u0010(\u001a\u0004\bV\u0010\b¨\u0006Z"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "ContentDescription", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "StateDescription", "getStateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ProgressBarRangeInfo", "getProgressBarRangeInfo", "PaneTitle", "getPaneTitle", "Lkotlin/r2;", "SelectableGroup", "getSelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", "CollectionInfo", "getCollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "CollectionItemInfo", "getCollectionItemInfo", "Heading", "getHeading", "Disabled", "getDisabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", "LiveRegion", "getLiveRegion", "", "Focused", "getFocused", "IsTraversalGroup", "getIsTraversalGroup", "InvisibleToUser", "getInvisibleToUser", "getInvisibleToUser$annotations", "()V", "", "TraversalIndex", "getTraversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "HorizontalScrollAxisRange", "getHorizontalScrollAxisRange", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "IsPopup", "getIsPopup", "IsDialog", "getIsDialog", "Landroidx/compose/ui/semantics/Role;", "Role", "getRole", "TestTag", "getTestTag", "Landroidx/compose/ui/text/AnnotatedString;", "Text", "getText", "TextSubstitution", "getTextSubstitution", "IsShowingTextSubstitution", "getIsShowingTextSubstitution", "EditableText", "getEditableText", "Landroidx/compose/ui/text/TextRange;", "TextSelectionRange", "getTextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "ImeAction", "getImeAction", "Selected", "getSelected", "Landroidx/compose/ui/state/ToggleableState;", "ToggleableState", "getToggleableState", "Password", "getPassword", "Error", "getError", "Lkotlin/Function1;", "", "IndexForKey", "getIndexForKey", "getIsContainer", "getIsContainer$annotations", "IsContainer", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SemanticsProperties {

    @l
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();

    @l
    private static final SemanticsPropertyKey<List<String>> ContentDescription = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", SemanticsProperties$ContentDescription$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<String> StateDescription = SemanticsPropertiesKt.AccessibilityKey("StateDescription");

    @l
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");

    @l
    private static final SemanticsPropertyKey<String> PaneTitle = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", SemanticsProperties$PaneTitle$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<r2> SelectableGroup = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");

    @l
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");

    @l
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");

    @l
    private static final SemanticsPropertyKey<r2> Heading = SemanticsPropertiesKt.AccessibilityKey("Heading");

    @l
    private static final SemanticsPropertyKey<r2> Disabled = SemanticsPropertiesKt.AccessibilityKey("Disabled");

    @l
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");

    @l
    private static final SemanticsPropertyKey<Boolean> Focused = SemanticsPropertiesKt.AccessibilityKey("Focused");

    @l
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = SemanticsPropertiesKt.AccessibilityKey("IsTraversalGroup");

    @l
    private static final SemanticsPropertyKey<r2> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<Float> TraversalIndex = SemanticsPropertiesKt.AccessibilityKey("TraversalIndex", SemanticsProperties$TraversalIndex$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");

    @l
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");

    @l
    private static final SemanticsPropertyKey<r2> IsPopup = SemanticsPropertiesKt.AccessibilityKey("IsPopup", SemanticsProperties$IsPopup$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<r2> IsDialog = SemanticsPropertiesKt.AccessibilityKey("IsDialog", SemanticsProperties$IsDialog$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<Role> Role = SemanticsPropertiesKt.AccessibilityKey("Role", SemanticsProperties$Role$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, SemanticsProperties$TestTag$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = SemanticsPropertiesKt.AccessibilityKey("Text", SemanticsProperties$Text$1.INSTANCE);

    @l
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);

    @l
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);

    @l
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = SemanticsPropertiesKt.AccessibilityKey("EditableText");

    @l
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");

    @l
    private static final SemanticsPropertyKey<ImeAction> ImeAction = SemanticsPropertiesKt.AccessibilityKey("ImeAction");

    @l
    private static final SemanticsPropertyKey<Boolean> Selected = SemanticsPropertiesKt.AccessibilityKey("Selected");

    @l
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");

    @l
    private static final SemanticsPropertyKey<r2> Password = SemanticsPropertiesKt.AccessibilityKey("Password");

    @l
    private static final SemanticsPropertyKey<String> Error = SemanticsPropertiesKt.AccessibilityKey("Error");

    @l
    private static final SemanticsPropertyKey<v3.l<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @k(message = "Use `isTraversalGroup` instead.", replaceWith = @b1(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    @l
    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    @l
    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    @l
    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    @l
    public final SemanticsPropertyKey<r2> getDisabled() {
        return Disabled;
    }

    @l
    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    @l
    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    @l
    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    @l
    public final SemanticsPropertyKey<r2> getHeading() {
        return Heading;
    }

    @l
    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    @l
    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    @l
    public final SemanticsPropertyKey<v3.l<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    @l
    public final SemanticsPropertyKey<r2> getInvisibleToUser() {
        return InvisibleToUser;
    }

    @l
    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsTraversalGroup;
    }

    @l
    public final SemanticsPropertyKey<r2> getIsDialog() {
        return IsDialog;
    }

    @l
    public final SemanticsPropertyKey<r2> getIsPopup() {
        return IsPopup;
    }

    @l
    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    @l
    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    @l
    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    @l
    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    @l
    public final SemanticsPropertyKey<r2> getPassword() {
        return Password;
    }

    @l
    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    @l
    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    @l
    public final SemanticsPropertyKey<r2> getSelectableGroup() {
        return SelectableGroup;
    }

    @l
    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    @l
    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    @l
    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    @l
    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    @l
    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    @l
    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    @l
    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    @l
    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    @l
    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }
}
