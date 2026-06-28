.class public abstract Lcom/bytedance/sdk/openadsdk/api/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private volatile a:Lcom/bykv/vk/openvk/api/proto/Manager;

.field private volatile b:Z

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/bytedance/sdk/openadsdk/api/a$b<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->c:Ljava/util/List;

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
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/a$c;)Lcom/bykv/vk/openvk/api/proto/Manager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    return-object p0
.end method

.method static synthetic a(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/a$c;->b(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/api/a$b;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    .line 13
    invoke-interface {v1, p1}, Lcom/bytedance/sdk/openadsdk/api/a$b;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private a(Lcom/bytedance/sdk/openadsdk/api/a$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/api/a$b<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;)V"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->c:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/api/a$b<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;I)V"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_0

    .line 16
    :try_start_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/a$b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 17
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected manager call error: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "_tt_ad_sdk_"

    invoke-static {v0, p2}, Lcom/bytedance/sdk/openadsdk/api/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    .line 19
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->b:Z

    if-nez v0, :cond_2

    const/16 v0, 0x2710

    if-gt p2, v0, :cond_1

    goto :goto_1

    .line 20
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "\u5e7f\u544aSDK\u672aReady, \u8bf7\u5728load(\u8bf7\u6c42\u5e7f\u544a\uff09\u4e4b\u524d\uff0c\u5148\u8c03\u7528init and start\u65b9\u6cd5\uff0c\u4ee5\u907f\u514d\u65e0\u6cd5\u8bf7\u6c42\u5e7f\u544a"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_2
    :goto_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/e/a;->a()Lcom/bytedance/sdk/openadsdk/e/a;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/a$c$7;

    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/a$c$7;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bytedance/sdk/openadsdk/api/a$b;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;)V

    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bytedance/sdk/openadsdk/api/a$b;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    return-void
.end method

.method private static b(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-virtual {v0, v1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-interface {p0, v0}, Lcom/bykv/vk/openvk/api/proto/Manager;->getBridge(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v0, 0x6

    .line 28
    invoke-interface {p0, v0, p2, p1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
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
.method protected a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method protected a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 6
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->b:Z

    return-void
.end method

.method public createAdNative(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/TTAdNative;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/SoftReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/a$e;

    .line 7
    .line 8
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/a$c$1;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, Lcom/bytedance/sdk/openadsdk/api/a$c$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Ljava/lang/ref/SoftReference;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v1}, Lcom/bytedance/sdk/openadsdk/api/a$e;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/c/a/a;->a()Lcom/bytedance/sdk/openadsdk/TTAdNative;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getBiddingToken(Lcom/bytedance/sdk/openadsdk/AdSlot;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getNativeAdType()I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/api/a$c;->getBiddingToken(Lcom/bytedance/sdk/openadsdk/AdSlot;ZI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getBiddingToken(Lcom/bytedance/sdk/openadsdk/AdSlot;ZI)Ljava/lang/String;
    .locals 1

    if-lez p3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result p3

    if-lez p3, :cond_1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getAdType()I

    move-result p3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getNativeAdType()I

    move-result p3

    .line 3
    :goto_0
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/c/a/c/b;->b(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    invoke-static {p1}, Lcom/bykv/a/a/a/a/b;->j(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    const/16 v0, 0xd

    .line 4
    invoke-virtual {p1, v0, p2}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    const/16 p2, 0xe

    .line 5
    invoke-virtual {p1, p2, p3}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    const/4 p3, 0x1

    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/Manager;->getBridge(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p2

    const/4 p3, 0x2

    const-class v0, Ljava/lang/String;

    .line 8
    invoke-interface {p2, p3, p1, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/a$c;->b(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a$c$4;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/a$c$4;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x6

    .line 18
    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1
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

.method public getPluginVersion()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Manager;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const/16 v1, 0xc

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getSDKVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "6.4.1.5"

    return-object v0
.end method

.method public getThemeStatus()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c;->a:Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Manager;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const/16 v1, 0xb

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public register(Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a$c$2;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$2;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Ljava/lang/Object;)V

    const/4 p1, 0x4

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    return-void
.end method

.method public requestPermissionIfNecessary(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a$c$5;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$5;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Landroid/content/Context;)V

    const/4 p1, 0x3

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    return-void
.end method

.method public setThemeStatus(I)V
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a$c$6;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$6;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c;I)V

    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    return-void
.end method

.method public tryShowInstallDialogWhenExit(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/downloadnew/core/ExitInstallListener;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "activity"

    .line 7
    .line 8
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    const-string p1, "exitInstallListener"

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DownloadBridgeFactory;->getDownloadBridge(Landroid/content/Context;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 p2, 0x1

    .line 25
    invoke-static {p2}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p2, v1, v0}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-class v0, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-interface {p1, v1, p2, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1
.end method

.method public unregister(Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/a$c$3;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$3;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Ljava/lang/Object;)V

    const/4 p1, 0x5

    invoke-direct {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    return-void
.end method
