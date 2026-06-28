.class public final Landroidx/compose/ui/semantics/SemanticsActions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008M\u00102R5\u0010\u0008\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR)\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000e\u0010\u000bR)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\t\u001a\u0004\u0008\u0010\u0010\u000bRS\u0010\u0017\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00070\u00110\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\t\u001a\u0004\u0008\u0018\u0010\u000bR/\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\t\u001a\u0004\u0008\u001b\u0010\u000bR>\u0010\u001d\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u001c\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\t\u001a\u0004\u0008\u001e\u0010\u000bR;\u0010 \u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001f0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\t\u001a\u0004\u0008!\u0010\u000bR/\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\t\u001a\u0004\u0008$\u0010\u000bR/\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\t\u001a\u0004\u0008&\u0010\u000bR/\u0010\'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\t\u001a\u0004\u0008(\u0010\u000bR)\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010\t\u001a\u0004\u0008*\u0010\u000bR/\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010\t\u001a\u0004\u0008,\u0010\u000bR)\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010\t\u001a\u0004\u0008.\u0010\u000bR2\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008/\u0010\t\u0012\u0004\u00081\u00102\u001a\u0004\u00080\u0010\u000bR)\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010\t\u001a\u0004\u00084\u0010\u000bR)\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00085\u0010\t\u001a\u0004\u00086\u0010\u000bR)\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00087\u0010\t\u001a\u0004\u00088\u0010\u000bR)\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010\t\u001a\u0004\u0008:\u0010\u000bR)\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010\t\u001a\u0004\u0008<\u0010\u000bR)\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010\t\u001a\u0004\u0008>\u0010\u000bR)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010\t\u001a\u0004\u0008@\u0010\u000bR#\u0010C\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020B0A0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010\t\u001a\u0004\u0008D\u0010\u000bR)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010\t\u001a\u0004\u0008F\u0010\u000bR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010\t\u001a\u0004\u0008H\u0010\u000bR)\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010\t\u001a\u0004\u0008J\u0010\u000bR)\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010\t\u001a\u0004\u0008L\u0010\u000b\u00a8\u0006N"
    }
    d2 = {
        "Landroidx/compose/ui/semantics/SemanticsActions;",
        "",
        "Landroidx/compose/ui/semantics/SemanticsPropertyKey;",
        "Landroidx/compose/ui/semantics/AccessibilityAction;",
        "Lkotlin/Function1;",
        "",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "",
        "GetTextLayoutResult",
        "Landroidx/compose/ui/semantics/SemanticsPropertyKey;",
        "getGetTextLayoutResult",
        "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;",
        "Lkotlin/Function0;",
        "OnClick",
        "getOnClick",
        "OnLongClick",
        "getOnLongClick",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/v0;",
        "name",
        "x",
        "y",
        "ScrollBy",
        "getScrollBy",
        "",
        "ScrollToIndex",
        "getScrollToIndex",
        "progress",
        "SetProgress",
        "getSetProgress",
        "Lkotlin/Function3;",
        "SetSelection",
        "getSetSelection",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "SetText",
        "getSetText",
        "SetTextSubstitution",
        "getSetTextSubstitution",
        "ShowTextSubstitution",
        "getShowTextSubstitution",
        "ClearTextSubstitution",
        "getClearTextSubstitution",
        "InsertTextAtCursor",
        "getInsertTextAtCursor",
        "OnImeAction",
        "getOnImeAction",
        "PerformImeAction",
        "getPerformImeAction",
        "getPerformImeAction$annotations",
        "()V",
        "CopyText",
        "getCopyText",
        "CutText",
        "getCutText",
        "PasteText",
        "getPasteText",
        "Expand",
        "getExpand",
        "Collapse",
        "getCollapse",
        "Dismiss",
        "getDismiss",
        "RequestFocus",
        "getRequestFocus",
        "",
        "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
        "CustomActions",
        "getCustomActions",
        "PageUp",
        "getPageUp",
        "PageLeft",
        "getPageLeft",
        "PageDown",
        "getPageDown",
        "PageRight",
        "getPageRight",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1469:1\n553#2:1470\n552#2,9:1471\n553#2:1480\n552#2,9:1481\n553#2:1490\n552#2,9:1491\n553#2:1500\n552#2,9:1501\n553#2:1510\n552#2,9:1511\n553#2:1520\n552#2,9:1521\n553#2:1530\n552#2,9:1531\n553#2:1540\n552#2,9:1541\n553#2:1550\n552#2,9:1551\n553#2:1560\n552#2,9:1561\n553#2:1570\n552#2,9:1571\n553#2:1580\n552#2,9:1581\n553#2:1590\n552#2,9:1591\n553#2:1600\n552#2,9:1601\n553#2:1610\n552#2,9:1611\n553#2:1620\n552#2,9:1621\n553#2:1630\n552#2,9:1631\n553#2:1640\n552#2,9:1641\n553#2:1650\n552#2,9:1651\n553#2:1660\n552#2,9:1661\n553#2:1670\n552#2,9:1671\n553#2:1680\n552#2,9:1681\n553#2:1690\n552#2,9:1691\n553#2:1700\n552#2,9:1701\n553#2:1710\n552#2,9:1711\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n269#1:1470\n269#1:1471,9\n274#1:1480\n274#1:1481,9\n279#1:1490\n279#1:1491,9\n284#1:1500\n284#1:1501,9\n289#1:1510\n289#1:1511,9\n294#1:1520\n294#1:1521,9\n299#1:1530\n299#1:1531,9\n304#1:1540\n304#1:1541,9\n309#1:1550\n309#1:1551,9\n314#1:1560\n314#1:1561,9\n319#1:1570\n319#1:1571,9\n324#1:1580\n324#1:1581,9\n329#1:1590\n329#1:1591,9\n341#1:1600\n341#1:1601,9\n346#1:1610\n346#1:1611,9\n351#1:1620\n351#1:1621,9\n356#1:1630\n356#1:1631,9\n361#1:1640\n361#1:1641,9\n366#1:1650\n366#1:1651,9\n371#1:1660\n371#1:1661,9\n376#1:1670\n376#1:1671,9\n387#1:1680\n387#1:1681,9\n392#1:1690\n392#1:1691,9\n397#1:1700\n397#1:1701,9\n402#1:1710\n402#1:1711,9\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final ClearTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Collapse:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final CopyText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final CustomActions:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final CutText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Dismiss:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Expand:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final GetTextLayoutResult:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final InsertTextAtCursor:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final OnClick:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final OnImeAction:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final OnLongClick:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PageDown:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PageLeft:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PageRight:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PageUp:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PasteText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PerformImeAction:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final RequestFocus:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ScrollBy:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/p<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ScrollToIndex:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SetProgress:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/lang/Float;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SetSelection:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/q<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SetText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SetTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ShowTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/ui/semantics/SemanticsActions;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/semantics/SemanticsActions;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1;

    .line 9
    .line 10
    const-string v1, "GetTextLayoutResult"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->GetTextLayoutResult:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 17
    .line 18
    const-string v1, "OnClick"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->OnClick:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 25
    .line 26
    const-string v1, "OnLongClick"

    .line 27
    .line 28
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->OnLongClick:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 33
    .line 34
    const-string v1, "ScrollBy"

    .line 35
    .line 36
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->ScrollBy:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 41
    .line 42
    const-string v1, "ScrollToIndex"

    .line 43
    .line 44
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->ScrollToIndex:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 49
    .line 50
    const-string v1, "SetProgress"

    .line 51
    .line 52
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->SetProgress:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 57
    .line 58
    const-string v1, "SetSelection"

    .line 59
    .line 60
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->SetSelection:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 65
    .line 66
    const-string v1, "SetText"

    .line 67
    .line 68
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->SetText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 73
    .line 74
    const-string v1, "SetTextSubstitution"

    .line 75
    .line 76
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->SetTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 81
    .line 82
    const-string v1, "ShowTextSubstitution"

    .line 83
    .line 84
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->ShowTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 89
    .line 90
    const-string v1, "ClearTextSubstitution"

    .line 91
    .line 92
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->ClearTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 97
    .line 98
    const-string v1, "InsertTextAtCursor"

    .line 99
    .line 100
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->InsertTextAtCursor:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 105
    .line 106
    const-string v1, "PerformImeAction"

    .line 107
    .line 108
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    sput-object v2, Landroidx/compose/ui/semantics/SemanticsActions;->OnImeAction:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 113
    .line 114
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->PerformImeAction:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 119
    .line 120
    const-string v1, "CopyText"

    .line 121
    .line 122
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->CopyText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 127
    .line 128
    const-string v1, "CutText"

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->CutText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 135
    .line 136
    const-string v1, "PasteText"

    .line 137
    .line 138
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->PasteText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 143
    .line 144
    const-string v1, "Expand"

    .line 145
    .line 146
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->Expand:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 151
    .line 152
    const-string v1, "Collapse"

    .line 153
    .line 154
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->Collapse:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 159
    .line 160
    const-string v1, "Dismiss"

    .line 161
    .line 162
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->Dismiss:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 167
    .line 168
    const-string v1, "RequestFocus"

    .line 169
    .line 170
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->RequestFocus:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 175
    .line 176
    const-string v1, "CustomActions"

    .line 177
    .line 178
    invoke-static {v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->CustomActions:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 183
    .line 184
    const-string v1, "PageUp"

    .line 185
    .line 186
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->PageUp:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 191
    .line 192
    const-string v1, "PageLeft"

    .line 193
    .line 194
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->PageLeft:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 199
    .line 200
    const-string v1, "PageDown"

    .line 201
    .line 202
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    sput-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->PageDown:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 207
    .line 208
    const-string v1, "PageRight"

    .line 209
    .line 210
    invoke-static {v1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->AccessibilityKey(Ljava/lang/String;Lv3/p;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sput-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->PageRight:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 215
    .line 216
    const/16 v0, 0x8

    .line 217
    .line 218
    sput v0, Landroidx/compose/ui/semantics/SemanticsActions;->$stable:I

    .line 219
    .line 220
    return-void
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getPerformImeAction$annotations()V
    .locals 0
    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Use `SemanticsActions.OnImeAction` instead."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "OnImeAction"
            imports = {
                "androidx.compose.ui.semantics.SemanticsActions.OnImeAction"
            }
        .end subannotation
    .end annotation

    return-void
.end method


# virtual methods
.method public final getClearTextSubstitution()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->ClearTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getCollapse()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->Collapse:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getCopyText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->CopyText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getCustomActions()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/CustomAccessibilityAction;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->CustomActions:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getCutText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->CutText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getDismiss()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->Dismiss:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getExpand()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->Expand:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getGetTextLayoutResult()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->GetTextLayoutResult:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getInsertTextAtCursor()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->InsertTextAtCursor:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getOnClick()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->OnClick:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getOnImeAction()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->OnImeAction:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getOnLongClick()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->OnLongClick:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getPageDown()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->PageDown:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getPageLeft()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->PageLeft:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getPageRight()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->PageRight:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getPageUp()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->PageUp:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getPasteText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->PasteText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getPerformImeAction()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->PerformImeAction:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getRequestFocus()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->RequestFocus:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getScrollBy()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/p<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->ScrollBy:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getScrollToIndex()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->ScrollToIndex:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getSetProgress()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/lang/Float;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->SetProgress:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getSetSelection()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/q<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->SetSelection:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getSetText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->SetText:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getSetTextSubstitution()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->SetTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method

.method public final getShowTextSubstitution()Landroidx/compose/ui/semantics/SemanticsPropertyKey;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/semantics/SemanticsPropertyKey<",
            "Landroidx/compose/ui/semantics/AccessibilityAction<",
            "Lv3/l<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/semantics/SemanticsActions;->ShowTextSubstitution:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    return-object v0
.end method
