.class public Lcom/ss/android/socialbase/appdownloader/d/a;
.super Lcom/ss/android/socialbase/appdownloader/c/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/appdownloader/d/a$a;
    }
.end annotation


# instance fields
.field private a:Landroid/app/AlertDialog$Builder;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/c/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d/a;->a:Landroid/app/AlertDialog$Builder;

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
.end method


# virtual methods
.method public a()Lcom/ss/android/socialbase/appdownloader/c/k;
    .locals 2

    .line 9
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/d/a$a;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/d/a;->a:Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/appdownloader/d/a$a;-><init>(Landroid/app/AlertDialog$Builder;)V

    return-object v0
.end method

.method public a(I)Lcom/ss/android/socialbase/appdownloader/c/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d/a;->a:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/c/l;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d/a;->a:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public a(Landroid/content/DialogInterface$OnCancelListener;)Lcom/ss/android/socialbase/appdownloader/c/l;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d/a;->a:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/c/l;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d/a;->a:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public b(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/c/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d/a;->a:Landroid/app/AlertDialog$Builder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
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
