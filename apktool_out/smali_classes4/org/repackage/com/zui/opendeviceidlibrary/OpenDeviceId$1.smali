.class Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Landroid/content/Context;Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;


# direct methods
.method constructor <init>(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;)V
    .locals 0

    iput-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    .line 3
    .line 4
    invoke-static {p2}, Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface$Stub;->a(Landroid/os/IBinder;)Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-static {p1, p2}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;)Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    .line 12
    .line 13
    invoke-static {p1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;)Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    .line 20
    .line 21
    invoke-static {p1}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;)Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string p2, "Deviceid Service Connected"

    .line 26
    .line 27
    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    .line 28
    .line 29
    invoke-interface {p1, p2, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$CallBack;->a(Ljava/lang/Object;Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    .line 33
    .line 34
    const-string p2, "Service onServiceConnected"

    .line 35
    .line 36
    invoke-static {p1, p2}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit p0

    .line 43
    throw p1
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

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;)Lorg/repackage/com/zui/deviceidservice/IDeviceidInterface;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId$1;->a:Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;

    .line 8
    .line 9
    const-string v0, "Service onServiceDisconnected"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;->a(Lorg/repackage/com/zui/opendeviceidlibrary/OpenDeviceId;Ljava/lang/String;)V

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
