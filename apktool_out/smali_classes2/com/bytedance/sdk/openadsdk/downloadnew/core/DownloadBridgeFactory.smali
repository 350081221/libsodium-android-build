.class public Lcom/bytedance/sdk/openadsdk/downloadnew/core/DownloadBridgeFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getDownloadBridge(Landroid/content/Context;)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 0

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/downloadnew/d;->a(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/downloadnew/d;

    move-result-object p0

    return-object p0
.end method
