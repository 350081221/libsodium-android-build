.class public Lcom/bytedance/pangle/ZeusApplication;
.super Lcom/bytedance/pangle/PluginContext;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field mHostApplication:Landroid/app/Application;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/pangle/PluginContext;-><init>()V

    return-void
.end method


# virtual methods
.method public attach(Lcom/bytedance/pangle/plugin/Plugin;Landroid/app/Application;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/pangle/PluginContext;->mPlugin:Lcom/bytedance/pangle/plugin/Plugin;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/pangle/ZeusApplication;->mHostApplication:Landroid/app/Application;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lcom/bytedance/pangle/ZeusApplication;->attachBaseContext(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/bytedance/pangle/ZeusApplication;->onCreate()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public onCreate()V
    .locals 0

    return-void
.end method
