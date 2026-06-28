.class Lcom/bytedance/sdk/openadsdk/api/a$e$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a$e;->i(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/openadsdk/api/a$b<",
        "Lcom/bykv/vk/openvk/api/proto/Loader;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field final synthetic b:Lcom/bykv/vk/openvk/api/proto/Bridge;

.field final synthetic c:Lcom/bytedance/sdk/openadsdk/api/a$e;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a$e;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$e$2;->c:Lcom/bytedance/sdk/openadsdk/api/a$e;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$e$2;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/a$e$2;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bykv/vk/openvk/api/proto/Loader;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$e$2;->a:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->j(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/a$e$2;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0, v2, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Loader;->load(ILcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Loader;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$e$2;->a(Lcom/bykv/vk/openvk/api/proto/Loader;)V

    return-void
.end method
