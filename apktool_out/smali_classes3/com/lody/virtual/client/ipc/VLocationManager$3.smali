.class Lcom/lody/virtual/client/ipc/VLocationManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/ipc/VLocationManager;->notifyLocation(Ljava/lang/Object;Landroid/location/Location;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

.field final synthetic val$ListenerTransport:Ljava/lang/Object;

.field final synthetic val$location:Landroid/location/Location;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/ipc/VLocationManager;Landroid/location/Location;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->this$0:Lcom/lody/virtual/client/ipc/VLocationManager;

    iput-object p2, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$location:Landroid/location/Location;

    iput-object p3, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$ListenerTransport:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-le v0, v1, :cond_1

    .line 8
    .line 9
    const/16 v1, 0x1e

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$location:Landroid/location/Location;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    sget-object v1, Lmirror/android/location/LocationManager$LocationListenerTransport;->onLocationChanged:Lmirror/RefMethod;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$ListenerTransport:Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    new-array v5, v5, [Ljava/lang/Object;

    .line 29
    .line 30
    aput-object v0, v5, v2

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    aput-object v0, v5, v3

    .line 34
    .line 35
    invoke-virtual {v1, v4, v5}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v0, Lmirror/android/location/LocationManager$LocationListenerTransport;->onLocationChanged:Lmirror/RefMethod;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$ListenerTransport:Ljava/lang/Object;

    .line 42
    .line 43
    new-array v3, v3, [Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v4, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$location:Landroid/location/Location;

    .line 46
    .line 47
    aput-object v4, v3, v2

    .line 48
    .line 49
    invoke-virtual {v0, v1, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    sget-object v0, Lmirror/android/location/LocationManager$ListenerTransport;->onLocationChanged:Lmirror/RefMethod;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$ListenerTransport:Ljava/lang/Object;

    .line 56
    .line 57
    new-array v3, v3, [Ljava/lang/Object;

    .line 58
    .line 59
    iget-object v4, p0, Lcom/lody/virtual/client/ipc/VLocationManager$3;->val$location:Landroid/location/Location;

    .line 60
    .line 61
    aput-object v4, v3, v2

    .line 62
    .line 63
    invoke-virtual {v0, v1, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void
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
