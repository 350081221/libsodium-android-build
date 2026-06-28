.class public final Lcom/tendcloud/tenddata/ca;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ca$a;
    }
.end annotation


# static fields
.field private static volatile c:Lcom/tendcloud/tenddata/ca;


# instance fields
.field a:Landroid/content/ServiceConnection;

.field private final b:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tendcloud/tenddata/ca;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/ca;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/ca;->c:Lcom/tendcloud/tenddata/ca;

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
    iput-object v0, p0, Lcom/tendcloud/tenddata/ca;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 11
    .line 12
    new-instance v0, Lcom/tendcloud/tenddata/ca$1;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/ca$1;-><init>(Lcom/tendcloud/tenddata/ca;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/tendcloud/tenddata/ca;->a:Landroid/content/ServiceConnection;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static synthetic a(Lcom/tendcloud/tenddata/ca;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/ca;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/bx;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/tendcloud/tenddata/bx;->c()Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :catchall_0
    return v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    .line 5
    invoke-static {p0, p1}, Lcom/tendcloud/tenddata/ca;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 2

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    if-eqz p0, :cond_1

    const/16 v0, 0x80

    .line 4
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_1
    :goto_0
    return-object v1
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, "com.huawei.hwid"

    .line 1
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/ca;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "com.huawei.hms"

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/ca;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    const-string v1, "com.huawei.hwid.tv"

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/ca;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static bindHWServiceGetOAID(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/ca;->c:Lcom/tendcloud/tenddata/ca;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/ca;->c(Landroid/content/Context;)V

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "com.uodis.opendevice.OPENIDS_SERVICE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/tendcloud/tenddata/ca;->a:Landroid/content/ServiceConnection;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 19
    .line 20
    .line 21
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ca;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/os/IBinder;

    .line 31
    .line 32
    new-instance v1, Lcom/tendcloud/tenddata/ca$a;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, v0, v2}, Lcom/tendcloud/tenddata/ca$a;-><init>(Landroid/os/IBinder;Lcom/tendcloud/tenddata/ca$1;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ca$a;->getOAID()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/df;->setOAID(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    :catchall_0
    :try_start_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ca;->a:Landroid/content/ServiceConnection;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    .line 54
    :catchall_1
    :cond_0
    return-void
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
