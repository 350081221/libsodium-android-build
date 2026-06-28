.class Lcom/bytedance/sdk/openadsdk/c/a/a$a$1;
.super Lcom/bytedance/sdk/openadsdk/CSJAdError;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/c/a/a$a;->loadSplashAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/util/Pair;

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/c/a/a$a;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/c/a/a$a;Landroid/util/Pair;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a$1;->b:Lcom/bytedance/sdk/openadsdk/c/a/a$a;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a$1;->a:Landroid/util/Pair;

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/CSJAdError;-><init>()V

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a$1;->a:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a$a$1;->a:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
