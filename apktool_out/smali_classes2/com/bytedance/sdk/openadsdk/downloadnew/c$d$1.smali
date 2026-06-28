.class Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/downloadnew/core/IDialogStatusChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;->c(Lcom/ss/android/download/api/model/b;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/download/api/model/b;

.field final synthetic b:Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;Lcom/ss/android/download/api/model/b;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;->b:Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;->a:Lcom/ss/android/download/api/model/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;->a:Lcom/ss/android/download/api/model/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/ss/android/download/api/model/b;->h:Lcom/ss/android/download/api/model/b$b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/model/b$b;->c(Landroid/content/DialogInterface;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public onNegativeBtnClick(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;->a:Lcom/ss/android/download/api/model/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/ss/android/download/api/model/b;->h:Lcom/ss/android/download/api/model/b$b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/model/b$b;->b(Landroid/content/DialogInterface;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    return-void
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

.method public onPositiveBtnClick(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;->a:Lcom/ss/android/download/api/model/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/ss/android/download/api/model/b;->h:Lcom/ss/android/download/api/model/b$b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/model/b$b;->a(Landroid/content/DialogInterface;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
