.class public Ld1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/a;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ld1/a;


# direct methods
.method public constructor <init>(Ld1/a;)V
    .locals 0

    iput-object p1, p0, Ld1/a$a;->a:Ld1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld1/a$a;->a:Ld1/a;

    .line 2
    .line 3
    invoke-static {v0}, Ld1/a;->h(Ld1/a;)Ld1/a$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ld1/a$a;->a:Ld1/a;

    .line 10
    .line 11
    new-instance v1, Ld1/a$d;

    .line 12
    .line 13
    iget-object v2, p0, Ld1/a$a;->a:Ld1/a;

    .line 14
    .line 15
    invoke-static {v2}, Ld1/a;->a(Ld1/a;)Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v1, v2, v3}, Ld1/a$d;-><init>(Ld1/a;Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Ld1/a;->b(Ld1/a;Ld1/a$d;)Ld1/a$d;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ld1/a$a;->a:Ld1/a;

    .line 26
    .line 27
    invoke-static {v0}, Ld1/a;->h(Ld1/a;)Ld1/a$d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Ld1/a$a;->a:Ld1/a;

    .line 32
    .line 33
    invoke-static {v1}, Ld1/a;->k(Ld1/a;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :try_start_0
    iget-object v0, p0, Ld1/a$a;->a:Ld1/a;

    .line 41
    .line 42
    invoke-static {v0}, Ld1/a;->h(Ld1/a;)Ld1/a$d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-object v0, p0, Ld1/a$a;->a:Ld1/a;

    .line 53
    .line 54
    invoke-static {v0}, Ld1/a;->h(Ld1/a;)Ld1/a$d;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Ld1/a$a;->a:Ld1/a;

    .line 62
    .line 63
    invoke-static {v0}, Ld1/a;->l(Ld1/a;)Landroid/os/Handler;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x1

    .line 68
    const-wide/16 v2, 0x2710

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    invoke-static {v0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    :goto_0
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
