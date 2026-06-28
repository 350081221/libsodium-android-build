.class public Lcom/tendcloud/tenddata/bz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bz$a;
    }
.end annotation


# static fields
.field private static volatile b:Lcom/tendcloud/tenddata/bz;


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

    new-instance v0, Lcom/tendcloud/tenddata/bz;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bz;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/bz;->b:Lcom/tendcloud/tenddata/bz;

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
    iput-object v0, p0, Lcom/tendcloud/tenddata/bz;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 11
    .line 12
    new-instance v0, Lcom/tendcloud/tenddata/bz$1;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/bz$1;-><init>(Lcom/tendcloud/tenddata/bz;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/tendcloud/tenddata/bz;->c:Landroid/content/ServiceConnection;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static synthetic a(Lcom/tendcloud/tenddata/bz;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/bz;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/bx;->j()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x1

    :catchall_0
    return p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.asus.msa.action.ACCESS_DID"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroid/content/ComponentName;

    .line 12
    .line 13
    const-string v2, "com.asus.msa.SupplementaryDID"

    .line 14
    .line 15
    const-string v3, "com.asus.msa.SupplementaryDID.SupplementaryDIDService"

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/tendcloud/tenddata/bz;->c:Landroid/content/ServiceConnection;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Lcom/tendcloud/tenddata/bz;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroid/os/IBinder;

    .line 39
    .line 40
    new-instance v1, Lcom/tendcloud/tenddata/bz$a;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lcom/tendcloud/tenddata/bz$a;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    .line 44
    .line 45
    :try_start_1
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/bz$a;->getOAID()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/df;->setOAID(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    :catchall_0
    :try_start_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/bz;->c:Landroid/content/ServiceConnection;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    .line 60
    .line 61
    :catchall_1
    :cond_0
    return-void
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

.method public static bindASUSServiceGetOAID(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/bz;->b:Lcom/tendcloud/tenddata/bz;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/bz;->b(Landroid/content/Context;)V

    return-void
.end method
