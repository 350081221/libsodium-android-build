.class public Landroidx/core/text/method/LinkMovementMethodCompat;
.super Landroid/text/method/LinkMovementMethod;
.source "SourceFile"


# static fields
.field private static sInstance:Landroidx/core/text/method/LinkMovementMethodCompat;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    return-void
.end method

.method public static getInstance()Landroidx/core/text/method/LinkMovementMethodCompat;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/core/text/method/LinkMovementMethodCompat;->sInstance:Landroidx/core/text/method/LinkMovementMethodCompat;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/core/text/method/LinkMovementMethodCompat;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/core/text/method/LinkMovementMethodCompat;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Landroidx/core/text/method/LinkMovementMethodCompat;->sInstance:Landroidx/core/text/method/LinkMovementMethodCompat;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Landroidx/core/text/method/LinkMovementMethodCompat;->sInstance:Landroidx/core/text/method/LinkMovementMethodCompat;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/text/Spannable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/view/MotionEvent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/OptIn;
        markerClass = {
            Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/core/os/BuildCompat;->isAtLeastV()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    float-to-int v0, v0

    .line 21
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    float-to-int v2, v2

    .line 26
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sub-int/2addr v0, v3

    .line 31
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v2, v3

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v0, v3

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v2, v3

    .line 46
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-ltz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-le v2, v4, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    int-to-float v0, v0

    .line 64
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineLeft(I)F

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    cmpg-float v4, v0, v4

    .line 69
    .line 70
    if-ltz v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineRight(I)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    cmpl-float v0, v0, v2

    .line 77
    .line 78
    if-lez v0, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    const/4 v0, 0x0

    .line 82
    move v1, v0

    .line 83
    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-static {p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, p2, p3}, Landroid/text/method/Touch;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    return p1

    .line 93
    :cond_4
    invoke-super {p0, p1, p2, p3}, Landroid/text/method/LinkMovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    return p1
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
.end method
