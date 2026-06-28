.class public Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/config/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/downloadnew/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;->a:Ljava/lang/ref/WeakReference;

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

.method private c(Lcom/ss/android/download/api/model/b;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;
    .locals 2

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;->builder()Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Lcom/ss/android/download/api/model/b;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;->setTitle(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p1, Lcom/ss/android/download/api/model/b;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;->setMessage(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p1, Lcom/ss/android/download/api/model/b;->e:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;->setNegativeBtnText(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p1, Lcom/ss/android/download/api/model/b;->d:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;->setPositiveBtnText(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p1, Lcom/ss/android/download/api/model/b;->g:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;->setIcon(Landroid/graphics/drawable/Drawable;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;

    .line 36
    .line 37
    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d$1;-><init>(Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;Lcom/ss/android/download/api/model/b;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;->setDialogStatusChangedListener(Lcom/bytedance/sdk/openadsdk/downloadnew/core/IDialogStatusChangedListener;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
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


# virtual methods
.method public a(Lcom/ss/android/download/api/model/b;)Landroid/app/AlertDialog;
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 4
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->d()Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTDownloadVisitor;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 5
    iget-object v1, p1, Lcom/ss/android/download/api/model/b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    instance-of v1, v1, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->d()Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTDownloadVisitor;

    move-result-object v0

    iget-object v1, p1, Lcom/ss/android/download/api/model/b;->a:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    iget v4, p1, Lcom/ss/android/download/api/model/b;->j:I

    if-ne v4, v3, :cond_1

    move v2, v3

    :cond_1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;->c(Lcom/ss/android/download/api/model/b;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTDownloadVisitor;->showDialogBySelf(Landroid/app/Activity;ZLcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;)Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1

    .line 7
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/downloadnew/c;->d()Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTDownloadVisitor;

    move-result-object v1

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;->a:Ljava/lang/ref/WeakReference;

    iget v5, p1, Lcom/ss/android/download/api/model/b;->j:I

    if-ne v5, v3, :cond_3

    move v2, v3

    :cond_3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;->c(Lcom/ss/android/download/api/model/b;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;

    move-result-object p1

    invoke-interface {v1, v4, v2, p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/ITTDownloadVisitor;->showDialogByDelegate(Ljava/lang/ref/WeakReference;ZLcom/bytedance/sdk/openadsdk/downloadnew/core/DialogBuilder;)V

    :cond_4
    return-object v0
.end method

.method public a(ILandroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-static {p2, p4, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "showToastWithDuration e "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "LibUIFactory"

    invoke-static {p2, p1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public synthetic b(Lcom/ss/android/download/api/model/b;)Landroid/app/Dialog;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/downloadnew/c$d;->a(Lcom/ss/android/download/api/model/b;)Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
