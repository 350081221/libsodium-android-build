.class Lcom/bytedance/sdk/openadsdk/a/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/a/c;->a(Lcom/bykv/vk/openvk/api/proto/EventListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bykv/vk/openvk/api/proto/EventListener;

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/a/c;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/a/c;Lcom/bykv/vk/openvk/api/proto/EventListener;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/a/c$1;->b:Lcom/bytedance/sdk/openadsdk/a/c;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/a/c$1;->a:Lcom/bykv/vk/openvk/api/proto/EventListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/a/c$1;->a:Lcom/bykv/vk/openvk/api/proto/EventListener;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/EventListener;->onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/a/c$1;->a:Lcom/bykv/vk/openvk/api/proto/EventListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/EventListener;->onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method
