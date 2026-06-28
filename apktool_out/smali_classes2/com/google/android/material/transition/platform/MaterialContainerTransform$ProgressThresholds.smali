.class public Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/transition/platform/MaterialContainerTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProgressThresholds"
.end annotation


# instance fields
.field private final end:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field private final start:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field


# direct methods
.method public constructor <init>(FF)V
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .param p2    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->start:F

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->end:F

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

.method static synthetic access$1000(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)F
    .locals 0

    iget p0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->start:F

    return p0
.end method

.method static synthetic access$1100(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)F
    .locals 0

    iget p0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->end:F

    return p0
.end method


# virtual methods
.method public getEnd()F
    .locals 1
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->end:F

    return v0
.end method

.method public getStart()F
    .locals 1
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->start:F

    return v0
.end method
