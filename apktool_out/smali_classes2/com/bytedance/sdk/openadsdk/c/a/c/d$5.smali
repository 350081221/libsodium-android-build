.class Lcom/bytedance/sdk/openadsdk/c/a/c/d$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/c/a/c/d;->a(Lcom/bytedance/sdk/openadsdk/TTCustomController;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter<",
        "Ljava/util/Map;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/TTCustomController;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/TTCustomController;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/c/d$5;->a:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/c/d$5;->a:Lcom/bytedance/sdk/openadsdk/TTCustomController;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/TTCustomController;->userPrivacyConfig()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/c/a/c/d$5;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
