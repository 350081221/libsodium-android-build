.class Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/e;->b(Lcom/bytedance/sdk/openadsdk/TTPluginListener;)V
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

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;->b:Lcom/bytedance/sdk/openadsdk/api/plugin/e;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;->a:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;->a:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->packageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->isPluginInstalled(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->isPluginLoaded(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->loadPlugin(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-static {v0}, Lcom/bytedance/pangle/Zeus;->getPlugin(Ljava/lang/String;)Lcom/bytedance/pangle/plugin/Plugin;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v0, v2

    .line 32
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "Find plugin:"

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 v3, 0x0

    .line 47
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v3, "TTPluginManager"

    .line 55
    .line 56
    invoke-static {v3, v1}, Lcom/bytedance/sdk/openadsdk/api/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->a(Lcom/bytedance/pangle/plugin/Plugin;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;->a:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    .line 65
    .line 66
    iget-object v3, v0, Lcom/bytedance/pangle/plugin/Plugin;->mClassLoader:Lcom/bytedance/pangle/PluginClassLoader;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/bytedance/pangle/plugin/Plugin;->mResources:Landroid/content/res/Resources;

    .line 69
    .line 70
    const/16 v4, 0x3e8

    .line 71
    .line 72
    invoke-interface {v1, v4, v3, v0, v2}, Lcom/bytedance/sdk/openadsdk/TTPluginListener;->onPluginListener(ILjava/lang/ClassLoader;Landroid/content/res/Resources;Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/e$5;->a:Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/api/plugin/e;->c(Lcom/bytedance/sdk/openadsdk/TTPluginListener;)Lcom/bytedance/sdk/openadsdk/TTPluginListener;

    .line 79
    .line 80
    .line 81
    :goto_2
    return-void
    .line 82
    .line 83
.end method
