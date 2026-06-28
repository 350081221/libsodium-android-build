.class public Lcom/bytedance/sdk/openadsdk/c/a/a/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTDrawFeedAd;


# instance fields
.field private final a:Lcom/bykv/vk/openvk/api/proto/Bridge;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lcom/bykv/a/a/a/a/b;->d:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

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
.end method


# virtual methods
.method public destroy()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v2, Ljava/lang/Void;

    .line 13
    .line 14
    const v3, 0x22352

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v3, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public getAdLogo()Landroid/graphics/Bitmap;
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222e2

    const-class v2, Landroid/graphics/Bitmap;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getAdView()Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222f0

    const-class v2, Landroid/view/View;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public getAdViewHeight()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x27104

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0
.end method

.method public getAdViewWidth()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x27103

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0
.end method

.method public getAppCommentNum()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222e6

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0
.end method

.method public getAppScore()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222e5

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0
.end method

.method public getAppSize()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222e7

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0
.end method

.method public getButtonText()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222f2

    const-class v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getComplianceInfo()Lcom/bytedance/sdk/openadsdk/ComplianceInfo;
    .locals 4

    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/c;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    const v2, 0x222ee

    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1, v2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a/c;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object v0
.end method

.method public getCustomVideo()Lcom/bytedance/sdk/openadsdk/TTFeedAd$CustomizeVideo;
    .locals 4

    new-instance v0, Lcom/bytedance/sdk/openadsdk/i/a/a/a/a;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    const v2, 0x27102

    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1, v2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/i/a/a/a/a;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222e4

    const-class v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDislikeDialog(Landroid/app/Activity;)Lcom/bytedance/sdk/openadsdk/TTAdDislike;
    .locals 4

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 3
    new-instance p1, Lcom/bytedance/sdk/openadsdk/c/a/a/h;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const-class v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    const v3, 0x22345

    invoke-interface {v1, v3, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p1, v0}, Lcom/bytedance/sdk/openadsdk/c/a/a/h;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object p1
.end method

.method public getDislikeDialog(Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;)Lcom/bytedance/sdk/openadsdk/TTAdDislike;
    .locals 4

    const/4 v0, 0x1

    .line 4
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 6
    new-instance p1, Lcom/bytedance/sdk/openadsdk/c/a/a/h;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const-class v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    const v3, 0x22346

    invoke-interface {v1, v3, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p1, v0}, Lcom/bytedance/sdk/openadsdk/c/a/a/h;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object p1
.end method

.method public getDislikeInfo()Lcom/bytedance/sdk/openadsdk/DislikeInfo;
    .locals 4

    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/d;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    const v2, 0x222ed

    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1, v2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a/d;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object v0
.end method

.method public getDownloadStatusController()Lcom/bytedance/sdk/openadsdk/DownloadStatusController;
    .locals 4

    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/e;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    const v2, 0x222ef

    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1, v2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a/e;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object v0
.end method

.method public getIcon()Lcom/bytedance/sdk/openadsdk/TTImage;
    .locals 4

    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/m;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    const v2, 0x222e9

    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1, v2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a/m;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object v0
.end method

.method public getImageList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTImage;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x222ea

    .line 8
    .line 9
    .line 10
    const-class v2, Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/List;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 46
    .line 47
    new-instance v3, Lcom/bytedance/sdk/openadsdk/c/a/a/m;

    .line 48
    .line 49
    invoke-direct {v3, v2}, Lcom/bytedance/sdk/openadsdk/c/a/a/m;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object v1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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

.method public getImageMode()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222ec

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0
.end method

.method public getInteractionType()I
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222eb

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result v0

    return v0
.end method

.method public getMediaExtraInfo()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222f1

    const-class v2, Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationNativeManager;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/manager/a/a/a/d;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 15
    .line 16
    const v4, 0x22354

    .line 17
    .line 18
    .line 19
    invoke-interface {v2, v4, v0, v3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/bytedance/sdk/openadsdk/mediation/manager/a/a/a/d;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 26
    .line 27
    .line 28
    return-object v1
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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

.method public getSource()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222e8

    const-class v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x222e3

    const-class v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getVideoCoverImage()Lcom/bytedance/sdk/openadsdk/TTImage;
    .locals 4

    new-instance v0, Lcom/bytedance/sdk/openadsdk/c/a/a/m;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    const v2, 0x222e1

    const-class v3, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v1, v2, v3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/c/a/a/m;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-object v0
.end method

.method public getVideoDuration()D
    .locals 2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/api/proto/Bridge;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const v1, 0x27101

    invoke-interface {v0, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->doubleValue(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public loss(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-virtual {v0, p1, p3}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-class p3, Ljava/lang/Void;

    .line 25
    .line 26
    const v0, 0x334b6

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public registerViewForInteraction(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationViewBinder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;",
            "Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationViewBinder;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x7

    .line 36
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x1

    .line 38
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x2

    .line 39
    invoke-virtual {v0, p1, p3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x3

    .line 40
    invoke-virtual {v0, p1, p4}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x4

    .line 41
    invoke-virtual {v0, p1, p5}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 42
    new-instance p1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;

    invoke-direct {p1, p6}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V

    const/4 p2, 0x5

    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 43
    new-instance p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/e;

    invoke-direct {p1, p7}, Lcom/bytedance/sdk/openadsdk/mediation/ad/a/a/b/e;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationViewBinder;)V

    const/4 p2, 0x6

    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 44
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const-class p3, Ljava/lang/Void;

    const p4, 0x22355

    invoke-interface {p1, p4, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public registerViewForInteraction(Landroid/view/ViewGroup;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V
    .locals 2

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x1

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 4
    new-instance p1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;

    invoke-direct {p1, p3}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V

    const/4 p2, 0x2

    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const-class p3, Ljava/lang/Void;

    const v0, 0x22347

    invoke-interface {p1, v0, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public registerViewForInteraction(Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x5

    .line 12
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x1

    .line 14
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x2

    .line 15
    invoke-virtual {v0, p1, p3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x3

    .line 16
    invoke-virtual {v0, p1, p4}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 17
    new-instance p1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;

    invoke-direct {p1, p5}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 18
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const-class p3, Ljava/lang/Void;

    const p4, 0x22349

    invoke-interface {p1, p4, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public registerViewForInteraction(Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x4

    .line 6
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x1

    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x2

    .line 9
    invoke-virtual {v0, p1, p3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 10
    new-instance p1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;

    invoke-direct {p1, p4}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V

    const/4 p2, 0x3

    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const-class p3, Ljava/lang/Void;

    const p4, 0x22348

    invoke-interface {p1, p4, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public registerViewForInteraction(Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x6

    .line 19
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x1

    .line 21
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x2

    .line 22
    invoke-virtual {v0, p1, p3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x3

    .line 23
    invoke-virtual {v0, p1, p4}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x4

    .line 24
    invoke-virtual {v0, p1, p5}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 25
    new-instance p1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;

    invoke-direct {p1, p6}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V

    const/4 p2, 0x5

    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 26
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const-class p3, Ljava/lang/Void;

    const p4, 0x2234a

    invoke-interface {p1, p4, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public registerViewForInteraction(Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x7

    .line 27
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x1

    .line 29
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x2

    .line 30
    invoke-virtual {v0, p1, p3}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x3

    .line 31
    invoke-virtual {v0, p1, p4}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x4

    .line 32
    invoke-virtual {v0, p1, p5}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    const/4 p1, 0x5

    .line 33
    invoke-virtual {v0, p1, p6}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 34
    new-instance p1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;

    invoke-direct {p1, p7}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$AdInteractionListener;)V

    const/4 p2, 0x6

    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 35
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p2

    const-class p3, Ljava/lang/Void;

    const p4, 0x2234b

    invoke-interface {p1, p4, p2, p3}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public render()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v2, Ljava/lang/Void;

    .line 13
    .line 14
    const v3, 0x2234e

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v3, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public setActivityForDownloadApp(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Ljava/lang/Void;

    .line 17
    .line 18
    const v2, 0x2234d

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/c/a/b/a;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/c/a/b/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Void;

    .line 22
    .line 23
    const v2, 0x334b8

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setCanInterruptVideoPlay(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->i(IZ)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Ljava/lang/Void;

    .line 17
    .line 18
    const v2, 0x29875

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setDislikeCallback(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/TTAdDislike$DislikeInteractionCallback;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    new-instance p1, Lcom/bytedance/sdk/openadsdk/f/a/a/a/a;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/f/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdDislike$DislikeInteractionCallback;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {v0, p2, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-class v0, Ljava/lang/Void;

    .line 26
    .line 27
    const v1, 0x22350

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v1, p2, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
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

.method public setDislikeDialog(Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Ljava/lang/Void;

    .line 17
    .line 18
    const v2, 0x22351

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setDownloadListener(Lcom/bytedance/sdk/openadsdk/TTAppDownloadListener;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/c/a/b/b;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/c/a/b/b;-><init>(Lcom/bytedance/sdk/openadsdk/TTAppDownloadListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Void;

    .line 22
    .line 23
    const v2, 0x2234c

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setDrawVideoListener(Lcom/bytedance/sdk/openadsdk/TTDrawFeedAd$DrawVideoListener;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/h/a/a/a/a;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/h/a/a/a/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTDrawFeedAd$DrawVideoListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Void;

    .line 22
    .line 23
    const v2, 0x29877

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setEasyPlayWidgetListener(Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/b;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$EasyPlayWidgetListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Void;

    .line 22
    .line 23
    const v2, 0x22357

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setExpressRenderListener(Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/k/a/a/a/c;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/k/a/a/a/c;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Void;

    .line 22
    .line 23
    const v2, 0x2234f

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setPauseIcon(Landroid/graphics/Bitmap;I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-virtual {v0, p1, p2}, Lcom/bykv/a/a/a/a/b;->e(II)Lcom/bykv/a/a/a/a/b;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-class v0, Ljava/lang/Void;

    .line 21
    .line 22
    const v1, 0x29876

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v1, p2, v0}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
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

.method public setPrice(Ljava/lang/Double;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Ljava/lang/Void;

    .line 17
    .line 18
    const v2, 0x334b7

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setVideoAdListener(Lcom/bytedance/sdk/openadsdk/TTFeedAd$VideoAdListener;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/i/a/a/b/a;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/i/a/a/b/a;-><init>(Lcom/bytedance/sdk/openadsdk/TTFeedAd$VideoAdListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Void;

    .line 22
    .line 23
    const v2, 0x27165

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setVideoRewardListener(Lcom/bytedance/sdk/openadsdk/TTFeedAd$VideoRewardListener;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/i/a/a/b/b;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/i/a/a/b/b;-><init>(Lcom/bytedance/sdk/openadsdk/TTFeedAd$VideoRewardListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Void;

    .line 22
    .line 23
    const v2, 0x27166

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public showInteractionExpressAd(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Ljava/lang/Void;

    .line 17
    .line 18
    const v2, 0x22353

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public uploadDislikeEvent(Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Ljava/lang/Void;

    .line 17
    .line 18
    const v2, 0x22356

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public win(Ljava/lang/Double;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/bykv/a/a/a/a/b;->g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/c/a/a/j;->a:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Ljava/lang/Void;

    .line 17
    .line 18
    const v2, 0x334b5

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method
