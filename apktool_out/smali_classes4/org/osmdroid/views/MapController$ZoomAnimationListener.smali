.class public Lorg/osmdroid/views/MapController$ZoomAnimationListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/views/MapController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ZoomAnimationListener"
.end annotation


# instance fields
.field private mMapController:Lorg/osmdroid/views/MapController;


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/MapController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/osmdroid/views/MapController$ZoomAnimationListener;->mMapController:Lorg/osmdroid/views/MapController;

    .line 5
    .line 6
    return-void
    .line 7
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
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    iget-object p1, p0, Lorg/osmdroid/views/MapController$ZoomAnimationListener;->mMapController:Lorg/osmdroid/views/MapController;

    invoke-virtual {p1}, Lorg/osmdroid/views/MapController;->onAnimationEnd()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    iget-object p1, p0, Lorg/osmdroid/views/MapController$ZoomAnimationListener;->mMapController:Lorg/osmdroid/views/MapController;

    invoke-virtual {p1}, Lorg/osmdroid/views/MapController;->onAnimationStart()V

    return-void
.end method
