.class public final Landroidx/compose/ui/text/android/LayoutCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/android/LayoutCompat$BreakStrategy;,
        Landroidx/compose/ui/text/android/LayoutCompat$HyphenationFrequency;,
        Landroidx/compose/ui/text/android/LayoutCompat$JustificationMode;,
        Landroidx/compose/ui/text/android/LayoutCompat$LineBreakStyle;,
        Landroidx/compose/ui/text/android/LayoutCompat$LineBreakWordStyle;,
        Landroidx/compose/ui/text/android/LayoutCompat$TextDirection;,
        Landroidx/compose/ui/text/android/LayoutCompat$TextLayoutAlignment;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u000756789:;B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/LayoutCompat;",
        "",
        "()V",
        "ALIGN_CENTER",
        "",
        "ALIGN_LEFT",
        "ALIGN_NORMAL",
        "ALIGN_OPPOSITE",
        "ALIGN_RIGHT",
        "BREAK_STRATEGY_BALANCED",
        "BREAK_STRATEGY_HIGH_QUALITY",
        "BREAK_STRATEGY_SIMPLE",
        "DEFAULT_ALIGNMENT",
        "DEFAULT_BREAK_STRATEGY",
        "DEFAULT_FALLBACK_LINE_SPACING",
        "",
        "DEFAULT_HYPHENATION_FREQUENCY",
        "DEFAULT_INCLUDE_PADDING",
        "DEFAULT_JUSTIFICATION_MODE",
        "DEFAULT_LAYOUT_ALIGNMENT",
        "Landroid/text/Layout$Alignment;",
        "getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release",
        "()Landroid/text/Layout$Alignment;",
        "DEFAULT_LINESPACING_EXTRA",
        "",
        "DEFAULT_LINESPACING_MULTIPLIER",
        "DEFAULT_LINE_BREAK_STYLE",
        "DEFAULT_LINE_BREAK_WORD_STYLE",
        "DEFAULT_MAX_LINES",
        "DEFAULT_TEXT_DIRECTION",
        "DEFAULT_TEXT_DIRECTION_HEURISTIC",
        "Landroid/text/TextDirectionHeuristic;",
        "getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release",
        "()Landroid/text/TextDirectionHeuristic;",
        "HYPHENATION_FREQUENCY_FULL",
        "HYPHENATION_FREQUENCY_FULL_FAST",
        "HYPHENATION_FREQUENCY_NONE",
        "HYPHENATION_FREQUENCY_NORMAL",
        "HYPHENATION_FREQUENCY_NORMAL_FAST",
        "JUSTIFICATION_MODE_INTER_WORD",
        "JUSTIFICATION_MODE_NONE",
        "LINE_BREAK_STYLE_LOOSE",
        "LINE_BREAK_STYLE_NONE",
        "LINE_BREAK_STYLE_NORMAL",
        "LINE_BREAK_STYLE_STRICT",
        "LINE_BREAK_WORD_STYLE_NONE",
        "LINE_BREAK_WORD_STYLE_PHRASE",
        "TEXT_DIRECTION_ANY_RTL_LTR",
        "TEXT_DIRECTION_FIRST_STRONG_LTR",
        "TEXT_DIRECTION_FIRST_STRONG_RTL",
        "TEXT_DIRECTION_LOCALE",
        "TEXT_DIRECTION_LTR",
        "TEXT_DIRECTION_RTL",
        "BreakStrategy",
        "HyphenationFrequency",
        "JustificationMode",
        "LineBreakStyle",
        "LineBreakWordStyle",
        "TextDirection",
        "TextLayoutAlignment",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final ALIGN_CENTER:I = 0x2

.field public static final ALIGN_LEFT:I = 0x3

.field public static final ALIGN_NORMAL:I = 0x0

.field public static final ALIGN_OPPOSITE:I = 0x1

.field public static final ALIGN_RIGHT:I = 0x4

.field public static final BREAK_STRATEGY_BALANCED:I = 0x2

.field public static final BREAK_STRATEGY_HIGH_QUALITY:I = 0x1

.field public static final BREAK_STRATEGY_SIMPLE:I = 0x0

.field public static final DEFAULT_ALIGNMENT:I = 0x0

.field public static final DEFAULT_BREAK_STRATEGY:I = 0x0

.field public static final DEFAULT_FALLBACK_LINE_SPACING:Z = true

.field public static final DEFAULT_HYPHENATION_FREQUENCY:I = 0x0

.field public static final DEFAULT_INCLUDE_PADDING:Z = false

.field public static final DEFAULT_JUSTIFICATION_MODE:I = 0x0

.field private static final DEFAULT_LAYOUT_ALIGNMENT:Landroid/text/Layout$Alignment;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final DEFAULT_LINESPACING_EXTRA:F = 0.0f

.field public static final DEFAULT_LINESPACING_MULTIPLIER:F = 1.0f

.field public static final DEFAULT_LINE_BREAK_STYLE:I = 0x0

.field public static final DEFAULT_LINE_BREAK_WORD_STYLE:I = 0x0

.field public static final DEFAULT_MAX_LINES:I = 0x7fffffff

.field public static final DEFAULT_TEXT_DIRECTION:I = 0x2

.field private static final DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/text/TextDirectionHeuristic;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final HYPHENATION_FREQUENCY_FULL:I = 0x2

.field public static final HYPHENATION_FREQUENCY_FULL_FAST:I = 0x4

.field public static final HYPHENATION_FREQUENCY_NONE:I = 0x0

.field public static final HYPHENATION_FREQUENCY_NORMAL:I = 0x1

.field public static final HYPHENATION_FREQUENCY_NORMAL_FAST:I = 0x3

.field public static final INSTANCE:Landroidx/compose/ui/text/android/LayoutCompat;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final JUSTIFICATION_MODE_INTER_WORD:I = 0x1

.field public static final JUSTIFICATION_MODE_NONE:I = 0x0

.field public static final LINE_BREAK_STYLE_LOOSE:I = 0x1

.field public static final LINE_BREAK_STYLE_NONE:I = 0x0

.field public static final LINE_BREAK_STYLE_NORMAL:I = 0x2

.field public static final LINE_BREAK_STYLE_STRICT:I = 0x3

.field public static final LINE_BREAK_WORD_STYLE_NONE:I = 0x0

.field public static final LINE_BREAK_WORD_STYLE_PHRASE:I = 0x1

.field public static final TEXT_DIRECTION_ANY_RTL_LTR:I = 0x4

.field public static final TEXT_DIRECTION_FIRST_STRONG_LTR:I = 0x2

.field public static final TEXT_DIRECTION_FIRST_STRONG_RTL:I = 0x3

.field public static final TEXT_DIRECTION_LOCALE:I = 0x5

.field public static final TEXT_DIRECTION_LTR:I = 0x0

.field public static final TEXT_DIRECTION_RTL:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/text/android/LayoutCompat;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/text/android/LayoutCompat;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/text/android/LayoutCompat;->INSTANCE:Landroidx/compose/ui/text/android/LayoutCompat;

    .line 7
    .line 8
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 9
    .line 10
    sput-object v0, Landroidx/compose/ui/text/android/LayoutCompat;->DEFAULT_LAYOUT_ALIGNMENT:Landroid/text/Layout$Alignment;

    .line 11
    .line 12
    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 13
    .line 14
    sput-object v0, Landroidx/compose/ui/text/android/LayoutCompat;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/text/TextDirectionHeuristic;

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    sput v0, Landroidx/compose/ui/text/android/LayoutCompat;->$stable:I

    .line 19
    .line 20
    return-void
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

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release()Landroid/text/Layout$Alignment;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/text/android/LayoutCompat;->DEFAULT_LAYOUT_ALIGNMENT:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release()Landroid/text/TextDirectionHeuristic;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/text/android/LayoutCompat;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/text/TextDirectionHeuristic;

    return-object v0
.end method
