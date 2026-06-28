package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import p4.l;
import v3.a;
import v3.p;
import v3.q;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bM\u00102R5\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bRS\u0010\u0017\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u00110\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000bR/\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR>\u0010\u001d\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000bR;\u0010 \u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000bR/\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000bR/\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b&\u0010\u000bR/\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u000bR)\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b*\u0010\u000bR/\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000bR)\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b.\u0010\u000bR2\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\t\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u000bR)\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u000bR)\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b6\u0010\u000bR)\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b8\u0010\u000bR)\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b:\u0010\u000bR)\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b<\u0010\u000bR)\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b>\u0010\u000bR)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b@\u0010\u000bR#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\t\u001a\u0004\bD\u0010\u000bR)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\t\u001a\u0004\bF\u0010\u000bR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\t\u001a\u0004\bH\u0010\u000bR)\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\t\u001a\u0004\bJ\u0010\u000bR)\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00030\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\t\u001a\u0004\bL\u0010\u000b¨\u0006N"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "GetTextLayoutResult", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "OnClick", "getOnClick", "OnLongClick", "getOnLongClick", "Lkotlin/Function2;", "", "Lkotlin/v0;", "name", "x", "y", "ScrollBy", "getScrollBy", "", "ScrollToIndex", "getScrollToIndex", "progress", "SetProgress", "getSetProgress", "Lkotlin/Function3;", "SetSelection", "getSetSelection", "Landroidx/compose/ui/text/AnnotatedString;", "SetText", "getSetText", "SetTextSubstitution", "getSetTextSubstitution", "ShowTextSubstitution", "getShowTextSubstitution", "ClearTextSubstitution", "getClearTextSubstitution", "InsertTextAtCursor", "getInsertTextAtCursor", "OnImeAction", "getOnImeAction", "PerformImeAction", "getPerformImeAction", "getPerformImeAction$annotations", "()V", "CopyText", "getCopyText", "CutText", "getCutText", "PasteText", "getPasteText", "Expand", "getExpand", "Collapse", "getCollapse", "Dismiss", "getDismiss", "RequestFocus", "getRequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "CustomActions", "getCustomActions", "PageUp", "getPageUp", "PageLeft", "getPageLeft", "PageDown", "getPageDown", "PageRight", "getPageRight", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1469:1\n553#2:1470\n552#2,9:1471\n553#2:1480\n552#2,9:1481\n553#2:1490\n552#2,9:1491\n553#2:1500\n552#2,9:1501\n553#2:1510\n552#2,9:1511\n553#2:1520\n552#2,9:1521\n553#2:1530\n552#2,9:1531\n553#2:1540\n552#2,9:1541\n553#2:1550\n552#2,9:1551\n553#2:1560\n552#2,9:1561\n553#2:1570\n552#2,9:1571\n553#2:1580\n552#2,9:1581\n553#2:1590\n552#2,9:1591\n553#2:1600\n552#2,9:1601\n553#2:1610\n552#2,9:1611\n553#2:1620\n552#2,9:1621\n553#2:1630\n552#2,9:1631\n553#2:1640\n552#2,9:1641\n553#2:1650\n552#2,9:1651\n553#2:1660\n552#2,9:1661\n553#2:1670\n552#2,9:1671\n553#2:1680\n552#2,9:1681\n553#2:1690\n552#2,9:1691\n553#2:1700\n552#2,9:1701\n553#2:1710\n552#2,9:1711\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n269#1:1470\n269#1:1471,9\n274#1:1480\n274#1:1481,9\n279#1:1490\n279#1:1491,9\n284#1:1500\n284#1:1501,9\n289#1:1510\n289#1:1511,9\n294#1:1520\n294#1:1521,9\n299#1:1530\n299#1:1531,9\n304#1:1540\n304#1:1541,9\n309#1:1550\n309#1:1551,9\n314#1:1560\n314#1:1561,9\n319#1:1570\n319#1:1571,9\n324#1:1580\n324#1:1581,9\n329#1:1590\n329#1:1591,9\n341#1:1600\n341#1:1601,9\n346#1:1610\n346#1:1611,9\n351#1:1620\n351#1:1621,9\n356#1:1630\n356#1:1631,9\n361#1:1640\n361#1:1641,9\n366#1:1650\n366#1:1651,9\n371#1:1660\n371#1:1661,9\n376#1:1670\n376#1:1671,9\n387#1:1680\n387#1:1681,9\n392#1:1690\n392#1:1691,9\n397#1:1700\n397#1:1701,9\n402#1:1710\n402#1:1711,9\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsActions {
    public static final int $stable;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> ClearTextSubstitution;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Collapse;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> CopyText;

    @l
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> CutText;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Dismiss;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Expand;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<v3.l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    @l
    public static final SemanticsActions INSTANCE = new SemanticsActions();

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<v3.l<AnnotatedString, Boolean>>> InsertTextAtCursor;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnClick;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnImeAction;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnLongClick;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageDown;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageLeft;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageRight;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageUp;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PasteText;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PerformImeAction;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> RequestFocus;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> ScrollBy;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<v3.l<Integer, Boolean>>> ScrollToIndex;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<v3.l<Float, Boolean>>> SetProgress;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> SetSelection;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<v3.l<AnnotatedString, Boolean>>> SetText;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<v3.l<AnnotatedString, Boolean>>> SetTextSubstitution;

    @l
    private static final SemanticsPropertyKey<AccessibilityAction<v3.l<Boolean, Boolean>>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE;
        GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        PerformImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    @k(level = m.ERROR, message = "Use `SemanticsActions.OnImeAction` instead.", replaceWith = @b1(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCollapse() {
        return Collapse;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCopyText() {
        return CopyText;
    }

    @l
    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCutText() {
        return CutText;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getDismiss() {
        return Dismiss;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getExpand() {
        return Expand;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<v3.l<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<v3.l<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnClick() {
        return OnClick;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnImeAction() {
        return OnImeAction;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageDown() {
        return PageDown;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageRight() {
        return PageRight;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageUp() {
        return PageUp;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPasteText() {
        return PasteText;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPerformImeAction() {
        return PerformImeAction;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<v3.l<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<v3.l<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<v3.l<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<v3.l<AnnotatedString, Boolean>>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    @l
    public final SemanticsPropertyKey<AccessibilityAction<v3.l<Boolean, Boolean>>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }
}
