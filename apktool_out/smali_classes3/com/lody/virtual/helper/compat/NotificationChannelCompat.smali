.class public Lcom/lody/virtual/helper/compat/NotificationChannelCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DAEMON_ID:Ljava/lang/String;

.field public static final DEFAULT_ID:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/lody/virtual/client/env/Constants;->NOTIFICATION_DAEMON_CHANNEL:Ljava/lang/String;

    .line 2
    .line 3
    sput-object v0, Lcom/lody/virtual/helper/compat/NotificationChannelCompat;->DAEMON_ID:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v0, Lcom/lody/virtual/client/env/Constants;->NOTIFICATION_CHANNEL:Ljava/lang/String;

    .line 6
    .line 7
    sput-object v0, Lcom/lody/virtual/helper/compat/NotificationChannelCompat;->DEFAULT_ID:Ljava/lang/String;

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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkOrCreateChannel(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const-string v0, "notification"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/app/NotificationManager;

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroidx/core/app/d3;->a(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Landroid/app/NotificationChannel;

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-direct {v0, p1, p2, v1}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 25
    .line 26
    .line 27
    const-string p1, "Compatibility of old versions"

    .line 28
    .line 29
    invoke-static {v0, p1}, Landroidx/core/app/g0;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-static {v0, p1, p1}, Landroidx/core/app/h0;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-static {v0, p1}, Landroidx/core/app/o;->a(Landroid/app/NotificationChannel;Z)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-static {p0, v0}, Landroidx/core/app/h3;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    :cond_0
    :goto_0
    return-void
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
.end method

.method public static createBuilder(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getTargetSdkVersion()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroid/app/Notification$Builder;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance p1, Landroid/app/Notification$Builder;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    return-object p1
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

.method public static enable()Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x1a

    .line 5
    .line 6
    if-le v0, v2, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getTargetSdkVersion()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lt v0, v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    :cond_0
    return v1
    .line 20
    .line 21
    .line 22
    .line 23
.end method
