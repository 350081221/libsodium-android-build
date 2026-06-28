.class public final Lcom/bytedance/sdk/openadsdk/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# static fields
.field private static volatile a:Lcom/bytedance/sdk/openadsdk/a/c;


# instance fields
.field private b:Lcom/bytedance/sdk/openadsdk/a/b;

.field private c:Lcom/bytedance/sdk/openadsdk/a/a;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/a/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/a/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/a/c;->c:Lcom/bytedance/sdk/openadsdk/a/a;

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

.method public static a()Lcom/bytedance/sdk/openadsdk/a/c;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/a/c;->a:Lcom/bytedance/sdk/openadsdk/a/c;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/openadsdk/a/c;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/a/c;->a:Lcom/bytedance/sdk/openadsdk/a/c;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/openadsdk/a/c;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/a/c;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/a/c;->a:Lcom/bytedance/sdk/openadsdk/a/c;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/a/c;->a:Lcom/bytedance/sdk/openadsdk/a/c;

    return-object v0
.end method

.method private a(Lcom/bykv/vk/openvk/api/proto/EventListener;)V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/a/c;->c:Lcom/bytedance/sdk/openadsdk/a/a;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/a/c$1;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/a/c$1;-><init>(Lcom/bytedance/sdk/openadsdk/a/c;Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/a/a;->a(Lcom/bytedance/sdk/openadsdk/a/a$a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/bytedance/sdk/openadsdk/a/b;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/a/c;->b:Lcom/bytedance/sdk/openadsdk/a/b;

    return-void
.end method

.method public b()Landroid/app/Application$ActivityLifecycleCallbacks;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/a/c;->c:Lcom/bytedance/sdk/openadsdk/a/a;

    return-object v0
.end method

.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :pswitch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/a/c;->b:Lcom/bytedance/sdk/openadsdk/a/b;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/a/b;->a(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    return-object v1

    .line 21
    :pswitch_1
    const-class p1, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {p2, v0, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of p2, p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 28
    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/EventListener;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/a/c;->a(Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :pswitch_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/a/c;->b:Lcom/bytedance/sdk/openadsdk/a/b;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    const/4 v2, 0x4

    .line 42
    invoke-interface {v0, v2}, Lcom/bytedance/sdk/openadsdk/a/b;->a(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-interface {v0, p1, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_1
    return-object v1

    .line 53
    :pswitch_3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :pswitch_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/a/c;->c:Lcom/bytedance/sdk/openadsdk/a/a;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/a/a;->a()Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_2
    :goto_1
    return-object v1

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 3

    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/16 v1, 0x2710

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    return-object v0
.end method
