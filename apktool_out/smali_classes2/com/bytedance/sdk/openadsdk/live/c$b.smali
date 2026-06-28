.class final Lcom/bytedance/sdk/openadsdk/live/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTPluginListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/live/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field a:I

.field b:Ljava/lang/String;

.field final synthetic c:Lcom/bytedance/sdk/openadsdk/live/c;


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/openadsdk/live/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->c:Lcom/bytedance/sdk/openadsdk/live/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/live/c;Lcom/bytedance/sdk/openadsdk/live/c$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/live/c$b;-><init>(Lcom/bytedance/sdk/openadsdk/live/c;)V

    return-void
.end method

.method private a(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V
    .locals 3

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->a:I

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->c:Lcom/bytedance/sdk/openadsdk/live/c;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Lcom/bytedance/sdk/openadsdk/live/c;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->c:Lcom/bytedance/sdk/openadsdk/live/c;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Lcom/bytedance/sdk/openadsdk/live/c;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    const/4 v1, 0x1

    .line 7
    invoke-virtual {p1, v1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2, p3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2, p4}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->c:Lcom/bytedance/sdk/openadsdk/live/c;

    .line 8
    invoke-static {p3, p5}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Lcom/bytedance/sdk/openadsdk/live/c;Z)Ljava/util/Map;

    move-result-object p3

    const/4 p4, 0x4

    invoke-virtual {p1, p4, p3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    const/4 p3, 0x0

    .line 9
    invoke-interface {v0, p2, p1, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private a(ILjava/lang/String;Z)V
    .locals 2

    .line 10
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->a:I

    .line 11
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->b:Ljava/lang/String;

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->c:Lcom/bytedance/sdk/openadsdk/live/c;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Lcom/bytedance/sdk/openadsdk/live/c;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    move-result-object p1

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    .line 14
    invoke-virtual {p1, v0, p2}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 15
    :cond_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->c:Lcom/bytedance/sdk/openadsdk/live/c;

    invoke-static {p2, p3}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Lcom/bytedance/sdk/openadsdk/live/c;Z)Ljava/util/Map;

    move-result-object p2

    const/4 p3, 0x2

    invoke-virtual {p1, p3, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 16
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/live/c$b;->c:Lcom/bytedance/sdk/openadsdk/live/c;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/live/c;->a(Lcom/bytedance/sdk/openadsdk/live/c;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p2, p3, p1, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/live/c$b;ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/live/c$b;->a(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V

    return-void
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/live/c$b;ILjava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/live/c$b;->a(ILjava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public config()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/live/c$b;->a(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public packageName()Ljava/lang/String;
    .locals 1

    const-string v0, "com.byted.live.lite"

    return-object v0
.end method
