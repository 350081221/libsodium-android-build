.class final Lcom/google/android/material/internal/FadeThroughUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final THRESHOLD_ALPHA:F = 0.5f


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static calculateFadeOutAndInAlphas(F[F)V
    .locals 6
    .param p0    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    cmpg-float v0, p0, v0

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/high16 v2, 0x40000000    # 2.0f

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    mul-float/2addr p0, v2

    .line 15
    sub-float/2addr v1, p0

    .line 16
    aput v1, p1, v5

    .line 17
    .line 18
    aput v4, p1, v3

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    aput v4, p1, v5

    .line 22
    .line 23
    mul-float/2addr p0, v2

    .line 24
    sub-float/2addr p0, v1

    .line 25
    aput p0, p1, v3

    .line 26
    .line 27
    :goto_0
    return-void
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
.end method
