.class Lcom/bytedance/tools/ui/view/b$b;
.super Lcom/bytedance/sdk/openadsdk/TTCustomController;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/view/b;->i(Lcom/bytedance/tools/c/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/bytedance/tools/ui/view/b;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/view/b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/view/b$b;->c:Lcom/bytedance/tools/ui/view/b;

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/TTCustomController;-><init>()V

    return-void
.end method


# virtual methods
.method public alist()Z
    .locals 2

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0x11

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getDevImei()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDevOaid()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0xd

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMacAddress()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0x12

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTTLocation()Lcom/bytedance/sdk/openadsdk/LocationProvider;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const-string v1, "null"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    const-string v1, ","

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    array-length v1, v0

    .line 32
    const-string v2, ""

    .line 33
    .line 34
    if-lez v1, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    aget-object v1, v0, v1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v1, v2

    .line 41
    :goto_0
    array-length v3, v0

    .line 42
    const/4 v4, 0x1

    .line 43
    if-le v3, v4, :cond_1

    .line 44
    .line 45
    aget-object v2, v0, v4

    .line 46
    .line 47
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    return-object v0

    .line 61
    :cond_2
    new-instance v0, Lcom/bytedance/tools/ui/view/b$b$a;

    .line 62
    .line 63
    invoke-direct {v0, p0, v1, v2}, Lcom/bytedance/tools/ui/view/b$b$a;-><init>(Lcom/bytedance/tools/ui/view/b$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/TTCustomController;->getTTLocation()Lcom/bytedance/sdk/openadsdk/LocationProvider;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public isCanUseAndroidId()Z
    .locals 2

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0x16

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isCanUseLocation()Z
    .locals 2

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isCanUsePermissionRecordAudio()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCanUsePhoneState()Z
    .locals 2

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isCanUseWifiState()Z
    .locals 2

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isCanUseWriteExternal()Z
    .locals 2

    sget-object v0, Lcom/bytedance/tools/ToolsProvider;->a:Landroid/content/Context;

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lcom/bytedance/tools/d/g;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
