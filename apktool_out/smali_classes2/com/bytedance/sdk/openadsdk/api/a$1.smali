.class Lcom/bytedance/sdk/openadsdk/api/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a;->a(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/bykv/a/a/a/a/b;

.field final synthetic c:Lcom/bytedance/sdk/openadsdk/api/a;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a;Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$1;->c:Lcom/bytedance/sdk/openadsdk/api/a;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$1;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/a$1;->b:Lcom/bykv/a/a/a/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$1;->c:Lcom/bytedance/sdk/openadsdk/api/a;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/a$1;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/api/a$1;->b:Lcom/bykv/a/a/a/a/b;

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Landroid/content/Context;Lcom/bykv/a/a/a/a/b;)V

    return-void
.end method
