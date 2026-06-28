.class final Lcom/ss/android/download/api/a/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/download/api/a/a;->a(Lcom/ss/android/download/api/model/b;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/download/api/model/b;


# direct methods
.method constructor <init>(Lcom/ss/android/download/api/model/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/download/api/a/a$3;->a:Lcom/ss/android/download/api/model/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/download/api/a/a$3;->a:Lcom/ss/android/download/api/model/b;

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
    .line 25
    .line 26
    .line 27
.end method
