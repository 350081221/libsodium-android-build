.class Lcom/bytedance/sdk/openadsdk/api/a$c$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a$c;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
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
.field final synthetic a:Ljava/lang/Class;

.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Lcom/bytedance/sdk/openadsdk/api/a$c;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$4;->c:Lcom/bytedance/sdk/openadsdk/api/a$c;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$4;->a:Ljava/lang/Class;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$4;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$4;->c:Lcom/bytedance/sdk/openadsdk/api/a$c;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$c;)Lcom/bykv/vk/openvk/api/proto/Manager;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$4;->a:Ljava/lang/Class;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$4;->b:Landroid/os/Bundle;

    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$4;->a(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method
