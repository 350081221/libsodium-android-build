.class public final Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 V2\u00020\u0001:\u0001VB\'\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020\u0013\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010D\u001a\u00020C\u00a2\u0006\u0004\u0008T\u0010UJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0002\u0008\tH\u0082\u0008J\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0000H\u0002J\u0008\u0010\u000f\u001a\u00020\u0000H\u0002J\u0008\u0010\u0010\u001a\u00020\u0000H\u0002J\u0008\u0010\u0011\u001a\u00020\u0000H\u0002J\u0008\u0010\u0012\u001a\u00020\u0005H\u0002J\u0017\u0010\u0015\u001a\u00020\u0002*\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002H\u0082\u0010J\u0017\u0010\u0016\u001a\u00020\u0002*\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002H\u0082\u0010J\u0016\u0010\u0017\u001a\u00020\u0002*\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002H\u0002J\u0016\u0010\u0018\u001a\u00020\u0002*\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002H\u0002J\u0014\u0010\u001a\u001a\u00020\u0002*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0002H\u0002J\u0019\u0010\u001e\u001a\u00020\u00082\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0086\u0008J\u0006\u0010\u001f\u001a\u00020\u0000J\u0006\u0010 \u001a\u00020\u0000J\u0006\u0010!\u001a\u00020\u0000J\u0006\u0010\"\u001a\u00020\u0000J\u0006\u0010#\u001a\u00020\u0000J\u0006\u0010$\u001a\u00020\u0000J\u001f\u0010&\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0002\u0008\tJ\u001f\u0010\'\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0002\u0008\tJ\u0006\u0010(\u001a\u00020\u0002J\u0006\u0010)\u001a\u00020\u0002J\u0006\u0010*\u001a\u00020\u0000J\u0006\u0010+\u001a\u00020\u0000J\u0006\u0010,\u001a\u00020\u0000J\u0006\u0010-\u001a\u00020\u0000J\u0006\u0010.\u001a\u00020\u0002J\u0006\u0010/\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u0006\u00104\u001a\u00020\u0002J\u0006\u00105\u001a\u00020\u0000J\u0006\u00106\u001a\u00020\u0002J\u0006\u00107\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\u0000J\u0006\u00109\u001a\u00020\u0000J\u0006\u0010:\u001a\u00020\u0000R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010>\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0017\u0010G\u001a\u00020F8\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010JR(\u0010K\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010N\"\u0004\u0008O\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010S\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006W"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;",
        "",
        "",
        "pagesAmount",
        "jumpByPagesOffset",
        "",
        "resetCachedX",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "block",
        "applyIfNotEmpty",
        "offset",
        "setCursor",
        "moveCursorPrev",
        "moveCursorNext",
        "moveCursorNextByWord",
        "moveCursorPrevByWord",
        "isLtr",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "currentOffset",
        "getNextWordOffsetForLayout",
        "getPrevWordOffsetForLayout",
        "getLineStartByOffsetForLayout",
        "getLineEndByOffsetForLayout",
        "linesAmount",
        "jumpByLinesOffset",
        "charOffset",
        "Lkotlin/Function0;",
        "Landroidx/compose/ui/text/TextRange;",
        "deleteIfSelectedOr",
        "moveCursorUpByPage",
        "moveCursorDownByPage",
        "selectAll",
        "deselect",
        "moveCursorLeft",
        "moveCursorRight",
        "or",
        "collapseLeftOr",
        "collapseRightOr",
        "getPrecedingCharacterIndex",
        "getNextCharacterIndex",
        "moveCursorToHome",
        "moveCursorToEnd",
        "moveCursorLeftByWord",
        "moveCursorRightByWord",
        "getNextWordOffset",
        "getPreviousWordOffset",
        "moveCursorPrevByParagraph",
        "moveCursorNextByParagraph",
        "moveCursorUpByLine",
        "moveCursorDownByLine",
        "getLineStartByOffset",
        "moveCursorToLineStart",
        "getLineEndByOffset",
        "moveCursorToLineEnd",
        "moveCursorToLineLeftSide",
        "moveCursorToLineRightSide",
        "selectMovement",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "state",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "textLayoutResult",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "",
        "visibleTextLayoutHeight",
        "F",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;",
        "textPreparedSelectionState",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "initialValue",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "getInitialValue",
        "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "selection",
        "J",
        "getSelection-d9O1mEE",
        "()J",
        "setSelection-5zc-tL8",
        "(J)V",
        "",
        "text",
        "Ljava/lang/String;",
        "<init>",
        "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;FLandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;)V",
        "Companion",
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
        "SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n159#1,7:444\n159#1,7:451\n155#1,11:458\n155#1,11:469\n155#1,11:480\n155#1,11:491\n155#1,11:502\n155#1,11:513\n155#1,11:524\n155#1,11:535\n155#1,11:546\n155#1,11:557\n155#1,11:568\n155#1,11:579\n155#1,11:590\n155#1,11:601\n155#1,11:612\n155#1,11:623\n159#1,7:634\n159#1,7:641\n155#1,11:648\n155#1,11:659\n155#1,11:670\n155#1,11:681\n159#1,7:692\n495#2,4:433\n500#2:442\n129#3,5:437\n1#4:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n*L\n114#1:444,7\n121#1:451,7\n175#1:458,11\n179#1:469,11\n183#1:480,11\n191#1:491,11\n202#1:502,11\n217#1:513,11\n240#1:524,11\n245#1:535,11\n250#1:546,11\n254#1:557,11\n258#1:568,11\n266#1:579,11\n276#1:590,11\n282#1:601,11\n286#1:612,11\n294#1:623,11\n302#1:634,7\n306#1:641,7\n312#1:648,11\n318#1:659,11\n322#1:670,11\n330#1:681,11\n339#1:692,7\n87#1:433,4\n87#1:442\n87#1:437,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final NoCharacterFound:I = -0x1


# instance fields
.field private final initialValue:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private selection:J

.field private final state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final text:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final textPreparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final visibleTextLayoutHeight:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->Companion:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;FLandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/TextLayoutResult;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->visibleTextLayoutHeight:F

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 11
    .line 12
    sget-object p2, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 13
    .line 14
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    :try_start_0
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 19
    .line 20
    .line 21
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    :try_start_1
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :try_start_2
    invoke-virtual {p2, p3}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 35
    .line 36
    .line 37
    move-result-wide p2

    .line 38
    iput-wide p2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    :try_start_3
    invoke-virtual {p2, p3}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 49
    .line 50
    .line 51
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 54
    .line 55
    .line 56
    throw p1
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
.end method

.method public static final synthetic access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    return-object p0
.end method

.method public static final synthetic access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    return-object p0
.end method

.method private final applyIfNotEmpty(ZLv3/l;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    :goto_0
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-interface {p2, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_2
    return-object p0
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
.end method

.method static synthetic applyIfNotEmpty$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 0

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
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-lez p1, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const/4 p4, 0x0

    .line 27
    :goto_0
    if-eqz p4, :cond_3

    .line 28
    .line 29
    invoke-interface {p2, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_3
    return-object p0
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

.method private final charOffset(I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lkotlin/ranges/s;->B(II)I

    move-result p1

    return p1
.end method

.method private final getLineEndByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, p2, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd(IZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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
.end method

.method static synthetic getLineEndByOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-wide p2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 6
    .line 7
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineEndByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
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
.end method

.method private final getLineStartByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineStart(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
.end method

.method static synthetic getLineStartByOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-wide p2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 6
    .line 7
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineStartByOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
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
.end method

.method private final getNextWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p2, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->charOffset(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getWordBoundary--jx7JFs(I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-gt v2, p2, :cond_1

    .line 29
    .line 30
    add-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
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
.end method

.method static synthetic getNextWordOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-wide p2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 6
    .line 7
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getNextWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
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
.end method

.method private final getPrevWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 3

    .line 1
    :goto_0
    if-gtz p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->charOffset(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getWordBoundary--jx7JFs(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-lt v2, p2, :cond_1

    .line 18
    .line 19
    add-int/lit8 p2, p2, -0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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
.end method

.method static synthetic getPrevWordOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-wide p2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 6
    .line 7
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getPrevWordOffsetForLayout(Landroidx/compose/ui/text/TextLayoutResult;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
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
.end method

.method private final isLtr()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 2
    .line 3
    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 4
    .line 5
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getParagraphDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Ltr:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
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

.method private final jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->getCachedX()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->setCachedX(F)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, p2

    .line 37
    if-gez v0, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    return p1

    .line 41
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineCount()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-lt v0, p2, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    :cond_2
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    const/4 v1, 0x1

    .line 59
    int-to-float v2, v1

    .line 60
    sub-float/2addr p2, v2

    .line 61
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textPreparedSelectionState:Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 62
    .line 63
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->getCachedX()F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineRight(I)F

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    cmpl-float v3, v2, v3

    .line 78
    .line 79
    if-gez v3, :cond_4

    .line 80
    .line 81
    :cond_3
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_5

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineLeft(I)F

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    cmpg-float v3, v2, v3

    .line 92
    .line 93
    if-gtz v3, :cond_5

    .line 94
    .line 95
    :cond_4
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd(IZ)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1

    .line 100
    :cond_5
    invoke-static {v2, p2}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    return p1
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

.method private final jumpByPagesOffset(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->visibleTextLayoutHeight:F

    .line 18
    .line 19
    int-to-float p1, p1

    .line 20
    mul-float/2addr v1, p1

    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/geometry/Rect;->translate(FF)Landroidx/compose/ui/geometry/Rect;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForVerticalPosition(F)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sub-float/2addr v1, v0

    .line 47
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    sub-float/2addr v2, v0

    .line 56
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    cmpl-float v0, v1, v0

    .line 61
    .line 62
    if-lez v0, :cond_0

    .line 63
    .line 64
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getBottomLeft-F1C5BW0()J

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    :goto_0
    return p1
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

.method private final moveCursorNext()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getNextCharacterIndex()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object p0
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

.method private final moveCursorNextByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getNextWordOffset()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-object p0
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

.method private final moveCursorPrev()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getPrecedingCharacterIndex()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object p0
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

.method private final moveCursorPrevByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getPreviousWordOffset()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-object p0
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

.method private final setCursor(I)V
    .locals 2

    invoke-static {p1, p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    return-void
.end method


# virtual methods
.method public final collapseLeftOr(Lv3/l;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 42
    .line 43
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 52
    .line 53
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_1
    return-object p0
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

.method public final collapseRightOr(Lv3/l;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 42
    .line 43
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 52
    .line 53
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_1
    return-object p0
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

.method public final deleteIfSelectedOr(Lv3/a;)V
    .locals 8
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Landroidx/compose/ui/text/TextRange;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getSelection-d9O1mEE()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x4

    .line 23
    const/4 v7, 0x0

    .line 24
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroidx/compose/ui/text/TextRange;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, ""

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x4

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceText-Sb-Bc2M$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final deselect()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object p0
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

.method public final getInitialValue()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    return-object v0
.end method

.method public final getLineEndByOffset()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineEndByOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final getLineStartByOffset()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineStartByOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final getNextCharacterIndex()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findFollowingBreak(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getNextWordOffset()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getNextWordOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final getPrecedingCharacterIndex()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpers_androidKt;->findPrecedingBreak(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getPreviousWordOffset()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getPrevWordOffsetForLayout$default(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;Landroidx/compose/ui/text/TextLayoutResult;IILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final getSelection-d9O1mEE()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    return-wide v0
.end method

.method public final moveCursorDownByLine()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 18
    .line 19
    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object p0
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

.method public final moveCursorDownByPage()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->jumpByPagesOffset(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-object p0
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

.method public final moveCursorLeft()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorPrev()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorNext()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-object p0
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

.method public final moveCursorLeftByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorPrevByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorNextByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-object p0
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

.method public final moveCursorNextByParagraph()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 24
    .line 25
    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphEnd(Ljava/lang/CharSequence;I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-ne v0, v1, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eq v0, v1, :cond_1

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x1

    .line 54
    .line 55
    invoke-static {v1, v0}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphEnd(Ljava/lang/CharSequence;I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    :cond_1
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object p0
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

.method public final moveCursorPrevByParagraph()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 24
    .line 25
    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v0, v1}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphStart(Ljava/lang/CharSequence;I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-ne v0, v1, :cond_1

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 46
    .line 47
    add-int/lit8 v0, v0, -0x1

    .line 48
    .line 49
    invoke-static {v1, v0}, Landroidx/compose/foundation/text/StringHelpersKt;->findParagraphStart(Ljava/lang/CharSequence;I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    :cond_1
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-object p0
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

.method public final moveCursorRight()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorNext()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorPrev()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-object p0
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

.method public final moveCursorRightByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorNextByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorPrevByWord()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-object p0
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

.method public final moveCursorToEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object p0
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

.method public final moveCursorToHome()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-object p0
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

.method public final moveCursorToLineEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineEndByOffset()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-object p0
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

.method public final moveCursorToLineLeftSide()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-object p0
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

.method public final moveCursorToLineRightSide()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->isLtr()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineEnd()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->moveCursorToLineStart()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-object p0
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

.method public final moveCursorToLineStart()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->getLineStartByOffset()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-object p0
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

.method public final moveCursorUpByLine()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->textLayoutResult:Landroidx/compose/ui/text/TextLayoutResult;

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->jumpByLinesOffset(Landroidx/compose/ui/text/TextLayoutResult;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object p0
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

.method public final moveCursorUpByPage()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->jumpByPagesOffset(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->setCursor(I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-object p0
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

.method public final selectAll()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getTextPreparedSelectionState$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;->resetCachedX()V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->text:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v1, v0}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    iput-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 35
    .line 36
    :cond_1
    return-object p0
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

.method public final selectMovement()Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->access$getText$p(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->initialValue:Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    .line 37
    .line 38
    :cond_1
    return-object p0
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

.method public final setSelection-5zc-tL8(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;->selection:J

    return-void
.end method
