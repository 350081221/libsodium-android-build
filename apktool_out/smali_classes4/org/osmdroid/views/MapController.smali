.class public Lorg/osmdroid/views/MapController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/api/IMapController;
.implements Lorg/osmdroid/views/MapView$OnFirstLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/MapController$ReplayController;,
        Lorg/osmdroid/views/MapController$ZoomAnimationListener;,
        Lorg/osmdroid/views/MapController$MapAnimatorListener;,
        Lorg/osmdroid/views/MapController$ReplayType;
    }
.end annotation


# instance fields
.field private mCurrentAnimator:Landroid/animation/Animator;

.field private mInterpolator:Landroid/animation/TimeInterpolator;

.field protected final mMapView:Lorg/osmdroid/views/MapView;

.field private mReplayController:Lorg/osmdroid/views/MapController$ReplayController;

.field private mTargetZoomLevel:D

.field private mZoomInAnimationOld:Landroid/view/animation/ScaleAnimation;

.field private mZoomOutAnimationOld:Landroid/view/animation/ScaleAnimation;


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lorg/osmdroid/views/MapController;->mTargetZoomLevel:D

    .line 7
    .line 8
    iput-object p1, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 9
    .line 10
    new-instance v0, Lorg/osmdroid/views/MapController$ReplayController;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, v1}, Lorg/osmdroid/views/MapController$ReplayController;-><init>(Lorg/osmdroid/views/MapController;Lorg/osmdroid/views/MapController$1;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/osmdroid/views/MapController;->mReplayController:Lorg/osmdroid/views/MapController$ReplayController;

    .line 17
    .line 18
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lorg/osmdroid/views/MapView;->addOnFirstLayoutListener(Lorg/osmdroid/views/MapView$OnFirstLayoutListener;)V

    .line 25
    .line 26
    .line 27
    :cond_0
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
.method public animateTo(II)V
    .locals 8

    .line 20
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    move-result v0

    if-nez v0, :cond_0

    .line 21
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mReplayController:Lorg/osmdroid/views/MapController$ReplayController;

    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/views/MapController$ReplayController;->animateTo(II)V

    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->isAnimating()Z

    move-result v0

    if-nez v0, :cond_2

    .line 23
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lorg/osmdroid/views/MapView;->mIsFlinging:Z

    .line 24
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getMapScrollX()J

    move-result-wide v0

    long-to-int v3, v0

    .line 25
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getMapScrollY()J

    move-result-wide v0

    long-to-int v4, v0

    .line 26
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v5, p1, v0

    .line 27
    iget-object p1, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    sub-int v6, p2, p1

    if-ne v5, v3, :cond_1

    if-eq v6, v4, :cond_2

    .line 28
    :cond_1
    iget-object p1, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getScroller()Landroid/widget/Scroller;

    move-result-object v2

    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object p1

    invoke-interface {p1}, Lorg/osmdroid/config/c;->N()I

    move-result v7

    invoke-virtual/range {v2 .. v7}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 29
    iget-object p1, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    :cond_2
    return-void
.end method

.method public animateTo(Lorg/osmdroid/api/IGeoPoint;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lorg/osmdroid/views/MapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;)V

    return-void
.end method

.method public animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/osmdroid/views/MapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;)V

    return-void
.end method

.method public animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 2
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/MapController;->animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Boolean;)V

    return-void
.end method

.method public animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Boolean;)V
    .locals 11

    move-object v9, p0

    .line 3
    iget-object v0, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v1, v9, Lorg/osmdroid/views/MapController;->mReplayController:Lorg/osmdroid/views/MapController$ReplayController;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/views/MapController$ReplayController;->animateTo(Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Boolean;)V

    return-void

    .line 5
    :cond_0
    new-instance v4, Lorg/osmdroid/util/GeoPoint;

    iget-object v0, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/views/Projection;->getCurrentCenter()Lorg/osmdroid/util/GeoPoint;

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    .line 6
    new-instance v10, Lorg/osmdroid/views/MapController$MapAnimatorListener;

    iget-object v0, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 7
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iget-object v0, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 8
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object v0, v10

    move-object v1, p0

    move-object v3, p2

    move-object v5, p1

    move-object v7, p4

    move-object/from16 v8, p5

    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/views/MapController$MapAnimatorListener;-><init>(Lorg/osmdroid/views/MapController;Ljava/lang/Double;Ljava/lang/Double;Lorg/osmdroid/api/IGeoPoint;Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 9
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v10}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 11
    invoke-virtual {v0, v10}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    if-nez p3, :cond_1

    .line 12
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v1

    invoke-interface {v1}, Lorg/osmdroid/config/c;->N()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 14
    :goto_0
    iget-object v1, v9, Lorg/osmdroid/views/MapController;->mCurrentAnimator:Landroid/animation/Animator;

    if-eqz v1, :cond_2

    .line 15
    invoke-virtual {v10, v1}, Lorg/osmdroid/views/MapController$MapAnimatorListener;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 16
    :cond_2
    iget-object v1, v9, Lorg/osmdroid/views/MapController;->mInterpolator:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 17
    iput-object v0, v9, Lorg/osmdroid/views/MapController;->mCurrentAnimator:Landroid/animation/Animator;

    .line 18
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method protected onAnimationEnd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/osmdroid/views/MapView;->mIsAnimating:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->resetMultiTouchScale()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lorg/osmdroid/views/MapController;->mCurrentAnimator:Landroid/animation/Animator;

    .line 16
    .line 17
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
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

.method protected onAnimationStart()V
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    iget-object v0, v0, Lorg/osmdroid/views/MapView;->mIsAnimating:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public onFirstLayout(Landroid/view/View;IIII)V
    .locals 0

    iget-object p1, p0, Lorg/osmdroid/views/MapController;->mReplayController:Lorg/osmdroid/views/MapController$ReplayController;

    invoke-virtual {p1}, Lorg/osmdroid/views/MapController$ReplayController;->replayCalls()V

    return-void
.end method

.method public scrollBy(II)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/views/MapView;->scrollBy(II)V

    return-void
.end method

.method public setCenter(Lorg/osmdroid/api/IGeoPoint;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mReplayController:Lorg/osmdroid/views/MapController$ReplayController;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/MapController$ReplayController;->setCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lorg/osmdroid/views/MapView;->setExpectedCenter(Lorg/osmdroid/api/IGeoPoint;)V

    .line 18
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
.end method

.method public setZoom(D)D
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/views/MapView;->setZoomLevel(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public setZoom(I)I
    .locals 2

    int-to-double v0, p1

    .line 1
    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/views/MapController;->setZoom(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method

.method public stopAnimation(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getScroller()Landroid/widget/Scroller;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lorg/osmdroid/views/MapView;->mIsFlinging:Z

    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getScroller()Landroid/widget/Scroller;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lorg/osmdroid/views/MapController;->stopPanning()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mCurrentAnimator:Landroid/animation/Animator;

    .line 32
    .line 33
    iget-object v1, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 34
    .line 35
    iget-object v1, v1, Lorg/osmdroid/views/MapView;->mIsAnimating:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_1
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public stopPanning()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lorg/osmdroid/views/MapView;->mIsFlinging:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getScroller()Landroid/widget/Scroller;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public zoomIn()Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/MapController;->zoomIn(Ljava/lang/Long;)Z

    move-result v0

    return v0
.end method

.method public zoomIn(Ljava/lang/Long;)Z
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    invoke-virtual {p0, v0, v1, p1}, Lorg/osmdroid/views/MapController;->zoomTo(DLjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomInFixing(II)Z
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/views/MapController;->zoomInFixing(IILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomInFixing(IILjava/lang/Long;)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double v5, v0, v2

    move-object v4, p0

    move v7, p1

    move v8, p2

    move-object v9, p3

    invoke-virtual/range {v4 .. v9}, Lorg/osmdroid/views/MapController;->zoomToFixing(DIILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomOut()Z
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/MapController;->zoomOut(Ljava/lang/Long;)Z

    move-result v0

    return v0
.end method

.method public zoomOut(Ljava/lang/Long;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    invoke-virtual {p0, v0, v1, p1}, Lorg/osmdroid/views/MapController;->zoomTo(DLjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomOutFixing(II)Z
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double v5, v0, v2

    const/4 v9, 0x0

    move-object v4, p0

    move v7, p1

    move v8, p2

    invoke-virtual/range {v4 .. v9}, Lorg/osmdroid/views/MapController;->zoomToFixing(DIILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomTo(D)Z
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/views/MapController;->zoomTo(DLjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomTo(DLjava/lang/Long;)Z
    .locals 7

    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v5, v0, 0x2

    move-object v1, p0

    move-wide v2, p1

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/views/MapController;->zoomToFixing(DIILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomTo(I)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/osmdroid/views/MapController;->zoomTo(ILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomTo(ILjava/lang/Long;)Z
    .locals 2

    int-to-double v0, p1

    .line 2
    invoke-virtual {p0, v0, v1, p2}, Lorg/osmdroid/views/MapController;->zoomTo(DLjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomToFixing(DII)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    .line 23
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/MapController;->zoomToFixing(DIILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomToFixing(DIILjava/lang/Long;)Z
    .locals 12

    move-object v9, p0

    .line 2
    iget-object v0, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getMaxZoomLevel()D

    move-result-wide v0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_0

    iget-object v0, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getMaxZoomLevel()D

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    .line 3
    :goto_0
    iget-object v2, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v2}, Lorg/osmdroid/views/MapView;->getMinZoomLevel()D

    move-result-wide v2

    cmpg-double v2, v0, v2

    if-gez v2, :cond_1

    iget-object v0, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getMinZoomLevel()D

    move-result-wide v0

    .line 4
    :cond_1
    iget-object v2, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v2}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v2

    cmpg-double v4, v0, v2

    const/4 v10, 0x1

    const/4 v5, 0x0

    if-gez v4, :cond_2

    .line 5
    iget-object v4, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v4}, Lorg/osmdroid/views/MapView;->canZoomOut()Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    cmpl-double v4, v0, v2

    if-lez v4, :cond_4

    iget-object v4, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    .line 6
    invoke-virtual {v4}, Lorg/osmdroid/views/MapView;->canZoomIn()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    move v4, v10

    goto :goto_1

    :cond_4
    move v4, v5

    :goto_1
    if-nez v4, :cond_5

    return v5

    .line 7
    :cond_5
    iget-object v4, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    iget-object v4, v4, Lorg/osmdroid/views/MapView;->mIsAnimating:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v4

    if-eqz v4, :cond_6

    return v5

    .line 8
    :cond_6
    iget-object v4, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    iget-object v4, v4, Lorg/osmdroid/views/MapView;->mListners:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/osmdroid/events/MapListener;

    if-eqz v5, :cond_7

    goto :goto_3

    .line 9
    :cond_7
    new-instance v5, Lorg/osmdroid/events/ZoomEvent;

    iget-object v7, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-direct {v5, v7, v0, v1}, Lorg/osmdroid/events/ZoomEvent;-><init>(Lorg/osmdroid/views/MapView;D)V

    :goto_3
    invoke-interface {v6, v5}, Lorg/osmdroid/events/MapListener;->onZoom(Lorg/osmdroid/events/ZoomEvent;)Z

    goto :goto_2

    .line 10
    :cond_8
    iget-object v4, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    move v5, p3

    int-to-float v5, v5

    move/from16 v6, p4

    int-to-float v6, v6

    invoke-virtual {v4, v5, v6}, Lorg/osmdroid/views/MapView;->setMultiTouchScaleInitPoint(FF)V

    .line 11
    iget-object v4, v9, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v4}, Lorg/osmdroid/views/MapView;->startAnimation()V

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    sub-double v6, v0, v2

    .line 12
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 13
    new-instance v11, Lorg/osmdroid/views/MapController$MapAnimatorListener;

    .line 14
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v11

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/views/MapController$MapAnimatorListener;-><init>(Lorg/osmdroid/views/MapController;Ljava/lang/Double;Ljava/lang/Double;Lorg/osmdroid/api/IGeoPoint;Lorg/osmdroid/api/IGeoPoint;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 15
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 16
    invoke-virtual {v0, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 17
    invoke-virtual {v0, v11}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    if-nez p5, :cond_9

    .line 18
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v1

    invoke-interface {v1}, Lorg/osmdroid/config/c;->a0()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    goto :goto_4

    .line 19
    :cond_9
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 20
    :goto_4
    iget-object v1, v9, Lorg/osmdroid/views/MapController;->mInterpolator:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 21
    iput-object v0, v9, Lorg/osmdroid/views/MapController;->mCurrentAnimator:Landroid/animation/Animator;

    .line 22
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return v10

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public zoomToFixing(III)Z
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/osmdroid/views/MapController;->zoomToFixing(IIILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomToFixing(IIILjava/lang/Long;)Z
    .locals 6

    int-to-double v1, p1

    move-object v0, p0

    move v3, p2

    move v4, p3

    move-object v5, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/MapController;->zoomToFixing(DIILjava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public zoomToSpan(DD)V
    .locals 7

    const-wide/16 v0, 0x0

    cmpg-double v2, p1, v0

    if-lez v2, :cond_3

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->isLayoutOccurred()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mReplayController:Lorg/osmdroid/views/MapController$ReplayController;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/osmdroid/views/MapController$ReplayController;->zoomToSpan(DD)V

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/views/Projection;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    invoke-virtual {v1}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v1

    invoke-virtual {v1}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    move-result-wide v1

    .line 5
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLatitudeSpan()D

    move-result-wide v3

    .line 6
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpan()D

    move-result-wide v5

    div-double/2addr p1, v3

    div-double/2addr p3, v5

    .line 7
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    const-wide/high16 p3, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p1, p3

    if-lez v0, :cond_2

    .line 8
    iget-object p3, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    double-to-float p1, p1

    invoke-static {p1}, Lorg/osmdroid/util/MyMath;->getNextSquareNumberAbove(F)I

    move-result p1

    int-to-double p1, p1

    sub-double/2addr v1, p1

    invoke-virtual {p3, v1, v2}, Lorg/osmdroid/views/MapView;->setZoomLevel(D)D

    goto :goto_0

    :cond_2
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, p1, v3

    if-gez v0, :cond_3

    .line 9
    iget-object v0, p0, Lorg/osmdroid/views/MapController;->mMapView:Lorg/osmdroid/views/MapView;

    const/high16 v3, 0x3f800000    # 1.0f

    double-to-float p1, p1

    div-float/2addr v3, p1

    .line 10
    invoke-static {v3}, Lorg/osmdroid/util/MyMath;->getNextSquareNumberAbove(F)I

    move-result p1

    int-to-double p1, p1

    add-double/2addr v1, p1

    sub-double/2addr v1, p3

    .line 11
    invoke-virtual {v0, v1, v2}, Lorg/osmdroid/views/MapView;->setZoomLevel(D)D

    :cond_3
    :goto_0
    return-void
.end method

.method public zoomToSpan(II)V
    .locals 4

    int-to-double v0, p1

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    mul-double/2addr v0, v2

    int-to-double p1, p2

    mul-double/2addr p1, v2

    .line 12
    invoke-virtual {p0, v0, v1, p1, p2}, Lorg/osmdroid/views/MapController;->zoomToSpan(DD)V

    return-void
.end method
