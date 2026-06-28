.class Lcom/bytedance/sdk/openadsdk/api/plugin/e$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/sdk/openadsdk/TTPluginListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/api/plugin/e;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/plugin/e;Lcom/bytedance/sdk/openadsdk/TTPluginListener;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$4;->b:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$4;->a:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    const-string v0, "TTPluginManager"

    .line 2
    .line 3
    const-string v1, "Load plugin failed, caused by timeout."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$4;->a:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    .line 9
    .line 10
    const/16 v1, 0x3e9

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-interface {v0, v1, v2, v2, v2}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
