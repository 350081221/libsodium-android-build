.class public Lorg/osmdroid/views/overlay/gestures/OneFingerZoomOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# instance fields
.field private mIsDoubleClick:Z

.field private mLastY:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/gestures/OneFingerZoomOverlay;->mIsDoubleClick:Z

    .line 6
    .line 7
    return-void
    .line 8
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
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/gestures/OneFingerZoomOverlay;->mIsDoubleClick:Z

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/gestures/OneFingerZoomOverlay;->mIsDoubleClick:Z

    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Lorg/osmdroid/views/overlay/Overlay;->onDoubleTapEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/gestures/OneFingerZoomOverlay;->mIsDoubleClick:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x64

    .line 13
    .line 14
    const/high16 v2, 0x447a0000    # 1000.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    div-float/2addr v1, v2

    .line 28
    iget v2, p0, Lorg/osmdroid/views/overlay/gestures/OneFingerZoomOverlay;->mLastY:F

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    cmpl-float v2, v2, v3

    .line 35
    .line 36
    if-lez v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    float-to-double v5, v1

    .line 47
    sub-double/2addr v3, v5

    .line 48
    invoke-interface {v2, v3, v4}, Lorg/osmdroid/api/IMapController;->setZoom(D)D

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getController()Lorg/osmdroid/api/IMapController;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {p2}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    float-to-double v5, v1

    .line 61
    add-double/2addr v3, v5

    .line 62
    invoke-interface {v2, v3, v4}, Lorg/osmdroid/api/IMapController;->setZoom(D)D

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iput v1, p0, Lorg/osmdroid/views/overlay/gestures/OneFingerZoomOverlay;->mLastY:F

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-super {p0, p1, p2}, Lorg/osmdroid/views/overlay/Overlay;->onTouchEvent(Landroid/view/MotionEvent;Lorg/osmdroid/views/MapView;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    return p1
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
.end method
