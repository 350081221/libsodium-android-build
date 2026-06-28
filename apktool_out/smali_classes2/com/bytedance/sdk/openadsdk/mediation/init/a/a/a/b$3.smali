.class Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/b$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/b;->a(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/b$3;->a:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/b$3;->a:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;->isCanUseOaid()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/a/a/a/b$3;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
