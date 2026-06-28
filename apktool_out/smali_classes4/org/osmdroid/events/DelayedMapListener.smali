.class public Lorg/osmdroid/events/DelayedMapListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/events/MapListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/events/DelayedMapListener$CallbackTask;
    }
.end annotation


# static fields
.field protected static final DEFAULT_DELAY:I = 0x64


# instance fields
.field protected callback:Lorg/osmdroid/events/DelayedMapListener$CallbackTask;

.field protected delay:J

.field protected handler:Landroid/os/Handler;

.field wrappedListener:Lorg/osmdroid/events/MapListener;


# direct methods
.method public constructor <init>(Lorg/osmdroid/events/MapListener;)V
    .locals 2

    const-wide/16 v0, 0x64

    .line 6
    invoke-direct {p0, p1, v0, v1}, Lorg/osmdroid/events/DelayedMapListener;-><init>(Lorg/osmdroid/events/MapListener;J)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/events/MapListener;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/osmdroid/events/DelayedMapListener;->wrappedListener:Lorg/osmdroid/events/MapListener;

    .line 3
    iput-wide p2, p0, Lorg/osmdroid/events/DelayedMapListener;->delay:J

    .line 4
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lorg/osmdroid/events/DelayedMapListener;->handler:Landroid/os/Handler;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lorg/osmdroid/events/DelayedMapListener;->callback:Lorg/osmdroid/events/DelayedMapListener$CallbackTask;

    return-void
.end method


# virtual methods
.method protected dispatch(Lorg/osmdroid/events/MapEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/events/DelayedMapListener;->callback:Lorg/osmdroid/events/DelayedMapListener$CallbackTask;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/osmdroid/events/DelayedMapListener;->handler:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Lorg/osmdroid/events/DelayedMapListener$CallbackTask;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lorg/osmdroid/events/DelayedMapListener$CallbackTask;-><init>(Lorg/osmdroid/events/DelayedMapListener;Lorg/osmdroid/events/MapEvent;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lorg/osmdroid/events/DelayedMapListener;->callback:Lorg/osmdroid/events/DelayedMapListener$CallbackTask;

    .line 16
    .line 17
    iget-object p1, p0, Lorg/osmdroid/events/DelayedMapListener;->handler:Landroid/os/Handler;

    .line 18
    .line 19
    iget-wide v1, p0, Lorg/osmdroid/events/DelayedMapListener;->delay:J

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 22
    .line 23
    .line 24
    return-void
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

.method public onScroll(Lorg/osmdroid/events/ScrollEvent;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lorg/osmdroid/events/DelayedMapListener;->dispatch(Lorg/osmdroid/events/MapEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onZoom(Lorg/osmdroid/events/ZoomEvent;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lorg/osmdroid/events/DelayedMapListener;->dispatch(Lorg/osmdroid/events/MapEvent;)V

    const/4 p1, 0x1

    return p1
.end method
