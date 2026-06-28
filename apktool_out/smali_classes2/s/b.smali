.class public Ls/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/b$c;,
        Ls/b$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService"

.field public static final b:I = 0x1

.field public static final c:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ls/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls/b$b;-><init>(Ls/b$a;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Landroid/content/Intent;

    .line 8
    .line 9
    const-string v3, "com.uodis.opendevice.OPENIDS_SERVICE"

    .line 10
    .line 11
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "com.huawei.hwid"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {p1, v2, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    :try_start_0
    new-instance v2, Ls/b$c;

    .line 27
    .line 28
    invoke-virtual {v0}, Ls/b$b;->a()Landroid/os/IBinder;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v2, v3}, Ls/b$c;-><init>(Landroid/os/IBinder;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ls/b$c;->m()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :catch_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-object v1
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
.end method
