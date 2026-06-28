.class public final Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\u0008\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\t\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;",
        "",
        "()V",
        "LongPress",
        "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;",
        "getLongPress-5zf0vsI",
        "()I",
        "I",
        "TextHandleMove",
        "getTextHandleMove-5zf0vsI",
        "ui_release"
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

.field public static final INSTANCE:Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final LongPress:I

.field private static final TextHandleMove:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;->INSTANCE:Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->constructor-impl(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput v0, Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;->LongPress:I

    .line 14
    .line 15
    const/16 v0, 0x9

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->constructor-impl(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sput v0, Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;->TextHandleMove:I

    .line 22
    .line 23
    return-void
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
.method public final getLongPress-5zf0vsI()I
    .locals 1

    sget v0, Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;->LongPress:I

    return v0
.end method

.method public final getTextHandleMove-5zf0vsI()I
    .locals 1

    sget v0, Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;->TextHandleMove:I

    return v0
.end method
