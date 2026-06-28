.class public final Landroidx/compose/ui/text/android/selection/WordBoundary;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/selection/WordBoundary;",
        "",
        "locale",
        "Ljava/util/Locale;",
        "text",
        "",
        "(Ljava/util/Locale;Ljava/lang/CharSequence;)V",
        "wordIterator",
        "Landroidx/compose/ui/text/android/selection/WordIterator;",
        "getWordEnd",
        "",
        "offset",
        "getWordStart",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;Ljava/lang/CharSequence;)V
    .locals 3
    .param p1    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, p2, v2, v1, p1}, Landroidx/compose/ui/text/android/selection/WordIterator;-><init>(Ljava/lang/CharSequence;IILjava/util/Locale;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 15
    .line 16
    return-void
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


# virtual methods
.method public final getWordEnd(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/selection/WordIterator;->nextBoundary(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroidx/compose/ui/text/android/selection/WordIterator;->isAfterPunctuation(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/selection/WordIterator;->getPunctuationEnd(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/selection/WordIterator;->getNextWordEndOnTwoWordBoundary(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    const/4 v1, -0x1

    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move p1, v0

    .line 33
    :goto_1
    return p1
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
.end method

.method public final getWordStart(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/selection/WordIterator;->prevBoundary(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroidx/compose/ui/text/android/selection/WordIterator;->isOnPunctuation(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/selection/WordIterator;->getPunctuationBeginning(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/text/android/selection/WordBoundary;->wordIterator:Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/selection/WordIterator;->getPrevWordBeginningOnTwoWordsBoundary(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    const/4 v1, -0x1

    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move p1, v0

    .line 33
    :goto_1
    return p1
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
.end method
