.class Lcom/bytedance/sdk/openadsdk/api/a$c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a$c;->register(Ljava/lang/Object;)V
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
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/api/a$c;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$2;->b:Lcom/bytedance/sdk/openadsdk/api/a$c;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$2;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$2;->b:Lcom/bytedance/sdk/openadsdk/api/a$c;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$2;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-static {v1}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3, v0}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    .line 4
    invoke-interface {p1, v1}, Lcom/bykv/vk/openvk/api/proto/Manager;->getBridge(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    const/4 v1, 0x4

    const-class v2, Ljava/lang/Void;

    invoke-interface {p1, v1, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$2;->a(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method
