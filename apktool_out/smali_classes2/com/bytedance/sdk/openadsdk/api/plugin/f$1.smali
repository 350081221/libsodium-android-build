.class Lcom/bytedance/sdk/openadsdk/api/plugin/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/api/plugin/f;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/plugin/f;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f$1;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/f$1;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/f;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/f;->a(Lcom/bytedance/sdk/openadsdk/api/plugin/f;I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    return-object p1
.end method
