.class Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a$c$1;->a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/openadsdk/api/a$b<",
        "Lcom/bykv/vk/openvk/api/proto/Manager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/api/a$b;

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/api/a$c$1;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a$c$1;Lcom/bytedance/sdk/openadsdk/api/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;->b:Lcom/bytedance/sdk/openadsdk/api/a$c$1;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;->a:Lcom/bytedance/sdk/openadsdk/api/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;->b:Lcom/bytedance/sdk/openadsdk/api/a$c$1;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->d:Lcom/bytedance/sdk/openadsdk/api/a$c;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->b:Lcom/bytedance/sdk/openadsdk/api/a$b;

    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bytedance/sdk/openadsdk/api/a$b;)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;->b:Lcom/bytedance/sdk/openadsdk/api/a$c$1;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->c:Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {p1, v1}, Lcom/bykv/vk/openvk/api/proto/Manager;->createLoader(Landroid/content/Context;)Lcom/bykv/vk/openvk/api/proto/Loader;

    move-result-object p1

    iput-object p1, v0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->a:Lcom/bykv/vk/openvk/api/proto/Loader;

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;->a:Lcom/bytedance/sdk/openadsdk/api/a$b;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;->b:Lcom/bytedance/sdk/openadsdk/api/a$c$1;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->a:Lcom/bykv/vk/openvk/api/proto/Loader;

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/a$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;->a(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method
