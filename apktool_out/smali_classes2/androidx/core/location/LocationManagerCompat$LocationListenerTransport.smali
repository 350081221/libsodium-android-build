.class Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/location/LocationManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LocationListenerTransport"
.end annotation


# instance fields
.field final mExecutor:Ljava/util/concurrent/Executor;

.field volatile mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/core/location/LocationManagerCompat$LocationListenerKey;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p1    # Landroidx/core/location/LocationManagerCompat$LocationListenerKey;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mExecutor:Ljava/util/concurrent/Executor;

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

.method public static synthetic a(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->lambda$onProviderEnabled$4(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->lambda$onStatusChanged$3(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->lambda$onLocationChanged$1(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic d(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->lambda$onFlushComplete$2(I)V

    return-void
.end method

.method public static synthetic e(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->lambda$onProviderDisabled$5(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->lambda$onLocationChanged$0(Landroid/location/Location;)V

    return-void
.end method

.method private synthetic lambda$onFlushComplete$2(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Landroidx/core/location/LocationManagerCompat$LocationListenerKey;->mListener:Landroidx/core/location/LocationListenerCompat;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/core/location/LocationListenerCompat;->onFlushComplete(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private synthetic lambda$onLocationChanged$0(Landroid/location/Location;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Landroidx/core/location/LocationManagerCompat$LocationListenerKey;->mListener:Landroidx/core/location/LocationListenerCompat;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroid/location/LocationListener;->onLocationChanged(Landroid/location/Location;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private synthetic lambda$onLocationChanged$1(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Landroidx/core/location/LocationManagerCompat$LocationListenerKey;->mListener:Landroidx/core/location/LocationListenerCompat;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/core/location/LocationListenerCompat;->onLocationChanged(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private synthetic lambda$onProviderDisabled$5(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Landroidx/core/location/LocationManagerCompat$LocationListenerKey;->mListener:Landroidx/core/location/LocationListenerCompat;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/core/location/LocationListenerCompat;->onProviderDisabled(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private synthetic lambda$onProviderEnabled$4(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Landroidx/core/location/LocationManagerCompat$LocationListenerKey;->mListener:Landroidx/core/location/LocationListenerCompat;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Landroidx/core/location/LocationListenerCompat;->onProviderEnabled(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private synthetic lambda$onStatusChanged$3(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Landroidx/core/location/LocationManagerCompat$LocationListenerKey;->mListener:Landroidx/core/location/LocationListenerCompat;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2, p3}, Landroidx/core/location/LocationListenerCompat;->onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
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
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public getKey()Landroidx/core/location/LocationManagerCompat$LocationListenerKey;
    .locals 1

    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    invoke-static {v0}, Landroidx/core/util/ObjectsCompat;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    return-object v0
.end method

.method public onFlushComplete(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mExecutor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v1, Landroidx/core/location/k0;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Landroidx/core/location/k0;-><init>(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
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
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2
    .param p1    # Landroid/location/Location;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/n0;

    invoke-direct {v1, p0, p1}, Landroidx/core/location/n0;-><init>(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Landroid/location/Location;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLocationChanged(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/l0;

    invoke-direct {v1, p0, p1}, Landroidx/core/location/l0;-><init>(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mExecutor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v1, Landroidx/core/location/m0;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Landroidx/core/location/m0;-><init>(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
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
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mExecutor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v1, Landroidx/core/location/j0;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Landroidx/core/location/j0;-><init>(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
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
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mExecutor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v1, Landroidx/core/location/o0;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/core/location/o0;-><init>(Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
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
    .line 112
    .line 113
    .line 114
.end method

.method public unregister()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/core/location/LocationManagerCompat$LocationListenerTransport;->mKey:Landroidx/core/location/LocationManagerCompat$LocationListenerKey;

    return-void
.end method
