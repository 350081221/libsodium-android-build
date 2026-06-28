.class Lcom/bytedance/sdk/openadsdk/api/a$c$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a$c;->setThemeStatus(I)V
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
.field final synthetic a:I

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/api/a$c;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a$c;I)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$6;->b:Lcom/bytedance/sdk/openadsdk/api/a$c;

    iput p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$6;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 3

    .line 2
    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/16 v1, 0xb

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$6;->a:I

    invoke-virtual {v0, v1, v2}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-interface {p1, v1}, Lcom/bykv/vk/openvk/api/proto/Manager;->getBridge(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    const-class v2, Ljava/lang/Void;

    invoke-interface {p1, v1, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$6;->a(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method
