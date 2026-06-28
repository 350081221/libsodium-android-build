.class public final Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;,
        Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u0000 M2\u00020\u0001:\u0002MNB#\u0012\u0006\u00109\u001a\u000208\u0012\u0008\u0010<\u001a\u0004\u0018\u00010;\u0012\u0008\u0010?\u001a\u0004\u0018\u00010>\u00a2\u0006\u0004\u0008K\u0010LJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J*\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\"\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J,\u0010%\u001a\u00020\u00042\u0008\u0008\u0002\u0010 \u001a\u00020\u00192\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040!\u00a2\u0006\u0002\u0008#H\u0086\u0008J\u001b\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008*\u0010+J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010+J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0086@\u00a2\u0006\u0004\u00081\u00102J\u0013\u00104\u001a\u00020\u00192\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u00105\u001a\u00020\u0002H\u0016J\u0008\u00107\u001a\u000206H\u0016R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u001e\u0010C\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0011\u0010H\u001a\u00020E8F\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0011\u0010J\u001a\u00020E8F\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010G\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006O"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "",
        "",
        "transformedOffset",
        "Lkotlin/r2;",
        "placeCursorBeforeCharAt",
        "Landroidx/compose/ui/text/TextRange;",
        "transformedRange",
        "selectCharsIn-5zc-tL8",
        "(J)V",
        "selectCharsIn",
        "untransformedRange",
        "selectUntransformedCharsIn-5zc-tL8",
        "selectUntransformedCharsIn",
        "",
        "newText",
        "replaceAll",
        "selectAll",
        "deleteSelectedText",
        "range",
        "Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;",
        "undoBehavior",
        "replaceText-Sb-Bc2M",
        "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V",
        "replaceText",
        "",
        "clearComposition",
        "replaceSelectedText",
        "collapseSelectionToMax",
        "collapseSelectionToEnd",
        "undo",
        "redo",
        "notifyImeOfChanges",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
        "Lkotlin/u;",
        "block",
        "editUntransformedTextAsUser",
        "offset",
        "mapToTransformed--jx7JFs",
        "(I)J",
        "mapToTransformed",
        "mapToTransformed-GEjPoXI",
        "(J)J",
        "mapFromTransformed",
        "mapFromTransformed-GEjPoXI",
        "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;",
        "notifyImeListener",
        "",
        "collectImeNotifications",
        "(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "other",
        "equals",
        "hashCode",
        "",
        "toString",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "textFieldState",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "inputTransformation",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
        "codepointTransformation",
        "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;",
        "transformedText",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "getText",
        "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "text",
        "getUntransformedText",
        "untransformedText",
        "<init>",
        "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/CodepointTransformation;)V",
        "Companion",
        "TransformedText",
        "foundation_release"
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
        "SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,393:1\n186#2,20:394\n186#2,20:414\n186#2,20:434\n186#2,20:454\n186#2,20:474\n186#2,20:494\n186#2,20:514\n186#2,20:534\n186#2,20:554\n314#3,11:574\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n*L\n93#1:394,20\n99#1:414,20\n106#1:434,20\n112#1:454,20\n131#1:474,20\n148#1:494,20\n166#1:514,20\n173#1:534,20\n201#1:554,20\n277#1:574,11\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final transformedText:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/CodepointTransformation;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/InputTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/text2/input/CodepointTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$transformedText$1$1;

    .line 13
    .line 14
    invoke-direct {p1, p0, p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$transformedText$1$1;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/CodepointTransformation;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->transformedText:Landroidx/compose/runtime/State;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public static final synthetic access$getCompanion$p()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    return-object v0
.end method

.method public static final synthetic access$getInputTransformation$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/InputTransformation;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    return-object p0
.end method

.method public static final synthetic access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    return-object p0
.end method

.method private static final calculateTransformedText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/CodepointTransformation;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;
    .locals 1
    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    invoke-static {v0, p0, p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->access$calculateTransformedText(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/CodepointTransformation;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic editUntransformedTextAsUser$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;ZLv3/l;ILjava/lang/Object;)V
    .locals 5

    .line 1
    const/4 p4, 0x1

    .line 2
    and-int/2addr p3, p4

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    move p1, p4

    .line 6
    :cond_0
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p4, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 15
    .line 16
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {p2, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_1

    .line 51
    .line 52
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_1

    .line 69
    .line 70
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-static {p3, v0, p0, p1, p4}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
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
.end method

.method private static final mapFromTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J
    .locals 1
    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    invoke-static {v0, p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->access$mapFromTransformed-xdX6-G0(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final mapToTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J
    .locals 1
    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    invoke-static {v0, p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->access$mapToTransformed-xdX6-G0(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic replaceSelectedText$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    sget-object p3, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceSelectedText(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
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
.end method

.method public static synthetic replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x4

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p4, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
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
.end method


# virtual methods
.method public final collapseSelectionToEnd()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v4, v5, v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_0

    .line 58
    .line 59
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_0

    .line 76
    .line 77
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    const/4 v4, 0x1

    .line 97
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final collapseSelectionToMax()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v4, v5, v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_0

    .line 58
    .line 59
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_0

    .line 76
    .line 77
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    const/4 v4, 0x1

    .line 97
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final collectImeNotifications(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-eq v2, v3, :cond_1

    .line 37
    .line 38
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    iget-object p1, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;

    .line 49
    .line 50
    iget-object p1, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p0, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object p1, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$1;->label:I

    .line 66
    .line 67
    new-instance p2, Lkotlinx/coroutines/q;

    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/coroutines/intrinsics/b;->e(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {p2, v2, v3}, Lkotlinx/coroutines/q;-><init>(Lkotlin/coroutines/d;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Lkotlinx/coroutines/q;->B()V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->addNotifyImeListener$foundation_release(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;)V

    .line 84
    .line 85
    .line 86
    new-instance v2, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$2$1;

    .line 87
    .line 88
    invoke-direct {v2, p0, p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$collectImeNotifications$2$1;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p2, v2}, Lkotlinx/coroutines/p;->g(Lv3/l;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lkotlinx/coroutines/q;->E()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    if-ne p1, p2, :cond_3

    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Lkotlin/coroutines/d;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    if-ne p1, v1, :cond_4

    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_4
    :goto_1
    new-instance p1, Lkotlin/y;

    .line 111
    .line 112
    invoke-direct {p1}, Lkotlin/y;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p1
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
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
.end method

.method public final deleteSelectedText()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->NeverMerge:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v4, v5, v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->delete(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-virtual {v4, v5, v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_0

    .line 77
    .line 78
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_0

    .line 95
    .line 96
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v5}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_0

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    const/4 v4, 0x1

    .line 116
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
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

.method public final editUntransformedTextAsUser(ZLv3/l;)V
    .locals 8
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {p2, v4}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_0

    .line 46
    .line 47
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {p2, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-static {v0, v3, v1, p1, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    return-void
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 14
    .line 15
    iget-object v2, p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    return v1

    .line 24
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;

    .line 25
    .line 26
    iget-object p1, p1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;

    .line 27
    .line 28
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->transformedText:Landroidx/compose/runtime/State;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final getUntransformedText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    return v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final mapFromTransformed(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->transformedText:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->getOffsetMapping()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapFromDest--jx7JFs(I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :cond_1
    :goto_0
    return p1
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final mapFromTransformed-GEjPoXI(J)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->transformedText:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->getOffsetMapping()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    .line 21
    .line 22
    invoke-static {v1, p1, p2, v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->access$mapFromTransformed-xdX6-G0(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    :cond_1
    :goto_0
    return-wide p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final mapToTransformed--jx7JFs(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->transformedText:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->getOffsetMapping()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapFromSource--jx7JFs(I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0

    .line 25
    :cond_1
    :goto_0
    invoke-static {p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    return-wide v0
    .line 30
    .line 31
    .line 32
.end method

.method public final mapToTransformed-GEjPoXI(J)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->transformedText:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;->getOffsetMapping()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->Companion:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    .line 21
    .line 22
    invoke-static {v1, p1, p2, v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->access$mapToTransformed-xdX6-G0(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    :cond_1
    :goto_0
    return-wide p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final placeCursorBeforeCharAt(I)V
    .locals 2

    invoke-static {p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    return-void
.end method

.method public final redo()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getUndoState()Landroidx/compose/foundation/text2/input/UndoState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/UndoState;->redo()V

    return-void
.end method

.method public final replaceAll(Ljava/lang/CharSequence;)V
    .locals 10
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, Landroidx/compose/foundation/text2/input/internal/EditCommandKt;->deleteAll(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v5, 0x1

    .line 34
    invoke-static {v4, p1, v5}, Landroidx/compose/foundation/text2/input/internal/EditCommandKt;->commitText(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 60
    .line 61
    .line 62
    move-result-wide v8

    .line 63
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_0

    .line 68
    .line 69
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {p1, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-static {v0, v3, v1, v5, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-void
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public final replaceSelectedText(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 7
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->commitComposition()V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-virtual {v3, p2, v6, p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->replace(IILjava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    add-int/2addr p2, p1

    .line 53
    invoke-virtual {v3, p2, p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    invoke-interface {v2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    invoke-static {p1, p2, v3, v4}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    invoke-interface {v2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    const/4 p1, 0x1

    .line 108
    invoke-static {v0, v2, v1, p1, p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    return-void
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public final replaceText-Sb-Bc2M(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 6
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {p0, p2, p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->mapFromTransformed-GEjPoXI(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p2

    .line 28
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {v3, v4, v5, p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->replace(IILjava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    add-int/2addr p2, p1

    .line 48
    invoke-virtual {v3, p2, p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_0

    .line 64
    .line 65
    invoke-interface {v2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 66
    .line 67
    .line 68
    move-result-wide p1

    .line 69
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    invoke-static {p1, p2, v3, v4}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    invoke-interface {v2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    const/4 p1, 0x1

    .line 103
    invoke-static {v0, v2, v1, p1, p4}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    return-void
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public final selectAll()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getLength()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-virtual {v4, v6, v5}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v5}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    const/4 v4, 0x1

    .line 86
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final selectCharsIn-5zc-tL8(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->mapFromTransformed-GEjPoXI(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectUntransformedCharsIn-5zc-tL8(J)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final selectUntransformedCharsIn-5zc-tL8(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->inputTransformation:Landroidx/compose/foundation/text2/input/InputTransformation;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v4, v5, p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-static {p1, p2, v4, v5}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_0

    .line 68
    .line 69
    invoke-interface {v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    const/4 p1, 0x1

    .line 89
    invoke-static {v0, v3, v1, p1, v2}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "TransformedTextFieldState(textFieldState="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", codepointTransformation="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", transformedText="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->transformedText:Landroidx/compose/runtime/State;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", text=\""

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, "\")"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final undo()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->textFieldState:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getUndoState()Landroidx/compose/foundation/text2/input/UndoState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/UndoState;->undo()V

    return-void
.end method
