.class public Lcom/ss/android/download/api/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/config/i;


# instance fields
.field private a:Lcom/ss/android/download/api/config/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;I[Ljava/lang/String;[I)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    array-length p1, p4

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/ss/android/download/api/a/b;->a:Lcom/ss/android/download/api/config/t;

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    .line 5
    aget p4, p4, p2

    const/4 v0, -0x1

    if-ne p4, v0, :cond_0

    .line 6
    aget-object p2, p3, p2

    invoke-interface {p1, p2}, Lcom/ss/android/download/api/config/t;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-nez p4, :cond_1

    .line 7
    invoke-interface {p1}, Lcom/ss/android/download/api/config/t;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/app/Activity;[Ljava/lang/String;Lcom/ss/android/download/api/config/t;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p3, p0, Lcom/ss/android/download/api/a/b;->a:Lcom/ss/android/download/api/config/t;

    const/4 p3, 0x1

    .line 2
    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
