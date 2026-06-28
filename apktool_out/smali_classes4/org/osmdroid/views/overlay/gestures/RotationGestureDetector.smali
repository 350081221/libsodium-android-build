.class public Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;
    }
.end annotation


# instance fields
.field private mEnabled:Z

.field private mListener:Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;

.field protected mRotation:F


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mEnabled:Z

    .line 6
    .line 7
    iput-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mListener:Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;

    .line 8
    .line 9
    return-void
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
.end method

.method private static rotation(Landroid/view/MotionEvent;)F
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-float/2addr v1, v3

    .line 12
    float-to-double v3, v1

    .line 13
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    sub-float/2addr v0, p0

    .line 22
    float-to-double v0, v0

    .line 23
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    double-to-float p0, v0

    .line 32
    return p0
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
.end method


# virtual methods
.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mEnabled:Z

    return v0
.end method

.method public onTouch(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x5

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    invoke-static {p1}, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->rotation(Landroid/view/MotionEvent;)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mRotation:F

    .line 21
    .line 22
    :cond_1
    invoke-static {p1}, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->rotation(Landroid/view/MotionEvent;)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mRotation:F

    .line 27
    .line 28
    sub-float v1, p1, v0

    .line 29
    .line 30
    iget-boolean v2, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mEnabled:Z

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    add-float/2addr v0, v1

    .line 35
    iput v0, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mRotation:F

    .line 36
    .line 37
    iget-object p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mListener:Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;

    .line 38
    .line 39
    invoke-interface {p1, v1}, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector$RotationListener;->onRotate(F)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iput p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mRotation:F

    .line 44
    .line 45
    :goto_0
    return-void
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
.end method

.method public setEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/gestures/RotationGestureDetector;->mEnabled:Z

    return-void
.end method
