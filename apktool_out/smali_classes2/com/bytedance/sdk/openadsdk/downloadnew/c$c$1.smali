.class Lcom/bytedance/sdk/openadsdk/downloadnew/c$c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTPermissionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/downloadnew/c$c;->a(Landroid/app/Activity;[Ljava/lang/String;Lcom/ss/android/download/api/config/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/download/api/config/t;

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/downloadnew/c$c;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/downloadnew/c$c;Lcom/ss/android/download/api/config/t;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$c$1;->b:Lcom/bytedance/sdk/openadsdk/downloadnew/c$c;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$c$1;->a:Lcom/ss/android/download/api/config/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$c$1;->a:Lcom/ss/android/download/api/config/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/t;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
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

.method public onGranted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$c$1;->a:Lcom/ss/android/download/api/config/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/ss/android/download/api/config/t;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
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
.end method
