.class public abstract Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008,\u0010-J2\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0002\u0008\tH\u0082\u0008J\u0015\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ:\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJP\u0010\"\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001eH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006."
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;",
        "",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "state",
        "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;",
        "textLayoutState",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "block",
        "preparedSelectionContext",
        "",
        "getVisibleTextLayoutHeight",
        "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)Ljava/lang/Float;",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "event",
        "textFieldState",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
        "textFieldSelectionState",
        "Landroidx/compose/ui/focus/FocusManager;",
        "focusManager",
        "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
        "keyboardController",
        "",
        "onPreKeyEvent-MyFupTE",
        "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z",
        "onPreKeyEvent",
        "editable",
        "singleLine",
        "Lkotlin/Function0;",
        "onSubmit",
        "onKeyEvent-6ptp14s",
        "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZZLv3/a;)Z",
        "onKeyEvent",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;",
        "preparedSelectionState",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;",
        "Landroidx/compose/foundation/text/DeadKeyCombiner;",
        "deadKeyCombiner",
        "Landroidx/compose/foundation/text/DeadKeyCombiner;",
        "Landroidx/compose/foundation/text/KeyMapping;",
        "keyMapping",
        "Landroidx/compose/foundation/text/KeyMapping;",
        "<init>",
        "()V",
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
        "SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 4 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n229#1,9:284\n238#1,5:384\n197#2,6:257\n206#2:283\n197#2,6:330\n206#2:356\n197#2,6:357\n206#2:383\n186#3,20:263\n186#3,20:336\n186#3,20:363\n104#4,4:293\n109#4:299\n104#4,4:300\n109#4:305\n104#4,4:306\n109#4:311\n104#4,4:312\n109#4:317\n104#4,4:318\n109#4:323\n104#4,4:324\n109#4:329\n1#5:297\n1#5:298\n1#5:304\n1#5:310\n1#5:316\n1#5:322\n1#5:328\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n*L\n105#1:284,9\n105#1:384,5\n88#1:257,6\n88#1:283\n170#1:330,6\n170#1:356\n181#1:357,6\n181#1:383\n88#1:263,20\n170#1:336,20\n181#1:363,20\n127#1:293,4\n127#1:299\n137#1:300,4\n137#1:305\n145#1:306,4\n145#1:311\n151#1:312,4\n151#1:317\n157#1:318,4\n157#1:323\n163#1:324,4\n163#1:329\n127#1:298\n137#1:304\n145#1:310\n151#1:316\n157#1:322\n163#1:328\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final deadKeyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final keyMapping:Landroidx/compose/foundation/text/KeyMapping;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final preparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 10
    .line 11
    new-instance v0, Landroidx/compose/foundation/text/DeadKeyCombiner;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/compose/foundation/text/DeadKeyCombiner;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->deadKeyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;

    .line 17
    .line 18
    invoke-static {}, Landroidx/compose/foundation/text/KeyMapping_androidKt;->getPlatformDefaultKeyMapping()Landroidx/compose/foundation/text/KeyMapping;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->keyMapping:Landroidx/compose/foundation/text/KeyMapping;

    .line 23
    .line 24
    return-void
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

.method private final getVisibleTextLayoutHeight(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)Ljava/lang/Float;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getTextLayoutNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getDecoratorNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-interface {p1}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object p1, v1

    .line 32
    :goto_1
    if-eqz p1, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x2

    .line 36
    invoke-static {p1, v0, v2, v3, v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->localBoundingBoxOf$default(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;ZILjava/lang/Object;)Landroidx/compose/ui/geometry/Rect;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move-object p1, v1

    .line 42
    :goto_2
    if-eqz p1, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getSize-NH-jbRc()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_3
    return-object v1
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
.end method

.method private final preparedSelectionContext(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Lv3/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->getVisibleTextLayoutHeight(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    new-instance v1, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 21
    .line 22
    invoke-direct {v1, p1, v0, p2, v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;FLandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    .line 29
    .line 30
    .line 31
    move-result-wide p2

    .line 32
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getInitialValue()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-static {p2, p3, v2, v3}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    .line 47
    .line 48
    .line 49
    move-result-wide p2

    .line 50
    invoke-virtual {p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
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


# virtual methods
.method public onKeyEvent-6ptp14s(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZZLv3/a;)Z
    .locals 15
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/text2/input/internal/TextLayoutState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p7    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/KeyEvent;",
            "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
            "ZZ",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)Z"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    invoke-static/range {p1 .. p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result v3

    sget-object v4, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    .line 2
    :cond_0
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/TextFieldKeyInput_androidKt;->isTypedEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    .line 3
    iget-object v3, v0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->deadKeyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;

    invoke-virtual {v3, v1}, Landroidx/compose/foundation/text/DeadKeyCombiner;->consume-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const/4 v6, 0x2

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/text/StringHelpers_jvmKt;->appendCodePointX(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz p5, :cond_2

    .line 5
    invoke-static/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;

    move-result-object v3

    .line 6
    invoke-static/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/InputTransformation;

    move-result-object v2

    .line 7
    sget-object v4, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 8
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v6

    .line 9
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 10
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v7

    .line 11
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->commitComposition()V

    .line 12
    invoke-static {v7, v1, v5}, Landroidx/compose/foundation/text2/input/internal/EditCommandKt;->commitText(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;Ljava/lang/String;I)V

    .line 13
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    move-result v1

    if-nez v1, :cond_1

    .line 14
    invoke-interface {v6}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v7

    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 15
    invoke-interface {v6}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    move-result-object v1

    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 16
    :cond_1
    invoke-static {v3, v6, v2, v5, v4}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 17
    :goto_0
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    move v4, v5

    :cond_2
    return v4

    .line 18
    :cond_3
    iget-object v3, v0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->keyMapping:Landroidx/compose/foundation/text/KeyMapping;

    invoke-interface {v3, v1}, Landroidx/compose/foundation/text/KeyMapping;->map-ZmokQxo(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;

    move-result-object v1

    if-eqz v1, :cond_19

    .line 19
    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyCommand;->getEditsText()Z

    move-result v3

    if-eqz v3, :cond_4

    if-nez p5, :cond_4

    goto/16 :goto_5

    .line 20
    :cond_4
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v3

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object/from16 v6, p3

    .line 21
    invoke-direct {p0, v6}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->getVisibleTextLayoutHeight(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)Ljava/lang/Float;

    move-result-object v6

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    .line 22
    new-instance v7, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 23
    iget-object v8, v0, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->preparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 24
    invoke-direct {v7, v2, v3, v6, v8}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;FLandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;)V

    .line 25
    sget-object v3, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, -0x1

    const/4 v6, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    .line 26
    :pswitch_0
    invoke-static {}, Landroidx/compose/foundation/text/KeyEventHelpers_androidKt;->showCharacterPalette()V

    goto/16 :goto_3

    .line 27
    :pswitch_1
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->redo()V

    goto/16 :goto_3

    .line 28
    :pswitch_2
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->undo()V

    goto/16 :goto_3

    .line 29
    :pswitch_3
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->deselect()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 30
    :pswitch_4
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 31
    :pswitch_5
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToHome()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 32
    :pswitch_6
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorDownByPage()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 33
    :pswitch_7
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorUpByPage()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 34
    :pswitch_8
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorDownByLine()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 35
    :pswitch_9
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorUpByLine()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 36
    :pswitch_a
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineRightSide()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 37
    :pswitch_b
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineLeftSide()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 38
    :pswitch_c
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 39
    :pswitch_d
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 40
    :pswitch_e
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorNextByParagraph()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 41
    :pswitch_f
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorPrevByParagraph()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 42
    :pswitch_10
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorRightByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 43
    :pswitch_11
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorLeftByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 44
    :pswitch_12
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorRight()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 45
    :pswitch_13
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorLeft()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    .line 46
    :pswitch_14
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selectAll()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto/16 :goto_3

    :pswitch_15
    if-nez p6, :cond_16

    .line 47
    invoke-static/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;

    move-result-object v1

    .line 48
    invoke-static/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/InputTransformation;

    move-result-object v3

    .line 49
    sget-object v4, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 50
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v6

    .line 51
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 52
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v8

    .line 53
    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->commitComposition()V

    const-string v9, "\t"

    .line 54
    invoke-static {v8, v9, v5}, Landroidx/compose/foundation/text2/input/internal/EditCommandKt;->commitText(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;Ljava/lang/String;I)V

    .line 55
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    move-result v8

    if-nez v8, :cond_6

    .line 56
    invoke-interface {v6}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v8

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 57
    invoke-interface {v6}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    move-result-object v8

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto/16 :goto_3

    .line 58
    :cond_6
    invoke-static {v1, v6, v3, v5, v4}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    goto/16 :goto_3

    :pswitch_16
    if-nez p6, :cond_8

    .line 59
    invoke-static/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/TextFieldState;

    move-result-object v1

    .line 60
    invoke-static/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text2/input/InputTransformation;

    move-result-object v3

    .line 61
    sget-object v4, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 62
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v6

    .line 63
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 64
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v8

    .line 65
    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->commitComposition()V

    const-string v9, "\n"

    .line 66
    invoke-static {v8, v9, v5}, Landroidx/compose/foundation/text2/input/internal/EditCommandKt;->commitText(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;Ljava/lang/String;I)V

    .line 67
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    move-result v8

    if-nez v8, :cond_7

    .line 68
    invoke-interface {v6}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v8

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 69
    invoke-interface {v6}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    move-result-object v8

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto/16 :goto_3

    .line 70
    :cond_7
    invoke-static {v1, v6, v3, v5, v4}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    goto/16 :goto_3

    .line 71
    :cond_8
    invoke-interface/range {p7 .. p7}, Lv3/a;->invoke()Ljava/lang/Object;

    goto/16 :goto_3

    .line 72
    :pswitch_17
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-nez v1, :cond_9

    .line 73
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 74
    :cond_9
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineEndByOffset()I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v10

    .line 75
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 76
    :pswitch_18
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-nez v1, :cond_a

    .line 77
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 78
    :cond_a
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineStartByOffset()I

    move-result v1

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v10

    .line 79
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 80
    :pswitch_19
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-nez v1, :cond_b

    .line 81
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 82
    :cond_b
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getNextWordOffset()I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v10

    .line 83
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 84
    :pswitch_1a
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-nez v1, :cond_c

    .line 85
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 86
    :cond_c
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getPreviousWordOffset()I

    move-result v1

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v10

    .line 87
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 88
    :pswitch_1b
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-nez v1, :cond_d

    .line 89
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 90
    :cond_d
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getNextCharacterIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v8

    if-eq v8, v3, :cond_e

    move v4, v5

    :cond_e
    if-eqz v4, :cond_f

    goto :goto_1

    :cond_f
    move-object v1, v6

    :goto_1
    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 91
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v3

    invoke-static {v3, v1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    move-result-object v6

    :cond_10
    if-eqz v6, :cond_15

    .line 92
    invoke-virtual {v6}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    move-result-wide v10

    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 93
    :pswitch_1c
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v1

    if-nez v1, :cond_11

    .line 94
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 95
    :cond_11
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getPrecedingCharacterIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v8

    if-eq v8, v3, :cond_12

    move v4, v5

    :cond_12
    if-eqz v4, :cond_13

    goto :goto_2

    :cond_13
    move-object v1, v6

    :goto_2
    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 96
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    move-result-object v6

    :cond_14
    if-eqz v6, :cond_15

    .line 97
    invoke-virtual {v6}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    move-result-wide v10

    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    move-result-object v8

    const-string v9, ""

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    goto :goto_3

    .line 98
    :pswitch_1d
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 99
    :pswitch_1e
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToHome()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 100
    :pswitch_1f
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineRightSide()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 101
    :pswitch_20
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineLeftSide()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 102
    :pswitch_21
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 103
    :pswitch_22
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 104
    :pswitch_23
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorDownByPage()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 105
    :pswitch_24
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorUpByPage()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 106
    :pswitch_25
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorDownByLine()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 107
    :pswitch_26
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorUpByLine()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 108
    :pswitch_27
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorNextByParagraph()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 109
    :pswitch_28
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorPrevByParagraph()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 110
    :pswitch_29
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorRightByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 111
    :pswitch_2a
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorLeftByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 112
    :pswitch_2b
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler$onKeyEvent$2$2;->INSTANCE:Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler$onKeyEvent$2$2;

    invoke-virtual {v7, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->collapseRightOr(Lv3/l;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 113
    :pswitch_2c
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler$onKeyEvent$2$1;->INSTANCE:Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler$onKeyEvent$2$1;

    invoke-virtual {v7, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->collapseLeftOr(Lv3/l;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    goto :goto_3

    .line 114
    :pswitch_2d
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->cut()V

    goto :goto_3

    .line 115
    :pswitch_2e
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->paste()V

    goto :goto_3

    :pswitch_2f
    move-object/from16 v1, p4

    .line 116
    invoke-virtual {v1, v4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->copy(Z)V

    :cond_15
    :goto_3
    move v4, v5

    .line 117
    :cond_16
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v5

    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getInitialValue()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v8

    invoke-static {v5, v6, v8, v9}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_17

    .line 118
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    :cond_17
    move v5, v4

    :cond_18
    :goto_4
    return v5

    :cond_19
    :goto_5
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPreKeyEvent-MyFupTE(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z
    .locals 0
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/focus/FocusManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/platform/SoftwareKeyboardController;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 6
    .line 7
    .line 8
    move-result-wide p4

    .line 9
    invoke-static {p4, p5}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/compose/foundation/text/KeyEventHelpers_androidKt;->cancelsTextSelection-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->deselect()V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    return p1
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
.end method
