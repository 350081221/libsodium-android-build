.class public Lcom/tendcloud/tenddata/cd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/cd$a;
    }
.end annotation


# static fields
.field private static volatile b:Lcom/tendcloud/tenddata/cd;


# instance fields
.field private final a:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tendcloud/tenddata/cd;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/cd;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/cd;->b:Lcom/tendcloud/tenddata/cd;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/tendcloud/tenddata/cd;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 11
    .line 12
    new-instance v0, Lcom/tendcloud/tenddata/cd$1;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/cd$1;-><init>(Lcom/tendcloud/tenddata/cd;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/tendcloud/tenddata/cd;->c:Landroid/content/ServiceConnection;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static synthetic a(Lcom/tendcloud/tenddata/cd;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/cd;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/bx;->k()Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v1, "com.zui.deviceidservice"

    invoke-virtual {p0, v1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    return v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.zui.deviceidservice"

    .line 7
    .line 8
    const-string v2, "com.zui.deviceidservice.DeviceidService"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/tendcloud/tenddata/cd;->c:Landroid/content/ServiceConnection;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/cd;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/os/IBinder;

    .line 29
    .line 30
    new-instance v1, Lcom/tendcloud/tenddata/cd$a;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lcom/tendcloud/tenddata/cd$a;-><init>(Landroid/os/IBinder;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cd$a;->getOAID()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/df;->setOAID(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    :catchall_0
    :try_start_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/cd;->c:Landroid/content/ServiceConnection;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    .line 50
    .line 51
    :catchall_1
    :cond_0
    return-void
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
.end method

.method public static bindLENOVOServiceGetOAID(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/cd;->b:Lcom/tendcloud/tenddata/cd;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/cd;->b(Landroid/content/Context;)V

    return-void
.end method
